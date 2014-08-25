package com.lowcoupling.mdpm.ui.wbstreeview.views;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject;

public class WBSContentProvider implements IGraphEntityContentProvider {

	public ArrayList<Object> getElements(WBSNode activity){
		ArrayList<Object> results = new ArrayList<Object>();
		Iterator<WBSNode> actIt = activity.getWbsNodes().iterator();
		results.addAll(activity.getWbsNodes());
		//results.addAll(activity.getWorkpackages());
		while(actIt.hasNext()){
			WBSNode act = actIt.next();
			results.addAll(getElements(act));
		}
		return results;
	}

	public ArrayList<Object> getElements(WBSProject project){
		ArrayList<Object> results = new ArrayList<Object>();
		results.addAll(project.getWbsNodes());
		Iterator<WBSNode>actIt = project.getWbsNodes().iterator();
		while(actIt.hasNext()){
			WBSNode act = actIt.next();
			results.addAll(getElements(act));
		}
		results.add(project); 
		return results;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		ArrayList<Object> results = new ArrayList<Object>();
		if (inputElement instanceof WBSProgram) {
			WBSProgram program = (WBSProgram) inputElement;
			Iterator<WBSProject> prjIt = program.getProjects().iterator();
			while(prjIt.hasNext()){
				WBSProject prj = prjIt.next();
				results.addAll(getElements(prj));
			}
			results.add(program);
		}

		if (inputElement instanceof WBSProject) {
			WBSProject project = (WBSProject) inputElement;
			//results.addAll(project.getName());
			results.addAll(project.getWbsNodes());
			Iterator<WBSNode>actIt = project.getWbsNodes().iterator();
			while(actIt.hasNext()){
				WBSNode act = actIt.next();
				results.addAll(getElements(act));
			}
			results.add(project);
		}
		if (inputElement instanceof WBSNode) {
			WBSNode activity = (WBSNode) inputElement;
			//results.addAll(project.getName());
			results.addAll(activity.getWbsNodes());
			//results.addAll(activity.getWorkpackages());
			//results.add(activity);
		}
		if (inputElement instanceof WBSNode) {
			WBSNode wp = (WBSNode) inputElement;
			//results.addAll(project.getName());
			results.add(wp);
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

		if (entity instanceof WBSProgram) {
			WBSProgram p = (WBSProgram) entity;
			results.addAll(p.getProjects());
		}

		if (entity instanceof WBSProject) {
			WBSProject p = (WBSProject) entity;
			results.addAll(p.getWbsNodes());
		}
		if (entity instanceof WBSNode) {
			WBSNode a = (WBSNode) entity;
			results.addAll(a.getWbsNodes());
			//results.addAll(a.getWorkpackages());
		}
		return results.toArray();
	}

}
