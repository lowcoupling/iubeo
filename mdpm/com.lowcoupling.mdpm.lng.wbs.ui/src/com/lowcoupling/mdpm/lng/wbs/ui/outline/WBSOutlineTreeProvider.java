/*
 * generated by Xtext
 */
package com.lowcoupling.mdpm.lng.wbs.ui.outline;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.osgi.framework.Bundle;

/**
 * customization of the default outline structure
 * 
 */
public class WBSOutlineTreeProvider extends DefaultOutlineTreeProvider {
	@Override
	protected Image _image(Object modelElement) {
		// TODO Auto-generated method stub
		Bundle bundle = Platform.getBundle("com.lowcoupling.mdpm.lng.wbs.ui");

		URL iconURL = bundle.getEntry("/images/bsnodeIcon.png");
		InputStream in = null;
		try {
			in = iconURL.openConnection().getInputStream();
			Image img = new Image(Display.getCurrent(), in);
			in.close();
			return img; 	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return super._image(modelElement);
	}
}
