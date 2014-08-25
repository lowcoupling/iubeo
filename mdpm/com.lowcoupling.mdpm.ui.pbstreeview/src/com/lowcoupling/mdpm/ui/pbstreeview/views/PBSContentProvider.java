package com.lowcoupling.mdpm.ui.pbstreeview.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;

import com.lowcoupling.mdpm.lng.pbs.pBS.Part;
import com.lowcoupling.mdpm.lng.pbs.pBS.Product;


public class PBSContentProvider implements IGraphEntityContentProvider {
	 
	public ArrayList<Object> getElements(Part part){
		ArrayList<Object> results = new ArrayList<Object>();
		Iterator<Part> partsIt = part.getParts().iterator();
		results.addAll(part.getParts());
		//results.addAll(activity.getWorkpackages());
		while(partsIt.hasNext()){
			Part pt = partsIt.next();
			results.addAll(getElements(pt));
		}
		return results;
	}
	 
	public ArrayList<Object> getElements(Product product){
		ArrayList<Object> results = new ArrayList<Object>();
		results.addAll(product.getParts());
		Iterator<Part> partsIt = product.getParts().iterator();
		while(partsIt.hasNext()){
			Part part = partsIt.next();
			results.addAll(getElements(part));
		}
		results.add(product); 
		return results;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		ArrayList<Object> results = new ArrayList<Object>();
		if (inputElement instanceof Product) {
			return  getElements((Product)inputElement).toArray();
		}

		 
		return results.toArray();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}


	@Override
	public Object[] getConnectedTo(Object entity) {
		// TODO Auto-generated method stub
		Collection<Object> results = new ArrayList<Object>();

		if (entity instanceof Product) {
			Product p = (Product) entity;
			results.addAll(p.getParts());
		}

		if (entity instanceof Part) {
			Part p = (Part) entity;
			results.addAll(p.getParts());
		}
 
		return results.toArray();
	}

}
