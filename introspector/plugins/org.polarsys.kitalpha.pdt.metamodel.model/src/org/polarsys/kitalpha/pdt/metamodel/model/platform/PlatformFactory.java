/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage
 * @generated
 */
public interface PlatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformFactory eINSTANCE = org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin</em>'.
	 * @generated
	 */
	Plugin createPlugin();

	/**
	 * Returns a new object of class '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Point</em>'.
	 * @generated
	 */
	ExtensionPoint createExtensionPoint();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Configured Schema Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configured Schema Element</em>'.
	 * @generated
	 */
	ConfiguredSchemaElement createConfiguredSchemaElement();

	/**
	 * Returns a new object of class '<em>Configuration Element Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Element Attribute</em>'.
	 * @generated
	 */
	ConfigurationElementAttribute createConfigurationElementAttribute();

	/**
	 * Returns a new object of class '<em>Complex Compositor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Compositor</em>'.
	 * @generated
	 */
	ComplexCompositor createComplexCompositor();

	/**
	 * Returns a new object of class '<em>Schema Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Element</em>'.
	 * @generated
	 */
	SchemaElement createSchemaElement();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Plugin Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin Dependency</em>'.
	 * @generated
	 */
	PluginDependency createPluginDependency();

	/**
	 * Returns a new object of class '<em>Feature Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Dependency</em>'.
	 * @generated
	 */
	FeatureDependency createFeatureDependency();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Feature Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Inclusion</em>'.
	 * @generated
	 */
	FeatureInclusion createFeatureInclusion();

	/**
	 * Returns a new object of class '<em>Configuration Element Attribute Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Element Attribute Instance</em>'.
	 * @generated
	 */
	ConfigurationElementAttributeInstance createConfigurationElementAttributeInstance();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Java Class Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Class Value</em>'.
	 * @generated
	 */
	JavaClassValue createJavaClassValue();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality</em>'.
	 * @generated
	 */
	Cardinality createCardinality();

	/**
	 * Returns a new object of class '<em>Schema Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Element Reference</em>'.
	 * @generated
	 */
	SchemaElementReference createSchemaElementReference();

	/**
	 * Returns a new object of class '<em>Eclipse Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eclipse Element</em>'.
	 * @generated
	 */
	EclipseElement createEclipseElement();

	/**
	 * Returns a new object of class '<em>Feature To Plugin Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature To Plugin Dependency</em>'.
	 * @generated
	 */
	FeatureToPluginDependency createFeatureToPluginDependency();

	/**
	 * Returns a new object of class '<em>Plugin Extensions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin Extensions</em>'.
	 * @generated
	 */
	PluginExtensions createPluginExtensions();

	/**
	 * Returns a new object of class '<em>Plugin Extension Points</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin Extension Points</em>'.
	 * @generated
	 */
	PluginExtensionPoints createPluginExtensionPoints();

	/**
	 * Returns a new object of class '<em>Plugin Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin Dependencies</em>'.
	 * @generated
	 */
	PluginDependencies createPluginDependencies();

	/**
	 * Returns a new object of class '<em>Feature Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Dependencies</em>'.
	 * @generated
	 */
	FeatureDependencies createFeatureDependencies();

	/**
	 * Returns a new object of class '<em>Feature Inclusions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Inclusions</em>'.
	 * @generated
	 */
	FeatureInclusions createFeatureInclusions();

	/**
	 * Returns a new object of class '<em>Feature Plugin Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Plugin Dependencies</em>'.
	 * @generated
	 */
	FeaturePluginDependencies createFeaturePluginDependencies();

	/**
	 * Returns a new object of class '<em>Included Plugins</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Included Plugins</em>'.
	 * @generated
	 */
	IncludedPlugins createIncludedPlugins();

	/**
	 * Returns a new object of class '<em>Eclipse Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eclipse Model</em>'.
	 * @generated
	 */
	EclipseModel createEclipseModel();

	/**
	 * Returns a new object of class '<em>Exported Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exported Package</em>'.
	 * @generated
	 */
	ExportedPackage createExportedPackage();

	/**
	 * Returns a new object of class '<em>Exported Packages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exported Packages</em>'.
	 * @generated
	 */
	ExportedPackages createExportedPackages();

	/**
	 * Returns a new object of class '<em>Introspection Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Introspection Error</em>'.
	 * @generated
	 */
	IntrospectionError createIntrospectionError();

	/**
	 * Returns a new object of class '<em>Execution Environments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Environments</em>'.
	 * @generated
	 */
	ExecutionEnvironments createExecutionEnvironments();

	/**
	 * Returns a new object of class '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Environment</em>'.
	 * @generated
	 */
	ExecutionEnvironment createExecutionEnvironment();

	/**
	 * Returns a new object of class '<em>Introspection Errors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Introspection Errors</em>'.
	 * @generated
	 */
	IntrospectionErrors createIntrospectionErrors();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlatformPackage getPlatformPackage();

} //PlatformFactory
