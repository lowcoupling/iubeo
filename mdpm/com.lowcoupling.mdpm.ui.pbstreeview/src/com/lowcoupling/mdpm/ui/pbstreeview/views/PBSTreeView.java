package com.lowcoupling.mdpm.ui.pbstreeview.views;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
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
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.CompositeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.DirectedGraphLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalShift;

import com.lowcoupling.mdpm.lng.pbs.pBS.Product;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class PBSTreeView extends ViewPart implements ISelectionListener, IZoomableWorkbenchPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.lowcoupling.mdpm.ui.pbstreeview.views.PBSTreeView";
	private GraphViewer viewer;
	
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().
					getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public PBSTreeView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new GraphViewer(parent, SWT.NONE);
		viewer.setContentProvider(new PBSContentProvider());
		viewer.setLabelProvider(new PBSLabelProvider());
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
			//System.out.println("eobject "+eobject.getClass().getName());
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
			 
			if (eobject instanceof Product){
				updateCanvas((Product)eobject);
			}
	 

		}
	}

	public void updateCanvas(Product product){
		viewer.setInput(product);
	    GC gc = new GC(viewer.getControl());
		Rectangle bounds = viewer.getControl().getBounds();
		Image image = new Image(viewer.getControl().getDisplay(), bounds);
		try {
		    gc.copyArea(image, 0, 0);
		    ImageLoader imageLoader = new ImageLoader();
		    imageLoader.data = new ImageData[] { image.getImageData() };
		    imageLoader.save("c:\\out.png", SWT.IMAGE_PNG);
		} finally {
		    image.dispose();
		    gc.dispose();
		}
	}
 
 

	private void fillToolBar() {
		ZoomContributionViewItem toolbarZoomContributionViewItem = new ZoomContributionViewItem(this);
		IActionBars bars = getViewSite().getActionBars();
		bars.getMenuManager().add(toolbarZoomContributionViewItem);

	}

	@Override
	public AbstractZoomableViewer getZoomableViewer() {
		// TODO Auto-generated method stub
		return viewer;
	}

}