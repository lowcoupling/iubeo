package com.lowcoupling.mdpm.ui.occupationview.views;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.Weeks;

import com.lowcoupling.charthelper.LineChart;
import com.lowcoupling.mdpm.commons.util.PlanUtil;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityElement;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityGroup;
import com.lowcoupling.mdpm.lng.plan.plan.Program;
import com.lowcoupling.mdpm.lng.plan.plan.Project;
import com.lowcoupling.mdpm.lng.plan.util.ActivityElementDecorator;
import com.lowcoupling.mdpm.lng.resources.resources.Resource;



/**
org.eclipse.birt.chart.device.extension 	Allows third parties to extend the chart render device

org.eclipse.birt.chart.engine.extension Allows third parties to extend the chart engine.
org.eclipse.birt.chart.engine 	Renders charts.
org.eclipse.birt.core 	Provides basic functionalities for all BIRT plug-ins.
 */

public class ResourceOccupationView extends ViewPart implements ISelectionListener{

	private Chart chart;
	private ChartCanvas canvas;
	private Action zoomIn, zoomOut;
	private int zoomLevel;
	private Project lastPlan;
	public int getZoomLevel() {
		return zoomLevel;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().removeSelectionListener(this);

	}

	public void setZoomLevel(int zoomLevel) {
		this.zoomLevel = zoomLevel;
	}
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.lowcoupling.mdpm.ui.occupationview.views.ResourceOccupationView";

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub

		zoomLevel=1;
		lastPlan=null;
		EObject eobject = null;
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().addSelectionListener(this);
		IEditorPart ie = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		XtextEditor editor = (XtextEditor)ie;
		if(editor==null){
			System.out.println("<OccupationView> null editor");
		}else{
			editor.getDocument();

			eobject = editor.getDocument().readOnly(
					new IUnitOfWork<EObject, XtextResource>() {
						public EObject exec(XtextResource resource) throws Exception {
							EObject eObject = resource.getContents().get(0);
							return eObject;
						}
					});
		}
		Project plan= null;

		canvas = new ChartCanvas(parent, SWT.NONE);
		canvas.addMouseWheelListener(new OccupationChartWheelListener());	
		createActions();
		createToolBar();
		if(eobject!=null){
			if(eobject instanceof Project){
				plan = (Project)eobject;
				updateContents(plan);
			}else if(eobject instanceof Program){
				Program plans = (Program)eobject;
				updateContents(plans);
			}else if (eobject instanceof ActivityElement){
				plan = PlanUtil.getInstance().getPlan((ActivityElement)eobject);
				updateContents(plan);
			} 	
		}



	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public void refresh(){
		if(lastPlan!=null){
			updateContents(lastPlan);
		}
	}


	private void updateContents(Program plans){
		Map<String,LinkedHashMap<String,Double>> dataSet = new HashMap<String,LinkedHashMap<String,Double>>();
		Map<String,Resource> resources = PlanUtil.getInstance().getInvolvedResources(plans,true);

		ActivityElementDecorator first = new ActivityElementDecorator(PlanUtil.getInstance().getFirstActivity(plans,true));
		ActivityElementDecorator last =  new ActivityElementDecorator(PlanUtil.getInstance().getLastActivity(plans,true));

		DateTime firstDate = new DateTime(first.getStartByCalendar());
		DateTime lastDate = new DateTime(last.getEndByCalendar());
		if(zoomLevel==0){
			Iterator<Resource>resIt = resources.values().iterator();
			Months months = Months.monthsBetween(firstDate,lastDate);
			int monthsCount= months.getMonths();
			while (resIt.hasNext()){
				Resource res = resIt.next();
				LinkedHashMap<String,Double> occupations = new LinkedHashMap<String,Double>();
				DateTime tmpDate = firstDate;
				for (int m=0;m<=monthsCount; m++){
					if (res!=null){
						Interval period = new Interval(tmpDate.withDayOfMonth(1), tmpDate.dayOfMonth().withMaximumValue());
						double occupation = PlanUtil.getInstance().getOccupationByPeriod(res, plans,period);
						occupations.put(tmpDate.toString("MMM"), occupation);
						tmpDate = 	tmpDate.plusMonths(1);
					} 
				}
				dataSet.put(res.getName(), occupations);
			}
		}

		if(zoomLevel==1){
			Iterator<Resource>resIt = resources.values().iterator();
			Weeks weeks = Weeks.weeksBetween(firstDate,lastDate);
			int weeksCount= weeks.getWeeks();
			while (resIt.hasNext()){
				Resource res = resIt.next();
				LinkedHashMap<String,Double> occupations = new LinkedHashMap<String,Double>();
				DateTime tmpDate = firstDate;
				for (int m=0;m<=weeksCount; m++){
					if (res!=null){
						Interval period = new Interval(tmpDate.withDayOfWeek(1) , tmpDate.withDayOfWeek(7));
						double occupation = PlanUtil.getInstance().getOccupationByPeriod(res, plans,period);
						occupations.put(tmpDate.toString("dd/MM/yy"), occupation);
						tmpDate = 	tmpDate.plusWeeks(1);
					} 
				}
				dataSet.put(res.getName(), occupations);
			}
		}
		if(zoomLevel==2){
			Iterator<Resource>resIt = resources.values().iterator();
			Days days = Days.daysBetween(firstDate,lastDate);
			int daysCount= days.getDays();
			while (resIt.hasNext()){
				Resource res = resIt.next();
				LinkedHashMap<String,Double> occupations = new LinkedHashMap<String,Double>();
				DateTime tmpDate = firstDate;
				for (int m=0;m<=daysCount; m++){
					if (res!=null){
						Interval period = new Interval(tmpDate, tmpDate.plusDays(1));
						double occupation = PlanUtil.getInstance().getOccupationByPeriod(res,plans,period);
						occupations.put(tmpDate.toString("dd/MM/yy"), occupation);
						tmpDate = 	tmpDate.plusDays(1);
					} 
				}
				dataSet.put(res.getName(), occupations);
			}
		}

		if(dataSet.size()>0){

		}else{
			LinkedHashMap<String,Double> occupations = new LinkedHashMap<String,Double>();
			occupations.put(firstDate.toString("dd/MM/yy"), 0.1);
			occupations.put(lastDate.toString("dd/MM/yy"), 0.1);
			dataSet.put("NoResource",occupations);
		}
		LineChart oc = new LineChart(dataSet,"OccupationChart","Time","Occupation");
		oc.build();
		chart = oc.getChart();
		//canvas = new ChartCanvas(_parent, SWT.NONE);
		canvas.setChart(chart);
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);
		canvas.redraw();
		if(canvas!=null){
			//	canvas.dispose();
		}


	}

	private void updateContents(Project plan){
		lastPlan=plan;
		Map<String,LinkedHashMap<String,Double>> dataSet = new HashMap<String,LinkedHashMap<String,Double>>();
		Map<String,Resource> resources = PlanUtil.getInstance().getInvolvedResources(plan,true);
		ActivityElementDecorator first = new ActivityElementDecorator(PlanUtil.getInstance().getFirstActivity((Project)plan,true));
		ActivityElementDecorator last =  new ActivityElementDecorator(PlanUtil.getInstance().getLastActivity((Project)plan,true));
		DateTime firstDate = new DateTime(first.getStartByCalendar());
		DateTime lastDate = new DateTime(last.getEndByCalendar());
		if(zoomLevel==0){
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

		if(zoomLevel==1){
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
		if(zoomLevel==2){
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

		if(dataSet.size()>0){

		}else{
			LinkedHashMap<String,Double> occupations = new LinkedHashMap<String,Double>();
			occupations.put(firstDate.toString("dd/MM/yy"), 0.1);
			occupations.put(lastDate.toString("dd/MM/yy"), 0.1);
			dataSet.put("NoResource",occupations);
		}
		LineChart oc = new LineChart(dataSet,"OccupationChart","Time","Occupation");
		oc.build();
		chart = oc.getChart();
		//canvas = new ChartCanvas(_parent, SWT.NONE);
		canvas.setChart(chart);
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);
		canvas.redraw();
		if(canvas!=null){
			//	canvas.dispose();
		}


	}
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		EObject eobject = null;
		XtextEditor editor = null;
		if(selection != null && !selection.isEmpty()){

			if (selection instanceof ITextSelection){
				final ITextSelection textSel = (ITextSelection) selection;
				IEditorPart ie = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				editor = (XtextEditor)ie;
				if(editor==null){
					System.out.println("null editor");
				}else{

					eobject = editor.getDocument().readOnly(
							new IUnitOfWork<EObject, XtextResource>() {
								public EObject exec(XtextResource resource) throws Exception {
									EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();
									EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, textSel.getOffset());
									return eObject;
								}
							});
				}
			}
			//System.out.println("eobject "+eobject.getClass().getName());
			if (selection instanceof IStructuredSelection) {
				Object first = ((IStructuredSelection)selection).getFirstElement();
				if (first!=null && first instanceof EObjectNode){
					EObjectNode enode = (EObjectNode)first;
					ResourceSet resourceSet = new ResourceSetImpl();
					org.eclipse.emf.ecore.resource.Resource inResource = resourceSet.getResource(enode.getEObjectURI(),true);
					//System.out.println(inResource);
					eobject = (EObject)inResource.getEObject(enode.getEObjectURI().fragment());
				}
			}
			if (eobject instanceof Project){
				updateContents((Project)eobject);

			}
			if (eobject instanceof Program){
				Program plans = (Program)eobject;	
				updateContents(plans);
			}
			if (eobject instanceof ActivityGroup){
				@SuppressWarnings("unused")
				ActivityGroup group = (ActivityGroup)eobject;

			}
			if (eobject instanceof ActivityElement){
				Project plan = PlanUtil.getInstance().getPlan((ActivityElement)eobject);
				updateContents(plan);
			}

		}

	}

	class OccupationChartWheelListener implements MouseWheelListener{
		//private GanttChart ganttChart;
		public OccupationChartWheelListener(){
			//ganttChart= gantt;
		}

		@Override
		public void mouseScrolled(MouseEvent e) {
			// TODO Auto-generated method stub
			//if(ganttChart!=null){
			if(e.count>0){
				//System.out.println("Occupation Zoom In");
				//ganttChart.getGanttComposite().zoomIn();
			}else{
				//ganttChart.getGanttComposite().zoomOut();
				//System.out.println("Occupation Zoom out");
			}
			//}
		}

	}

	private void createActions() {
		zoomIn = new ZoomInAction(this);
		zoomOut = new ZoomOutAction( this);
	}

	private void createToolBar(){  
		IToolBarManager toolbarMGR = getViewSite().getActionBars().getToolBarManager();  
		toolbarMGR.add(zoomIn);  
		toolbarMGR.add(zoomOut); 
	}

	class ZoomInAction extends Action{
		private ResourceOccupationView view;
		public ZoomInAction(ResourceOccupationView view){
			super("Zoom In");
			this.view=view;
		}
		public void run() { 
			if(zoomLevel<2){
				zoomLevel++;
				view.setZoomLevel(zoomLevel);
			}
			view.refresh();
		}
	}
	class ZoomOutAction extends Action{
		private ResourceOccupationView view;
		public ZoomOutAction(ResourceOccupationView view){
			super("Zoom out");
			this.view=view;
		}
		public void run() { 
			if(zoomLevel>0){
				zoomLevel--;
				view.setZoomLevel(zoomLevel);
			}
			view.refresh();
		}

	}
}


