package com.lowcoupling.mdpm.ui.wbstreeview.views;

import java.io.File;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.zest.core.viewers.GraphViewer;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject;

public class WBSTreeImageExporter {
	public WBSTreeImageExporter(WBSProject project, String path){		
//		Graph g = (Graph) getControl();
//		Rectangle bounds = g.getContents().getBounds();
//		Point size = new Point(g.getContents().getSize().width, g.getContents()
//			.getSize().height);
//		org.eclipse.draw2d.geometry.Point viewLocation = g.getViewport()
//			.getViewLocation();
//		final Image image = new Image(null, size.x, size.y);
//		GC gc = new GC(image);
//		SWTGraphics swtGraphics = new SWTGraphics(gc);
//
//		swtGraphics.translate(-1 * bounds.x + viewLocation.x, -1 * bounds.y
//			+ viewLocation.y);
//		g.getViewport().paint(swtGraphics);
//		gc.copyArea(image, 0, 0);
//		gc.dispose();
//		ImageLoader loader = new ImageLoader();
//		loader.data = new ImageData[] { image.getImageData() };
//		loader.save(filename, format);
//		
//		
//			
		Shell shell = new Shell(Display.getDefault());
		System.out.println("Generating WBSTree for "+project.getName());
		GraphViewer viewer  = new GraphViewer(shell, SWT.NONE);
		viewer.setContentProvider(new WBSContentProvider());
		viewer.setLabelProvider(new WBSLabelProvider()); 
		viewer.setInput(project);
		GC gc = new GC(viewer.getControl());
		Rectangle bounds = new Rectangle(10, 10, 640, 480); // viewer.getControl().getBounds();
		viewer.getControl().setBounds(bounds);
		viewer.refresh();
		
		Image image = new Image(viewer.getControl().getDisplay(), viewer.getControl().getBounds());
		try {
			gc.copyArea(image, 0, 0);
			ImageLoader imageLoader = new ImageLoader();
			imageLoader.data = new ImageData[] { image.getImageData() };
			File out = new File(path);
			imageLoader.save("C:\\Test.png", SWT.IMAGE_PNG);
		} finally {
			image.dispose();
			gc.dispose();
		}
		image.dispose();
		gc.dispose();
	}

}
