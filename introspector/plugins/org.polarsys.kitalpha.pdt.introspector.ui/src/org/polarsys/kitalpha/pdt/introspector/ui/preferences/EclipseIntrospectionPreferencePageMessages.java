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

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Xavier DECOOL
 *
 */

public class EclipseIntrospectionPreferencePageMessages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.pdt.introspector.ui.preferences.messages"; //$NON-NLS-1$
	
	//Title of the preference page
	public static String EclipseIntrospectionPreferencePage_description;
	
	//Introspection Perimeter------------------------------------------------------------------------
	public static String EclipseIntrospectionPreferencePage_PerimeterIsWorkspaceOnlyLabel;
	public static String EclipseIntrospectionPreferencePage_PerimeterIsPlatformOnlyLabel;
	public static String EclipseIntrospectionPreferencePage_PerimeterIsPlatformAndWorkspaceLabel;
	//-----------------------------------------------------------------------------------------------
	
	
	
	//Incremental introspection----------------------------------------------------------------------
	public static String EclipseIntrospectionPreferencePage_ActivateIncrementalIntrospectionLabel;
	
	public static String EclipseIntrospectionPreferencePage_IncrementalIntrospectionLabel;
	
	public static String EclipseIntrospectionPreferencePage_ReuseFromFolderLabel;
	public static String EclipseIntrospectionPreferencePage_ReuseFromWorkspaceLabel;
	public static String EclipseIntrospectionPreferencePage_ReuseFromResourceReuseLabel;
	
	public static String EclipseIntrospectionPreferencePage_SettingButtonLabel;
	public static String EclipseIntrospectionPreferencePage_SettingsPageTittle;
	//-----------------------------------------------------------------------------------------------
	
	
	
	//Advanced settings------------------------------------------------------------------------------
	public static String EclipseIntrospectionPreferencePage_CreatePackagesLabel;
	public static String EclipseIntrospectionPreferencePage_QualifierMatchLabel;
	public static String EclipseIntrospectionPreferencePage_StoreIntrospectionIssuesLabel;
	//-----------------------------------------------------------------------------------------------
	
	//Wizard page------------------------------------------------------------------------------------
	public static String EclipseIntrospectionWizardPage_Tittle;
	public static String EclipseIntrospectionWizardPage_Summary;
	//-----------------------------------------------------------------------------------------------
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME,
				EclipseIntrospectionPreferencePageMessages.class);
	}

	private EclipseIntrospectionPreferencePageMessages() {
	}
}
