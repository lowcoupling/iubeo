package com.lowcoupling.mdpm.project.wizard.wizards;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class MDPMNewWizardPage extends WizardPage {
	//private Text containerText;

	private Text fileText;

	private ISelection selection;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public MDPMNewWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("Iubeo Project Wizard");
		//setDescription("This wizard creates a new file with *.elt extension that can be opened by a multi-page editor.");
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		//Label label = new Label(container, SWT.NULL);
		//label.setText("&Container:");

		//containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		
		//GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		//containerText.setLayoutData(gd);
		//containerText.addModifyListener(new ModifyListener() {
		//	public void modifyText(ModifyEvent e) {
		//		dialogChanged();
		//	}
		//});
		/*
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		*/
	  Label label = new Label(container, SWT.NULL);
		label.setText("&Project name:");

		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				//IContainer container = null;
				//if (obj instanceof IContainer)
				//	container = (IContainer) obj;
				//else
				//	container = ((IResource) obj).getParent();
				    //containerText.setText(container.getFullPath().toString());
			}
		}
		fileText.setText("");
	}



	private void dialogChanged() {
		
		//IResource container = ResourcesPlugin.getWorkspace().getRoot();
		String fileName = getFileName();

		/*
		if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		*/
		
		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		
		updateStatus(null);
		
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getContainerName() {
		return "test";
		//return containerText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}
}