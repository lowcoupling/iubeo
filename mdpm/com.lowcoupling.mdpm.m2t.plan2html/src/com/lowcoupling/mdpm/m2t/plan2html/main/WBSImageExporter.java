package com.lowcoupling.mdpm.m2t.plan2html.main;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;
import com.lowcoupling.mdpm.lng.plan.plan.Project;
import com.lowcoupling.mdpm.lng.plan.plan.WBSImport;
import com.lowcoupling.mdpm.lng.wbs.WBSStandaloneSetup;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject;
import com.lowcoupling.mdpm.ui.wbstreeview.views.WBSTreeImageExporter;

public class WBSImageExporter {

	private static IPath path;
	private File out;
	private int zoomLevel;
	private static IFile currentModel;
	

	public static IFile getCurrentModel() {
		return currentModel;
	}

	public static void setCurrentModel(IFile currentModel) {
		WBSImageExporter.currentModel = currentModel;
	}

	class WBSCreator implements Runnable{
		Project plan = null;
		String name= null;
		private IFile currentModel;
		public IFile getCurrentModel() {
			return currentModel;
		}


		public void setCurrentModel(IFile currentModel) {
			this.currentModel = currentModel;
		}


		public WBSCreator(Project plan,String name){
			this.plan=plan;
			this.name= name;
		}
		 
		
	
		public void run() {
			// TODO Auto-generated method stub
			WBSImport wbs = plan.getWbs();
			System.out.println ("PATH IS "+currentModel.getLocation().append("../").append(wbs.getImportURI()).toString());
			String pathInput = currentModel.getLocation().append("../").append(wbs.getImportURI()).toString();
			System.out.println("Current Model Location URI "+currentModel.getRawLocationURI().toString());
			//new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("..\ ");
			Injector injector = new WBSStandaloneSetup().createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			//System.out.println("the uri is... "+URI.createURI(wbs.getImportURI()). .toString());
			//URI.crea
			Resource resource = resourceSet.getResource(URI.createURI("file:/"+pathInput), true);
			WBSProject project = (WBSProject) resource.getContents().get(0);
			
			String planName= plan.getName();
			IFolder planFolder = currentModel.getProject().getFolder("/docs/"+planName+"Data/");
			if(!planFolder.exists()){
				try {
					planFolder.create(true, true, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			IFolder imgFolder = currentModel.getProject().getFolder("/docs/"+planName+"Data/img/");
			if(!imgFolder.exists()){
				try {
					imgFolder.create(true, true, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			IFolder occupationFolder = currentModel.getProject().getFolder("/docs/"+planName+"Data/img/WBSCharts/");
			if (!occupationFolder.exists()){
				try {
					occupationFolder.create(true,true,null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			path = currentModel.getProject().getFolder("/docs/"+planName+"Data/img/WBSCharts").getRawLocation().makeAbsolute();
			//new WBSTreeImageExporter()
			//out = new File(path.toString()+"/"+name);
			new WBSTreeImageExporter(project, path.toString()+"/"+name);
		}
		
	}
 

	public String generateDiagram(com.lowcoupling.mdpm.lng.plan.plan.impl.ProjectImpl plan){
		String name = plan.getName()+"WBS.png";
		Display display = Display.getDefault();
		WBSCreator wc = new WBSCreator((Project)plan,name);
		wc.setCurrentModel(currentModel);
		display.syncExec(
				wc

				);
		
		return "";
	}
}