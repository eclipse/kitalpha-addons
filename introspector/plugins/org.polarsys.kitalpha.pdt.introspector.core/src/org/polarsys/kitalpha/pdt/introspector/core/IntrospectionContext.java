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
package org.polarsys.kitalpha.pdt.introspector.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.ischema.ISchemaElement;
import org.polarsys.kitalpha.pdt.introspector.core.comparators.FeatureComparator;
import org.polarsys.kitalpha.pdt.introspector.core.comparators.PluginComparator;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * Class where are stocked Hash Maps to reuse objects
 * 
 * 
 * @author Xavier DECOOL
 * 
 */

/*
 * FIXME
 */
@SuppressWarnings("restriction")
public class IntrospectionContext {

	/**
	 * HashMap of extension points. Key is the extension point's name and the
	 * value is extension point
	 */
	private HashMap<String, ExtensionPoint> extensionPointId_ExtensionPoint = new HashMap<String, ExtensionPoint>();

	/**
	 * HashMap of created plugins. Key is the plugin's name and the value is
	 * plugin
	 */
	private HashMap<String, Plugin> pluginId_Plugin = new HashMap<String, Plugin>();

	/**
	 * HashMap of plugins loaded from other models when the related preference
	 * is selected. Key is the plugin's name and the value is the plugin
	 */
	private HashMap<String, Plugin> pluginId_Plugin_fromOtherModels = new HashMap<String, Plugin>();

	/**
	 * HashMap of created features. Key is the feature's name and the value is
	 * feature
	 */
	private HashMap<String, Feature> featureId_Feature = new HashMap<String, Feature>();

	/**
	 * HashMap of features loaded from other models when the related preference
	 * is selected. Key is the feature's name and the value is feature
	 */
	private HashMap<String, Feature> featureId_Feature_fromOtherModels = new HashMap<String, Feature>();

	/**
	 * HashMap of Schema elements. Key is the Eclipse's side Schema element.
	 * Value is metamodel's side schema element
	 */
	private HashMap<ISchemaElement, SchemaElement> schemaElementHashMap = new HashMap<ISchemaElement, SchemaElement>();

	/**
	 * HashMap of Repositories. Key is the repository's name. Value is the
	 * repository
	 */
	private HashMap<String, Repository> repositoryHashMap = new HashMap<String, Repository>();

	/**
	 * HashMap of Repositories. Key is the repository's name. Value is the
	 * repository
	 */
	private HashMap<String, Repository> repositoryToSaveHashMap = new HashMap<String, Repository>();

	private Collection<IntrospectionErrors> introErrors = new ArrayList<IntrospectionErrors>();

	private Collection<IntrospectionError> introError = new ArrayList<IntrospectionError>();

	/**
	 * My platform
	 */

	private boolean loadClassesSetting = false;

	// preferences definition---------------------------
	private String modelName;
	private String filterRegEx;

	private String introspectionPerimeter = "platformOnly";

	private boolean activateIncrementalIntrospection = false;
	private String incrementalIntrospection = "";

	private boolean createPackages = false;
	private boolean qualifierMatch = false;
	private boolean storeIntrospectionIssues = false;

	private SearchCriteria criteria;
	// --------------------------------------------------

	public static final String WORKSPACE_KEY = "Workspace";
	public static final String PLATFORM_KEY = "Platform";
	public static final String ID_VERSION_SEPARATOR = "_v_";
	private ResourceSet resourceSet;

	/**
	 * @return the resourceSet
	 */
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public SearchCriteria getSettedCriteria() {
		return criteria;
	}

	public void setCriteria(SearchCriteria criteria) {
		this.criteria = criteria;
	}

	// Getters and setters for preferences------------------

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getFilterRegEx() {
		return filterRegEx;
	}

	public void setFilterRegEx(String filterRegEx) {
		this.filterRegEx = filterRegEx;
	}

	public String getIntrospectionPerimeter() {
		return introspectionPerimeter;
	}

	public void setIntrospectionPerimeter(String introspectionPerimeter) {
		this.introspectionPerimeter = introspectionPerimeter;
	}

	public boolean isActivateIncrementalIntrospection() {
		return activateIncrementalIntrospection;
	}

	public void setActivateIncrementalIntrospection(
			boolean activateIncrementalIntrospection) {
		this.activateIncrementalIntrospection = activateIncrementalIntrospection;
	}

	public String getIncrementalIntrospection() {
		return incrementalIntrospection;
	}

	public void setIncrementalIntrospection(String incrementalIntrospection) {
		this.incrementalIntrospection = incrementalIntrospection;
	}

	public boolean isQualifierMatch() {
		return qualifierMatch;
	}

	public void setQualifierMatch(boolean qualifierMatch) {
		this.qualifierMatch = qualifierMatch;
	}

	public boolean isCreatePackages() {
		return createPackages;
	}

	public void setCreatePackages(boolean createPackages) {
		this.createPackages = createPackages;
	}

	public boolean isStoreIntrospectionIssues() {
		return storeIntrospectionIssues;
	}

	public void setStoreIntrospectionIssues(boolean storeIssues) {
		this.storeIntrospectionIssues = storeIssues;
	}

	// ------------------------------------------------------

	/**
	 * indique si on doit visiter la plateforme
	 */
	private boolean visitPlatform;

	/**
	 * @return the visitPlatform
	 */
	public boolean isVisitPlatform() {
		return visitPlatform;
	}

	/**
	 * @param visitPlatform
	 *            the visitPlatform to set
	 */
	public void setVisitPlatform(boolean visitPlatform) {
		this.visitPlatform = visitPlatform;
	}

	/**
	 * @return the visitWorkspace
	 */
	public boolean isVisitWorkspace() {
		return visitWorkspace;
	}

	/**
	 * @param visitWorkspace
	 *            the visitWorkspace to set
	 */
	public void setVisitWorkspace(boolean visitWorkspace) {
		this.visitWorkspace = visitWorkspace;
	}

	/**
	 * indique si on doit visiter le workspace
	 */
	private boolean visitWorkspace;

	/**
	 * indique des chemins d'update-sites à visiter PLUS TARD
	 */
	@SuppressWarnings("unused")
	private List<String> updateSitesToVisit;

	/**
	 * Method that provide how many plugins are contained in the platform
	 * 
	 * @return Number of platform's plugins
	 */
	public int getPlatformPluginNumber() {
		return PluginRegistry.getExternalModels().length;
	}

	/**
	 * Method that provide how many features are contained in the platform
	 * 
	 * @return Number of platform's features
	 */
	public int getPlatformFeatureNumber() {
		return PDECore.getDefault().getFeatureModelManager().getModels().length;
	}

	/**
	 * Method that provide how many plugins are contained in the workspace
	 * 
	 * @return Number of worskpace's plugins
	 */
	public int getWorkspacePluginNumber() {
		return PluginRegistry.getWorkspaceModels().length;
	}

	public int getWorkspaceFeatureNumber() {
		return PDECore.getDefault().getFeatureModelManager()
				.getWorkspaceModels().length;
	}

	/**
	 * @param ptf
	 */
	public IntrospectionContext() {
		resourceSet = new ResourceSetImpl();
	}

	/**
	 * @return the extensionPointId_ExtensionPoint
	 */
	public HashMap<String, ExtensionPoint> getExtensionPointId_ExtensionPoint() {
		return extensionPointId_ExtensionPoint;
	}

	/**
	 * @return the pluginId_Plugin
	 */
	public HashMap<String, Plugin> getPluginId_Plugin() {
		return pluginId_Plugin;
	}

	/**
	 * @return the pluginId_Plugin_fromOtherModel
	 */
	public HashMap<String, Plugin> getPluginId_Plugin_fromOtherModels() {
		return pluginId_Plugin_fromOtherModels;
	}

	/**
	 * @return the featureId_Feature
	 */
	public HashMap<String, Feature> getFeatureId_Feature() {
		return featureId_Feature;
	}

	/**
	 * @return the featureId_Feature_fromOtherModels
	 */
	public HashMap<String, Feature> getFeatureId_Feature_fromOtherModels() {
		return featureId_Feature_fromOtherModels;
	}

	public HashMap<ISchemaElement, SchemaElement> getEclipseSchemaElement_SchemaElement() {
		return schemaElementHashMap;
	}

	/**
	 * @return the repositoryHashMap
	 */
	public HashMap<String, Repository> getRepositoryHashMap() {
		return repositoryHashMap;
	}

	/**
	 * @return the repositoryToSaveHashMap
	 */
	public HashMap<String, Repository> getRepositoryToSaveHashMap() {
		return repositoryToSaveHashMap;
	}

	/**
	 * @return list of plugins
	 */
	public Collection<Plugin> getPlugins() {
		return getPluginId_Plugin().values();
	}

	/**
	 * @return list of extension points
	 */
	public Collection<ExtensionPoint> getExtensionPoints() {
		return getExtensionPointId_ExtensionPoint().values();
	}

	/**
	 * @return list of features
	 */
	public Collection<Feature> getFeatures() {
		return getFeatureId_Feature().values();
	}

	/**
	 * @return list of schema elements
	 */
	public Collection<SchemaElement> getSchemaElement() {
		return getEclipseSchemaElement_SchemaElement().values();
	}

	/**
	 * Add plugin into HashMap of plugins
	 * 
	 * @param id
	 *            : id of received plugin
	 * @param thePlugin
	 */
	public void addPlugin(String id, Plugin thePlugin) {
		if (!pluginId_Plugin.containsKey(id))
			pluginId_Plugin.put(id, thePlugin);
	}

	/**
	 * Add plugin into HashMap of existing models' plugins
	 * 
	 * @param id
	 *            : id of received plugin
	 * @param thePlugin
	 */
	public void addPlugin_fromOtherModels(String id, Plugin thePlugin) {
		if (!pluginId_Plugin_fromOtherModels.containsKey(id))
			pluginId_Plugin_fromOtherModels.put(id, thePlugin);
	}

	/**
	 * Add extension point into HashMap of extension points
	 * 
	 * @param id
	 *            : id of received extension point
	 * @param extensionPoint
	 */
	public void addExtensionPoint(String id, ExtensionPoint extensionPoint) {
		if (!extensionPointId_ExtensionPoint.containsKey(id))
			extensionPointId_ExtensionPoint.put(id, extensionPoint);
	}

	/**
	 * Add feature into HashMap of features
	 * 
	 * @param id
	 *            : id of received feature
	 * @param currentFeature
	 */
	public void addFeature(String id, Feature currentFeature) {
		if (!featureId_Feature.containsKey(id))
			featureId_Feature.put(id, currentFeature);
	}

	/**
	 * Add feature into HashMap of existing models'features
	 * 
	 * @param id
	 *            : id of received feature
	 * @param currentFeature
	 */
	public void addFeature_fromOtherModels(String id, Feature currentFeature) {
		if (!featureId_Feature_fromOtherModels.containsKey(id))
			featureId_Feature_fromOtherModels.put(id, currentFeature);
	}

	public Collection<IntrospectionErrors> getIntroErrors() {
		return introErrors;
	}

	public void addErrors(IntrospectionErrors introErrors2) {
		introErrors.add(introErrors2);
	}

	public Collection<IntrospectionError> getIntroError() {
		return introError;
	}

	public void addError(IntrospectionError introError2) {
		introError.add(introError2);
	}

	/**
	 * Add schema element into HashMap of schema elements
	 * 
	 * @param eclipseSchemaElement
	 *            : Eclipse's side schema element
	 * @param schemaElement
	 *            : Metamodel's side schema element
	 */
	public void addSchemaElement(ISchemaElement eclipseSchemaElement,
			SchemaElement schemaElement) {
		schemaElementHashMap.put(eclipseSchemaElement, schemaElement);
	}

	/**
	 * Add repository into HashMap of repositories
	 * 
	 * @param name
	 *            : name of the repository
	 * @param repository
	 *            : the repository
	 */
	public void addRepository(String repositoryName, Repository repository) {
		if (!repositoryHashMap.containsKey(repositoryName))
			repositoryHashMap.put(repositoryName, repository);
	}

	public void addRepositoryToSave(String repoName, Repository repository) {
		if (!repositoryToSaveHashMap.containsKey(repoName))
			repositoryToSaveHashMap.put(repoName, repository);
	}

	public void setLoadClassesSetting(boolean loadClassesSetting) {
		this.loadClassesSetting = loadClassesSetting;
	}

	public boolean getLoadClassesSetting() {
		return loadClassesSetting;
	}

	public List<Plugin> getAllPluginsWithGivenID(String id) {

		HashMap<String, Plugin> pluginId_Plugin = getPluginId_Plugin();
		HashMap<String, Plugin> pluginId_Plugin_fromOtherModels = getPluginId_Plugin_fromOtherModels();
		Set<String> keySetOfNewPlugins = pluginId_Plugin.keySet();
		Set<String> keySetOfPluginsFromOtherModels = pluginId_Plugin_fromOtherModels
				.keySet();

		Set<String> allExistingPlugins = new HashSet<String>();
		allExistingPlugins.addAll(keySetOfNewPlugins);
		allExistingPlugins.addAll(keySetOfPluginsFromOtherModels);

		List<Plugin> plugins = new ArrayList<Plugin>();
		String idAndV = id + IntrospectionContext.ID_VERSION_SEPARATOR;

		for (String pluginIDAndVersion : allExistingPlugins) {
			int length = idAndV.length();
			String pluginID = "";
			if (pluginIDAndVersion.length() > length)
				pluginID = pluginIDAndVersion.substring(0, length);
			if (pluginID.equals(idAndV)) {
				Plugin currentPlugin = pluginId_Plugin.get(pluginIDAndVersion);
				if (currentPlugin != null)
					plugins.add(currentPlugin);
				else {
					currentPlugin = pluginId_Plugin_fromOtherModels
							.get(pluginIDAndVersion);
					if (currentPlugin != null)
						plugins.add(currentPlugin);
				}
			}
		}
		// plugins now contains the list of all plugins having for id
		// "currentPluginID"
		Collections.sort(plugins, new PluginComparator());
		// we could sort them by version
		return plugins;
	}

	public List<Feature> getAllFeaturesWithGivenID(String id) {
		HashMap<String, Feature> featureID_Feature = getFeatureId_Feature();
		HashMap<String, Feature> featureId_Feature_fromOtherModels = getFeatureId_Feature_fromOtherModels();
		Set<String> keySetOfCurrentWorkspaceFeatures = featureID_Feature
				.keySet();
		Set<String> keySetOfFeaturesFromOtherModels = featureId_Feature_fromOtherModels
				.keySet();

		Set<String> allExistingFeatures = new HashSet<String>();
		allExistingFeatures.addAll(keySetOfCurrentWorkspaceFeatures);
		allExistingFeatures.addAll(keySetOfFeaturesFromOtherModels);

		List<Feature> features = new ArrayList<Feature>();
		String idAndV = id + IntrospectionContext.ID_VERSION_SEPARATOR;
		for (String featureIDAndVersion : allExistingFeatures) {
			int length = idAndV.length();
			String featureID = "";
			if (featureIDAndVersion.length() > length)
				featureID = featureIDAndVersion.substring(0, length);
			if (featureID.equals(idAndV)) {
				Feature currentFeature = featureID_Feature
						.get(featureIDAndVersion);
				if (currentFeature != null)
					features.add(currentFeature);
				else {
					currentFeature = featureId_Feature_fromOtherModels
							.get(featureIDAndVersion);
					if (currentFeature != null)
						features.add(currentFeature);
				}
			}

		}
		// features now contains the list of all features having for id
		// "id"
		Collections.sort(features, new FeatureComparator());
		// we could sort them by version
		return features;

	}

	public void reset() {
		// Clear all Hash Maps and lists
		this.getExtensionPointId_ExtensionPoint().clear();
		this.getExtensionPoints().clear();
		this.getFeatureId_Feature().clear();
		this.getFeatures().clear();
		this.getPluginId_Plugin().clear();
		this.getPlugins().clear();
		this.getSchemaElement().clear();
		this.getEclipseSchemaElement_SchemaElement().clear();
		this.getRepositoryHashMap().clear();
		this.getRepositoryToSaveHashMap().clear();
		this.getPluginId_Plugin_fromOtherModels().clear();
		this.getFeatureId_Feature_fromOtherModels().clear();
		this.getIntroError().clear();
		this.getIntroErrors().clear();
		this.resourceSet = new ResourceSetImpl();
		if (this.criteria != null) {
			this.criteria.setDomain("");
			this.criteria.setId("");
			this.criteria.setName("");
			this.criteria.setVersion("");
			this.criteria.getTags().clear();
		}
	}

}
