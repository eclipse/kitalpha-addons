/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.modeler.utils.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedVersionnedElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement;

import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

/**
 * 
 * @author Xavier Decool, Boubekeur Zendagui
 *
 */
public class IntrospectionServices {

	private static final String SHORT_VERSION_LABEL_END = "[...]";
	private static final int MAX_VERSION_LABEL_LENGTH = 15;

	
	public List<Plugin> getAllPlugins(EObject any){
		List<Plugin> result = new ArrayList<Plugin>();
		
		final EObject modelRootElement = EcoreUtil.getRootContainer(any);
		final TreeIterator<EObject> allElements = modelRootElement.eAllContents();
		
		while (allElements.hasNext()) {
			EObject eObject = (EObject) allElements.next();
			if (eObject instanceof Plugin)
			{
				result.add((Plugin)eObject);
			}
		}
		
		Collections.sort(result, new Comparator<Plugin>() {
			@Override
			public int compare(Plugin arg0, Plugin  arg1) {
				final String id0 = arg0.getId();
				final String id1 = arg1.getId();
				return id0.compareTo(id1);
			}
		});
		return result;
	}
	
	public List<Feature> getAllFeatures(EObject any){
		List<Feature> result = new ArrayList<Feature>();
		
		final EObject modelRootElement = EcoreUtil.getRootContainer(any);
		final TreeIterator<EObject> allElements = modelRootElement.eAllContents();
		
		while (allElements.hasNext()) {
			EObject eObject = (EObject) allElements.next();
			if (eObject instanceof Feature)
			{
				result.add((Feature)eObject);
			}
		}
		
		Collections.sort(result, new Comparator<Feature>() {
			@Override
			public int compare(Feature arg0, Feature  arg1) {
				final String id0 = arg0.getId();
				final String id1 = arg1.getId();
				return id0.compareTo(id1);
			}
		});
		return result;
	}
	
	public List<IdentifiedVersionnedElement> getLinkedElement(IdentifiedVersionnedElement element, DSemanticDiagram diagram){
		List<IdentifiedVersionnedElement> result = new ArrayList<IdentifiedVersionnedElement>();
		// First: get all incoming links
		final List<IdentifiedVersionnedElement> incomingLinks = getDependenciesOrInclusionsForGivenElement(element);
		if (incomingLinks != null && ! incomingLinks.isEmpty())
		{
			result.addAll(incomingLinks);
		}
		
		// Second: get all outgoing links
		final List<IdentifiedVersionnedElement> outgoingLinks = getOutgoingDependenciesOrInclusionsForGivenElement(element);
		if (outgoingLinks != null && ! outgoingLinks.isEmpty())
		{
			result.addAll(outgoingLinks);
		}
		
		final List<IdentifiedVersionnedElement> elementOnTheDiagram = getElementOnTheDiagram(diagram);
		
		result.removeAll(elementOnTheDiagram);
		
		return result;
	}
	
	private List<IdentifiedVersionnedElement> getElementOnTheDiagram(DSemanticDiagram diagram){
		List<IdentifiedVersionnedElement> result = new ArrayList<IdentifiedVersionnedElement>();
		final EList<DRepresentationElement> ownedRepresentationElements = diagram.getOwnedRepresentationElements();
		for (DRepresentationElement dRepresentationElement : ownedRepresentationElements) 
		{
			final EObject target = dRepresentationElement.getTarget();
			if (target != null && target instanceof IdentifiedVersionnedElement)
			{
				result.add((IdentifiedVersionnedElement) target);
			}
		}
		return result;
	}
	
	public List<IdentifiedVersionnedElement> getOutgoingDependenciesOrInclusionsForGivenElement(IdentifiedVersionnedElement element){
		List<IdentifiedVersionnedElement> result = new ArrayList<IdentifiedVersionnedElement>();
		if (element instanceof Plugin)
		{
			Plugin plugin = (Plugin) element;
			final PluginDependencies pluginDependencies = plugin.getPluginDependencies();
			if (pluginDependencies != null)
			{
				final EList<PluginDependency> pluginDependencies2 = pluginDependencies.getPluginDependencies();
				if (pluginDependencies2 != null && ! pluginDependencies2.isEmpty())
				{
					for (PluginDependency pluginDependency : pluginDependencies2) 
					{
						result.add(pluginDependency.getTarget());
					}
				}
			}
		}
		
		if (element instanceof Feature)
		{
			Feature feature = (Feature) element;
			// Getting all dependencies
			final IncludedPlugins includedPlugins = feature.getIncludedPlugins();
			final FeaturePluginDependencies pluginDependencies = feature.getPluginDependencies();
			final FeatureInclusions featureInclusions = feature.getFeatureInclusions();
			final FeatureDependencies featureDependencies = feature.getFeatureDependencies();
			
			final EList<Plugin> includedPlugins2 = includedPlugins.getIncludedPlugins();
			final EList<FeatureToPluginDependency> pluginDependencies2 = pluginDependencies.getPluginDependencies();
			final EList<FeatureInclusion> featureInclusions2 = featureInclusions.getFeatureInclusions();
			final EList<FeatureDependency> featureDependencies2 = featureDependencies.getFeatureDependencies();
			
			// Handling dependencies
			if (includedPlugins2 != null && ! includedPlugins2.isEmpty())
			{
				result.addAll(includedPlugins2);
			}
			if (pluginDependencies2 != null && ! pluginDependencies2.isEmpty())
			{
				for (FeatureToPluginDependency featureToPluginDependency : pluginDependencies2) 
				{
					final Plugin target = featureToPluginDependency.getTarget();
					if (target != null)
					{
						result.add(target);
					}
				}
			}
			if (featureDependencies2 != null && ! featureDependencies2.isEmpty())
			{
				for (FeatureDependency featureDependency : featureDependencies2) 
				{
					final Feature target = featureDependency.getTarget();
					if (target != null)
					{
						result.add(target);
					}
				}
			}
			
			if (featureInclusions2 != null && ! featureInclusions2.isEmpty())
			{
				for (FeatureInclusion featureInclusion : featureInclusions2) 
				{
					final Feature includedFeature = featureInclusion.getIncludedFeature();
					if (includedFeature != null)
					{
						result.add(includedFeature);
					}
				}
			}
		}
		return result;
	}
	
	public static void printEObject(EObject obj) {
		System.out.println(obj);
	}

	public static String printName(EclipseElement current) {
		System.out.println(current.toString());
		return current.toString();
	}

	public static Plugin getContributedPluginForGivenPlugin(EObject obj) {
		if (obj instanceof Plugin) {
			Plugin plugin = (Plugin) obj;
			return getContributedPluginForGivenPlugin(plugin);
		}
		return null;
	}

	public static Plugin getContributedPluginForGivenPlugin(Plugin plugin) {
		Plugin contributedPlugin = null;
		EObject pluginContainer = null;
		PluginExtensions extensionFolder = null;
		EList<Extension> extensions = null;
		ArrayList<EObject> containers = new ArrayList<EObject>();

		if (plugin.getExtensions() != null) {
			extensionFolder = plugin.getExtensions();
		}

		if (extensionFolder != null) {
			extensions = extensionFolder.getExtensions();
		}
		if (extensions != null) {
			for (Extension extension : extensions) {
				pluginContainer = extension.getExtensionPoint().eContainer()
						.eContainer();
				containers.add(pluginContainer);
			}
		}

		if (containers != null) {
			for (EObject container : containers) {
				if (container instanceof Plugin) {
					contributedPlugin = (Plugin) container;
				}
			}
		}
		return contributedPlugin;
	}

//	public static Plugin getContributedPluginForGivenExtension(EObject obj) {
//		if (obj instanceof Plugin) {
//			Plugin plugin = (Plugin) obj;
//			return getContributedPluginForGivenExtension(plugin);
//		}
//		return null;
//	}

	public static Plugin getContributedPluginForGivenExtension(Extension extension) {
		Plugin contributedPlugin = null;
		EObject pluginContributed = extension.getExtensionPoint().eContainer().eContainer();
		if (pluginContributed instanceof Plugin)
		{
			contributedPlugin = (Plugin) pluginContributed;
		}
		return contributedPlugin;
	}

	public static List<Plugin> getContributorsOfGivenPlugin(EObject obj) {
		if (obj instanceof Plugin) {
			Plugin plugin = (Plugin) obj;
			return getContributorsOfGivenPlugin(plugin);
		}
		return null;
	}

	public static List<Plugin> getContributorsOfGivenPlugin(Plugin plugin) {
		List<Plugin> contributors = new ArrayList<Plugin>();

		PluginExtensionPoints extensionPointsFolder = null;
		EList<ExtensionPoint> extensionPoints = null;
		EList<Extension> extensionContributors = null;
		EObject pluginContainer = null;
		Plugin contributorPlugin = null;

		if (plugin.getExtensionPoints() != null) {
			extensionPointsFolder = plugin.getExtensionPoints();
		}

		if (extensionPointsFolder != null) {
			extensionPoints = extensionPointsFolder.getExtensionPoints();
		}

		if (extensionPoints != null) {
			for (ExtensionPoint extensionPoint : extensionPoints) {
				extensionContributors = extensionPoint.getContributors();

				for (Extension extension : extensionContributors) {
					pluginContainer = extension.eContainer().eContainer();

					if (pluginContainer instanceof Plugin) {
						contributorPlugin = (Plugin) pluginContainer;
						contributors.add(contributorPlugin);
					}
				}
			}
		}
		return contributors;
	}

	public static List<Plugin> getContributorsForGivenEP(EObject obj) {
		if (obj instanceof ExtensionPoint) {
			ExtensionPoint ep = (ExtensionPoint) obj;
			return getContributorsForGivenEP(ep);
		}
		return null;
	}

	public static List<Plugin> getContributorsForGivenEP(ExtensionPoint ep) {
		Plugin contributor = null;
		EObject pluginContributor = null;
		ArrayList<Plugin> contributors = new ArrayList<Plugin>();
		EList<Extension> extensionContributors = ep.getContributors();

		for (Extension extension : extensionContributors) {
			pluginContributor = extension.eContainer().eContainer();
			if (pluginContributor instanceof Plugin) {
				contributor = (Plugin) pluginContributor;
				contributors.add(contributor);
			}

		}
		return contributors;
	}

	public static List<IdentifiedVersionnedElement> getDependenciesOrInclusionsForGivenElement(
			EObject element) {

		if (element instanceof EclipseElement) {
			EclipseElement ee = (EclipseElement) element;
			return getDependenciesOrInclusionsForGivenElement(ee);
		}
		return null;
	}

	public static List<IdentifiedVersionnedElement> getContainingFeatures(
			Plugin plugin) {
		List<IdentifiedVersionnedElement> incomingFeatures = new ArrayList<IdentifiedVersionnedElement>();
		Collection<Setting> crossReferences = UsageCrossReferencer.find(plugin,
				plugin.eResource());
		IdentifiedVersionnedElement dependant = null;
		
		for (Setting setting : crossReferences) {

			EStructuralFeature settingStructuralFeature = setting
					.getEStructuralFeature();
			
			EReference feature_IncludedPlugins = PlatformPackage.eINSTANCE
					.getIncludedPlugins_IncludedPlugins();

			if (settingStructuralFeature
					.equals(feature_IncludedPlugins)) {
				EObject dependency = setting.getEObject();

				if (dependency instanceof IncludedPlugins)
					dependant = (Feature) (dependency.eContainer());
				if (dependant != null)
					incomingFeatures.add(dependant);
			}
		}
		return incomingFeatures;
	}

	public static List<IdentifiedVersionnedElement> getDependenciesOrInclusionsForGivenElement(EclipseElement element) {
		List<IdentifiedVersionnedElement> incomingElements = new ArrayList<IdentifiedVersionnedElement>();
		Collection<Setting> crossReferences = null;
		IdentifiedVersionnedElement dependant = null;

		// I've received a plugin
		if (element instanceof Plugin) {
			// I check the cross referencer
			//FIXME set ECrossReferencerAdapter, rather than computing this each time!
			crossReferences = UsageCrossReferencer.find(element, element.eResource());
			for (Setting setting : crossReferences) 
			{
				// If my plugin is necessary for others plugins
				EReference pluginDependency_Target = PlatformPackage.eINSTANCE.getPluginDependency_Target();
				if (setting.getEStructuralFeature().equals(pluginDependency_Target)) {
					EObject dependency = setting.getEObject();
					// if a plugin depends on my current plugin
					if (dependency instanceof PluginDependency)
					{
						dependant = (Plugin) (dependency.eContainer().eContainer());
					}

					if (dependant != null)
					{
						incomingElements.add(dependant);
					}
				}

				EStructuralFeature settingStructuralFeature = setting.getEStructuralFeature();
				// If my plugin is necessary for others feature
				if (settingStructuralFeature.equals(PlatformPackage.eINSTANCE.getFeatureToPluginDependency_Target())) 
				{
					EObject dependency = setting.getEObject();
					if (dependency instanceof FeatureToPluginDependency)
					{
						dependant = (Feature) (dependency.eContainer().eContainer());
					}
					if (dependant != null)
					{
						incomingElements.add(dependant);
					}
				} 
				else 
				{
					EReference feature_IncludedPlugins = PlatformPackage.eINSTANCE.getIncludedPlugins_IncludedPlugins();

					if (settingStructuralFeature.equals(feature_IncludedPlugins)) 
					{
						EObject dependency = setting.getEObject();
						if (dependency instanceof IncludedPlugins)
						{
							dependant = (Feature) (dependency.eContainer());
						}
						if (dependant != null)
						{
							incomingElements.add(dependant);
						}
					}
				}
			}
		}

		// I've received a feature
		if (element instanceof Feature) 
		{
			// I check the cross referencer
			crossReferences = UsageCrossReferencer.find(element, element.eResource());
			for (Setting setting : crossReferences) 
			{
				// if a feature depends on my feature
				if (setting.getEStructuralFeature().equals(PlatformPackage.eINSTANCE.getFeatureDependency_Target())) 
				{
					FeatureDependency dependency = (FeatureDependency) setting.getEObject();
					dependant = (Feature) (dependency.eContainer().eContainer());
					incomingElements.add(dependant);
				}

				// if a feature includes my feature
				if (setting.getEStructuralFeature().equals(PlatformPackage.eINSTANCE.getFeatureInclusion_IncludedFeature())) 
				{
					FeatureInclusion inclusion = (FeatureInclusion) setting.getEObject();
					dependant = (Feature) (inclusion.eContainer().eContainer());
					if (dependant != null)
					{
						incomingElements.add(dependant);
					}
				}
			}
		}
		return incomingElements;
	}

	public static String getNameForEclipseElement(EObject obj) {
		if (obj instanceof EclipseElement) {
			EclipseElement elem = (EclipseElement) obj;
			return getNameForEclipseElement(elem);
		}
		return null;
	}

	/**
	 * @param current
	 * @return
	 */
	public static String getNameForEclipseElement(EclipseElement current) {
		String temp = new EclipseElementNameSwitch().doSwitch(current);
		return temp;
	}

//	public static String getVersionShortStringLabel(EObject obj) {
//		if (obj instanceof VersionnedElement) {
//			VersionnedElement ve = (VersionnedElement) obj;
//			return getVersionShortStringLabel(ve);
//		}
//
//		return null;
//	}

	public static String getVersionShortStringLabel(VersionnedElement current) {

		String versionLabel = "<<depends>>\n";
		if (current.getVersion() != null) {
			if (current.getVersion().length() > MAX_VERSION_LABEL_LENGTH) {
				versionLabel += "v"
						+ current.getVersion().substring(0,
								MAX_VERSION_LABEL_LENGTH);
				if (current.getVersion().length() > MAX_VERSION_LABEL_LENGTH)
					versionLabel += versionLabel
							.concat(SHORT_VERSION_LABEL_END);
			} else
				versionLabel += "v" + current.getVersion();
		}
		return versionLabel;
	}

	public static String getLabelForGivenExtension(EObject obj) {
		if (obj instanceof Extension) {
			Extension ext = (Extension) obj;
			return getLabelForGivenExtension(ext);
		}
		return null;
	}

	public static String getLabelForGivenExtension(Extension extension) {
		String result = "";
		EObject eContainer = extension.eContainer().eContainer();
		if (eContainer instanceof Plugin) {
			EList<Extension> extensions = ((Plugin) eContainer).getExtensions()
					.getExtensions();
			int i = 0;
			for (Extension currentExtension : extensions) {
				i++;
				if (currentExtension == extension)
					result = extension.getId() + "_"
							+ ((Plugin) eContainer).getId() + "_" + i;
			}
		}
		return result;
	}

	public static String getVersionShortString(EObject obj) {
		if (obj instanceof VersionnedElement) {
			VersionnedElement ve = (VersionnedElement) obj;
			return getVersionShortString(ve);
		}
		return null;
	}

	public static String getVersionShortString(VersionnedElement current) {
		String versionLabel = "";
		if (current.getVersion().length() > MAX_VERSION_LABEL_LENGTH) {
			versionLabel = "v"
					+ current.getVersion().substring(0,
							MAX_VERSION_LABEL_LENGTH);
			if (current.getVersion().length() > MAX_VERSION_LABEL_LENGTH)
				versionLabel = "v"
						+ versionLabel.concat(SHORT_VERSION_LABEL_END);
		}
		return versionLabel;
	}

	public static String getVersionAndInclusionDependenciesString(EObject obj) {
		if (obj instanceof PluginDependency) {
			PluginDependency dep = (PluginDependency) obj;
			return getVersionAndInclusionDependenciesString(dep);
		}
		return null;
	}

	public static String getVersionAndInclusionDependenciesString(
			PluginDependency current) {

		String label = "";
		InclusionKind minInclusion = current.getMinimumInclusion();
		InclusionKind maxInclusion = current.getMaximumInclusion();
		String minVersion = current.getMinimumVersion();
		String maxVersion = current.getMaximumVersion();
		if (minInclusion == InclusionKind.INCLUSIVE) 
		{
			label += "[";
		}
		else if (minInclusion == InclusionKind.EXCLUSIVE) 
		{
			label += "]";
		} 
		else
		{
			label += "|";
		}
		
		label += (minVersion != null ? minVersion : "?")  + ";" + (maxVersion != null ? maxVersion : "?");

		if (maxInclusion == InclusionKind.INCLUSIVE) {
			label += "]";
		} else if (maxInclusion == InclusionKind.EXCLUSIVE) {
			label += "[";
		} else
			label += "|";

		return label;
	}

	public static String getMaxCardofAComplexSchemaElement(Cardinality maxCard) {
		if (maxCard.isUnbounded())
			return "*";
		else {
			int card = maxCard.getMaxCard();
			String cardinality = Integer.toString(card);
			return cardinality;
		}
	}
}
