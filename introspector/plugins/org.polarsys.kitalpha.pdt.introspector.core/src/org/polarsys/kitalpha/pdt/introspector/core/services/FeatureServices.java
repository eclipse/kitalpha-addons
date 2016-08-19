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
package org.polarsys.kitalpha.pdt.introspector.core.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.ifeature.IFeatureChild;
import org.eclipse.pde.internal.core.ifeature.IFeatureImport;
import org.eclipse.pde.internal.core.ifeature.IFeatureInfo;
import org.eclipse.pde.internal.core.ifeature.IFeatureModel;
import org.eclipse.pde.internal.core.ifeature.IFeaturePlugin;
import org.eclipse.pde.internal.core.ifeature.IFeatureURL;
import org.eclipse.pde.internal.core.ifeature.IFeatureURLElement;
import org.eclipse.pde.internal.core.util.VersionUtil;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.introspector.core.exceptions.IntrospectionExceptions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;

/**
 * Services for create features and all object linked on features like
 * dependencies and inclusions
 * 
 * 
 * @author Xavier DECOOL
 * 
 */

@SuppressWarnings("restriction")
public class FeatureServices {

	/**
	 * Method where feature are created and set
	 * 
	 * @param featureEntry
	 * @param introContext
	 *            : Class where are stocked Hash Maps to reuse objects
	 * @param currentRepository
	 */
	private static Feature createFeature(
			org.eclipse.pde.internal.core.feature.Feature featureEntry,
			IntrospectionContext introContext, Repository currentRepository) {

		// Creation of a metamodel Feature
		Feature currentFeature;
		String copyrigthNotice = "";
		String licenseAgreement = "";

		PlatformFactory factory = PlatformFactory.eINSTANCE;
		currentFeature = factory.createFeature();

		Version featureVersion = new Version(featureEntry.getVersion());
		String qualifier = featureVersion.getQualifier();
		int qualifierSize = qualifier.length();

		boolean qualifierMatch = introContext.isQualifierMatch();

		String version = Helpers.controlVersionLabel(featureEntry.getVersion(),
				qualifierMatch, qualifierSize);

		currentFeature.setFeatureDependencies(factory
				.createFeatureDependencies());
		currentFeature.setFeatureInclusions(factory.createFeatureInclusions());
		currentFeature.setPluginDependencies(factory
				.createFeaturePluginDependencies());
		currentFeature.setIncludedPlugins(factory.createIncludedPlugins());

		// Set feataure's id
		currentFeature.setId(featureEntry.getId());

		// Set feature's version
		currentFeature.setVersion(version);
		IFeatureInfo featureInfo32 = featureEntry.getFeatureInfo(1);
		if (featureInfo32 != null) {
			copyrigthNotice = featureInfo32.getDescription();
		}

		// If featureEntry contains a description
		if (copyrigthNotice != null) {
			// Set it to his value
			currentFeature.setCopyrightNotice(copyrigthNotice);
		} else {
			// else set it to "undefined"
			currentFeature.setCopyrightNotice(Helpers.UNDEFINED_STRING);
		}
		// Index 0 to get the featureEntry description
		IFeatureInfo featureInfo = featureEntry.getFeatureInfo(0);
		String description = null;
		if (featureInfo != null) {
			description = featureInfo.getDescription();
		}
		// If featureEntry contains description
		if (description != null) {
			// Set it to his value
			currentFeature.setFeatureDescription(description);
		} else {
			// else set it to "undefined"
			currentFeature.setFeatureDescription(Helpers.UNDEFINED_STRING);
		}
		// Index 2 to get the featureEntry licenseAgreeement
		IFeatureInfo featureInfo2;
		featureInfo2 = featureEntry.getFeatureInfo(2);
		if (featureInfo2 != null) {
			licenseAgreement = featureInfo2.getDescription();
		}
		if (licenseAgreement != null) {
			currentFeature.setLicenseAgreement(licenseAgreement);
		} else {
			currentFeature.setLicenseAgreement(Helpers.UNDEFINED_STRING);
		}

		// Idem for the provider ...
		String providerName = featureEntry.getFeature().getProviderName();
		if (licenseAgreement != null) {
			currentFeature.setProvider(providerName);
		} else {
			currentFeature.setProvider(Helpers.UNDEFINED_STRING);
		}

		// ... and the URL
		IFeatureURL url = featureEntry.getFeature().getURL();
		IFeatureURLElement[] discoveries = null;
		if (url != null) {
			discoveries = url.getDiscoveries();
		}
		if (discoveries != null) {
			currentFeature.setSitesToVisit(discoveries.toString());
		} else {
			currentFeature.setSitesToVisit(Helpers.UNDEFINED_STRING);
		}

		return currentFeature;
	}

	/**
	 * Method used for create feature dependencies and inclusions
	 * 
	 * @param featureEntry
	 * @param featureDescription
	 * @param introContext
	 *            : Class where are stocked Hash Maps to reuse objects
	 */
	private static void createFeatureDependenciesAndInclusions(
			org.eclipse.pde.internal.core.feature.Feature featureEntry,
			IFeatureModel featureDescription,
			IntrospectionContext introContext, Repository currentRepository) {

		FeatureDependencies featureDependenciesFolder = null;
		IncludedPlugins includedPluginFolder = null;
		EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin> includedPlugins = null;
		EList<FeatureDependency> featureDependencies = null;
		FeaturePluginDependencies pluginDependenciesFolder = null;
		EList<FeatureToPluginDependency> pluginDependencies = null;

		String currentFeatureIDAndVersion = featureEntry.getId()
				+ IntrospectionContext.ID_VERSION_SEPARATOR
				+ featureEntry.getVersion();

		boolean qualifierMatch = introContext.isQualifierMatch();

		Version featureVersion = new Version(featureEntry.getVersion());
		String qualifier = featureVersion.getQualifier();
		int qualifierSize = qualifier.length();

		String id = Helpers.controlVersionLabel(currentFeatureIDAndVersion,
				qualifierMatch, qualifierSize);

		Feature introspectionFeature = introContext.getFeatureId_Feature().get(
				id);

		FeatureInclusions featureInclusionsFolder = null;

		if (introspectionFeature.getFeatureInclusions() != null)
			featureInclusionsFolder = introspectionFeature
					.getFeatureInclusions();
		EList<FeatureInclusion> featureInclusions = featureInclusionsFolder
				.getFeatureInclusions();

		if (introspectionFeature != null) {
			includedPluginFolder = introspectionFeature.getIncludedPlugins();
		}
		if (includedPluginFolder != null) {
			includedPlugins = includedPluginFolder.getIncludedPlugins();
		}

		/*
		 * Features dependencies (imports)
		 */
		if (introspectionFeature != null) {
			featureDependenciesFolder = introspectionFeature
					.getFeatureDependencies();
			pluginDependenciesFolder = introspectionFeature
					.getPluginDependencies();
		}

		if (featureDependenciesFolder != null)
			featureDependencies = featureDependenciesFolder
					.getFeatureDependencies();

		if (pluginDependenciesFolder != null)
			pluginDependencies = pluginDependenciesFolder
					.getPluginDependencies();

		IFeatureImport[] imports = featureDescription.getFeature().getImports();
		if (imports != null) {
			for (IFeatureImport _import : imports) {
				String requiredObjectID = _import.getId();
				int type = _import.getType();
				// 0 = plugin , 1 = feature

				if (type == 1) {
					/*
					 * Feature
					 */

					List<Feature> availableFeatures = introContext
							.getAllFeaturesWithGivenID(requiredObjectID);
					Feature requiredFeatureModel = null;

					if (availableFeatures != null) {
						for (int i = availableFeatures.size() - 1; i >= 0; i--) {
							requiredFeatureModel = availableFeatures.get(i);
							// Search for the good feature dependency wich fit
							// with
							// the matchRule
							boolean compare = VersionUtil.compare(
									featureEntry.getId(),
									featureEntry.getVersion(),
									requiredObjectID,
									requiredFeatureModel.getVersion(),
									_import.getMatch());
							// If it's fits,
							if (compare)
								break;
						}
					}

					// Set up feature dependency
					if (requiredFeatureModel != null) {
						FeatureDependency featureDependency = PlatformFactory.eINSTANCE
								.createFeatureDependency();
						featureDependency.setTarget(requiredFeatureModel);

						String featureDependencyVersion = _import.getVersion();
						featureDependency.setVersion(featureDependencyVersion);

						int featureDependencyMatchRule = _import.getMatch();
						MatchRule currentMatchRule = MatchRule.UNSET;

						currentMatchRule = getMatchRule(featureDependencyMatchRule);
						featureDependency.setMatchRule(currentMatchRule);

						// Feature dependency added to our current feature
						featureDependencies.add(featureDependency);
					}
				}

				else {

					/*
					 * Plugin
					 */
					List<Plugin> pluginsWithGivenID = introContext
							.getAllPluginsWithGivenID(requiredObjectID);
					Plugin requiredPluginModel = null;

					if (!pluginsWithGivenID.isEmpty()) {
						requiredPluginModel = pluginsWithGivenID
								.get(pluginsWithGivenID.size() - 1);
						boolean compare = VersionUtil.compare(
								featureEntry.getId(),
								featureEntry.getVersion(), requiredObjectID,
								requiredPluginModel.getVersion(),
								_import.getMatch());
						// If it's fits,
						if (compare)
							break;
					}

					if (requiredPluginModel != null) {
						FeatureToPluginDependency featureToPluginDependency = PlatformFactory.eINSTANCE
								.createFeatureToPluginDependency();
						featureToPluginDependency
								.setTarget(requiredPluginModel);

						String versionToMatch = _import.getVersion();
						featureToPluginDependency.setVersion(versionToMatch);
						int versionMatch = _import.getMatch();

						// Setting of the match rule
						MatchRule currentMatchRule = MatchRule.UNSET;
						currentMatchRule = getMatchRule(versionMatch);
						featureToPluginDependency
								.setMatchRule(currentMatchRule);

						// Add plugin dependency to our current feature
						pluginDependencies.add(featureToPluginDependency);
					}
				}
			}
			if (pluginDependencies != null)
				sortFeaturePluginDependencies(pluginDependencies);

			if (featureDependencies != null)
				sortFeatureDependencies(featureDependencies);
		}

		/*
		 * Included Plugins
		 */
		IFeaturePlugin[] includedEclipsePlugins = featureEntry.getPlugins();

		for (IFeaturePlugin iFeaturePlugin : includedEclipsePlugins) {
			String includedPluginID = iFeaturePlugin.getId();

			List<Plugin> pluginsWithGivenID = introContext
					.getAllPluginsWithGivenID(includedPluginID);
			Plugin includedPlugin = null;

			if (!pluginsWithGivenID.isEmpty())
				includedPlugin = pluginsWithGivenID.get(pluginsWithGivenID
						.size() - 1);

			// If i have included plugin
			if (includedPlugin != null) {
				// Add it
				includedPlugins.add(includedPlugin);
			}
		}

		PackageServices.sortPlugins(includedPlugins);

		/*
		 * Included features
		 */
		IFeatureChild[] includedFeatures = featureEntry.getIncludedFeatures();
		for (IFeatureChild iFeatureChild : includedFeatures) {
			String includedFeatureID = iFeatureChild.getId();
			Feature includedFeature = null;
			List<Feature> includedFeatures2 = introContext
					.getAllFeaturesWithGivenID(includedFeatureID);
			if (!includedFeatures2.isEmpty())
				includedFeature = includedFeatures2.get(includedFeatures2
						.size() - 1);

			// If i have included feature
			if (includedFeature != null) {
				// create it
				FeatureInclusion featureInclusion = PlatformFactory.eINSTANCE
						.createFeatureInclusion();
				// Set his attributes
				featureInclusion.setIncludedFeature(includedFeature);
				featureInclusion.setOptional(iFeatureChild.isOptional());
				featureInclusion.setVersion(iFeatureChild.getVersion());

				// And then add it to feature inclusions of the current feature
				featureInclusions.add(featureInclusion);
			}
		}
		sortFeatureInclusions(featureInclusions);

	}

	/**
	 * @param featureDependencyMatchRule
	 * @return
	 */
	private static MatchRule getMatchRule(int featureDependencyMatchRule) {
		MatchRule currentMatchRule;
		// Setting of feature's match rule
		switch (featureDependencyMatchRule) {
		case 0:
			currentMatchRule = MatchRule.UNSET;
			break;
		case 1:
			currentMatchRule = MatchRule.EQUIVALENT;
			break;
		case 2:
			currentMatchRule = MatchRule.COMPATIBLE;
			break;
		case 3:
			currentMatchRule = MatchRule.PERFECT;
			break;
		case 4:
			currentMatchRule = MatchRule.GREATER_OR_EQUAL;
			break;
		case 5:
			currentMatchRule = MatchRule.PREFIX;
			break;
		default:
			currentMatchRule = MatchRule.UNSET;
		}
		return currentMatchRule;
	}

	/**
	 * Public method that call other privates methods implemented in this class
	 * 
	 * @param introContext
	 *            : Class where are stocked Hash Maps to reuse objects
	 * @param monitor
	 */

	public static void createFeatures(IntrospectionContext introContext,
			IProgressMonitor monitor) throws IntrospectionExceptions {

		// String result = EclipseIntrospectionPreferenceUtils.getResultName();

		// platform features
		List<IFeatureModel> platformFeatureModels = new ArrayList<IFeatureModel>();

		// workspace features
		List<IFeatureModel> workspaceFeatureModels = new ArrayList<IFeatureModel>();
		// total features
		Set<IFeatureModel> totalFeatures = new HashSet<IFeatureModel>();
		// my repository

		Feature currentFeature = null;
		String namedAndVersionnedFeature = "";
		Repository currentRepository = null;

		if (introContext.isVisitPlatform()) {
			platformFeatureModels = Arrays.asList(PDECore.getDefault()
					.getFeatureModelManager().getExternalModels());
			totalFeatures.addAll(platformFeatureModels);
		}

		if (introContext.isVisitWorkspace()) {
			workspaceFeatureModels = Arrays.asList(PDECore.getDefault()
					.getFeatureModelManager().getWorkspaceModels());
			totalFeatures.addAll(workspaceFeatureModels);
		}

		if (monitor != null) {
			monitor.subTask("Creating Features...");
			if (monitor.isCanceled()) {
				throw new IntrospectionExceptions();
			}
		}
		// Here for create features
		for (IFeatureModel currentFeatureModel : totalFeatures) {
			if (monitor != null) {
				if (monitor.isCanceled()) {
					throw new IntrospectionExceptions();
				}
			}
			String filterRegEx = introContext.getFilterRegEx();
			// here i store only plugins that respect the regex setted by user
			if (currentFeatureModel.getFeature().getId()
					.startsWith(filterRegEx)) {
				org.eclipse.pde.internal.core.feature.Feature feature = (org.eclipse.pde.internal.core.feature.Feature) currentFeatureModel
						.getFeature();

				if (feature != null) {
					String id = feature.getId()
							+ IntrospectionContext.ID_VERSION_SEPARATOR
							+ feature.getVersion();
					Version featureVersion = new Version(feature.getVersion());
					String qualifier = featureVersion.getQualifier();
					int qualifierSize = qualifier.length();
					boolean qualifierMatch = introContext.isQualifierMatch();

					namedAndVersionnedFeature = Helpers.controlVersionLabel(id,
							qualifierMatch, qualifierSize);
				}

				if (platformFeatureModels.contains(currentFeatureModel))
					currentRepository = introContext
							.getRepositoryToSaveHashMap().get(
									IntrospectionContext.PLATFORM_KEY);

				if (workspaceFeatureModels.contains(currentFeatureModel))
					currentRepository = introContext
							.getRepositoryToSaveHashMap().get(
									IntrospectionContext.WORKSPACE_KEY);

				if (feature != null
						&& currentRepository != null
						&& (!introContext
								.getFeatureId_Feature_fromOtherModels()
								.containsKey(namedAndVersionnedFeature))) {
					currentFeature = createFeature(feature, introContext,
							currentRepository);
					currentRepository.getFeatures().add(currentFeature);
					introContext.addFeature(namedAndVersionnedFeature,
							currentFeature);
				} else
					// add feature from other models in current hash map
					introContext.addFeature(namedAndVersionnedFeature,
							introContext.getFeatureId_Feature_fromOtherModels()
									.get(namedAndVersionnedFeature));
				// 1 feature traited, 1 coin used for the monitor
				if (monitor != null)
					monitor.worked(1);
			}
		}

		// And here for create objects linked to features
		if (monitor != null)
			monitor.subTask("Setting up Features dependencies and inclusions...");
		if (!totalFeatures.isEmpty()) {
			for (IFeatureModel currentFeatureDescription : totalFeatures) {
				if (monitor != null) {
					if (monitor.isCanceled()) {
						throw new IntrospectionExceptions();
					}
				}
				String filterRegEx = introContext.getFilterRegEx();
				// here i store only plugins that respect the regex setted by
				// user
				if (currentFeatureDescription.getFeature().getId()
						.startsWith(filterRegEx)) {
					org.eclipse.pde.internal.core.feature.Feature featureEntry = (org.eclipse.pde.internal.core.feature.Feature) currentFeatureDescription
							.getFeature();
					if (!introContext.getFeatureId_Feature_fromOtherModels()
							.containsKey(namedAndVersionnedFeature)) {
						createFeatureDependenciesAndInclusions(featureEntry,
								currentFeatureDescription, introContext,
								currentRepository);

					} else
						break;
					currentRepository.getFeatures().add(currentFeature);
					introContext.addFeature(namedAndVersionnedFeature,
							currentFeature);
					// 1 feature traited, 1 coin used for the monitor
					if (monitor != null)
						monitor.worked(1);
				}
			}
		}
	}

	public static void sortFeatureInclusions(
			EList<FeatureInclusion> includedFeatures) {
		FeatureInclusion[] includedFeaturesArray = (FeatureInclusion[]) includedFeatures
				.toArray();
		org.polarsys.kitalpha.pdt.introspector.core.comparators.FeatureInclusionsComparator FeatureInclusionsComparator = new org.polarsys.kitalpha.pdt.introspector.core.comparators.FeatureInclusionsComparator();
		Arrays.sort(includedFeaturesArray, FeatureInclusionsComparator);
		includedFeatures.clear();
		for (FeatureInclusion includedfeature : includedFeaturesArray) {
			includedFeatures.add(includedfeature);
		}
	}

	public static void sortFeaturePluginDependencies(
			EList<FeatureToPluginDependency> pluginDependencies) {
		FeatureToPluginDependency[] includedPluginDependenciesArray = (FeatureToPluginDependency[]) pluginDependencies
				.toArray();
		org.polarsys.kitalpha.pdt.introspector.core.comparators.PluginFeatureDependenciesComparator PluginFeatureDependenciesComparator = new org.polarsys.kitalpha.pdt.introspector.core.comparators.PluginFeatureDependenciesComparator();
		Arrays.sort(includedPluginDependenciesArray,
				PluginFeatureDependenciesComparator);
		pluginDependencies.clear();
		for (FeatureToPluginDependency plugin : includedPluginDependenciesArray) {
			pluginDependencies.add(plugin);
		}
	}

	public static void sortFeatureDependencies(
			EList<FeatureDependency> featureDependencies) {
		FeatureDependency[] featureDependenciesArray = (FeatureDependency[]) featureDependencies
				.toArray();
		org.polarsys.kitalpha.pdt.introspector.core.comparators.FeatureDependenciesComparator FeatureDependenciesComparator = new org.polarsys.kitalpha.pdt.introspector.core.comparators.FeatureDependenciesComparator();
		Arrays.sort(featureDependenciesArray, FeatureDependenciesComparator);
		featureDependencies.clear();
		for (FeatureDependency feature : featureDependenciesArray) {
			featureDependencies.add(feature);
		}
	}
}
