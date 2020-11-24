/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.introspector.ui.preferences;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.polarsys.kitalpha.pdt.introspector.preferences.utils.IntrospectorPreferenceMessages;
import org.polarsys.kitalpha.pdt.introspector.preferences.utils.IntrospectorPreferenceUtils;
import org.polarsys.kitalpha.pdt.introspector.ui.dialog.ResourceReuseSettingsDialog;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 * 
 * 
 * @author Xavier DECOOL
 * 
 */

public class EclipseIntrospectionPreferencePage extends
		FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private ScopedPreferenceStore preferences;

	// Introspection perimeter editors definition
	private Group introspectionPerimeterGroup;

	private RadioGroupFieldEditor introspectionPerimeterRadioEditorGroup;

	// Incremental introspection editors definition
	private Group incrementalIntrospectionGroup;
	private BooleanFieldEditor activateIncrementalIntrospectionBooleanEditor;

	private RadioGroupFieldEditor incrementalIntrospectionRadioEditor;
	private Button incremantalIntrospectionSettingsButton;
	private Dialog dialog;
	private SearchCriteria criteria = new SearchCriteria();
	private String[][] labelsAndValues;

	// Advanced settings editors definition
	private Group advancedSettingsGroup;
	private BooleanFieldEditor createPackagesBooleanEditor;
	private BooleanFieldEditor storeIntrospectionIssuesBooleanEditor;
	private BooleanFieldEditor matchQualifierBooleanEditor;

	public EclipseIntrospectionPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
		preferences = new ScopedPreferenceStore(
				ConfigurationScope.INSTANCE,
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_PLUGIN_ID);
		setPreferenceStore(preferences);
		setDescription(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_description);
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */

	public void createFieldEditors() {

		// Container layout
		// preferences-----------------------------------------------
		Composite prefContainer = new Composite(getFieldEditorParent(),
				SWT.FILL);

		GridData gridDataPref = new GridData(SWT.FILL, SWT.FILL, true, false);
		prefContainer.setLayoutData(gridDataPref);
		GridLayout gridLayoutPref = new GridLayout();
		gridLayoutPref.numColumns = 1;
		prefContainer.setLayout(gridLayoutPref);
		// ---------------------------------------------------------------------------

		createIntrospectionPerimeterGroup(prefContainer);
		createIncrementalIntrospection(prefContainer);
		createAdvancedSettingsGroup(prefContainer);

	}

	private void createIntrospectionPerimeterGroup(Composite prefContainer) {

		// Configuring the group
		introspectionPerimeterGroup = new Group(prefContainer, SWT.FILL);
		introspectionPerimeterGroup.setText("Introspection Perimeter");
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		introspectionPerimeterGroup.setLayoutData(gridData);

		// Preparing the radio options
		String[][] labelsAndValues = new String[][] {
				{
						EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_PerimeterIsPlatformOnlyLabel,
						IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_PerimeterIsPlatformOnly },
				{
						EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_PerimeterIsWorkspaceOnlyLabel,
						IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_PerimeterIsWorkspaceOnly },
				{
						EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_PerimeterIsPlatformAndWorkspaceLabel,
						IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_PerimeterIsPlatformAndWorkspace } };

		// Declaring the radio Editor field

		introspectionPerimeterRadioEditorGroup = new RadioGroupFieldEditor(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IntrospectionPerimeterName,
				"Shall be intropected", 1, labelsAndValues,
				introspectionPerimeterGroup);

		// Add the field to the preferences page
		addField(introspectionPerimeterRadioEditorGroup);

	}

	private void createIncrementalIntrospection(Composite prefContainer) {

		// Configuring the group
		incrementalIntrospectionGroup = new Group(prefContainer, SWT.FILL);
		incrementalIntrospectionGroup.setText("Incremental Introspection");
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		incrementalIntrospectionGroup.setLayoutData(gridData);

		// Declaration of boolean field editors
		activateIncrementalIntrospectionBooleanEditor = new BooleanFieldEditor(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ActivateIncrementalIntrospectionName,
				EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_ActivateIncrementalIntrospectionLabel,
				incrementalIntrospectionGroup);
		addField(activateIncrementalIntrospectionBooleanEditor);

		// Declaration of the depending radio list

		// Preparing the radio options
		labelsAndValues = new String[][] {
				{
						EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_ReuseFromFolderLabel,
						IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ReuseFromFolder },
				{
						EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_ReuseFromWorkspaceLabel,
						IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ReuseFromWorkspace },
				{
						EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_ReuseFromResourceReuseLabel,
						IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ReuseFromResourceReuse } };

		// Declaring the radio Editor field

		incrementalIntrospectionRadioEditor = new RadioGroupFieldEditor(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IncrementalIntrospectionName,
				"Models to be reused", 1, labelsAndValues,
				incrementalIntrospectionGroup);

		incremantalIntrospectionSettingsButton = new Button(
				incrementalIntrospectionGroup, SWT.PUSH);
		incremantalIntrospectionSettingsButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_SettingButtonLabel);

		incremantalIntrospectionSettingsButton
				.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						dialog = new ResourceReuseSettingsDialog(getShell());
						dialog.open();
					}
				});

		// Add the field to the preferences page
		addField(incrementalIntrospectionRadioEditor);
		incrementalIntrospectionRadioEditor.setEnabled(
				IntrospectorPreferenceUtils
						.getActivateIncrementalIntrospection(),
				incrementalIntrospectionGroup);

	}

	private void createAdvancedSettingsGroup(Composite prefContainer) {

		// Configuring the group
		advancedSettingsGroup = new Group(prefContainer, SWT.FILL);
		advancedSettingsGroup.setText("Advanced settings");
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		GridLayout grid = new GridLayout();
		grid.marginLeft = 50;
		advancedSettingsGroup.setLayout(grid);
		advancedSettingsGroup.setLayoutData(gridData);

		// Declaration of boolean field editors
		createPackagesBooleanEditor = new BooleanFieldEditor(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_CreatePackagesName,
				EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_CreatePackagesLabel, //$NON-NLS-1$
				advancedSettingsGroup);
		addField(createPackagesBooleanEditor);

		storeIntrospectionIssuesBooleanEditor = new BooleanFieldEditor(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_StoreIntrospectionIssuesName,
				EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_StoreIntrospectionIssuesLabel, //$NON-NLS-1$
				advancedSettingsGroup);
		addField(storeIntrospectionIssuesBooleanEditor);

		matchQualifierBooleanEditor = new BooleanFieldEditor(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_QualifierMatchName,
				EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_QualifierMatchLabel, //$NON-NLS-1$
				advancedSettingsGroup);
		addField(matchQualifierBooleanEditor);
	}

	public void init(IWorkbench workbench) {

	}

	public SearchCriteria getSettedCriteria() {
		return criteria;
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {

		if (event.getSource() == incrementalIntrospectionRadioEditor) {
			boolean activateButton = (event.getNewValue()
					.equals(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ReuseFromResourceReuse));
			incremantalIntrospectionSettingsButton.setEnabled(activateButton);
		}

		if (event.getSource() == activateIncrementalIntrospectionBooleanEditor) {

			boolean groupEnabled = activateIncrementalIntrospectionBooleanEditor
					.getBooleanValue();

			incrementalIntrospectionRadioEditor.setEnabled(groupEnabled,
					incrementalIntrospectionGroup);
			incrementalIntrospectionRadioEditor.load();

			if (groupEnabled)
				incremantalIntrospectionSettingsButton
						.setEnabled(IntrospectorPreferenceUtils
								.getModelreuseState());
			else
				incremantalIntrospectionSettingsButton.setEnabled(false);

		}
	}
}
