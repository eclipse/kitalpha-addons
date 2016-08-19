/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind;
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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformFactoryImpl extends EFactoryImpl implements PlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformFactory init() {
		try {
			PlatformFactory thePlatformFactory = (PlatformFactory)EPackage.Registry.INSTANCE.getEFactory(PlatformPackage.eNS_URI);
			if (thePlatformFactory != null) {
				return thePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlatformPackage.PLUGIN: return createPlugin();
			case PlatformPackage.EXTENSION_POINT: return createExtensionPoint();
			case PlatformPackage.EXTENSION: return createExtension();
			case PlatformPackage.REPOSITORY: return createRepository();
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT: return createConfiguredSchemaElement();
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE: return createConfigurationElementAttribute();
			case PlatformPackage.COMPLEX_COMPOSITOR: return createComplexCompositor();
			case PlatformPackage.SCHEMA_ELEMENT: return createSchemaElement();
			case PlatformPackage.FEATURE: return createFeature();
			case PlatformPackage.PLUGIN_DEPENDENCY: return createPluginDependency();
			case PlatformPackage.FEATURE_DEPENDENCY: return createFeatureDependency();
			case PlatformPackage.PACKAGE: return createPackage();
			case PlatformPackage.FEATURE_INCLUSION: return createFeatureInclusion();
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE: return createConfigurationElementAttributeInstance();
			case PlatformPackage.STRING_VALUE: return createStringValue();
			case PlatformPackage.JAVA_CLASS_VALUE: return createJavaClassValue();
			case PlatformPackage.BOOLEAN_VALUE: return createBooleanValue();
			case PlatformPackage.CARDINALITY: return createCardinality();
			case PlatformPackage.SCHEMA_ELEMENT_REFERENCE: return createSchemaElementReference();
			case PlatformPackage.ECLIPSE_ELEMENT: return createEclipseElement();
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY: return createFeatureToPluginDependency();
			case PlatformPackage.PLUGIN_EXTENSIONS: return createPluginExtensions();
			case PlatformPackage.PLUGIN_EXTENSION_POINTS: return createPluginExtensionPoints();
			case PlatformPackage.PLUGIN_DEPENDENCIES: return createPluginDependencies();
			case PlatformPackage.FEATURE_DEPENDENCIES: return createFeatureDependencies();
			case PlatformPackage.FEATURE_INCLUSIONS: return createFeatureInclusions();
			case PlatformPackage.FEATURE_PLUGIN_DEPENDENCIES: return createFeaturePluginDependencies();
			case PlatformPackage.INCLUDED_PLUGINS: return createIncludedPlugins();
			case PlatformPackage.ECLIPSE_MODEL: return createEclipseModel();
			case PlatformPackage.EXPORTED_PACKAGE: return createExportedPackage();
			case PlatformPackage.EXPORTED_PACKAGES: return createExportedPackages();
			case PlatformPackage.INTROSPECTION_ERROR: return createIntrospectionError();
			case PlatformPackage.EXECUTION_ENVIRONMENTS: return createExecutionEnvironments();
			case PlatformPackage.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
			case PlatformPackage.INTROSPECTION_ERRORS: return createIntrospectionErrors();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_KIND:
				return createConfigurationElementAttributeKindFromString(eDataType, initialValue);
			case PlatformPackage.COMPLEX_COMPOSITOR_KIND:
				return createComplexCompositorKindFromString(eDataType, initialValue);
			case PlatformPackage.MATCH_RULE:
				return createMatchRuleFromString(eDataType, initialValue);
			case PlatformPackage.INCLUSION_KIND:
				return createInclusionKindFromString(eDataType, initialValue);
			case PlatformPackage.REPOSITORY_KIND:
				return createRepositoryKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_KIND:
				return convertConfigurationElementAttributeKindToString(eDataType, instanceValue);
			case PlatformPackage.COMPLEX_COMPOSITOR_KIND:
				return convertComplexCompositorKindToString(eDataType, instanceValue);
			case PlatformPackage.MATCH_RULE:
				return convertMatchRuleToString(eDataType, instanceValue);
			case PlatformPackage.INCLUSION_KIND:
				return convertInclusionKindToString(eDataType, instanceValue);
			case PlatformPackage.REPOSITORY_KIND:
				return convertRepositoryKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin createPlugin() {
		PluginImpl plugin = new PluginImpl();
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint createExtensionPoint() {
		ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguredSchemaElement createConfiguredSchemaElement() {
		ConfiguredSchemaElementImpl configuredSchemaElement = new ConfiguredSchemaElementImpl();
		return configuredSchemaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationElementAttribute createConfigurationElementAttribute() {
		ConfigurationElementAttributeImpl configurationElementAttribute = new ConfigurationElementAttributeImpl();
		return configurationElementAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexCompositor createComplexCompositor() {
		ComplexCompositorImpl complexCompositor = new ComplexCompositorImpl();
		return complexCompositor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaElement createSchemaElement() {
		SchemaElementImpl schemaElement = new SchemaElementImpl();
		return schemaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginDependency createPluginDependency() {
		PluginDependencyImpl pluginDependency = new PluginDependencyImpl();
		return pluginDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDependency createFeatureDependency() {
		FeatureDependencyImpl featureDependency = new FeatureDependencyImpl();
		return featureDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.kitalpha.pdt.metamodel.model.platform.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureInclusion createFeatureInclusion() {
		FeatureInclusionImpl featureInclusion = new FeatureInclusionImpl();
		return featureInclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationElementAttributeInstance createConfigurationElementAttributeInstance() {
		ConfigurationElementAttributeInstanceImpl configurationElementAttributeInstance = new ConfigurationElementAttributeInstanceImpl();
		return configurationElementAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClassValue createJavaClassValue() {
		JavaClassValueImpl javaClassValue = new JavaClassValueImpl();
		return javaClassValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaElementReference createSchemaElementReference() {
		SchemaElementReferenceImpl schemaElementReference = new SchemaElementReferenceImpl();
		return schemaElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseElement createEclipseElement() {
		EclipseElementImpl eclipseElement = new EclipseElementImpl();
		return eclipseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureToPluginDependency createFeatureToPluginDependency() {
		FeatureToPluginDependencyImpl featureToPluginDependency = new FeatureToPluginDependencyImpl();
		return featureToPluginDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginExtensions createPluginExtensions() {
		PluginExtensionsImpl pluginExtensions = new PluginExtensionsImpl();
		return pluginExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginExtensionPoints createPluginExtensionPoints() {
		PluginExtensionPointsImpl pluginExtensionPoints = new PluginExtensionPointsImpl();
		return pluginExtensionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginDependencies createPluginDependencies() {
		PluginDependenciesImpl pluginDependencies = new PluginDependenciesImpl();
		return pluginDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDependencies createFeatureDependencies() {
		FeatureDependenciesImpl featureDependencies = new FeatureDependenciesImpl();
		return featureDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureInclusions createFeatureInclusions() {
		FeatureInclusionsImpl featureInclusions = new FeatureInclusionsImpl();
		return featureInclusions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePluginDependencies createFeaturePluginDependencies() {
		FeaturePluginDependenciesImpl featurePluginDependencies = new FeaturePluginDependenciesImpl();
		return featurePluginDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedPlugins createIncludedPlugins() {
		IncludedPluginsImpl includedPlugins = new IncludedPluginsImpl();
		return includedPlugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseModel createEclipseModel() {
		EclipseModelImpl eclipseModel = new EclipseModelImpl();
		return eclipseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportedPackage createExportedPackage() {
		ExportedPackageImpl exportedPackage = new ExportedPackageImpl();
		return exportedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportedPackages createExportedPackages() {
		ExportedPackagesImpl exportedPackages = new ExportedPackagesImpl();
		return exportedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrospectionError createIntrospectionError() {
		IntrospectionErrorImpl introspectionError = new IntrospectionErrorImpl();
		return introspectionError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironments createExecutionEnvironments() {
		ExecutionEnvironmentsImpl executionEnvironments = new ExecutionEnvironmentsImpl();
		return executionEnvironments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment createExecutionEnvironment() {
		ExecutionEnvironmentImpl executionEnvironment = new ExecutionEnvironmentImpl();
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrospectionErrors createIntrospectionErrors() {
		IntrospectionErrorsImpl introspectionErrors = new IntrospectionErrorsImpl();
		return introspectionErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationElementAttributeKind createConfigurationElementAttributeKindFromString(EDataType eDataType, String initialValue) {
		ConfigurationElementAttributeKind result = ConfigurationElementAttributeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigurationElementAttributeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexCompositorKind createComplexCompositorKindFromString(EDataType eDataType, String initialValue) {
		ComplexCompositorKind result = ComplexCompositorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplexCompositorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchRule createMatchRuleFromString(EDataType eDataType, String initialValue) {
		MatchRule result = MatchRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionKind createInclusionKindFromString(EDataType eDataType, String initialValue) {
		InclusionKind result = InclusionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInclusionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryKind createRepositoryKindFromString(EDataType eDataType, String initialValue) {
		RepositoryKind result = RepositoryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepositoryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformPackage getPlatformPackage() {
		return (PlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatformPackage getPackage() {
		return PlatformPackage.eINSTANCE;
	}

} //PlatformFactoryImpl
