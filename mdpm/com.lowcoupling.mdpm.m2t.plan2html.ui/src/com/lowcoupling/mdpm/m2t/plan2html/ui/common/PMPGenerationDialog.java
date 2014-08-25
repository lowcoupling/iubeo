package com.lowcoupling.mdpm.m2t.plan2html.ui.common;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;


public class PMPGenerationDialog extends Dialog implements Listener {
	private Button generateIntro;
	private Button generatePurpose;
	private Button generateScheduleSection;
	private Button generateGanttChart;
	private Button generateScheduleTable; 
	private Preferences preferences;
	private Button okButton;
	public PMPGenerationDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {

		/*
		 * The GridLayout of the dialog area
		 */	 
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout compositeLayout = new GridLayout();
		compositeLayout.numColumns = 4;
		compositeLayout.horizontalSpacing = 30;
		compositeLayout.verticalSpacing = 10;
		compositeLayout.marginHeight = 10;
		compositeLayout.marginWidth = 30;
		compositeLayout.makeColumnsEqualWidth=true;
		composite.setLayout(compositeLayout);
		GridData compositeData = new GridData();
		
		compositeData.grabExcessHorizontalSpace = false;
		compositeData.widthHint=600;
		composite.setLayoutData(compositeData);

		/*
		 * the composite data of the dialog area
		 */
		composite.getShell().setText("PMP Generation Options");

		GridData gridData = new GridData();
		Group generics = new Group(composite, SWT.FILL);
		generics.setText("");
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 4;
		generics.setLayout(gridLayout);
		
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 4;
		generics.setLayoutData(gridData);

		Label label = new Label(generics, SWT.FILL);
		label.setText("Format:"); 

		Combo formats = new Combo(generics, SWT.FILL);
		formats.setItems(new String [] {"HTML", "Doc. (OpenXML)"});
		formats.select(0); 

//		label = new Label(generics, SWT.FILL);
//		label.setText("File:"); 
//
//		Text fileText = new Text(generics,SWT.FILL | SWT.BORDER);
//		fileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		okButton = new Button(generics,SWT.PUSH);
		okButton.setText("Generate");
		okButton.setLayoutData(new GridData(SWT.SINGLE));
		preferences = ConfigurationScope.INSTANCE.getNode("PMPGenerationPreferences");
		okButton.addListener(SWT.Selection, this);
		
		{

			Group intro = new Group(composite, SWT.HORIZONTAL);
			intro.setText("Intro");
			gridLayout = new GridLayout();
			gridLayout.numColumns = 2;
			intro.setLayout(gridLayout);
			gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
			gridData.horizontalSpan = 2;
			gridData.grabExcessHorizontalSpace = false;
			gridData.widthHint=240;
			intro.setLayoutData(gridData);
		
			generateIntro = new Button(intro, SWT.CHECK); 
			generateIntro.addListener(SWT.Selection, this);
			generateIntro.setSelection(preferences.getBoolean("generateIntro", true));
			label = new Label(intro, SWT.NONE);
			label.setText("Generate Section");
			
			generatePurpose = new Button(intro, SWT.CHECK);
			generatePurpose.addListener(SWT.Selection, this);
			generatePurpose.setSelection(preferences.getBoolean("generatePurpose", true));
			new Label(intro, SWT.NULL).setText("Generate Purpose ");
			
			
			new Button(intro, SWT.CHECK); 
			new Label(intro, SWT.NULL).setText("Generate Assumptions and Constraints ");
			 
			 
		}		
		
		//Schedule and time Management
		{


			Group schedule = new Group(composite, SWT.HORIZONTAL);
			schedule.setText("Schedule & Time Management");
			gridLayout = new GridLayout();
			gridLayout.numColumns = 2;
			schedule.setLayout(gridLayout);
			gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
			gridData.horizontalSpan = 2;
			gridData.grabExcessHorizontalSpace = false;
			gridData.widthHint=240;
			schedule.setLayoutData(gridData);

			generateScheduleSection = new Button(schedule, SWT.CHECK); 
			generateScheduleSection.addListener(SWT.Selection, this);
			generateScheduleSection.setSelection(preferences.getBoolean("generateSchedule", true));
			label = new Label(schedule, SWT.NONE);
			label.setText("Generate Section");
			

			generateGanttChart = new Button(schedule, SWT.CHECK); 
			generateGanttChart.addListener(SWT.Selection, this);
			generateGanttChart.setSelection(preferences.getBoolean("generateGanttChart", true));
			new Label(schedule, SWT.NULL).setText("Generate Gantt Chart ");
			
			generateScheduleTable = new Button(schedule, SWT.CHECK); 
			generateScheduleTable.addListener(SWT.Selection, this);
			generateScheduleTable.setSelection(preferences.getBoolean("generateScheduleTable", true));
			new Label(schedule, SWT.NULL).setText("Generate Schedule Table ");
		}

		composite.getShell().pack();
		return composite;
	}

	// overriding this methods allows you to set the
	// title of the custom dialog
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);

	}

	@Override
	protected Point getInitialSize() {
		return new Point(600, 300);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		//super.createButtonsForButtonBar(parent);
	}

	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		if (event.widget==generateIntro){
			preferences.putBoolean("generateIntro", generateIntro.getSelection());
		}
		if (event.widget==generatePurpose){
			preferences.putBoolean("generatePurpose", generatePurpose.getSelection());
		}
		
		if (event.widget==generateGanttChart){
			preferences.putBoolean("generateGanttChart", generateGanttChart.getSelection());
		}
		
		if (event.widget==generateScheduleTable){
			preferences.putBoolean("generateScheduleTable", generateScheduleTable.getSelection());
		}
		
		if (event.widget==generateScheduleSection){
			preferences.putBoolean("generateSchedule", generateScheduleSection.getSelection());
		}
		if (event.widget == okButton){
			this.close();
		}
		try {
			  // forces the application to save the preferences
			  preferences.flush();
			  } catch (BackingStoreException e) {
			    e.printStackTrace();
			  }
			
	}


} 