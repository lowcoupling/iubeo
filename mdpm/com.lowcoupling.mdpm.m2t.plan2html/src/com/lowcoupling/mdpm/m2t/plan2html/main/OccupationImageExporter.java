package com.lowcoupling.mdpm.m2t.plan2html.main;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.Weeks;

import com.lowcoupling.charthelper.ChartToPngRenderer;
import com.lowcoupling.charthelper.LineChart;
import com.lowcoupling.mdpm.commons.util.PlanUtil;
import com.lowcoupling.mdpm.lng.plan.plan.Project;
import com.lowcoupling.mdpm.lng.plan.plan.impl.ProjectImpl;
import com.lowcoupling.mdpm.lng.plan.util.ActivityElementDecorator;
import com.lowcoupling.mdpm.lng.resources.resources.Resource;
public class OccupationImageExporter {

	private static IPath path;
	private File out;
	private int zoomLevel;
	private static IFile currentModel;

	public static IFile getCurrentModel() {
		return currentModel;
	}

	public static void setCurrentModel(IFile currentModel) {
		OccupationImageExporter.currentModel = currentModel;
	}

	public String generateDiagram(com.lowcoupling.mdpm.lng.plan.plan.impl.ProgramImpl plans){
		Iterator<Project>planIt= plans.getProjects().iterator();
		while(planIt.hasNext()){
			Project plan = planIt.next();
			String result= "";
			result= result+generateDiagram((ProjectImpl)plan,0,plan.getName()+"ChartOccupation0.png");
			result= result+" "+generateDiagram((ProjectImpl)plan,1,plan.getName()+"ChartOccupation1.png");
			result = result+" "+generateDiagram((ProjectImpl)plan,2,plan.getName()+"ChartOccupation2.png");

		}
		return "";
	}

	public String generateDiagram(com.lowcoupling.mdpm.lng.plan.plan.impl.ProjectImpl plan,int zoom, String name){
		zoomLevel =zoom;
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
		IFolder occupationFolder = currentModel.getProject().getFolder("/docs/"+planName+"Data/img/occupationCharts/");
		if (!occupationFolder.exists()){
			try {
				occupationFolder.create(true,true,null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		OccupationImageExporter.path = currentModel.getProject().getFolder("/docs/"+planName+"Data/img/occupationCharts").getRawLocation().makeAbsolute();



		out = new File(path.toString()+"/"+name);
		//System.out.println("Trying to create "+path.toString()+"/"+name+" create in "+out.toString());
		LineChart oc = updateContents(plan);
		if(oc!=null){
			oc.build();
			Chart chart = oc.getChart();
			ChartToPngRenderer pngCanvas = new ChartToPngRenderer(SWT.NONE, out);
			pngCanvas.setChart(chart);
			pngCanvas.buildChart();
			pngCanvas.drawToCachedImage(new Rectangle(0,0, 640,480));
		}
		return plan.getName()+" Diagram Generated";
	}
	public OccupationImageExporter(){

	}




	
	private LineChart updateContents(Project plan){
		//System.out.println("Project "+plan.getName()+"ZOOM LEVEL "+zoomLevel);
		Map<String,LinkedHashMap<String,Double>> dataSet = new HashMap<String,LinkedHashMap<String,Double>>();
		Map<String,Resource> resources = PlanUtil.getInstance().getInvolvedResources(plan,true);
		if (resources.size()==0){
			return null;
		}
		ActivityElementDecorator first = new ActivityElementDecorator(PlanUtil.getInstance().getFirstActivity((Project)plan,true));
		ActivityElementDecorator last =  new ActivityElementDecorator(PlanUtil.getInstance().getLastActivity((Project)plan,true));
		DateTime firstDate = new DateTime(first.getStartByCalendar());
		DateTime lastDate = new DateTime(last.getEndByCalendar());
		if(this.zoomLevel==0){
			Iterator<Resource>resIt = resources.values().iterator();
			Months months = Months.monthsBetween(firstDate,lastDate);
			int monthsCount= months.getMonths();
			while (resIt.hasNext()){
				Resource res = resIt.next();
				LinkedHashMap<String,Double> occupations = new LinkedHashMap<String,Double>();
				//System.out.println("Analyzing "+ res.getName());
				DateTime tmpDate = firstDate;
				for (int m=0;m<=monthsCount; m++){
					if (res!=null){
						Interval period = new Interval(tmpDate.withDayOfMonth(1), tmpDate.dayOfMonth().withMaximumValue());
						double occupation = PlanUtil.getInstance().getOccupationByPeriod(res, (Project)plan,period,true);
						occupations.put(tmpDate.toString("MMM"), occupation);
						tmpDate = 	tmpDate.plusMonths(1);
					} 
				}
				dataSet.put(res.getName(), occupations);
			}
		}

		if(this.zoomLevel==1){
			Iterator<Resource>resIt = resources.values().iterator();
			Weeks weeks = Weeks.weeksBetween(firstDate,lastDate);
			int weeksCount= weeks.getWeeks();
			while (resIt.hasNext()){
				Resource res = resIt.next();
				LinkedHashMap<String,Double> occupations = new LinkedHashMap<String,Double>();
				//System.out.println("Analyzing "+ res.getName());
				DateTime tmpDate = firstDate;
				for (int m=0;m<=weeksCount; m++){
					if (res!=null){
						Interval period = new Interval(tmpDate.withDayOfWeek(1) , tmpDate.withDayOfWeek(7));
						double occupation = PlanUtil.getInstance().getOccupationByPeriod(res, (Project)plan,period,true);
						occupations.put(tmpDate.toString("dd/MM/yy"), occupation);
						tmpDate = 	tmpDate.plusWeeks(1);
					} 
				}
				dataSet.put(res.getName(), occupations);
			}
		}
		if(this.zoomLevel==2){
			Iterator<Resource>resIt = resources.values().iterator();
			Days days = Days.daysBetween(firstDate,lastDate);
			int daysCount= days.getDays();
			while (resIt.hasNext()){
				Resource res = resIt.next();
				LinkedHashMap<String,Double> occupations = new LinkedHashMap<String,Double>();
				//System.out.println("Analyzing "+ res.getName());
				DateTime tmpDate = firstDate;
				for (int m=0;m<=daysCount; m++){
					if (res!=null){
						Interval period = new Interval(tmpDate, tmpDate.plusDays(1));
						double occupation = PlanUtil.getInstance().getOccupationByPeriod(res,(Project)plan,period,true);
						occupations.put(tmpDate.toString("dd/MM/yy"), occupation);
						tmpDate = 	tmpDate.plusDays(1);
					} 
				}
				dataSet.put(res.getName(), occupations);
			}
		}
		LineChart oc = new LineChart(dataSet,"OccupationChart","Time","Occupation");
		return oc;

	}

}