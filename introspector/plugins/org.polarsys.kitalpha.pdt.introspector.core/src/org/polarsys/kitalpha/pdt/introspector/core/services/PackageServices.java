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
package org.polarsys.kitalpha.pdt.introspector.core.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.introspector.core.comparators.FeatureComparator;
import org.polarsys.kitalpha.pdt.introspector.core.exceptions.IntrospectionExceptions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Package;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;

/**
 * Reference all package Services used for create packages and sort plugins,
 * features and packages
 * 
 * 
 * @author Xavier DECOOL
 *
 */
public class PackageServices {

	/**
	 * Method that sort package in alphabetical order
	 * 
	 * @param myRepository
	 */
	private static void sortPackages(Repository myRepository) {
		EList<Package> containedPackages = myRepository.getPackages();

		// i sort my immediate child
		Package[] containedPackagesArray = (Package[]) containedPackages
				.toArray();
		org.polarsys.kitalpha.pdt.introspector.core.comparators.PackageComparator packageComparator = new org.polarsys.kitalpha.pdt.introspector.core.comparators.PackageComparator();
		Arrays.sort(containedPackagesArray, packageComparator);
		containedPackages.clear();
		for (Package currentPackage : containedPackagesArray) {
			containedPackages.add(currentPackage);
		}

		// recursive sort of the descendance
		for (Package currentPackage : containedPackages) {
			sortPackages(currentPackage);
		}
	}

	/**
	 * Method that sort package in alphabetical order
	 * 
	 * @param currentPackage
	 */
	private static void sortPackages(Package currentPackage) {

		// I find sub-packages of the received package
		EList<Package> containedPackages = currentPackage.getSubPackages();
		Package[] containedPackagesArray = (Package[]) containedPackages
				.toArray();
		org.polarsys.kitalpha.pdt.introspector.core.comparators.PackageComparator packageComparator = new org.polarsys.kitalpha.pdt.introspector.core.comparators.PackageComparator();

		// Sort of the array
		Arrays.sort(containedPackagesArray, packageComparator);
		containedPackages.clear();

		for (Package child : containedPackagesArray) {
			containedPackages.add(child);
		}

		for (Package child : containedPackages) {
			// recursive sort of packages
			sortPackages(child);
			sortFeatures(child.getFeatures());
			sortPlugins(child.getPlugins());
		}
	}

	/**
	 * Method that sort features in alphabetical order
	 * 
	 * @param containedFeatures
	 *            : list of features contained in the current package
	 */

	public static void sortFeatures(EList<Feature> containedFeatures) {
		Feature[] containedFeatureArray = (Feature[]) containedFeatures
				.toArray();
		FeatureComparator comparator = new FeatureComparator();
		Arrays.sort(containedFeatureArray, comparator);
		containedFeatures.clear();
		for (Feature feature : containedFeatureArray) {
			containedFeatures.add(feature);
		}
	}

	/**
	 * Method that sort plugins in alphabetical order
	 * 
	 * @param containedPlugins
	 *            : list of plugins contained in the current packages
	 */

	public static void sortPlugins(EList<Plugin> containedPlugins) {
		Plugin[] containedPluginArray = (Plugin[]) containedPlugins.toArray();
		org.polarsys.kitalpha.pdt.introspector.core.comparators.PluginComparator PluginComparator = new org.polarsys.kitalpha.pdt.introspector.core.comparators.PluginComparator();
		Arrays.sort(containedPluginArray, PluginComparator);
		containedPlugins.clear();
		for (Plugin plugin : containedPluginArray) {
			containedPlugins.add(plugin);
		}
	}

	/**
	 * Method that create packages and stock them into sub-packages, based on
	 * absolute name
	 * 
	 * @param myRepository
	 * @param factory
	 * @param absoluteName2Package
	 *            Map of packages associated to their id
	 * @param elementId
	 *            : Id of received objet (plugin or feature)
	 * @param element
	 *            : Element received (plugin or feature)
	 */
	static void handlePackagesForPluginOrFeature(Repository myRepository,
			PlatformFactory factory, Map<String, Package> absoluteName2Package,
			String elementId, EObject element) {
		String currentPluginName = elementId;
		String[] names = currentPluginName.split("[.]");
		String currentAbsName = "";
		String parentAbsName;

		// for (int i = 0; i < names.length - 1; i++) {
		for (int i = 0; i < names.length; i++) {

			// I stock names into parent name. Example : a plugin named a.b.c.d
			// will be stocked
			// on the tree a->b->c->d
			parentAbsName = currentAbsName;

			String currName = names[i];
			if (currentAbsName.length() > 0)
				currentAbsName = currentAbsName + "." + currName;
			else
				currentAbsName = currName;

			Package currentPackage;
			// If i don't have any package with this absolute name
			if (!absoluteName2Package.containsKey(currentAbsName)) {
				// ===> I create it
				currentPackage = factory.createPackage();
				currentPackage.setName(currName);
				absoluteName2Package.put(currentAbsName, currentPackage);

				// Find if a parent package exist
				Package parentPackage;
				if (parentAbsName.length() > 0) {
					parentPackage = absoluteName2Package.get(parentAbsName);

					// and then put currentPackge into the finded parent package
					parentPackage.getSubPackages().add(currentPackage);
				} else {
					myRepository.getPackages().add(currentPackage);
				}
			} else {
				currentPackage = absoluteName2Package.get(currentAbsName);
			}

			// add the plugin into the package only if we are a the last
			// "segment" of the absolute name
			if (i == (names.length - 1)) {
				if (element instanceof Plugin) {
					currentPackage.getPlugins().add((Plugin) element);
				} else if (element instanceof Feature) {
					currentPackage.getFeatures().add((Feature) element);
				} else
					System.out.println("cas non prévu");
			}
		}
	}

	/**
	 * Public method that call other private method implemented in this class
	 * 
	 * @param introContext
	 * @param monitor
	 * @param myRepository
	 * @param myRepository
	 */
	public static void createPackages(IntrospectionContext introContext,
			IProgressMonitor monitor, Repository myRepository) throws IntrospectionExceptions{

		monitor.subTask("Creating Packages...");

		Plugin[] plugins = (Plugin[]) myRepository.getPlugins().toArray();
		Feature[] features = (Feature[]) myRepository.getFeatures().toArray();

		PlatformFactory factory = PlatformFactory.eINSTANCE;
		Map<String, Package> absoluteName2Package = new HashMap<String, Package>();

		for (Plugin currentPlugin : plugins) {
			// Get the id of each plugin
			if(monitor.isCanceled()){
				throw new IntrospectionExceptions();
			}
			String pluginId = currentPlugin.getId();
			PackageServices.handlePackagesForPluginOrFeature(myRepository,
					factory, absoluteName2Package, pluginId, currentPlugin);
			monitor.worked(1);
		}
		for (Feature currentFeature : features) {
			if(monitor.isCanceled()){
				throw new IntrospectionExceptions();
			}
			String featureId = currentFeature.getId();
			PackageServices.handlePackagesForPluginOrFeature(myRepository,
					factory, absoluteName2Package, featureId, currentFeature);
			monitor.worked(1);
		}
		// recursive sort of packages
		sortPackages(myRepository);

		// et on refait un tour sur les packages : si un package ne contient
		// qu'un seul plugin ou une seule feature,
		// alors on bouge le plugin/la feature vers le container
		boolean changed = true;
		while (changed) {
			changed = false;
			Package[] rootPackages = (Package[]) myRepository.getPackages()
					.toArray();
			for (Package currentPackage : rootPackages) {
				changed = changed || removeUselessPackages(currentPackage);
			}
		}
	}

	private static boolean removeUselessPackages(Package p) {
		boolean changed = false;
		Package[] subPackages = (Package[]) p.getSubPackages().toArray();
		if (subPackages.length == 0) {
			Plugin[] plugins = (Plugin[]) p.getPlugins().toArray();
			Feature[] features = (Feature[]) p.getFeatures().toArray();

			if (plugins.length + features.length == 1) {
				if (plugins.length == 1)
					for (Plugin plugin : plugins) {
						// System.out.println("moved " + plugin.getId() + " "
						// + plugin.getVersion());

						if (p.eContainer() instanceof Package) {
							Package father = (Package) p.eContainer();
							father.getPlugins().add(plugin);
							// System.out.println("...to " +
							// father.getAbsoluteName());
							// System.out.println(plugin.eContainer());
						} else {
							Repository father = (Repository) p.eContainer();
							father.getPlugins().add(plugin);
							// System.out.println("...to " + father.getName());
							// System.out.println(plugin.eContainer());
						}
					}

				if (features.length == 1)
					for (Feature feature : features) {
						// System.out.print("moved " + feature.getId() + " "
						// + feature.getVersion());

						if (p.eContainer() instanceof Package) {
							Package father = (Package) p.eContainer();
							father.getFeatures().add(feature);
							// System.out.println("...to "
							// + father.getAbsoluteName());
							// System.out.println(feature.eContainer());
						} else {
							Repository father = (Repository) p.eContainer();
							father.getFeatures().add(feature);
							// System.out.println("...to " + father.getName());
							// System.out.println(feature.eContainer());
						}
					}

				// System.out.println("removed " + p.getAbsoluteName());
				EcoreUtil.remove(p);
				changed = true;
			}

		} else {
			for (Package subPackage : subPackages) {
				changed = changed || removeUselessPackages(subPackage);
			}
		}
		return changed;
	}

}
