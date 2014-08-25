package com.lowcoupling.mdpm.project.wizard.wizards;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class MDPMNewWizard extends Wizard implements INewWizard {
	private MDPMNewWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for EltProjectNewWizard.
	 */
	public MDPMNewWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new MDPMNewWizardPage(selection);
		addPage(page);
	}

	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	private void doFinish(
			String containerName,
			String fileName,
			IProgressMonitor monitor)
					throws CoreException, URISyntaxException, IOException {
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		try {
			IProject theProject = root.getProject(fileName);
			IProjectDescription theDesc = theProject.getWorkspace().newProjectDescription(fileName);
			// theDesc.setLocation(new Path(theLocation));
			theProject.create(theDesc, new NullProgressMonitor());
			if (theProject.exists()) {
				theProject.open(new NullProgressMonitor());
				URL fileURL =  Platform.getBundle("com.lowcoupling.mdpm.project.wizard").getEntry("templateProject/2_Planning/planExample.plan");
				InputStream in = fileURL.openConnection().getInputStream();
				IFolder planFolder = theProject.getFolder("2_Planning");
				planFolder.create(true,false,null);
				IFile planFile = theProject.getFile("2_Planning/planExample.plan");
				planFile.create(in, true, null);
				in.close();

				fileURL =  Platform.getBundle("com.lowcoupling.mdpm.project.wizard").getEntry("templateProject/1_Initiating/resourcesExample.resources");
				in = fileURL.openConnection().getInputStream();
				planFolder = theProject.getFolder("1_Initiating");
				planFolder.create(true,false,null);
				planFile = theProject.getFile("1_Initiating/resourcesExample.resources");
				planFile.create(in, true, null);
				in.close();
				
				fileURL =  Platform.getBundle("com.lowcoupling.mdpm.project.wizard").getEntry("templateProject/1_Initiating/wbsExample.wbs");
				in = fileURL.openConnection().getInputStream();
				planFolder = theProject.getFolder("1_Initiating");
				//planFolder.create(true,false,null);
				planFile = theProject.getFile("1_Initiating/wbsExample.wbs");
				planFile.create(in, true, null);
				in.close();
			}

		} finally {

		}

	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}