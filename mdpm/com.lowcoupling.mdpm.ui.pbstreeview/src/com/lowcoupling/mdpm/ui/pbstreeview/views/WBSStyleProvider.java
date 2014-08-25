package com.lowcoupling.mdpm.ui.pbstreeview.views;

import org.eclipse.zest.core.viewers.ISelfStyleProvider;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;

public class WBSStyleProvider implements ISelfStyleProvider {

	@Override
	public void selfStyleConnection(Object element, GraphConnection connection) {
		// TODO Auto-generated method stub
		connection.setCurveDepth(10);
	}

	@Override
	public void selfStyleNode(Object element, GraphNode node) {
		// TODO Auto-generated method stub
		
	}

}
