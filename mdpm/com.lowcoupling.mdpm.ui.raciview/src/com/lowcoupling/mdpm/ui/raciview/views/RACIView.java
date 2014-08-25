package com.lowcoupling.mdpm.ui.raciview.views;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.nebula.widgets.grid.Grid;
import org.eclipse.nebula.widgets.grid.GridColumn;
import org.eclipse.nebula.widgets.grid.GridEditor;
import org.eclipse.nebula.widgets.grid.GridItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
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

import com.lowcoupling.mdpm.commons.util.PlanUtil;
import com.lowcoupling.mdpm.lng.plan.plan.Activity;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityElement;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityGroup;
import com.lowcoupling.mdpm.lng.plan.plan.Program;
import com.lowcoupling.mdpm.lng.plan.plan.Project;
import com.lowcoupling.mdpm.lng.plan.plan.ResourceInvolvement;
import com.lowcoupling.mdpm.lng.resources.resources.Resource;

public class RACIView extends ViewPart implements ISelectionListener {
	Composite parent;

	class GridMouseAdapter implements MouseListener{
		Grid grid;
		GridEditor editor;
		public GridMouseAdapter(Grid grid){
			this.grid= grid;

		}
		@Override
		public void mouseDoubleClick(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseDown( MouseEvent e) {
			this.editor = new GridEditor( grid);
			Control oldEditor = editor.getEditor();
			if ( oldEditor != null){
				oldEditor.dispose();
			}

			Point pt = new Point( e.x, e.y);
			final GridItem item = grid.getItem( pt);
			final Point cell = grid.getCell( pt);
			if ( item == null || cell == null){
				return;
			}


			// The control that will be the editor must be a child of the Table
			Text newEditor = new Text( grid, SWT.SINGLE | SWT.BORDER | SWT.WRAP);
			newEditor.setText( item.getText( cell.x));
			editor.setEditor( newEditor, item, cell.x);
			editor.grabHorizontal = true;
			editor.grabVertical = true;

		}

		@Override
		public void mouseUp(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
	private Grid grid;



	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().removeSelectionListener(this);

	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent= parent;
		grid = new Grid(parent,SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		grid.setHeaderVisible(true);
		grid.setRowHeaderVisible(true);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().addSelectionListener(this);


		GridColumn column = new GridColumn(grid,SWT.NONE);
		column.setTree(false);
		column.setText("Resource");
		column.setWidth(100);
		column.setWordWrap( true);
		//item1.setHeaderBackground(new org.eclipse.swt.graphics.Color());
		//item1.setText("Root Item");


		GridItem item1 = new GridItem(grid,SWT.NONE);
		grid.setCellSelectionEnabled( true);
		item1.setHeaderText("Activity");

		item1 = new GridItem(grid,SWT.NONE);
		grid.setCellSelectionEnabled( true);
		item1.setHeaderText("Activity");


		//grid.addMouseListener( new GridMouseAdapter(grid)); 
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
	public void updateContents(Project plan){
		GridColumn cols[] = grid.getColumns();
		grid.clearAll(true);
		grid.removeAll();
		for (int c=0;c<cols.length; c++){
			cols[c].dispose();
		}

		Map<String,Resource> resources = PlanUtil.getInstance().getInvolvedResources(plan,false);
		if(resources.isEmpty()){
			return;
		}
		Iterator<Resource>resIt = resources.values().iterator();
		//Iterator<Resource>resIt2 = resIt.
		Iterator<ActivityElement> activities = PlanUtil.getInstance().getAllActivities(plan, true).values().iterator();

		while (resIt.hasNext()){
			Resource res = resIt.next();

			GridColumn column = new GridColumn(grid,SWT.NONE);
			column.setTree(false);
			column.setText(res.getName());
			column.setWidth(100);
			column.setWordWrap( true);
			//item1.setHeaderBackground(new org.eclipse.swt.graphics.Color());
			//item1.setText("Root Item");
		}

		while (activities.hasNext()){
			ActivityElement act = activities.next();
			if(act instanceof Activity){
				Activity activity = (Activity)act;
				resIt = resources.values().iterator();
				GridItem item1 = new GridItem(grid,SWT.NONE);
				grid.setCellSelectionEnabled( true);
				item1.setHeaderText(act.getName());
				Color background = Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
				item1.setForeground(background);
				int i=0;
				while(resIt.hasNext()){
					Resource res = resIt.next();
					//System.out.print("Checking "+res.getName()+ "against "+activity.getName());
					Iterator<ResourceInvolvement> invIt = activity.getInvolvedResources().iterator();
					ResourceInvolvement involvement = null;
					while(invIt.hasNext()){
						involvement= invIt.next();
						if(involvement.getResource()==res){
							break;
						}else{
							involvement=null;
						}
					}
					if(involvement!=null){
						//System.out.println(" RESOURCE INVOLVED");
						item1.setText(i,involvement.getResponsibility().toString());
						 
					}else{
						item1.setText(i,"--");
					}
					i++;


				}
			}
		}
	}


	public void updateContents(Program plans){
		//if(grid!=null){
		//	grid.dispose();
		//}
		GridColumn cols[] = grid.getColumns();
		grid.clearAll(true);
		grid.removeAll();
		for (int c=0;c<cols.length; c++){
			cols[c].dispose();
		}

		//grid = new Grid(this.parent,SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		Map<String,Resource> resources = PlanUtil.getInstance().getInvolvedResources(plans,true);
		if(resources.isEmpty()){
			return;
		}
		Iterator<Resource>resIt = resources.values().iterator();
		while (resIt.hasNext()){
			Resource res = resIt.next();

			GridColumn column = new GridColumn(grid,SWT.NONE);
			column.setTree(false);
			column.setText(res.getName());
			column.setWidth(100);
			column.setWordWrap( true);
			//item1.setHeaderBackground(new org.eclipse.swt.graphics.Color());
			//item1.setText("Root Item");
		}

		GridItem item1 = new GridItem(grid,SWT.NONE);
		grid.setCellSelectionEnabled( true);
		item1.setHeaderText("Activity");

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		EObject eobject = null;
		XtextEditor ceditor = null;
		if(selection != null && !selection.isEmpty()){

			if (selection instanceof ITextSelection){
				final ITextSelection textSel = (ITextSelection) selection;
				IEditorPart ie = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				ceditor = (XtextEditor)ie;
				if(ceditor==null){
					System.out.println("null editor");
				}else{

					eobject = ceditor.getDocument().readOnly(
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
			//System.out.println("Selection made");
			if (eobject instanceof Project){
				updateContents((Project)eobject);
				//System.out.println("\t Project selected");

			}
			if (eobject instanceof Program){
				Program plans = (Program)eobject;	
				updateContents(plans);
				//System.out.println("\t Program selected");
			}
			if (eobject instanceof ActivityGroup){
				@SuppressWarnings("unused")
				ActivityGroup group = (ActivityGroup)eobject;
				//System.out.println("\t Group selected");

			}
			if (eobject instanceof ActivityElement){
				Project plan = PlanUtil.getInstance().getPlan((ActivityElement)eobject);
				updateContents(plan);
				//System.out.println("\t Element selected");
			}

		}

	}

}

