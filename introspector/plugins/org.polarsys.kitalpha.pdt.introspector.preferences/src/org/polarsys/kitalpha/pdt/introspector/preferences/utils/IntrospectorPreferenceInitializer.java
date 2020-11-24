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
package org.polarsys.kitalpha.pdt.introspector.preferences.utils;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class IntrospectorPreferenceInitializer extends AbstractPreferenceInitializer {

	public IntrospectorPreferenceInitializer() {
		super();
	}

	@Override
	public void initializeDefaultPreferences() {
		IEclipsePreferences defaults = DefaultScope.INSTANCE
				.getNode(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_PLUGIN_ID);
		
		//Advanced Settings------------------------------------------------------------------------------------------------
		defaults.put(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_CreatePackagesName,
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_CreatePackagesDefaultValue);
		defaults.put(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_QualifierMatchName,
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_QualifierMatchDefaultValue);
		defaults.put(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_StoreIntrospectionIssuesName,
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_StoreIntrospectionIssuesDefaultValue);
		//----------------------------------------------------------------------------------------------------------------
		
		
		//Introspection Perimeter-----------------------------------------------------------------------------------------
		defaults.put(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IntrospectionPerimeterName,
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IntrospectionPerimeterDefaultValue);
		//----------------------------------------------------------------------------------------------------------------
		
		
		
		//Incremental Introspection---------------------------------------------------------------------------------------
		defaults.put(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ActivateIncrementalIntrospectionName,
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ActivateIncrementalIntrospectionDefaultValue);
		
		defaults.put(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IncrementalIntrospectionName,
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IncrementalIntrospectionDefaultValue);
		//----------------------------------------------------------------------------------------------------------------
		
	}
}
