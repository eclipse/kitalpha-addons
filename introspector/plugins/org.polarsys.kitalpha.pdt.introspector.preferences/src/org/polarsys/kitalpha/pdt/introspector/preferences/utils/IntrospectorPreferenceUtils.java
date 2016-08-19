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

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * 
 * @author Xavier DECOOL
 * 
 */
public class IntrospectorPreferenceUtils {

	public static SearchCriteria resourceReuseCriteria = new SearchCriteria();

	public static IEclipsePreferences getConfigurationEclipseIntrospectionPreferences() {
		IEclipsePreferences node = ConfigurationScope.INSTANCE
				.getNode(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_PLUGIN_ID);
		return node;
	}

	public static IEclipsePreferences getDefaultEclipseIntrospectionPreferences() {
		IEclipsePreferences node = DefaultScope.INSTANCE
				.getNode(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_PLUGIN_ID);
		return node;
	}

	private static String getValue(String key) {
		String defaultValue = getDefaultEclipseIntrospectionPreferences().get(
				key, "");
		String result = getConfigurationEclipseIntrospectionPreferences().get(
				key, defaultValue);
		return result;
	}

	private static void setValue(String key, String value) {
		getConfigurationEclipseIntrospectionPreferences().put(key, value);
	}

	// Introspection
	// Perimeter-----------------------------------------------------------------------------------------------
	public static String getIntrospectionPerimeter() {
		return (getValue(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IntrospectionPerimeterName));
	}

	public static void setIntrospectionPerimeter(String newResult) {
		setValue(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IntrospectionPerimeterName,
				newResult);
	}

	// ----------------------------------------------------------------------------------------------------------------------

	// Incremental
	// Introspection----------------------------------------------------------------------------------------------

	// Getters
	public static boolean getActivateIncrementalIntrospection() {
		return Boolean
				.parseBoolean(getValue(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ActivateIncrementalIntrospectionName));
	}

	public static String getIncrementalIntrospection() {
		return (getValue(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IncrementalIntrospectionName));
	}

	public static boolean getModelreuseState() {
		return getIncrementalIntrospection()
				.equals(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ReuseFromResourceReuse);
	}

	// Setters
	public static void setIncrementalIntrospectionStatut(boolean isIncremental) {
		setValue(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ActivateIncrementalIntrospectionName,
				String.valueOf(isIncremental));
	}

	public static void setIncrementalIntrospectionType(String type) {
		setValue(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_IncrementalIntrospectionName,
				type);
	}

	// ----------------------------------------------------------------------------------------------------------------------

	// Advanced
	// Settings------------------------------------------------------------------------------------------------
	// Getters
	public static boolean getCreatePackageSetting() {
		return Boolean
				.parseBoolean(getValue(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_CreatePackagesName));
	}

	public static boolean getQualifierMatch() {
		return Boolean
				.parseBoolean(getValue(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_QualifierMatchName));
	}

	public static boolean getStoreIntrospectionIssue() {
		return Boolean
				.parseBoolean(getValue(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_StoreIntrospectionIssuesName));
	}

	// Setters
	public static void setCreatePackageSetting(boolean createPackage) {
		setValue(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_CreatePackagesName,
				String.valueOf(createPackage));
	}

	public static void setQualifierMatchingSetting(boolean qualifierMatch) {
		setValue(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_QualifierMatchName,
				String.valueOf(qualifierMatch));
	}

	public static void setIntrospectionIssuesStorageStatut(boolean storeIssues) {
		setValue(
				IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_StoreIntrospectionIssuesName,
				String.valueOf(storeIssues));
	}

	// ----------------------------------------------------------------------------------------------------------------------

	public static SearchCriteria getCriteria() {
		return resourceReuseCriteria;
	}

	public static void setCriteria(SearchCriteria criteria) {
		resourceReuseCriteria = criteria;
	}

}
