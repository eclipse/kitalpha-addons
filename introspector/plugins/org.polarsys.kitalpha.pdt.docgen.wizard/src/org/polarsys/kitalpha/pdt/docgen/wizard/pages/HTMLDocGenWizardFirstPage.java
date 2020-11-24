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
package org.polarsys.kitalpha.pdt.docgen.wizard.pages;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.polarsys.kitalpha.pdt.docgen.wizard.general.HTMLDocGenContext;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class HTMLDocGenWizardFirstPage extends WizardPage implements Listener {

	private IFile selection;
	private Composite container;

	// my buttons
	private Button currentFolderGenerationRadioButton;
	private Button specifiedFolderGenerationRadioButton;

	private Button digramsInclusionRadioButton;
	private Button relatedModelGenerationRadioButton;
	private Button browseButton;

	// my text
	private Text folderPath;
	private SelectionDialog dialog;

	// my context
	private HTMLDocGenContext context = HTMLDocGenContext.INSTANCE;

	public HTMLDocGenWizardFirstPage(IFile selectedFile) {
		this(selectedFile.getName());
		selection = selectedFile;
	}

	public boolean specifiedRepositoryIsChecked() {
		return specifiedFolderGenerationRadioButton.getSelection();
	}

	protected HTMLDocGenWizardFirstPage(String pageName) {
		super(pageName);
		setTitle(Messages.PageTitle);
		setDescription(Messages.PageDescription);
	}

	@Override
	public void createControl(Composite parent) {

		container = new Composite(parent, SWT.FILL);
		GridLayout compositeLayout = new GridLayout();
		container.setLayout(compositeLayout);

		addSpecsGroup();
		addResultsGroup();

		setControl(container);
		handleEvent(null); // we provoke a validation of the page's content

	}

	private void addResultsGroup() {

		// Creating my group
		Group HTMLResultsGroup = new Group(container, SWT.FILL);
		HTMLResultsGroup.setText(Messages.ResultsGroup);
		HTMLResultsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		GridLayout specLayout = new GridLayout();
		specLayout.numColumns = 1;

		HTMLResultsGroup.setLayout(specLayout);
		digramsInclusionRadioButton = new Button(HTMLResultsGroup, SWT.CHECK);
		digramsInclusionRadioButton
				.setText(Messages.ResultsDiagramsInclusionsRadioButton);

		// default value
		digramsInclusionRadioButton.setSelection(true);

		// i add a listener to set value of the preferences
		digramsInclusionRadioButton
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent event) {
						Button btn = (Button) event.getSource();
						boolean buttonSelection = btn.getSelection();
						context.setDiagramsInclusion(buttonSelection);
					}
				});

		relatedModelGenerationRadioButton = new Button(HTMLResultsGroup,
				SWT.CHECK);
		relatedModelGenerationRadioButton
				.setText(Messages.ResultsGenerationOfRelatedModelsRadioButton);
		
		// default value
		relatedModelGenerationRadioButton.setSelection(false);

		// i add a listener to set value of the preferences
		relatedModelGenerationRadioButton
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent event) {
						Button btn = (Button) event.getSource();
						boolean buttonSelection = btn.getSelection();
						context.setDiagramsGeneration(buttonSelection);
					}
				});
	}

	private void addSpecsGroup() {

		Group HTMLSpecGroup = new Group(container, SWT.FILL);
		HTMLSpecGroup.setText(Messages.SpecificationsGroupLabel);
		HTMLSpecGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		GridLayout specLayout = new GridLayout();
		specLayout.numColumns = 1;

		HTMLSpecGroup.setLayout(specLayout);

		currentFolderGenerationRadioButton = new Button(HTMLSpecGroup,
				SWT.RADIO);
		currentFolderGenerationRadioButton
				.setText(Messages.SpecificationsCurrentFolderRadioButtonLabel);
		currentFolderGenerationRadioButton
				.setToolTipText(Messages.SpecificationsCurrentFolderRadioButtonTooltip);

		currentFolderGenerationRadioButton
				.addSelectionListener(new SelectionAdapter() {

					@Override
					public void widgetSelected(SelectionEvent event) {
						Button btn = (Button) event.getSource();
						boolean buttonSelection = btn.getSelection();
						context.setRepoSpecification(buttonSelection);

						// dynamic activation of browse button and filePath's
						// text
						browseButton.setEnabled(!buttonSelection);
						folderPath.setEnabled(!buttonSelection);
					}
				});

		specifiedFolderGenerationRadioButton = new Button(HTMLSpecGroup,
				SWT.RADIO);
		specifiedFolderGenerationRadioButton
				.setText(Messages.SpecificationsSpecifiedRadioButtonLabel);
		specifiedFolderGenerationRadioButton
				.setToolTipText(Messages.SpecificationsSpecifiedRadioButtonTooltip);
		specifiedFolderGenerationRadioButton.addListener(SWT.Selection, this);

		Group pathSpecification = new Group(HTMLSpecGroup, SWT.FILL);
		pathSpecification.setText("Path");
		GridLayout pathSpecGroupLayout = new GridLayout();
		pathSpecGroupLayout.numColumns = 2;
		pathSpecification.setLayout(pathSpecGroupLayout);

		folderPath = new Text(pathSpecification, SWT.BORDER | SWT.SINGLE
				| SWT.FILL);
		folderPath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		selection.getLocationURI();

		// I find project name
		IPath path = selection.getProjectRelativePath();

		String projectName = selection.getProject().getName();
		folderPath.setText(projectName + "/" + path.removeLastSegments(1));
		folderPath.addListener(SWT.KeyUp, this);

		browseButton = new Button(pathSpecification, SWT.PUSH);
		browseButton.setText("Browse...");

		browseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				dialog = new ContainerSelectionDialog(getShell(),
						ResourcesPlugin.getWorkspace().getRoot(), true,
						"Folder Path Specification");
				dialog.open();
				Object[] result = dialog.getResult();

				String dir = result[0].toString();
				if (dir != null) {
					// Set the text box to the new selection
					folderPath.setText(dir);
					folderPath.setLayoutData(new GridData(
							GridData.FILL_HORIZONTAL));

					String projectNameTemp = dir.replaceFirst("/", "");

					String[] projectName = projectNameTemp.split("/");

					// i set my project name
					context.setProjectName(projectName[0]);

					// and then my output folder absolute path
					String outputFolderPath = projectNameTemp
							.substring(projectName[0].length());
					context.setOutputFolderName(outputFolderPath.replaceFirst(
							"/", ""));
				}
			}
		});
	}

	@Override
	public void handleEvent(Event event) {

	}

}
