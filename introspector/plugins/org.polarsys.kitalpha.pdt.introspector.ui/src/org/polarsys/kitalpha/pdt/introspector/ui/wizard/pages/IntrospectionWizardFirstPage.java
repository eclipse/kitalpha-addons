package org.polarsys.kitalpha.pdt.introspector.ui.wizard.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.fieldassist.ContentAssistCommandAdapter;
import org.polarsys.kitalpha.pdt.introspector.preferences.utils.IntrospectorPreferenceUtils;
import org.polarsys.kitalpha.pdt.introspector.ui.dialog.ResourceReuseSettingsDialog;
import org.polarsys.kitalpha.pdt.introspector.ui.preferences.EclipseIntrospectionPreferencePageMessages;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

public class IntrospectionWizardFirstPage extends WizardPage {

	private  Text specifyText;
	private Button checkSpecifyingNameButton;

	// buttons
	private  Button perimeterPlatformOnlyButton;
	private  Button workspaceOnlyButton;
	private Button bothButton;

	private Button filterButton;
	private  Text filterText;

	private  Button incremantalIntrospectionButton;
	private  Button sameFolderButton;
	private  Button sameWorkspaceButton;
	private  Button modelReuseButton;
	private Button settingsButton;
	private  Button createPackageButton;
	private  Button storeIssuesButton;
	private  Button ignoreQualifierButton;
	private  Button overridePreferencesButton;
	private  SearchCriteria criteria;

	public IntrospectionWizardFirstPage(IFolder selection) {
		this(selection.getName());
	}

	protected IntrospectionWizardFirstPage(String pageName) {
		super(pageName);
		setTitle(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionWizardPage_Tittle);
		setDescription(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionWizardPage_Summary);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.FILL);
		GridLayout compositeLayout = new GridLayout();
		container.setLayout(compositeLayout);

		createGeneralSettingsGroup(container);
		createPerimeterGroup(container);
		createIncrementalGroup(container);
		createAdvancedSettingsGroup(container);
		setControl(container);

	}

	private void createGeneralSettingsGroup(Composite container) {
		Group generalSettingGroup = new Group(container, SWT.FILL);
		generalSettingGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
		generalSettingGroup.setText("General settings");

		GridLayout generalSettingsLayout = new GridLayout();
		generalSettingsLayout.numColumns = 2;
		generalSettingsLayout.marginHeight = 5;
		generalSettingsLayout.marginWidth = 5;
		generalSettingGroup.setLayout(generalSettingsLayout);

		checkSpecifyingNameButton = new Button(generalSettingGroup, SWT.CHECK);
		checkSpecifyingNameButton.setText("Specify generated model name");
		checkSpecifyingNameButton.setSelection(false);
		// specifying name button listener for gray text if the user wont to
		// override it
		checkSpecifyingNameButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				specifyText.setEnabled(checkSpecifyingNameButton.getSelection());
			}
		});

		specifyText = new Text(generalSettingGroup, SWT.BORDER);
		specifyText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		specifyText.setText("Eclipse Model");
		specifyText.setEnabled(false);

	}

	public  String getModelName() {
		return specifyText.getText();
	}

	public boolean modelNameHaveBeenSetted() {
		return checkSpecifyingNameButton.getSelection();
	}

	private void createAdvancedSettingsGroup(Composite container) {
		Group advancedSettingsGroup = new Group(container, SWT.FILL);

		advancedSettingsGroup.setText("Advanced settings");
		advancedSettingsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		GridLayout specLayout = new GridLayout();
		specLayout.numColumns = 1;
		advancedSettingsGroup.setLayout(specLayout);

		// Create package setting
		createPackageButton = new Button(advancedSettingsGroup, SWT.CHECK);
		createPackageButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_CreatePackagesLabel);
		createPackageButton.setSelection(IntrospectorPreferenceUtils
				.getCreatePackageSetting());

		// Store issues settings
		storeIssuesButton = new Button(advancedSettingsGroup, SWT.CHECK);
		storeIssuesButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_StoreIntrospectionIssuesLabel);
		storeIssuesButton.setSelection(IntrospectorPreferenceUtils
				.getStoreIntrospectionIssue());

		// Ignore qualifier settings
		ignoreQualifierButton = new Button(advancedSettingsGroup, SWT.CHECK);
		ignoreQualifierButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_QualifierMatchLabel);
		ignoreQualifierButton.setSelection(IntrospectorPreferenceUtils
				.getQualifierMatch());

		// Override preferences settings
		overridePreferencesButton = new Button(advancedSettingsGroup, SWT.CHECK);
		overridePreferencesButton
				.setText("Override introspector preferences according to this settings");
	}

	public  boolean preferencesHaveBeenOverriden() {
		return overridePreferencesButton.getSelection();
	}

	private void createIncrementalGroup(Composite container) {
		Group incrementalGroup = new Group(container, SWT.FILL);
		incrementalGroup.setText("Incremental Introspection");
		incrementalGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		GridLayout specLayout = new GridLayout();
		specLayout.numColumns = 1;
		incrementalGroup.setLayout(specLayout);

		incremantalIntrospectionButton = new Button(incrementalGroup, SWT.CHECK);
		incremantalIntrospectionButton
				.setText("Activate incremental introspection");
		incremantalIntrospectionButton.setSelection(IntrospectorPreferenceUtils
				.getActivateIncrementalIntrospection());

		Label incrementalLabel = new Label(incrementalGroup, SWT.NONE);
		incrementalLabel.setText("Models to be reused");

		sameFolderButton = new Button(incrementalGroup, SWT.RADIO);
		sameFolderButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_ReuseFromFolderLabel);
		sameWorkspaceButton = new Button(incrementalGroup, SWT.RADIO);
		sameWorkspaceButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_ReuseFromWorkspaceLabel);
		modelReuseButton = new Button(incrementalGroup, SWT.RADIO);
		modelReuseButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_ReuseFromResourceReuseLabel);

		settingsButton = new Button(incrementalGroup, SWT.PUSH);
		settingsButton.setText("Settings...");
		settingsButton.setEnabled(false);
		settingsButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				ResourceReuseSettingsDialog dialog = new ResourceReuseSettingsDialog(
						getShell());
				int okPressed = dialog.open();
				if (okPressed == Window.OK) {
					criteria = dialog.getCriteria();
				}
			}
		});

		// check if incremental button is checked, if it is then check the
		// button to check
		if (incremantalIntrospectionButton.getSelection()) {
			setUpIncrementalButtonsAccordingToCurrentPreferences();
		} else
			disableIncrementalButtons();

		modelReuseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				Button btn = (Button) event.getSource();
				boolean buttonSelection = btn.getSelection();
				settingsButton.setEnabled(buttonSelection);

			}
		});

		incremantalIntrospectionButton
				.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						Button btn = (Button) event.getSource();
						boolean buttonSelection = btn.getSelection();
						sameFolderButton.setEnabled(buttonSelection);
						sameWorkspaceButton.setEnabled(buttonSelection);
						modelReuseButton.setEnabled(buttonSelection);
						if (modelReuseButton.getSelection())
							settingsButton.setEnabled(buttonSelection);
					}
				});
	}

	private void setUpIncrementalButtonsAccordingToCurrentPreferences() {
		String incrementalIntrospection = IntrospectorPreferenceUtils
				.getIncrementalIntrospection();
		switch (incrementalIntrospection) {
		case "reuseFromFolder":
			sameFolderButton.setSelection(true);
			break;
		case "reuseFromWorkspace":
			sameWorkspaceButton.setSelection(true);
			break;
		case "reuseFromResourceReuse":
			modelReuseButton.setSelection(true);
			settingsButton.setEnabled(true);
			break;
		default:
			break;
		}
	}

	private void disableIncrementalButtons() {
		sameFolderButton.setEnabled(false);
		sameWorkspaceButton.setEnabled(false);
		modelReuseButton.setEnabled(false);
	}

	public  SearchCriteria getCriteria() {
		return criteria;
	}
	
	public  String getSpecifiedFilterRegex(){
		String text = filterText.getText();
		String result = text;
		if(text.contains("*")) {
			result = text.substring(0,text.length()-2);
		}
		return result;
	}

	private void createPerimeterGroup(Composite container) {
		Group perimeterGroup = new Group(container, SWT.FILL);
		perimeterGroup.setText("Introspection Perimeter");
		perimeterGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		GridLayout specLayout = new GridLayout();
		specLayout.numColumns = 1;
		perimeterGroup.setLayout(specLayout);
		Label perimeterLabel = new Label(perimeterGroup, SWT.NONE);
		perimeterLabel.setText("Shall be introspected");

		perimeterPlatformOnlyButton = new Button(perimeterGroup, SWT.RADIO);
		perimeterPlatformOnlyButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_PerimeterIsPlatformOnlyLabel);

		workspaceOnlyButton = new Button(perimeterGroup, SWT.RADIO);
		workspaceOnlyButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_PerimeterIsWorkspaceOnlyLabel);
		bothButton = new Button(perimeterGroup, SWT.RADIO);
		bothButton
				.setText(EclipseIntrospectionPreferencePageMessages.EclipseIntrospectionPreferencePage_PerimeterIsPlatformAndWorkspaceLabel);

		filterButton = new Button(perimeterGroup, SWT.CHECK);
		filterButton.setText("Filter Introspection Result Model");

		filterText = new Text(perimeterGroup, SWT.BORDER);
		filterText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		filterText.setVisible(true);
		filterText.setEnabled(false);

		filterButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				Button btn = (Button) event.getSource();
				boolean buttonSelection = btn.getSelection();
				filterText.setEnabled(buttonSelection);
			}
		});

		TextContentAdapter contentAdapter = new TextContentAdapter();
		contentAdapter.setCursorPosition(filterText, 0);

		SimpleContentProposalProvider stringProvider = new SimpleContentProposalProvider(
				getProposals());
		stringProvider.setFiltering(true);

		ContentAssistCommandAdapter adapter = new ContentAssistCommandAdapter(
				filterText, contentAdapter, stringProvider, null, new char[0],
				true);
		adapter.setEnabled(true);
		adapter.setProposalAcceptanceStyle(ContentAssistCommandAdapter.PROPOSAL_REPLACE);
		setUpPerimeterButtonsAccordingToCurrentPreferences();
	}

	private String[] getProposals() {
		// here i retrieve all plugins ID contained by the active target
		// platform + current workspace
		IPluginModelBase[] allModels = PluginRegistry.getAllModels();
		List<String> allPluginsID = new ArrayList<String>();

		for (IPluginModelBase iPluginModelBase : allModels) {
			String pluginId = iPluginModelBase.getPluginBase().getId();
			findAlternativesProposals(pluginId, allPluginsID, 0);
			if (!allPluginsID.contains(pluginId))
				allPluginsID.add(pluginId);
		}
		String[] result = allPluginsID.toArray(new String[allPluginsID.size()]);
		return result;
	}

	private void findAlternativesProposals(String pluginId,
			List<String> proposals, int pos) {
		String[] splitedId = pluginId.split("\\.");
		int length = splitedId.length;
		String alternativeId = "";
		// here i find all alternative proposals like com.* ...
		for (int i = 0; i <= pos; i++) {
			// i am not at the end
			if (i != pos)
				alternativeId += splitedId[i] + ".";
			else {
				if (pos < length - 1)
					alternativeId += splitedId[i] + ".*";
				else
					alternativeId += splitedId[i];
			}
		}
		if (!proposals.contains(alternativeId)) {
			proposals.add(alternativeId);
		}
		pos++;
		if (pos < length - 1)
			findAlternativesProposals(pluginId, proposals, pos);
		else
			return;
	}

	private void setUpPerimeterButtonsAccordingToCurrentPreferences() {

		// check preferences and set the wizard according to preferences
		String introspectionPerimeter = IntrospectorPreferenceUtils
				.getIntrospectionPerimeter();
		switch (introspectionPerimeter) {
		case "platformOnly":
			perimeterPlatformOnlyButton.setSelection(true);
			break;
		case "workspaceOnly":
			workspaceOnlyButton.setSelection(true);
			break;
		case "platformAndWorkspace":
			bothButton.setSelection(true);
			break;
		default:
			perimeterPlatformOnlyButton.setSelection(true);
			break;
		}
	}

	public  String getIntrospectionPerimeter() {
		String result = "";
		if (perimeterPlatformOnlyButton.getSelection()) {
			result = "platform";
		} else if (workspaceOnlyButton.getSelection()) {
			result = "workspace";
		} else
			result = "both";
		return result;
	}

	public  boolean isIncremental() {
		return incremantalIntrospectionButton.getSelection();
	}

	public  String getIncrementalIntrospectionType() {
		String result = "";
		if (sameFolderButton.getSelection())
			result = "sameFolder";
		else if (sameWorkspaceButton.getSelection())
			result = "sameWorkspace";
		else
			result = "modelreuse";
		return result;
	}

	public  boolean createPackages() {
		return createPackageButton.getSelection();
	}

	public  boolean storeIntrospectionIssues() {
		return storeIssuesButton.getSelection();
	}

	public  boolean ignoreQualifier() {
		return ignoreQualifierButton.getSelection();
	}

}
