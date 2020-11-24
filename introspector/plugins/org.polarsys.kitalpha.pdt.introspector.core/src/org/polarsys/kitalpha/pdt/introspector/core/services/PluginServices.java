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

import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.spi.RegistryContributor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.osgi.service.resolver.ExportPackageDescription;
import org.eclipse.osgi.service.resolver.VersionRange;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginExtensionPoint;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.introspector.core.exceptions.IntrospectionExceptions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironment;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;

/**
 * Reference all plugin Services used for create plugins, dependencies,
 * extension points and extensions
 * 
 * 
 * @author Xavier DECOOL
 * 
 */
public class PluginServices {
	private static final String ID_VERSION_SEPARATOR = IntrospectionContext.ID_VERSION_SEPARATOR;

	/**
	 * Public method that call all implemented methods required for create and
	 * set plugin's parameters
	 * 
	 * @param introContext
	 *            class wich refer HashMaps wich contains all elements needed.
	 * @param monitor
	 * @throws FileNotFoundException
	 */

	/*
	 * TODO Complex method
	 */
	public static void createPlugins(IntrospectionContext introContext,
			IProgressMonitor monitor, EclipseModel myEclipseModel)
			throws IntrospectionExceptions {

		List<IPluginModelBase> platformPlugins = new ArrayList<IPluginModelBase>();
		List<IPluginModelBase> workspacePlugins = new ArrayList<IPluginModelBase>();
		ArrayList<IPluginModelBase> totalPlugins = new ArrayList<IPluginModelBase>();

		if (introContext.isVisitPlatform()) {
			platformPlugins = Arrays.asList(PluginRegistry.getExternalModels());
			totalPlugins.addAll(platformPlugins);
		}

		if (introContext.isVisitWorkspace()) {
			workspacePlugins = Arrays.asList(PluginRegistry
					.getWorkspaceModels());
			totalPlugins.addAll(workspacePlugins);
		}

		// Plugins from platform and/or workspace provided by Eclipse are added
		// to the model
		// and to the hashmap
		// If the plugin is found, created and added, extension points are added
		// to the model plugin
		// ---------------------------------------------------------------------------------

		if (monitor != null)
			monitor.subTask("Creating Plugins...");

		for (IPluginModelBase pluginEntry : totalPlugins) {
			if (monitor != null) {
				if (monitor.isCanceled()) {
					throw new IntrospectionExceptions();
				}
			}
			String filterRegEx = introContext.getFilterRegEx();
			// here i store only plugins that respect the regex setted by user
			if (pluginEntry.getPluginBase().getId().startsWith(filterRegEx)) {
				Repository currentRepository = null;
				String pluginEntryIDAndVersionned_label = pluginEntry
						.getPluginBase().getId()
						+ IntrospectionContext.ID_VERSION_SEPARATOR
						+ pluginEntry.getBundleDescription().getVersion();

				String qualifier = pluginEntry.getBundleDescription()
						.getVersion().getQualifier();
				int qualifierSize = qualifier.length();
				boolean isQualifierMatch = introContext.isQualifierMatch();

				pluginEntryIDAndVersionned_label = Helpers.controlVersionLabel(
						pluginEntryIDAndVersionned_label, isQualifierMatch,
						qualifierSize);

				// XXX this interigate me. I'm introspecting a platform only,
				// why this
				// call to workspace? to find extensions?...
				loadWorkspacePlugin(pluginEntry, introContext);

				// Repository is chosen and loaded from user preferences
				if (platformPlugins.contains(pluginEntry))
					currentRepository = introContext
							.getRepositoryToSaveHashMap().get(
									IntrospectionContext.PLATFORM_KEY);
				if (workspacePlugins.contains(pluginEntry))
					currentRepository = introContext
							.getRepositoryToSaveHashMap().get(
									IntrospectionContext.WORKSPACE_KEY);

				// Declaration of the model's Eclipse plugin implementation
				Plugin currentPlugin = null;

				// Check first that currentRepository has been selected
				if (currentRepository != null) {

					// currentPlugin (plugin of the model) creation
					// and currentPlugin's data are copied into the hashmap
					if (!introContext.getPluginId_Plugin_fromOtherModels()
							.containsKey(pluginEntryIDAndVersionned_label)) {
						currentPlugin = createPlugin(pluginEntry, introContext,
								currentRepository);
						// To continue : check if there was no problem during
						// currentPlugin creation
						if (currentPlugin != null) {

							// Everything is allright : extensionsPoints of the
							// plugin
							// can be found
							// from Eclipse plug in element and added to the
							// plugin
							// model
							createPluginExtensionsPoints(pluginEntry,
									currentPlugin, introContext);

							// 1 plugin was considered, 1 coin used for the
							// monitor
							EList<ExtensionPoint> extensionPoints = currentPlugin
									.getExtensionPoints().getExtensionPoints();
							ExtensionPointServices
									.sortExtensionPoints(extensionPoints);
						} else {

							// The plugin couln't be added to the model :
							// Extension
							// points cannot be
							// created nor added. An error is generated on the
							// repository
							String name = pluginEntry.getPluginBase().getName();
							String message = "The plugin "
									+ name
									+ "cannot be added to the introspection model";
							String detail = "The operation createPlugin have failed to implement the plugin "
									+ name + " into the introspection model";

							Helpers.createErrorForModelElement(
									currentRepository, introContext, message,
									detail);
						}
						currentRepository.getPlugins().add(currentPlugin);
						introContext
								.addPlugin(pluginEntryIDAndVersionned_label,
										currentPlugin);
					}
				} else {
					// Turns out currentRepository haven't been selected
					// An error is generated
					Helpers.createErrorForModelElement(myEclipseModel,
							introContext, "Repository cannot be loaded", "");
				}
			}
			if (monitor != null)
				monitor.worked(1);
		}
		// -------------------------------------------------------------------------------

		// Preference to ignore or consider qualifier is loaded
		boolean qualifierMatch = introContext.isQualifierMatch();

		// Related dependencies are added to the model plugins previously
		// created
		// from eclipse elements
		// -------------------------------------------------------------------------------
		if (monitor != null)
			monitor.subTask("Setting up Plugins dependencies...");

		for (IPluginModelBase pluginEntry : totalPlugins) {
			if (monitor != null) {
				if (monitor.isCanceled()) {
					throw new IntrospectionExceptions();
				}
			}

			// Find the plugin related to plugin entry in the hashmap :
			// preparation...
			String namedAndVersionnedPlugin = "";
			String IdAndVersion = pluginEntry.getPluginBase().getId()
					+ ID_VERSION_SEPARATOR
					+ pluginEntry.getPluginBase().getVersion();

			String qualifier = pluginEntry.getBundleDescription().getVersion()
					.getQualifier();
			int qualifierSize = (qualifier.length());

			// .... you get the good key
			namedAndVersionnedPlugin = Helpers.controlVersionLabel(
					IdAndVersion, qualifierMatch, qualifierSize);

			// ...finally you should get it

			Plugin currentPlugin = introContext.getPluginId_Plugin().get(
					namedAndVersionnedPlugin);
			// Check you really found an entry related to the eclipse plugin in
			// the hashmap of
			// all model plugins previously added
			if ((!introContext.getPluginId_Plugin_fromOtherModels()
					.containsKey(namedAndVersionnedPlugin))
					&& currentPlugin != null) {

				createPluginDependencies(currentPlugin, pluginEntry,
						introContext);
			}

			// If it's ok, find the dependencies from the eclipse elements
			// and add them to the model

			// 1 plugin was considered, 1 coin used for the monitor
			if (currentPlugin != null) {
				EList<PluginDependency> pluginDependencies = currentPlugin
						.getPluginDependencies().getPluginDependencies();

				sortPluginDependencies(pluginDependencies);
			}
			if (monitor != null)
				monitor.worked(1);
		}
		// -------------------------------------------------------------------------------

		// Finally, creation of the extensions in the model related to the
		// plugins
		// -------------------------------------------------------------------------------
		if (monitor != null)
			monitor.subTask("Setting up Plugins Extension Points & Extensions...");

		for (IPluginModelBase pluginEntry : totalPlugins) {
			if (monitor != null) {
				if (monitor.isCanceled()) {
					throw new IntrospectionExceptions();
				}
			}
			String namedAndVersionnedPlugin = "";
			String IdAndVersion = pluginEntry.getPluginBase().getId()
					+ ID_VERSION_SEPARATOR
					+ pluginEntry.getPluginBase().getVersion();

			String qualifier = pluginEntry.getBundleDescription().getVersion()
					.getQualifier();
			int qualifierSize = (qualifier.length());

			// .... you get the good key
			namedAndVersionnedPlugin = Helpers.controlVersionLabel(
					IdAndVersion, qualifierMatch, qualifierSize);
			Plugin currentPlugin = introContext.getPluginId_Plugin().get(
					namedAndVersionnedPlugin);
			if ((!introContext.getPluginId_Plugin_fromOtherModels()
					.containsKey(namedAndVersionnedPlugin))
					&& currentPlugin != null) {
				createPluginExtensions(pluginEntry, introContext, currentPlugin);
			}

			// 1 plugin traited, 1 coin used for the monitor
			if (monitor != null)
				monitor.worked(1);
		}

		// -------------------------------------------------------------------------------
	}

	/**
	 * Creation of metamodel Plugin and setting id and version from received
	 * Eclipse Plugin (pluginEntry).
	 * 
	 * @param pluginEntry
	 *            IPluginModelBase Eclipse side
	 * @param introContext
	 *            : class wich refer HashMaps wich contains all elements needed.
	 * @param currentRepository
	 * @return Plugin Metamodel side
	 */
	private static Plugin createPlugin(IPluginModelBase pluginEntry,
			IntrospectionContext introContext, Repository currentRepository) {

		// Getting id of pluginEntry
		String id = pluginEntry.getPluginBase().getId() + ID_VERSION_SEPARATOR
				+ pluginEntry.getPluginBase().getVersion();

		PlatformFactory factory = PlatformFactory.eINSTANCE;
		Plugin currentPlugin = factory.createPlugin();

		String version = pluginEntry.getPluginBase().getVersion();

		boolean qualifierMatch = introContext.isQualifierMatch();

		String qualifier = pluginEntry.getBundleDescription().getVersion()
				.getQualifier();
		int qualifierSize = (qualifier.length());

		String namedAndVersionnedPlugin = Helpers.controlVersionLabel(id,
				qualifierMatch, qualifierSize);

		if (qualifierMatch && qualifierSize > 0)
			version = version.substring(0, version.length()
					- (qualifierSize + 1));

		// add folders in the plugin
		currentPlugin.setPluginDependencies(factory.createPluginDependencies());
		currentPlugin.setExtensionPoints(factory.createPluginExtensionPoints());
		currentPlugin.setExtensions(factory.createPluginExtensions());
		currentPlugin.setExportedPackages(factory.createExportedPackages());
		currentPlugin.setExecutionEnvironmnents(factory
				.createExecutionEnvironments());

		// Set id of metamodel's Plugin ...
		currentPlugin.setId(pluginEntry.getPluginBase().getId());

		// ... and the version
		currentPlugin.setVersion(version);

		// then exported packages
		BundleDescription bundleDescription = pluginEntry
				.getBundleDescription();

		String[] execEvts = bundleDescription.getExecutionEnvironments();
		for (String string : execEvts) {
			ExecutionEnvironment execEvt = factory.createExecutionEnvironment();
			execEvt.setId(string);
			currentPlugin.getExecutionEnvironmnents()
					.getExecutionEnvironments().add(execEvt);
		}

		ExportPackageDescription[] exportPackages = bundleDescription
				.getExportPackages();
		if (exportPackages != null) {
			for (ExportPackageDescription exportPackageDescription : exportPackages) {
				String packageName = exportPackageDescription.getName();
				ExportedPackage exportedPackage = factory
						.createExportedPackage();
				exportedPackage.setId(packageName);
				currentPlugin.getExportedPackages().getExportedPackages()
						.add(exportedPackage);
			}
		}

		// Add currentPlugin to the hash map of plugins
		introContext.addPlugin(namedAndVersionnedPlugin, currentPlugin);

		return currentPlugin;
	}

	/**
	 * Method where we create metamodel PluginDependencies
	 * 
	 * @param currentPlugin
	 * 
	 * @param currentPlugin
	 *            Metamodel Plugin
	 * @param pluginEntry
	 * @param introContext
	 * @param result
	 */
	private static void createPluginDependencies(Plugin currentPlugin,
			IPluginModelBase pluginEntry, IntrospectionContext introContext) {

		BundleDescription bundleDescription = pluginEntry
				.getBundleDescription();

		List<BundleSpecification> requiredBundles = new ArrayList<BundleSpecification>();

		if (bundleDescription != null)
			requiredBundles = Arrays.asList(bundleDescription
					.getRequiredBundles());
		else {

			// TODO externalize
			String message = "Cannot load the bundle for the plugin: "
					+ currentPlugin.getId();
			String detail = "Cannot load the bundle for the plugin: "
					+ currentPlugin.getId();

			Helpers.createErrorForModelElement(currentPlugin, introContext,
					message, detail);
		}

		if (requiredBundles != null) {
			for (BundleSpecification bundleDependency : requiredBundles) {
				// id of the plugin we depend on
				String requiredPluginID = bundleDependency.getName();
				Plugin neededPlugin = null;
				VersionRange versionRange = bundleDependency.getVersionRange();
				VersionRange range = versionRange;
				boolean qualifierMatch = introContext.isQualifierMatch();

				if (versionRange != null) {
					// we ask eclipse to give us the plugin we depend on
					IPluginModelBase neededPluginModelBase = PluginRegistry
							.findModel(requiredPluginID, range, null);

					if (neededPluginModelBase != null) {
						// we get the version number
						String versionNumber = neededPluginModelBase
								.getPluginBase().getVersion();
						String qualifer = neededPluginModelBase
								.getBundleDescription().getVersion()
								.getQualifier();
						int qualifierSize = qualifer.length();

						// construct the key
						String requiredPlugin_Key = requiredPluginID
								+ ID_VERSION_SEPARATOR + versionNumber;

						requiredPlugin_Key = Helpers.controlVersionLabel(
								requiredPlugin_Key, qualifierMatch,
								qualifierSize);

						// get the plugin from our map
						if (introContext.getPluginId_Plugin_fromOtherModels()
								.containsKey(requiredPlugin_Key)) {
							neededPlugin = introContext
									.getPluginId_Plugin_fromOtherModels().get(
											requiredPlugin_Key);
						} else
							neededPlugin = introContext.getPluginId_Plugin()
									.get(requiredPlugin_Key);
					}

				} else {
					// if no version range, we take the plugin with the biggest
					// version number
					List<Plugin> availablePlugins = introContext
							.getAllPluginsWithGivenID(requiredPluginID);
					neededPlugin = availablePlugins
							.get(availablePlugins.size() - 1);
				}

				if (neededPlugin != null) {

					// set up the dependency
					PluginDependency pluginDependency = PlatformFactory.eINSTANCE
							.createPluginDependency();
					pluginDependency.setTarget(neededPlugin);

					// construct the range (that is already satisfied)
					setUpVersionRangeForPluginDependence(pluginDependency,
							bundleDependency);

					// and add the dependency to our plugin
					PluginDependencies pluginDependenciesFolder = currentPlugin
							.getPluginDependencies();
					pluginDependenciesFolder.getPluginDependencies().add(
							pluginDependency);
				} else if (introContext.isStoreIntrospectionIssues()) {

					String message = "Cannot build dependency for the plugin "
							+ currentPlugin.getId();
					String detail = currentPlugin.getId() + " depends on "
							+ requiredPluginID + ", which doesn't exist!";

					Helpers.createErrorForModelElement(currentPlugin,
							introContext, message, detail);
				}
			}
		}
	}

	public static void setUpVersionRangeForPluginDependence(
			PluginDependency pluginDependency,
			BundleSpecification bundleDependency) {

		/*
		 * chercher les bornes de dependances
		 */
		if (bundleDependency != null) {
			VersionRange range = bundleDependency.getVersionRange();
			boolean includeMin = range.getIncludeMinimum();
			boolean includeMax = range.getIncludeMaximum();
			Version min = range.getMinimum();
			Version right = range.getRight();
			Version max = right == null ? new Version(Integer.MAX_VALUE,
					Integer.MAX_VALUE, Integer.MAX_VALUE) : right;

			String minString = min.toString();
			String maxString = null;

			// pour le max, repérer si c'est le max
			if (max.getMajor() == Integer.MAX_VALUE) {
				maxString = Helpers.UNDEFINED_STRING;
			} else {
				maxString = max.toString();
			}

			if (includeMin)
				pluginDependency.setMinimumInclusion(InclusionKind.INCLUSIVE);
			else
				pluginDependency.setMinimumInclusion(InclusionKind.EXCLUSIVE);

			if (includeMax)
				pluginDependency.setMaximumInclusion(InclusionKind.INCLUSIVE);
			else
				pluginDependency.setMaximumInclusion(InclusionKind.EXCLUSIVE);

			if (minString != null)
				pluginDependency.setMinimumVersion(minString);
			else
				pluginDependency.setMinimumVersion(Helpers.UNDEFINED_STRING);
			if (maxString != null)
				pluginDependency.setMaximumVersion(maxString);
			else
				pluginDependency.setMaximumVersion(Helpers.UNDEFINED_STRING);
		}
	}

	/**
	 * Method where we find contributed extensions of the current plugin's
	 * extension points
	 * 
	 * @param currentPlugin
	 * @param pluginEntry
	 * @param introContext
	 */
	private static void createPluginExtensions(IPluginModelBase pluginEntry,
			IntrospectionContext introContext, Plugin currentPlugin) {

		// Find extension points contained by the received plugin

		IPluginExtension[] extensions = pluginEntry.getPluginBase()
				.getExtensions();

		// TODO bug #6058 : quand un plugin declare n extension contribuant au
		// meme extension point
		// le model possède n² extension.
		// if (extensions.length > 1)
		// removeMultipleExtensions(extensions);

		for (IPluginExtension iPluginExtension : extensions) {

			if (iPluginExtension != null) {
				String extPointID = iPluginExtension.getPoint();
				IExtensionPoint extPoint = org.eclipse.core.runtime.Platform
						.getExtensionRegistry().getExtensionPoint(extPointID);
				iPluginExtension.getPluginBase();

				if (extPoint != null) {
					// let's look now for the extension on our plugin
					// "pluginEntry",
					// that contributes to the extension point
					IExtension[] contributingExtensions = extPoint
							.getExtensions();
					ExtensionPoint modelExtPoint = introContext
							.getExtensionPointId_ExtensionPoint().get(
									extPointID);

					for (IExtension iExtension : contributingExtensions) {
						String name = iExtension.getContributor().getName();
						if (name.equals(pluginEntry.getPluginBase().getId())) {
							createPluginExtension(introContext, pluginEntry,
									iExtension, extPoint, modelExtPoint,
									currentPlugin);
						}
					}

				} else {

					Helpers.createErrorForModelElement(
							currentPlugin,
							introContext,
							"extension point"
									+ extPointID
									+ " does not exist, altough it is referenced from -> "
									+ pluginEntry.getPluginBase().getId(),
							"extension point "
									+ extPointID
									+ " does not exist, altough it is referenced from -> "
									+ pluginEntry.getPluginBase().getId());
				}
			}
		}
	}

	private static void loadWorkspacePlugin(IPluginModelBase pluginEntry,
			IntrospectionContext introContext) {

		/*
		 * Solution when extensions are not loaded (if in workspace)
		 */
		Object master = new Object();

		IExtensionRegistry registry = RegistryFactory.getRegistry();

		String pluginPath = pluginEntry.getInstallLocation();

		// get object which represents the workspace
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		// get location of workspace (java.io.File)
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		IPath workspaceDirectory = workspaceRoot.getLocation();
		String workspacePath = workspaceDirectory.toOSString();

		if (pluginPath.contains(workspacePath)) {
			String pluginDotXmlFilePathString = pluginPath.replace(
					workspacePath, "") + "/plugin.xml"; //$NON-NLS-1$
			IPath pluginDotXmlFilePath = new Path(pluginDotXmlFilePathString);
			IFile pluginDotXmlFile = workspaceRoot
					.getFile(pluginDotXmlFilePath);
			String projectName = pluginEntry.getBundleDescription().getName();
			IContributor contributor = new RegistryContributor(projectName,
					projectName, projectName, projectName);
			try {
				Field masterField;
				masterField = registry.getClass().getDeclaredField(
						"masterToken"); //$NON-NLS-1$
				masterField.setAccessible(true);
				master = masterField.get(registry);

				// If not visited yet (we assume that no extensions & no
				// extensionPoints mean that it has never been visited)
				if ((registry.getExtensions(contributor.getName()).length == 0)
						&& (registry.getExtensionPoints(contributor.getName()).length == 0))
					registry.addContribution(pluginDotXmlFile.getContents(),
							contributor, false, contributor.getName(), null,
							master);
			} catch (Exception e) {
				Helpers.createErrorForModelElement(null, introContext,
						"Cannot find XML on " + projectName, "Plugin : "
								+ projectName + " does not include a xml");
			}
		}
	}

	/**
	 * Method where we create plugin's extensions, linked to the received
	 * extension point
	 * 
	 * @param introContext
	 * @param pluginEntry
	 * @param currentExtension
	 * @param currentExtensionPoint
	 *            Extension point, eclipse side
	 * @param extensionPoint
	 *            Extension point, metamodel side
	 * @param currentPlugin
	 */
	private static void createPluginExtension(
			IntrospectionContext introContext, IPluginModelBase pluginEntry,
			IExtension currentExtension, IExtensionPoint currentExtensionPoint,
			ExtensionPoint extensionPoint, Plugin currentPlugin) {

		if (extensionPoint == null) {

			Helpers.createErrorForModelElement(
					currentPlugin,
					introContext,
					"Cannot find a related extension point of "
							+ currentPlugin.getId() + ".", "");

			return;
		}

		PlatformFactory platformFactory = PlatformFactory.eINSTANCE;

		Extension extension = platformFactory.createExtension();

		// First for set Id
		if (currentExtension.getSimpleIdentifier() != null) {
			extension.setId(currentExtension.getSimpleIdentifier());

		} else
			extension.setId(Helpers.ANONYMOUS_ELEMENT);

		extension.setExtensionPoint(extensionPoint);

		// Finally, we add this extension to the extensionPoint
		if (extensionPoint != null)
			extensionPoint.getContributors().add(extension);

		ExtensionServices.createConfiguredSchemaElements(introContext,
				currentExtension, extensionPoint, extension);

		/*
		 * We store the extension with the following rule : If only one plugin
		 * has the given (pluginID), this plugin will host the etension If many
		 * plugins have the given pluginID, then we store the extension in the
		 * one with the higher version number
		 */
		currentPlugin.getExtensions().getExtensions().add(extension);
	}

	/**
	 * Method where we create plugin's extensionPoints
	 * 
	 * @param pluginEntry
	 * @param currentPlugin
	 * @param introContext
	 */
	private static void createPluginExtensionsPoints(
			IPluginModelBase pluginEntry, Plugin currentPlugin,
			IntrospectionContext introContext) {
		PlatformFactory platformFactory = PlatformFactory.eINSTANCE;

		// I search all extensionPoints contained by the received plugin
		IPluginExtensionPoint[] extPoints = pluginEntry.getPluginBase()
				.getExtensionPoints();

		// Creation table of IExtensionPoint needed.
		List<IExtensionPoint> extensionPoints = new ArrayList<IExtensionPoint>();

		for (IPluginExtensionPoint iPluginExtensionPoint : extPoints) {
			IExtensionPoint currentExtP = org.eclipse.core.runtime.Platform
					.getExtensionRegistry().getExtensionPoint(
							iPluginExtensionPoint.getFullId());

			// Recursive filling of the table
			if (currentExtP != null)
				extensionPoints.add(currentExtP);
			else {
				// je n'ai pas reussi à recupérer l'extension point que je
				// suis en train de traiter
				// il n'existe pas dans ma platform
			}
		}

		List<IExtensionPoint> allExtensionPoints = new ArrayList<IExtensionPoint>();

		allExtensionPoints.addAll(extensionPoints);

		// Then i create extensionPoints and i add it to my currentPlugin
		for (IExtensionPoint currentExtensionPoint : allExtensionPoints) {

			// Creation of a metamodel's extension point
			ExtensionPoint extensionPoint = platformFactory
					.createExtensionPoint();

			// Setting ID
			if (currentExtensionPoint.getUniqueIdentifier() == null)
				extensionPoint.setId(Helpers.ANONYMOUS_ELEMENT);
			else {
				extensionPoint.setId(currentExtensionPoint
						.getUniqueIdentifier());
			}

			// Then add it to my currentPlugin
			PluginExtensionPoints extensionPointsFolder = currentPlugin
					.getExtensionPoints();
			extensionPointsFolder.getExtensionPoints().add(extensionPoint);
			introContext.addExtensionPoint(extensionPoint.getId(),
					extensionPoint);
			ExtensionPointServices.createSchemaElements(introContext,
					currentExtensionPoint, extensionPoint);
		}
	}

	/**
	 * Method that sort plugin dependencies in alphabetical order
	 * 
	 * @param dependencies
	 *            : list of plugin dependencies contained in the current plugin
	 */

	public static void sortPluginDependencies(
			EList<PluginDependency> dependencies) {
		PluginDependency[] containedPluginArray = (PluginDependency[]) dependencies
				.toArray();
		org.polarsys.kitalpha.pdt.introspector.core.comparators.PluginDependenciesComparator PluginDependenciesComparator = new org.polarsys.kitalpha.pdt.introspector.core.comparators.PluginDependenciesComparator();
		Arrays.sort(containedPluginArray, PluginDependenciesComparator);
		dependencies.clear();
		for (PluginDependency plugin : containedPluginArray) {
			dependencies.add(plugin);
		}
	}
}
