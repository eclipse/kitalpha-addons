/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.introspector.preferences.utils;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class IntrospectorPreferenceMessages extends NLS {
	
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.pdt.introspector.preferences.utils.messages"; //$NON-NLS-1$
	
	public static String IntrospectorPreferenceMessages_PLUGIN_ID;
		
	
	//Advanced Settings------------------------------------------------------------------------------------------------
	public static String IntrospectorPreferenceMessages_CreatePackagesName;
	public static String IntrospectorPreferenceMessages_CreatePackagesDefaultValue;
	
	public static String IntrospectorPreferenceMessages_QualifierMatchName;
	public static String IntrospectorPreferenceMessages_QualifierMatchDefaultValue;
	
	public static String IntrospectorPreferenceMessages_StoreIntrospectionIssuesName;
	public static String IntrospectorPreferenceMessages_StoreIntrospectionIssuesDefaultValue;
	//------------------------------------------------------------------------------------------------------------------
	
	
	
	//Introspection Perimeter-------------------------------------------------------------------------------------------
	public static String IntrospectorPreferenceMessages_PerimeterIsPlatformAndWorkspace;
	public static String IntrospectorPreferenceMessages_PerimeterIsPlatformOnly;
	public static String IntrospectorPreferenceMessages_PerimeterIsWorkspaceOnly;
	
	public static String IntrospectorPreferenceMessages_IntrospectionPerimeterName;
	public static String IntrospectorPreferenceMessages_IntrospectionPerimeterDefaultValue;
	//------------------------------------------------------------------------------------------------------------------

	
	
	//Incremental Introspection-----------------------------------------------------------------------------------------
	public static String IntrospectorPreferenceMessages_ActivateIncrementalIntrospectionName;
	public static String IntrospectorPreferenceMessages_ActivateIncrementalIntrospectionDefaultValue;
	
	public static String IntrospectorPreferenceMessages_ReuseFromFolder;
	public static String IntrospectorPreferenceMessages_ReuseFromWorkspace;
	public static String IntrospectorPreferenceMessages_ReuseFromResourceReuse;
	

	public static String IntrospectorPreferenceMessages_IncrementalIntrospectionName;
	public static String IntrospectorPreferenceMessages_IncrementalIntrospectionDefaultValue;
	//-------------------------------------------------------------------------------------------------------------------
	

	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, IntrospectorPreferenceMessages.class);
	}

	private IntrospectorPreferenceMessages() {
	}
}
