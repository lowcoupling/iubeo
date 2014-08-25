package com.lowcoupling.mdpm.ui.wbstreeview.views;


import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionBars;
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
import org.eclipse.zest.core.viewers.AbstractZoomableViewer;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IZoomableWorkbenchPart;
import org.eclipse.zest.core.viewers.ZoomContributionViewItem;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.CompositeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.DirectedGraphLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalShift;
import org.osgi.framework.Bundle;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject;

public class WBSTreeView extends ViewPart implements ISelectionListener, IZoomableWorkbenchPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.lowcoupling.mdpm.ui.wbstreeview.views.WBSTreeView";

	private GraphViewer viewer;
	private Action export;
	private Action zoomIn;
	private Action zoomOut;
	private double[] zoomLevels = { .5, .75, 1.0, 1.5, 2.0, 2.5, 3, 4 };
	private int zoomIndex = 2;
	/**
	 * The constructor.
	 */
	public WBSTreeView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new GraphViewer(parent, SWT.NONE);
		viewer.setContentProvider(new WBSContentProvider());
		viewer.setLabelProvider(new WBSLabelProvider());
		int style = LayoutStyles.NO_LAYOUT_NODE_RESIZING;
		DirectedGraphLayoutAlgorithm alg = new DirectedGraphLayoutAlgorithm(style);
		viewer.setLayoutAlgorithm(
				new CompositeLayoutAlgorithm(style,
						new LayoutAlgorithm[]{
						alg, 
						new HorizontalShift(style) 
				}
						));


		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().addSelectionListener(this);
		export = new ExportAction(viewer);
		zoomIn = new ZoomIn(viewer);
		zoomOut = new ZoomOut(viewer);
		fillToolBar();
	}



	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		EObject eobject = null;
		if(selection != null && !selection.isEmpty()){

			if (selection instanceof ITextSelection){
				final ITextSelection textSel = (ITextSelection) selection;
				IEditorPart ie = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				XtextEditor editor = (XtextEditor)ie;
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
			if (selection instanceof IStructuredSelection) {
				Object first = ((IStructuredSelection)selection).getFirstElement();
				if (first!=null && first instanceof EObjectNode){
					EObjectNode enode = (EObjectNode)first;
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource inResource = resourceSet.getResource(enode.getEObjectURI(),true);
					//System.out.println(inResource);
					eobject = (EObject)inResource.getEObject(enode.getEObjectURI().fragment());
				}
			}
			if (eobject instanceof WBSNode){
				updateCanvas((WBSNode)eobject);
			}
			if (eobject instanceof WBSProject){
				updateCanvas((WBSProject)eobject);
			}
			if (eobject instanceof WBSProgram){
				updateCanvas((WBSProgram)eobject);
			}

		}
	}

	public void updateCanvas(WBSProject project){
		viewer.setInput(project);
	}
	public void updateCanvas(WBSProgram program){
		viewer.setInput(program);
		

	}
	public void updateCanvas(WBSNode activity){
		//ModelNode node = new ModelNode(activity);
		//viewer.setContents(node);
	}
	
	

	private void fillToolBar() {
		ZoomContributionViewItem toolbarZoomContributionViewItem = new ZoomContributionViewItem(this);
		IActionBars bars = getViewSite().getActionBars();
		getViewSite().getActionBars().getToolBarManager().add(zoomIn);
		getViewSite().getActionBars().getToolBarManager().add(zoomOut);
		
		getViewSite().getActionBars().getToolBarManager().add(export);
		
		//bars.getMenuManager().add(toolbarZoomContributionViewItem);

	}

	@Override
	public AbstractZoomableViewer getZoomableViewer() {
		// TODO Auto-generated method stub
		return viewer;
	}
	
	class ZoomIn extends Action{
		private GraphViewer viewer;
		public ZoomIn(GraphViewer viewer){ 
			super("ZoomIn");
			Bundle bundle = Platform.getBundle("com.lowcoupling.mdpm.commons");
			Path path = new Path("icons/zoomIn.png");
			URL fileURL = FileLocator.find(bundle, path, null);
			ImageDescriptor img = ImageDescriptor.createFromURL(fileURL);
			this.setImageDescriptor(img);
			this.viewer = viewer;
		}
		public void run(){
			Graph gr = viewer.getGraphControl();
			ZoomManager zoomManager = new ZoomManager(
					gr.getRootLayer(), 
					gr.getViewport() );
			if (zoomIndex < zoomLevels.length){
				zoomIndex++;
			}
			zoomManager.setZoom(zoomLevels[zoomIndex]);

		}
	}
	
	class ZoomOut extends Action{
		private GraphViewer viewer;
		public ZoomOut(GraphViewer viewer){ 
			super("ZoomOut"); 
			Bundle bundle = Platform.getBundle("com.lowcoupling.mdpm.commons");
			Path path = new Path("icons/zoomOut.png");
			URL fileURL = FileLocator.find(bundle, path, null);
			ImageDescriptor img = ImageDescriptor.createFromURL(fileURL);
			this.setImageDescriptor(img);
			this.viewer = viewer;
		}
		public void run(){
			Graph gr = viewer.getGraphControl();
			ZoomManager zoomManager = new ZoomManager(
					gr.getRootLayer(), 
					gr.getViewport() );
			 zoomManager.zoomOut();
			 if (zoomIndex > 0){
					zoomIndex--;
				}
				zoomManager.setZoom(zoomLevels[zoomIndex]);
		}
	}
	
	class ExportAction extends Action{
		private GraphViewer viewer;
		public ExportAction(GraphViewer viewer){
			super("Export"); 
			Bundle bundle = Platform.getBundle("com.lowcoupling.mdpm.commons");
			Path path = new Path("icons/export.gif");
			URL fileURL = FileLocator.find(bundle, path, null);
			ImageDescriptor img = ImageDescriptor.createFromURL(fileURL);
			this.setImageDescriptor(img); 
			this.viewer = viewer;
		}
		public void run() { 
			FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell());
		    // Set the text
		    fileDialog.setText("Select File");
		    // Set filter on .txt files
		    fileDialog.setFilterExtensions(new String[] { "*.png" });
		    // Put in a readable name for the filter
		   // fileDialog.setFilterNames(new String[] { "Textfiles(*.txt)" });
		    // Open Dialog and save result of selection
		    String selected = fileDialog.open();
		    System.out.println("SELECTED: "+selected);
		    ImageLoader loader = new ImageLoader();
		    GC gc = new GC(viewer.getControl());
			Rectangle bounds = viewer.getControl().getBounds();
			Image image = new Image(viewer.getControl().getDisplay(), bounds);
			try {
			    gc.copyArea(image, 0, 0);
			    ImageLoader imageLoader = new ImageLoader();
			    imageLoader.data = new ImageData[] { image.getImageData() };
			    imageLoader.save(selected, SWT.IMAGE_PNG);
			} finally {
			    image.dispose();
			    gc.dispose();
			}
		}
	}
		
}