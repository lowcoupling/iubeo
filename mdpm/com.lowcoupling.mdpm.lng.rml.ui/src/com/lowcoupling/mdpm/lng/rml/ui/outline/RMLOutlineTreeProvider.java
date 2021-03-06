/*
 * generated by Xtext
 */
package com.lowcoupling.mdpm.lng.rml.ui.outline;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.osgi.framework.Bundle;

import com.lowcoupling.mdpm.lng.rml.rML.REQRequirement;
import com.lowcoupling.mdpm.lng.rml.rML.RMLPackage;

/**
 * customization of the default outline structure
 * 
 */
public class RMLOutlineTreeProvider extends DefaultOutlineTreeProvider {
	@Override
	protected Image _image(Object modelElement) {
		// TODO Auto-generated method stub
		//return super._image(modelElement);
		Image img = null;
		if (modelElement instanceof REQRequirement){
			
			Bundle resourcesBundle = Platform.getBundle("com.lowcoupling.mdpm.lng.rml.ui");
			URL planIconUrl = resourcesBundle.getEntry("/images/req_icon.png");
			InputStream in = null;
			try {
				in = planIconUrl.openConnection().getInputStream();
				img = new Image(Display.getCurrent(), in);
				in.close();	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}else{
			img = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		}
		return img;
	}


}
