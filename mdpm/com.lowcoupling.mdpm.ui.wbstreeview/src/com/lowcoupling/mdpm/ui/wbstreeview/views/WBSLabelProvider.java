package com.lowcoupling.mdpm.ui.wbstreeview.views;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.zest.core.viewers.ISelfStyleProvider;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSActivity;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSDeliverable;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSWorkPackage;

public class WBSLabelProvider extends LabelProvider implements ISelfStyleProvider{
	@Override

	public String getText(Object element) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		if (element instanceof WBSProgram) {
			WBSProgram program = (WBSProgram) element;
			builder.append(program.getName());
		}
		if (element instanceof WBSProject) {
			WBSProject project = (WBSProject) element;
			builder.append(project.getName());
		}
		if (element instanceof WBSActivity) {
			WBSActivity act = (WBSActivity) element;
			builder.append(act.getName());
		}
		if (element instanceof WBSDeliverable) {
			WBSDeliverable act = (WBSDeliverable) element;
			builder.append(act.getName());
		}
		if (element instanceof WBSWorkPackage) {
			WBSWorkPackage wp = (WBSWorkPackage) element;
			builder.append(wp.getName());
		}
		return builder.toString();
	}

	@Override
	public void selfStyleConnection(Object element, GraphConnection connection) {
		// TODO Auto-generated method stub
		connection.setCurveDepth(2);

		//connection.setConnectionStyle(ZestStyles.CONNECTIONS_DOT);
		//connection.setLineStyle(ZestStyles.CONNECTIONS_DASH_DOT);
	}

	@Override
	public void selfStyleNode(Object element, GraphNode node) {
		// TODO Auto-generated method stub
		
		node.setForegroundColor(ColorConstants.black);
		node.setBackgroundColor(null);
		if (node.getSize().width<100){
			node.setSize(100, node.getSize().height);
		}
		if (node.getSize().height<30){
			node.setSize(node.getSize().width, 30);
		}
		if (element instanceof WBSProgram){
			node.setBackgroundColor(ColorConstants.darkBlue);
			node.setForegroundColor(ColorConstants.white);
		}
		if (element instanceof WBSProject){
			node.setBackgroundColor(ColorConstants.blue);
			node.setForegroundColor(ColorConstants.white);
		}
		if (element instanceof WBSActivity){
			node.setBackgroundColor(ColorConstants.lightBlue);
		}
		if (element instanceof WBSDeliverable){
			node.setBackgroundColor(ColorConstants.cyan);
		}
		if (element instanceof WBSWorkPackage){
			node.setBackgroundColor(ColorConstants.lightGreen);
		}
	}
}