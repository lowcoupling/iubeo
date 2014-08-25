package com.lowcoupling.mdpm.ui.pbstreeview.views;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.zest.core.viewers.ISelfStyleProvider;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;

import com.lowcoupling.mdpm.lng.pbs.pBS.Part;
import com.lowcoupling.mdpm.lng.pbs.pBS.Product;

public class PBSLabelProvider extends LabelProvider implements ISelfStyleProvider{
	@Override

	public String getText(Object element) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		if (element instanceof Product) {
			Product product = (Product) element;
			builder.append(product.getName());
		}
		if (element instanceof Part) {
			Part part = (Part) element;
			builder.append(part.getName());
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
		
//		if (node.getSize().width  <100){
//			node.setSize(100, node.getSize().height);
//		}
//		if (node.getSize().height<30){
//			node.setSize(node.getSize().width, 30);
//		}
		if (element instanceof Product){
			node.setBackgroundColor(ColorConstants.darkBlue);
			node.setForegroundColor(ColorConstants.white);
		}
		if (element instanceof Part){
			node.setBackgroundColor(ColorConstants.blue);
			node.setForegroundColor(ColorConstants.white);
		}
 
	}

}