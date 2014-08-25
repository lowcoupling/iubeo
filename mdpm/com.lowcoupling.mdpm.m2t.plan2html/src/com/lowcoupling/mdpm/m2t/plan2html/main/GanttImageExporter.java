package com.lowcoupling.mdpm.m2t.plan2html.main;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.ganttchart.DefaultSettings;
import org.eclipse.nebula.widgets.ganttchart.GanttChart;
import org.eclipse.nebula.widgets.ganttchart.GanttEvent;
import org.eclipse.nebula.widgets.ganttchart.GanttSection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.joda.time.DateTime;
import org.joda.time.Months;

import com.lowcoupling.mdpm.commons.util.PlanUtil;
import com.lowcoupling.mdpm.lng.plan.plan.Activity;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityElement;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityGroup;
import com.lowcoupling.mdpm.lng.plan.plan.CheckPoint;
import com.lowcoupling.mdpm.lng.plan.plan.Program;
import com.lowcoupling.mdpm.lng.plan.plan.Project;
import com.lowcoupling.mdpm.lng.plan.util.ActivityElementDecorator;
//import org.eclipse.swt.SWT;

public class GanttImageExporter {

	private static IFile currentModel;
	public static IFile getCurrentModel() {
		return currentModel;
	}

	public static void setCurrentModel(IFile currentModel) {
		GanttImageExporter.currentModel = currentModel;
	}
	private static IPath path;
	private File out;

	class GanttCreator implements Runnable{
		Shell shell;
		GanttChart ganttChart;
		Collection<Project> plans;
		Project  plan;
		public Image img;
		public GanttCreator(Collection<Project> plans){
			this.plans= plans;
		}
		public LinkedHashMap<String,GanttEvent> updateContents(Collection<Project> plans){
			ganttChart.getGanttComposite().clearChart();
			LinkedHashMap<String,GanttEvent> eventsMap = new LinkedHashMap<String, GanttEvent>();
			Iterator<Project> planIterator = plans.iterator();
			while(planIterator.hasNext()){
				Project plan = planIterator.next();
				EList<ActivityElement> activities = plan.getActivities();
				//System.out.println("\t *"+plan.getName());
				handlePlan(plan,activities,eventsMap);
			}
			planIterator  = plans.iterator();
			//it does it again to manage all the dependencies among plans
			//in this way also cross plans dependencies can be take into account
			while(planIterator.hasNext()){
				Project plan = planIterator.next();
				EList<ActivityElement> activities = plan.getActivities();
				handleDependencies(plan,activities,eventsMap,null);
			}
			return eventsMap;
		}

		public GanttEvent handleActivity(ActivityElement element, Project plan, GanttSection gs, String qualifiedName, LinkedHashMap<String,GanttEvent>tmpEventsMap){
			GanttEvent evt = null;
			if(element instanceof Activity){	
				Activity act = (Activity)element;
				ActivityElementDecorator activity  = new ActivityElementDecorator(act);
				Calendar start = activity.getStartByCalendar();
				Calendar end = activity.getEndByCalendar();
				String name="";
				if (act.getLongName()!=null){
					name=act.getLongName();
				}else{
					name=act.getName();
				}
				evt= new GanttEvent(ganttChart, name, start, end,act.getCompleteness());	
				gs.addGanttEvent(evt);
				tmpEventsMap.put(qualifiedName+"."+element.getName(), evt);
			}else if (element instanceof CheckPoint){
				CheckPoint checkPoint = (CheckPoint)element;
				Calendar start = GregorianCalendar.getInstance();
				String name="";
				if (checkPoint.getLongName()!=null){
					name=checkPoint.getLongName();
				}else{
					name=checkPoint.getName();
				}
				start = (new ActivityElementDecorator(element)).getStartByCalendar();
				Calendar end = GregorianCalendar.getInstance();
				end = (new ActivityElementDecorator(element)).getEndByCalendar();
				evt= new GanttEvent(ganttChart, name, start, end, checkPoint.getCompleteness());
				evt.setCheckpoint(true);
				gs.addGanttEvent(evt);
				tmpEventsMap.put(qualifiedName+"."+element.getName(), evt);
			}else if (element instanceof ActivityGroup){
				ActivityGroup group = (ActivityGroup)element;
				String name="";
				if (group.getLongName()!=null){
					name=group.getLongName();
				}else{
					name=group.getName();
				}
				GanttEvent scope = new GanttEvent(ganttChart,name);
				Iterator<ActivityElement>activityIterator = group.getActivities().iterator();
				tmpEventsMap.put(qualifiedName+"."+scope.getName(), scope);
				gs.addGanttEvent(scope);
				qualifiedName= qualifiedName+"."+scope.getName();
				while(activityIterator.hasNext()){
					ActivityElement activity = activityIterator.next();
						GanttEvent innerEvent = handleActivity(activity,plan,gs,qualifiedName,tmpEventsMap);
						if(innerEvent!=null){
							if(scope!=null){
								scope.addScopeEvent(innerEvent);
							}else{
							}
						}else{
						}
				}
		
				return scope;

			}
			return evt;
		}
		public void handlePlan(Project plan,EList<ActivityElement> activities, LinkedHashMap<String,GanttEvent>eventsMap){
			Iterator<ActivityElement> activityIterator = activities.iterator();
			String name ="";
			if (plan.getLongName()!=null){
				name = plan.getLongName();
			}else{
				name = plan.getName();
			}
			GanttSection gs = new GanttSection(ganttChart, name);
			LinkedHashMap<String,GanttEvent> tmpEventsMap = new LinkedHashMap<String, GanttEvent>();
			while(activityIterator.hasNext()){
				ActivityElement element = activityIterator.next();
				GanttEvent evt = handleActivity(element,plan,gs,plan.getName(),tmpEventsMap);
			}
			Iterator<GanttEvent> events  = tmpEventsMap.values().iterator();
			eventsMap.putAll(tmpEventsMap);

		}

		private void handleDependencies(Project plan,EList<ActivityElement> activities, LinkedHashMap<String,GanttEvent>eventsMap,GanttEvent scope){
			Iterator<ActivityElement> activityIterator = activities.iterator();
			while(activityIterator.hasNext()){
				ActivityElement element = activityIterator.next();
				Iterator<ActivityElement> dependencies=element.getDependencies().iterator();
				EObject container = element.eContainer();
				String elementQualifiedName=element.getName();;
				while ( !(container instanceof Project) && (container !=null)){
					if(container instanceof ActivityGroup){
						elementQualifiedName= ((ActivityGroup)container).getName()+"."+elementQualifiedName;
					}
					container = container.eContainer();
				}
				if (container instanceof Project){
					elementQualifiedName= ((Project)container).getName()+"."+elementQualifiedName;
				}
				while(dependencies.hasNext()){
					ActivityElement dependency = (ActivityElement) dependencies.next();
					container = dependency.eContainer();
					String dependencyQualifiedName=dependency.getName();;
					while ( !(container instanceof Project) && (container !=null)){
						if(container instanceof ActivityGroup){
							dependencyQualifiedName= ((ActivityGroup)container).getName()+"."+dependencyQualifiedName;
						}
						container = container.eContainer();
					}
					if (container instanceof Project){
						dependencyQualifiedName= ((Project)container).getName()+"."+dependencyQualifiedName;
					}

					GanttEvent targetEvent = (GanttEvent) eventsMap.get(dependencyQualifiedName);
					GanttEvent dependentEvent = eventsMap.get(elementQualifiedName);
					ganttChart.addConnection(targetEvent, dependentEvent);
				}
				if (element instanceof ActivityGroup){
					handleDependencies(plan,((ActivityGroup)element).getActivities(),eventsMap,scope);
				}
			}
		}


		public void run() {
			// TODO Auto-generated method stub
			DefaultSettings settings = new DefaultSettings(){@Override
				public boolean drawGanttSectionBarToBottom() {
				return true;
			} @Override
			public final boolean drawFillsToBottomWhenUsingGanttSections() {
				return true;
			}};
			
			shell = new Shell(Display.getDefault());
			ganttChart = new GanttChart( shell, SWT.MULTI, settings);
			LinkedHashMap<String,GanttEvent> eventsMap = updateContents(plans);
			ActivityElementDecorator first = new ActivityElementDecorator(PlanUtil.getInstance().getFirstActivity(plans,true));
			ActivityElementDecorator last =  new ActivityElementDecorator(PlanUtil.getInstance().getLastActivity(plans,true));
			GanttEvent evt = eventsMap.get(first.getFullQualifiedName());
			ganttChart.getGanttComposite().jumpToEvent(evt, true, 0);
			Months months= Months.monthsBetween(new DateTime(first.getStartByCalendar()), new DateTime(last.getEndByCalendar()));
			int monthsCount= months.getMonths();
			ganttChart.getGanttComposite().setZoomLevel(11);
			if (monthsCount>2){
				ganttChart.getGanttComposite().setZoomLevel(12);
			}
			if (monthsCount>3){
				ganttChart.getGanttComposite().setZoomLevel(13);
			}
			if (monthsCount>5){
				ganttChart.getGanttComposite().setZoomLevel(15);
			}
			img = ganttChart.getGanttComposite().getImage(new Rectangle(0,0,640,480));
		}
		public GanttChart getChart(){
			return ganttChart;
		}

	}


	public String generateGanttDiagram(com.lowcoupling.mdpm.lng.plan.plan.impl.ProjectImpl plan,String name){
		Display display = PlatformUI.getWorkbench().getDisplay();
		Collection<Project> plans = PlanUtil.getInstance().getRelatedPlans(plan);
		GanttCreator gcreator = new GanttCreator(plans);
		display.syncExec(
				gcreator

				);
		String planName= plan.getName();
		IFolder planFolder = currentModel.getProject().getFolder("/docs/"+planName+"Data/");
		
		if(!planFolder.exists()){
			try {
				planFolder.create(true, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		IFolder imgFolder = currentModel.getProject().getFolder("/docs/"+planName+"Data/img/");
		if(!imgFolder.exists()){
			try {
				imgFolder.create(true, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		IFolder ganttFolder = currentModel.getProject().getFolder("/docs/"+planName+"Data/img/ganttCharts/");
		if (!ganttFolder.exists()){
			try {
				ganttFolder.create(true,true,null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		GanttImageExporter.path = currentModel.getProject().getFolder("/docs/"+planName+"Data/img/ganttCharts").getRawLocation().makeAbsolute();
		out = new File(path.toString()+"/"+name+".png");
		Image img = gcreator.img; 
		ImageLoader loader = new ImageLoader();
		loader.data = new ImageData[] {img.getImageData()};
		loader.save(this.out.getAbsolutePath(), SWT.IMAGE_PNG);
		return "<p></p>"; //+param;
	}
	public GanttImageExporter(){


	}






}