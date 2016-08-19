/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.AbstractValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironment;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedVersionnedElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.NamedElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage
 * @generated
 */
public class PlatformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformSwitch() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PlatformPackage.PLUGIN: {
				Plugin plugin = (Plugin)theEObject;
				T result = casePlugin(plugin);
				if (result == null) result = caseIdentifiedVersionnedElement(plugin);
				if (result == null) result = caseIdentifiedElement(plugin);
				if (result == null) result = caseVersionnedElement(plugin);
				if (result == null) result = caseEclipseElement(plugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.EXTENSION_POINT: {
				ExtensionPoint extensionPoint = (ExtensionPoint)theEObject;
				T result = caseExtensionPoint(extensionPoint);
				if (result == null) result = caseIdentifiedElement(extensionPoint);
				if (result == null) result = caseEclipseElement(extensionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseIdentifiedElement(extension);
				if (result == null) result = caseEclipseElement(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = caseNamedElement(repository);
				if (result == null) result = caseEclipseElement(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT: {
				ConfiguredSchemaElement configuredSchemaElement = (ConfiguredSchemaElement)theEObject;
				T result = caseConfiguredSchemaElement(configuredSchemaElement);
				if (result == null) result = caseNamedElement(configuredSchemaElement);
				if (result == null) result = caseEclipseElement(configuredSchemaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE: {
				ConfigurationElementAttribute configurationElementAttribute = (ConfigurationElementAttribute)theEObject;
				T result = caseConfigurationElementAttribute(configurationElementAttribute);
				if (result == null) result = caseNamedElement(configurationElementAttribute);
				if (result == null) result = caseEclipseElement(configurationElementAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.COMPLEX_COMPOSITOR: {
				ComplexCompositor complexCompositor = (ComplexCompositor)theEObject;
				T result = caseComplexCompositor(complexCompositor);
				if (result == null) result = caseCardinality(complexCompositor);
				if (result == null) result = caseEclipseElement(complexCompositor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.SCHEMA_ELEMENT: {
				SchemaElement schemaElement = (SchemaElement)theEObject;
				T result = caseSchemaElement(schemaElement);
				if (result == null) result = caseNamedElement(schemaElement);
				if (result == null) result = caseEclipseElement(schemaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseIdentifiedVersionnedElement(feature);
				if (result == null) result = caseIdentifiedElement(feature);
				if (result == null) result = caseVersionnedElement(feature);
				if (result == null) result = caseEclipseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLUGIN_DEPENDENCY: {
				PluginDependency pluginDependency = (PluginDependency)theEObject;
				T result = casePluginDependency(pluginDependency);
				if (result == null) result = caseEclipseElement(pluginDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FEATURE_DEPENDENCY: {
				FeatureDependency featureDependency = (FeatureDependency)theEObject;
				T result = caseFeatureDependency(featureDependency);
				if (result == null) result = caseVersionnedElement(featureDependency);
				if (result == null) result = caseEclipseElement(featureDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PACKAGE: {
				org.polarsys.kitalpha.pdt.metamodel.model.platform.Package package_ = (org.polarsys.kitalpha.pdt.metamodel.model.platform.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseEclipseElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = caseEclipseElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FEATURE_INCLUSION: {
				FeatureInclusion featureInclusion = (FeatureInclusion)theEObject;
				T result = caseFeatureInclusion(featureInclusion);
				if (result == null) result = caseVersionnedElement(featureInclusion);
				if (result == null) result = caseEclipseElement(featureInclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE: {
				ConfigurationElementAttributeInstance configurationElementAttributeInstance = (ConfigurationElementAttributeInstance)theEObject;
				T result = caseConfigurationElementAttributeInstance(configurationElementAttributeInstance);
				if (result == null) result = caseConfigurationElementAttribute(configurationElementAttributeInstance);
				if (result == null) result = caseNamedElement(configurationElementAttributeInstance);
				if (result == null) result = caseEclipseElement(configurationElementAttributeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.IDENTIFIED_VERSIONNED_ELEMENT: {
				IdentifiedVersionnedElement identifiedVersionnedElement = (IdentifiedVersionnedElement)theEObject;
				T result = caseIdentifiedVersionnedElement(identifiedVersionnedElement);
				if (result == null) result = caseIdentifiedElement(identifiedVersionnedElement);
				if (result == null) result = caseVersionnedElement(identifiedVersionnedElement);
				if (result == null) result = caseEclipseElement(identifiedVersionnedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseEclipseElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseAbstractValue(stringValue);
				if (result == null) result = caseEclipseElement(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.JAVA_CLASS_VALUE: {
				JavaClassValue javaClassValue = (JavaClassValue)theEObject;
				T result = caseJavaClassValue(javaClassValue);
				if (result == null) result = caseAbstractValue(javaClassValue);
				if (result == null) result = caseEclipseElement(javaClassValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseAbstractValue(booleanValue);
				if (result == null) result = caseEclipseElement(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ABSTRACT_VALUE: {
				AbstractValue abstractValue = (AbstractValue)theEObject;
				T result = caseAbstractValue(abstractValue);
				if (result == null) result = caseEclipseElement(abstractValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.VERSIONNED_ELEMENT: {
				VersionnedElement versionnedElement = (VersionnedElement)theEObject;
				T result = caseVersionnedElement(versionnedElement);
				if (result == null) result = caseEclipseElement(versionnedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.CARDINALITY: {
				Cardinality cardinality = (Cardinality)theEObject;
				T result = caseCardinality(cardinality);
				if (result == null) result = caseEclipseElement(cardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.SCHEMA_ELEMENT_REFERENCE: {
				SchemaElementReference schemaElementReference = (SchemaElementReference)theEObject;
				T result = caseSchemaElementReference(schemaElementReference);
				if (result == null) result = caseCardinality(schemaElementReference);
				if (result == null) result = caseNamedElement(schemaElementReference);
				if (result == null) result = caseEclipseElement(schemaElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ECLIPSE_ELEMENT: {
				EclipseElement eclipseElement = (EclipseElement)theEObject;
				T result = caseEclipseElement(eclipseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY: {
				FeatureToPluginDependency featureToPluginDependency = (FeatureToPluginDependency)theEObject;
				T result = caseFeatureToPluginDependency(featureToPluginDependency);
				if (result == null) result = caseVersionnedElement(featureToPluginDependency);
				if (result == null) result = caseEclipseElement(featureToPluginDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLUGIN_EXTENSIONS: {
				PluginExtensions pluginExtensions = (PluginExtensions)theEObject;
				T result = casePluginExtensions(pluginExtensions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLUGIN_EXTENSION_POINTS: {
				PluginExtensionPoints pluginExtensionPoints = (PluginExtensionPoints)theEObject;
				T result = casePluginExtensionPoints(pluginExtensionPoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.PLUGIN_DEPENDENCIES: {
				PluginDependencies pluginDependencies = (PluginDependencies)theEObject;
				T result = casePluginDependencies(pluginDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FEATURE_DEPENDENCIES: {
				FeatureDependencies featureDependencies = (FeatureDependencies)theEObject;
				T result = caseFeatureDependencies(featureDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FEATURE_INCLUSIONS: {
				FeatureInclusions featureInclusions = (FeatureInclusions)theEObject;
				T result = caseFeatureInclusions(featureInclusions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.FEATURE_PLUGIN_DEPENDENCIES: {
				FeaturePluginDependencies featurePluginDependencies = (FeaturePluginDependencies)theEObject;
				T result = caseFeaturePluginDependencies(featurePluginDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.INCLUDED_PLUGINS: {
				IncludedPlugins includedPlugins = (IncludedPlugins)theEObject;
				T result = caseIncludedPlugins(includedPlugins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.ECLIPSE_MODEL: {
				EclipseModel eclipseModel = (EclipseModel)theEObject;
				T result = caseEclipseModel(eclipseModel);
				if (result == null) result = caseNamedElement(eclipseModel);
				if (result == null) result = caseEclipseElement(eclipseModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.EXPORTED_PACKAGE: {
				ExportedPackage exportedPackage = (ExportedPackage)theEObject;
				T result = caseExportedPackage(exportedPackage);
				if (result == null) result = caseIdentifiedElement(exportedPackage);
				if (result == null) result = caseEclipseElement(exportedPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.EXPORTED_PACKAGES: {
				ExportedPackages exportedPackages = (ExportedPackages)theEObject;
				T result = caseExportedPackages(exportedPackages);
				if (result == null) result = caseEclipseElement(exportedPackages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.INTROSPECTION_ERROR: {
				IntrospectionError introspectionError = (IntrospectionError)theEObject;
				T result = caseIntrospectionError(introspectionError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.EXECUTION_ENVIRONMENTS: {
				ExecutionEnvironments executionEnvironments = (ExecutionEnvironments)theEObject;
				T result = caseExecutionEnvironments(executionEnvironments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.EXECUTION_ENVIRONMENT: {
				ExecutionEnvironment executionEnvironment = (ExecutionEnvironment)theEObject;
				T result = caseExecutionEnvironment(executionEnvironment);
				if (result == null) result = caseIdentifiedElement(executionEnvironment);
				if (result == null) result = caseEclipseElement(executionEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlatformPackage.INTROSPECTION_ERRORS: {
				IntrospectionErrors introspectionErrors = (IntrospectionErrors)theEObject;
				T result = caseIntrospectionErrors(introspectionErrors);
				if (result == null) result = caseNamedElement(introspectionErrors);
				if (result == null) result = caseEclipseElement(introspectionErrors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlugin(Plugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionPoint(ExtensionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configured Schema Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configured Schema Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguredSchemaElement(ConfiguredSchemaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Element Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Element Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationElementAttribute(ConfigurationElementAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Compositor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Compositor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexCompositor(ComplexCompositor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaElement(SchemaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePluginDependency(PluginDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureDependency(FeatureDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Inclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureInclusion(FeatureInclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Element Attribute Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Element Attribute Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationElementAttributeInstance(ConfigurationElementAttributeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Versionned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Versionned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedVersionnedElement(IdentifiedVersionnedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Class Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Class Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaClassValue(JavaClassValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractValue(AbstractValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versionned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versionned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionnedElement(VersionnedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinality(Cardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaElementReference(SchemaElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eclipse Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eclipse Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEclipseElement(EclipseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature To Plugin Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature To Plugin Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureToPluginDependency(FeatureToPluginDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin Extensions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin Extensions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePluginExtensions(PluginExtensions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin Extension Points</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin Extension Points</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePluginExtensionPoints(PluginExtensionPoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePluginDependencies(PluginDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureDependencies(FeatureDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Inclusions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Inclusions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureInclusions(FeatureInclusions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Plugin Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Plugin Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePluginDependencies(FeaturePluginDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Plugins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Plugins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedPlugins(IncludedPlugins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eclipse Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eclipse Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEclipseModel(EclipseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exported Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exported Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportedPackage(ExportedPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exported Packages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exported Packages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportedPackages(ExportedPackages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Introspection Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Introspection Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntrospectionError(IntrospectionError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironments(ExecutionEnvironments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironment(ExecutionEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Introspection Errors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Introspection Errors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntrospectionErrors(IntrospectionErrors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PlatformSwitch
