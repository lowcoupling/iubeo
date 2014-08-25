package com.lowcoupling.mdpm.ui.wbstreeview.views;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.zest.core.viewers.IConnectionStyleProvider;
import org.eclipse.zest.core.widgets.ZestStyles;

public class ConnectionStyleProvider implements IConnectionStyleProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getConnectionStyle(Object rel) {
		// TODO Auto-generated method stub
		return ZestStyles.CONNECTIONS_SOLID;
	}

	@Override
	public Color getColor(Object rel) {
		// TODO Auto-generated method stub
		return ColorConstants.black;
	}

	@Override
	public Color getHighlightColor(Object rel) {
		// TODO Auto-generated method stub
		return ColorConstants.lightGreen;
	}

	@Override
	public int getLineWidth(Object rel) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public IFigure getTooltip(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
