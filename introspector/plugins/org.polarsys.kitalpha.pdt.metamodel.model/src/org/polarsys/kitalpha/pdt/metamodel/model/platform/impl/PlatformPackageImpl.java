/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.AbstractValue;
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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedVersionnedElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.NamedElement;
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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformPackageImpl extends EPackageImpl implements PlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuredSchemaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationElementAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexCompositorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureInclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationElementAttributeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedVersionnedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaClassValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionnedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaElementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureToPluginDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginExtensionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginExtensionPointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureInclusionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePluginDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedPluginsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportedPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportedPackagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass introspectionErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass introspectionErrorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum configurationElementAttributeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum complexCompositorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matchRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inclusionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repositoryKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlatformPackageImpl() {
		super(eNS_URI, PlatformFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlatformPackage init() {
		if (isInited) return (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Obtain or create and register package
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlatformPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePlatformPackage.createPackageContents();

		// Initialize created meta-data
		thePlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlatformPackage.eNS_URI, thePlatformPackage);
		return thePlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlugin() {
		return pluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlugin_ExtensionPoints() {
		return (EReference)pluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlugin_Extensions() {
		return (EReference)pluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlugin_PluginDependencies() {
		return (EReference)pluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlugin_ExportedPackages() {
		return (EReference)pluginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlugin_ExecutionEnvironmnents() {
		return (EReference)pluginEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionPoint() {
		return extensionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionPoint_SchemaElements() {
		return (EReference)extensionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionPoint_Contributors() {
		return (EReference)extensionPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionPoint_ExtensionSchemaElement() {
		return (EReference)extensionPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ExtensionPoint() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ConfiguredSchemaElement() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Packages() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Plugins() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Features() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_RepositoryKind() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguredSchemaElement() {
		return configuredSchemaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguredSchemaElement_Children() {
		return (EReference)configuredSchemaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguredSchemaElement_SchemaElement() {
		return (EReference)configuredSchemaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguredSchemaElement_ConfigurationElements() {
		return (EReference)configuredSchemaElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationElementAttribute() {
		return configurationElementAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationElementAttribute_Type() {
		return (EAttribute)configurationElementAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationElementAttribute_BasedOn() {
		return (EAttribute)configurationElementAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationElementAttribute_Translatable() {
		return (EAttribute)configurationElementAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexCompositor() {
		return complexCompositorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexCompositor_ComplexCompositorKind() {
		return (EAttribute)complexCompositorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexCompositor_ComplexCompositorChildren() {
		return (EReference)complexCompositorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexCompositor_ElementReferences() {
		return (EReference)complexCompositorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaElement() {
		return schemaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaElement_Attributes() {
		return (EReference)schemaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaElement_ComplexCompositor() {
		return (EReference)schemaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_FeatureDescription() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_CopyrightNotice() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_LicenseAgreement() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_SitesToVisit() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Provider() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeatureInclusions() {
		return (EReference)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_PluginDependencies() {
		return (EReference)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_IncludedPlugins() {
		return (EReference)featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeatureDependencies() {
		return (EReference)featureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginDependency() {
		return pluginDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginDependency_Target() {
		return (EReference)pluginDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDependency_MinimumVersion() {
		return (EAttribute)pluginDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDependency_MaximumVersion() {
		return (EAttribute)pluginDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDependency_MinimumInclusion() {
		return (EAttribute)pluginDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDependency_MaximumInclusion() {
		return (EAttribute)pluginDependencyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureDependency() {
		return featureDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureDependency_Target() {
		return (EReference)featureDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureDependency_MatchRule() {
		return (EAttribute)featureDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_SubPackages() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Plugins() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Features() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_AbsoluteName() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureInclusion() {
		return featureInclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureInclusion_Optional() {
		return (EAttribute)featureInclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureInclusion_IncludedFeature() {
		return (EReference)featureInclusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationElementAttributeInstance() {
		return configurationElementAttributeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationElementAttributeInstance_AttributeDefinition() {
		return (EReference)configurationElementAttributeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationElementAttributeInstance_ContainedValue() {
		return (EReference)configurationElementAttributeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedVersionnedElement() {
		return identifiedVersionnedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaClassValue() {
		return javaClassValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaClassValue_ClassName() {
		return (EAttribute)javaClassValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractValue() {
		return abstractValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionnedElement() {
		return versionnedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionnedElement_Version() {
		return (EAttribute)versionnedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_MinCard() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_MaxCard() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_Unbounded() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaElementReference() {
		return schemaElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaElementReference_Reference() {
		return (EReference)schemaElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipseElement() {
		return eclipseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseElement_EclipseElementIntrospectionErrors() {
		return (EReference)eclipseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureToPluginDependency() {
		return featureToPluginDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureToPluginDependency_MatchRule() {
		return (EAttribute)featureToPluginDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureToPluginDependency_Target() {
		return (EReference)featureToPluginDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginExtensions() {
		return pluginExtensionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginExtensions_Extensions() {
		return (EReference)pluginExtensionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginExtensionPoints() {
		return pluginExtensionPointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginExtensionPoints_ExtensionPoints() {
		return (EReference)pluginExtensionPointsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginDependencies() {
		return pluginDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginDependencies_PluginDependencies() {
		return (EReference)pluginDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureDependencies() {
		return featureDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureDependencies_FeatureDependencies() {
		return (EReference)featureDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureInclusions() {
		return featureInclusionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureInclusions_FeatureInclusions() {
		return (EReference)featureInclusionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturePluginDependencies() {
		return featurePluginDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturePluginDependencies_PluginDependencies() {
		return (EReference)featurePluginDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedPlugins() {
		return includedPluginsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludedPlugins_IncludedPlugins() {
		return (EReference)includedPluginsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipseModel() {
		return eclipseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseModel_Repositories() {
		return (EReference)eclipseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseModel_IntrospectionErrors() {
		return (EReference)eclipseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipseModel_QualifierIgnored() {
		return (EAttribute)eclipseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportedPackage() {
		return exportedPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportedPackages() {
		return exportedPackagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExportedPackages_ExportedPackages() {
		return (EReference)exportedPackagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntrospectionError() {
		return introspectionErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntrospectionError_Summary() {
		return (EAttribute)introspectionErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntrospectionError_Details() {
		return (EAttribute)introspectionErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntrospectionError_Target() {
		return (EReference)introspectionErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironments() {
		return executionEnvironmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionEnvironments_ExecutionEnvironments() {
		return (EReference)executionEnvironmentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironment() {
		return executionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntrospectionErrors() {
		return introspectionErrorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntrospectionErrors_IntrospectionErrors() {
		return (EReference)introspectionErrorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConfigurationElementAttributeKind() {
		return configurationElementAttributeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComplexCompositorKind() {
		return complexCompositorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMatchRule() {
		return matchRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInclusionKind() {
		return inclusionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepositoryKind() {
		return repositoryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactory getPlatformFactory() {
		return (PlatformFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pluginEClass = createEClass(PLUGIN);
		createEReference(pluginEClass, PLUGIN__EXTENSION_POINTS);
		createEReference(pluginEClass, PLUGIN__EXTENSIONS);
		createEReference(pluginEClass, PLUGIN__PLUGIN_DEPENDENCIES);
		createEReference(pluginEClass, PLUGIN__EXPORTED_PACKAGES);
		createEReference(pluginEClass, PLUGIN__EXECUTION_ENVIRONMNENTS);

		extensionPointEClass = createEClass(EXTENSION_POINT);
		createEReference(extensionPointEClass, EXTENSION_POINT__SCHEMA_ELEMENTS);
		createEReference(extensionPointEClass, EXTENSION_POINT__CONTRIBUTORS);
		createEReference(extensionPointEClass, EXTENSION_POINT__EXTENSION_SCHEMA_ELEMENT);

		extensionEClass = createEClass(EXTENSION);
		createEReference(extensionEClass, EXTENSION__EXTENSION_POINT);
		createEReference(extensionEClass, EXTENSION__CONFIGURED_SCHEMA_ELEMENT);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__PACKAGES);
		createEReference(repositoryEClass, REPOSITORY__PLUGINS);
		createEReference(repositoryEClass, REPOSITORY__FEATURES);
		createEAttribute(repositoryEClass, REPOSITORY__REPOSITORY_KIND);

		configuredSchemaElementEClass = createEClass(CONFIGURED_SCHEMA_ELEMENT);
		createEReference(configuredSchemaElementEClass, CONFIGURED_SCHEMA_ELEMENT__CHILDREN);
		createEReference(configuredSchemaElementEClass, CONFIGURED_SCHEMA_ELEMENT__SCHEMA_ELEMENT);
		createEReference(configuredSchemaElementEClass, CONFIGURED_SCHEMA_ELEMENT__CONFIGURATION_ELEMENTS);

		configurationElementAttributeEClass = createEClass(CONFIGURATION_ELEMENT_ATTRIBUTE);
		createEAttribute(configurationElementAttributeEClass, CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE);
		createEAttribute(configurationElementAttributeEClass, CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON);
		createEAttribute(configurationElementAttributeEClass, CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE);

		complexCompositorEClass = createEClass(COMPLEX_COMPOSITOR);
		createEAttribute(complexCompositorEClass, COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND);
		createEReference(complexCompositorEClass, COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN);
		createEReference(complexCompositorEClass, COMPLEX_COMPOSITOR__ELEMENT_REFERENCES);

		schemaElementEClass = createEClass(SCHEMA_ELEMENT);
		createEReference(schemaElementEClass, SCHEMA_ELEMENT__ATTRIBUTES);
		createEReference(schemaElementEClass, SCHEMA_ELEMENT__COMPLEX_COMPOSITOR);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__FEATURE_DESCRIPTION);
		createEAttribute(featureEClass, FEATURE__COPYRIGHT_NOTICE);
		createEAttribute(featureEClass, FEATURE__LICENSE_AGREEMENT);
		createEAttribute(featureEClass, FEATURE__SITES_TO_VISIT);
		createEAttribute(featureEClass, FEATURE__PROVIDER);
		createEReference(featureEClass, FEATURE__FEATURE_INCLUSIONS);
		createEReference(featureEClass, FEATURE__PLUGIN_DEPENDENCIES);
		createEReference(featureEClass, FEATURE__INCLUDED_PLUGINS);
		createEReference(featureEClass, FEATURE__FEATURE_DEPENDENCIES);

		pluginDependencyEClass = createEClass(PLUGIN_DEPENDENCY);
		createEReference(pluginDependencyEClass, PLUGIN_DEPENDENCY__TARGET);
		createEAttribute(pluginDependencyEClass, PLUGIN_DEPENDENCY__MINIMUM_VERSION);
		createEAttribute(pluginDependencyEClass, PLUGIN_DEPENDENCY__MAXIMUM_VERSION);
		createEAttribute(pluginDependencyEClass, PLUGIN_DEPENDENCY__MINIMUM_INCLUSION);
		createEAttribute(pluginDependencyEClass, PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION);

		featureDependencyEClass = createEClass(FEATURE_DEPENDENCY);
		createEReference(featureDependencyEClass, FEATURE_DEPENDENCY__TARGET);
		createEAttribute(featureDependencyEClass, FEATURE_DEPENDENCY__MATCH_RULE);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__SUB_PACKAGES);
		createEReference(packageEClass, PACKAGE__PLUGINS);
		createEReference(packageEClass, PACKAGE__FEATURES);
		createEAttribute(packageEClass, PACKAGE__ABSOLUTE_NAME);

		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		featureInclusionEClass = createEClass(FEATURE_INCLUSION);
		createEAttribute(featureInclusionEClass, FEATURE_INCLUSION__OPTIONAL);
		createEReference(featureInclusionEClass, FEATURE_INCLUSION__INCLUDED_FEATURE);

		configurationElementAttributeInstanceEClass = createEClass(CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE);
		createEReference(configurationElementAttributeInstanceEClass, CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ATTRIBUTE_DEFINITION);
		createEReference(configurationElementAttributeInstanceEClass, CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE);

		identifiedVersionnedElementEClass = createEClass(IDENTIFIED_VERSIONNED_ELEMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		javaClassValueEClass = createEClass(JAVA_CLASS_VALUE);
		createEAttribute(javaClassValueEClass, JAVA_CLASS_VALUE__CLASS_NAME);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		abstractValueEClass = createEClass(ABSTRACT_VALUE);

		versionnedElementEClass = createEClass(VERSIONNED_ELEMENT);
		createEAttribute(versionnedElementEClass, VERSIONNED_ELEMENT__VERSION);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__MIN_CARD);
		createEAttribute(cardinalityEClass, CARDINALITY__MAX_CARD);
		createEAttribute(cardinalityEClass, CARDINALITY__UNBOUNDED);

		schemaElementReferenceEClass = createEClass(SCHEMA_ELEMENT_REFERENCE);
		createEReference(schemaElementReferenceEClass, SCHEMA_ELEMENT_REFERENCE__REFERENCE);

		eclipseElementEClass = createEClass(ECLIPSE_ELEMENT);
		createEReference(eclipseElementEClass, ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS);

		featureToPluginDependencyEClass = createEClass(FEATURE_TO_PLUGIN_DEPENDENCY);
		createEAttribute(featureToPluginDependencyEClass, FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE);
		createEReference(featureToPluginDependencyEClass, FEATURE_TO_PLUGIN_DEPENDENCY__TARGET);

		pluginExtensionsEClass = createEClass(PLUGIN_EXTENSIONS);
		createEReference(pluginExtensionsEClass, PLUGIN_EXTENSIONS__EXTENSIONS);

		pluginExtensionPointsEClass = createEClass(PLUGIN_EXTENSION_POINTS);
		createEReference(pluginExtensionPointsEClass, PLUGIN_EXTENSION_POINTS__EXTENSION_POINTS);

		pluginDependenciesEClass = createEClass(PLUGIN_DEPENDENCIES);
		createEReference(pluginDependenciesEClass, PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES);

		featureDependenciesEClass = createEClass(FEATURE_DEPENDENCIES);
		createEReference(featureDependenciesEClass, FEATURE_DEPENDENCIES__FEATURE_DEPENDENCIES);

		featureInclusionsEClass = createEClass(FEATURE_INCLUSIONS);
		createEReference(featureInclusionsEClass, FEATURE_INCLUSIONS__FEATURE_INCLUSIONS);

		featurePluginDependenciesEClass = createEClass(FEATURE_PLUGIN_DEPENDENCIES);
		createEReference(featurePluginDependenciesEClass, FEATURE_PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES);

		includedPluginsEClass = createEClass(INCLUDED_PLUGINS);
		createEReference(includedPluginsEClass, INCLUDED_PLUGINS__INCLUDED_PLUGINS);

		eclipseModelEClass = createEClass(ECLIPSE_MODEL);
		createEReference(eclipseModelEClass, ECLIPSE_MODEL__REPOSITORIES);
		createEReference(eclipseModelEClass, ECLIPSE_MODEL__INTROSPECTION_ERRORS);
		createEAttribute(eclipseModelEClass, ECLIPSE_MODEL__QUALIFIER_IGNORED);

		exportedPackageEClass = createEClass(EXPORTED_PACKAGE);

		exportedPackagesEClass = createEClass(EXPORTED_PACKAGES);
		createEReference(exportedPackagesEClass, EXPORTED_PACKAGES__EXPORTED_PACKAGES);

		introspectionErrorEClass = createEClass(INTROSPECTION_ERROR);
		createEAttribute(introspectionErrorEClass, INTROSPECTION_ERROR__SUMMARY);
		createEAttribute(introspectionErrorEClass, INTROSPECTION_ERROR__DETAILS);
		createEReference(introspectionErrorEClass, INTROSPECTION_ERROR__TARGET);

		executionEnvironmentsEClass = createEClass(EXECUTION_ENVIRONMENTS);
		createEReference(executionEnvironmentsEClass, EXECUTION_ENVIRONMENTS__EXECUTION_ENVIRONMENTS);

		executionEnvironmentEClass = createEClass(EXECUTION_ENVIRONMENT);

		introspectionErrorsEClass = createEClass(INTROSPECTION_ERRORS);
		createEReference(introspectionErrorsEClass, INTROSPECTION_ERRORS__INTROSPECTION_ERRORS);

		// Create enums
		configurationElementAttributeKindEEnum = createEEnum(CONFIGURATION_ELEMENT_ATTRIBUTE_KIND);
		complexCompositorKindEEnum = createEEnum(COMPLEX_COMPOSITOR_KIND);
		matchRuleEEnum = createEEnum(MATCH_RULE);
		inclusionKindEEnum = createEEnum(INCLUSION_KIND);
		repositoryKindEEnum = createEEnum(REPOSITORY_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pluginEClass.getESuperTypes().add(this.getIdentifiedVersionnedElement());
		extensionPointEClass.getESuperTypes().add(this.getIdentifiedElement());
		extensionEClass.getESuperTypes().add(this.getIdentifiedElement());
		repositoryEClass.getESuperTypes().add(this.getNamedElement());
		configuredSchemaElementEClass.getESuperTypes().add(this.getNamedElement());
		configurationElementAttributeEClass.getESuperTypes().add(this.getNamedElement());
		complexCompositorEClass.getESuperTypes().add(this.getCardinality());
		schemaElementEClass.getESuperTypes().add(this.getNamedElement());
		featureEClass.getESuperTypes().add(this.getIdentifiedVersionnedElement());
		pluginDependencyEClass.getESuperTypes().add(this.getEclipseElement());
		featureDependencyEClass.getESuperTypes().add(this.getVersionnedElement());
		packageEClass.getESuperTypes().add(this.getNamedElement());
		identifiedElementEClass.getESuperTypes().add(this.getEclipseElement());
		featureInclusionEClass.getESuperTypes().add(this.getVersionnedElement());
		configurationElementAttributeInstanceEClass.getESuperTypes().add(this.getConfigurationElementAttribute());
		identifiedVersionnedElementEClass.getESuperTypes().add(this.getIdentifiedElement());
		identifiedVersionnedElementEClass.getESuperTypes().add(this.getVersionnedElement());
		namedElementEClass.getESuperTypes().add(this.getEclipseElement());
		stringValueEClass.getESuperTypes().add(this.getAbstractValue());
		javaClassValueEClass.getESuperTypes().add(this.getAbstractValue());
		booleanValueEClass.getESuperTypes().add(this.getAbstractValue());
		abstractValueEClass.getESuperTypes().add(this.getEclipseElement());
		versionnedElementEClass.getESuperTypes().add(this.getEclipseElement());
		cardinalityEClass.getESuperTypes().add(this.getEclipseElement());
		schemaElementReferenceEClass.getESuperTypes().add(this.getCardinality());
		schemaElementReferenceEClass.getESuperTypes().add(this.getNamedElement());
		featureToPluginDependencyEClass.getESuperTypes().add(this.getVersionnedElement());
		featureToPluginDependencyEClass.getESuperTypes().add(this.getEclipseElement());
		eclipseModelEClass.getESuperTypes().add(this.getNamedElement());
		exportedPackageEClass.getESuperTypes().add(this.getIdentifiedElement());
		exportedPackagesEClass.getESuperTypes().add(this.getEclipseElement());
		executionEnvironmentEClass.getESuperTypes().add(this.getIdentifiedElement());
		introspectionErrorsEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlugin_ExtensionPoints(), this.getPluginExtensionPoints(), null, "extensionPoints", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlugin_Extensions(), this.getPluginExtensions(), null, "extensions", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlugin_PluginDependencies(), this.getPluginDependencies(), null, "pluginDependencies", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlugin_ExportedPackages(), this.getExportedPackages(), null, "exportedPackages", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlugin_ExecutionEnvironmnents(), this.getExecutionEnvironments(), null, "executionEnvironmnents", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionPointEClass, ExtensionPoint.class, "ExtensionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionPoint_SchemaElements(), this.getSchemaElement(), null, "schemaElements", null, 0, -1, ExtensionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionPoint_Contributors(), this.getExtension(), this.getExtension_ExtensionPoint(), "contributors", null, 0, -1, ExtensionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionPoint_ExtensionSchemaElement(), this.getSchemaElement(), null, "extensionSchemaElement", null, 0, 1, ExtensionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtension_ExtensionPoint(), this.getExtensionPoint(), this.getExtensionPoint_Contributors(), "extensionPoint", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_ConfiguredSchemaElement(), this.getConfiguredSchemaElement(), null, "configuredSchemaElement", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Packages(), this.getPackage(), null, "packages", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Plugins(), this.getPlugin(), null, "plugins", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Features(), this.getFeature(), null, "features", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_RepositoryKind(), this.getRepositoryKind(), "repositoryKind", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configuredSchemaElementEClass, ConfiguredSchemaElement.class, "ConfiguredSchemaElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguredSchemaElement_Children(), this.getConfiguredSchemaElement(), null, "children", null, 0, -1, ConfiguredSchemaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguredSchemaElement_SchemaElement(), this.getSchemaElement(), null, "schemaElement", null, 1, 1, ConfiguredSchemaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguredSchemaElement_ConfigurationElements(), this.getConfigurationElementAttributeInstance(), null, "configurationElements", null, 0, -1, ConfiguredSchemaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationElementAttributeEClass, ConfigurationElementAttribute.class, "ConfigurationElementAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationElementAttribute_Type(), this.getConfigurationElementAttributeKind(), "type", null, 0, 1, ConfigurationElementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationElementAttribute_BasedOn(), ecorePackage.getEString(), "basedOn", null, 0, 1, ConfigurationElementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationElementAttribute_Translatable(), ecorePackage.getEBoolean(), "translatable", null, 1, 1, ConfigurationElementAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexCompositorEClass, ComplexCompositor.class, "ComplexCompositor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexCompositor_ComplexCompositorKind(), this.getComplexCompositorKind(), "complexCompositorKind", null, 0, 1, ComplexCompositor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexCompositor_ComplexCompositorChildren(), this.getComplexCompositor(), null, "complexCompositorChildren", null, 0, -1, ComplexCompositor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexCompositor_ElementReferences(), this.getSchemaElementReference(), null, "elementReferences", null, 1, -1, ComplexCompositor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaElementEClass, SchemaElement.class, "SchemaElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaElement_Attributes(), this.getConfigurationElementAttribute(), null, "attributes", null, 0, -1, SchemaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaElement_ComplexCompositor(), this.getComplexCompositor(), null, "complexCompositor", null, 0, 1, SchemaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_FeatureDescription(), ecorePackage.getEString(), "featureDescription", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_CopyrightNotice(), ecorePackage.getEString(), "copyrightNotice", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_LicenseAgreement(), ecorePackage.getEString(), "licenseAgreement", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_SitesToVisit(), ecorePackage.getEString(), "sitesToVisit", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_FeatureInclusions(), this.getFeatureInclusions(), null, "featureInclusions", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_PluginDependencies(), this.getFeaturePluginDependencies(), null, "pluginDependencies", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_IncludedPlugins(), this.getIncludedPlugins(), null, "includedPlugins", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_FeatureDependencies(), this.getFeatureDependencies(), null, "featureDependencies", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginDependencyEClass, PluginDependency.class, "PluginDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPluginDependency_Target(), this.getPlugin(), null, "target", null, 1, 1, PluginDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDependency_MinimumVersion(), ecorePackage.getEString(), "minimumVersion", null, 0, 1, PluginDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDependency_MaximumVersion(), ecorePackage.getEString(), "maximumVersion", null, 0, 1, PluginDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDependency_MinimumInclusion(), this.getInclusionKind(), "minimumInclusion", null, 0, 1, PluginDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDependency_MaximumInclusion(), this.getInclusionKind(), "maximumInclusion", null, 0, 1, PluginDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureDependencyEClass, FeatureDependency.class, "FeatureDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureDependency_Target(), this.getFeature(), null, "target", null, 1, 1, FeatureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureDependency_MatchRule(), this.getMatchRule(), "matchRule", "NONE", 1, 1, FeatureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.polarsys.kitalpha.pdt.metamodel.model.platform.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_SubPackages(), this.getPackage(), null, "subPackages", null, 0, -1, org.polarsys.kitalpha.pdt.metamodel.model.platform.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Plugins(), this.getPlugin(), null, "plugins", null, 0, -1, org.polarsys.kitalpha.pdt.metamodel.model.platform.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Features(), this.getFeature(), null, "features", null, 0, -1, org.polarsys.kitalpha.pdt.metamodel.model.platform.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_AbsoluteName(), ecorePackage.getEString(), "absoluteName", null, 1, 1, org.polarsys.kitalpha.pdt.metamodel.model.platform.Package.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureInclusionEClass, FeatureInclusion.class, "FeatureInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureInclusion_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, FeatureInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureInclusion_IncludedFeature(), this.getFeature(), null, "includedFeature", null, 1, 1, FeatureInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationElementAttributeInstanceEClass, ConfigurationElementAttributeInstance.class, "ConfigurationElementAttributeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationElementAttributeInstance_AttributeDefinition(), this.getConfigurationElementAttribute(), null, "attributeDefinition", null, 1, 1, ConfigurationElementAttributeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationElementAttributeInstance_ContainedValue(), this.getAbstractValue(), null, "containedValue", null, 1, 1, ConfigurationElementAttributeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiedVersionnedElementEClass, IdentifiedVersionnedElement.class, "IdentifiedVersionnedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaClassValueEClass, JavaClassValue.class, "JavaClassValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaClassValue_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, JavaClassValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractValueEClass, AbstractValue.class, "AbstractValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionnedElementEClass, VersionnedElement.class, "VersionnedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionnedElement_Version(), ecorePackage.getEString(), "version", null, 0, 1, VersionnedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_MinCard(), ecorePackage.getEInt(), "minCard", "0", 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_MaxCard(), ecorePackage.getEInt(), "maxCard", "0", 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_Unbounded(), ecorePackage.getEBoolean(), "unbounded", "false", 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaElementReferenceEClass, SchemaElementReference.class, "SchemaElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaElementReference_Reference(), this.getSchemaElement(), null, "reference", null, 1, 1, SchemaElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eclipseElementEClass, EclipseElement.class, "EclipseElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEclipseElement_EclipseElementIntrospectionErrors(), this.getIntrospectionError(), this.getIntrospectionError_Target(), "eclipseElementIntrospectionErrors", null, 0, -1, EclipseElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featureToPluginDependencyEClass, FeatureToPluginDependency.class, "FeatureToPluginDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureToPluginDependency_MatchRule(), this.getMatchRule(), "matchRule", "NONE", 1, 1, FeatureToPluginDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureToPluginDependency_Target(), this.getPlugin(), null, "target", null, 1, 1, FeatureToPluginDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginExtensionsEClass, PluginExtensions.class, "PluginExtensions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPluginExtensions_Extensions(), this.getExtension(), null, "extensions", null, 0, -1, PluginExtensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginExtensionPointsEClass, PluginExtensionPoints.class, "PluginExtensionPoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPluginExtensionPoints_ExtensionPoints(), this.getExtensionPoint(), null, "extensionPoints", null, 0, -1, PluginExtensionPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginDependenciesEClass, PluginDependencies.class, "PluginDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPluginDependencies_PluginDependencies(), this.getPluginDependency(), null, "pluginDependencies", null, 0, -1, PluginDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureDependenciesEClass, FeatureDependencies.class, "FeatureDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureDependencies_FeatureDependencies(), this.getFeatureDependency(), null, "featureDependencies", null, 0, -1, FeatureDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureInclusionsEClass, FeatureInclusions.class, "FeatureInclusions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureInclusions_FeatureInclusions(), this.getFeatureInclusion(), null, "featureInclusions", null, 0, -1, FeatureInclusions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featurePluginDependenciesEClass, FeaturePluginDependencies.class, "FeaturePluginDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturePluginDependencies_PluginDependencies(), this.getFeatureToPluginDependency(), null, "pluginDependencies", null, 0, -1, FeaturePluginDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includedPluginsEClass, IncludedPlugins.class, "IncludedPlugins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludedPlugins_IncludedPlugins(), this.getPlugin(), null, "includedPlugins", null, 0, -1, IncludedPlugins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eclipseModelEClass, EclipseModel.class, "EclipseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEclipseModel_Repositories(), this.getRepository(), null, "repositories", null, 0, -1, EclipseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipseModel_IntrospectionErrors(), this.getIntrospectionErrors(), null, "introspectionErrors", null, 0, -1, EclipseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipseModel_QualifierIgnored(), ecorePackage.getEBoolean(), "qualifierIgnored", "false", 1, 1, EclipseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportedPackageEClass, ExportedPackage.class, "ExportedPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exportedPackagesEClass, ExportedPackages.class, "ExportedPackages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExportedPackages_ExportedPackages(), this.getExportedPackage(), null, "exportedPackages", null, 0, -1, ExportedPackages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(introspectionErrorEClass, IntrospectionError.class, "IntrospectionError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntrospectionError_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, IntrospectionError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntrospectionError_Details(), ecorePackage.getEString(), "details", null, 1, 1, IntrospectionError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntrospectionError_Target(), this.getEclipseElement(), this.getEclipseElement_EclipseElementIntrospectionErrors(), "target", null, 1, 1, IntrospectionError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionEnvironmentsEClass, ExecutionEnvironments.class, "ExecutionEnvironments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionEnvironments_ExecutionEnvironments(), this.getExecutionEnvironment(), null, "executionEnvironments", null, 0, -1, ExecutionEnvironments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionEnvironmentEClass, ExecutionEnvironment.class, "ExecutionEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(introspectionErrorsEClass, IntrospectionErrors.class, "IntrospectionErrors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntrospectionErrors_IntrospectionErrors(), this.getIntrospectionError(), null, "introspectionErrors", null, 0, -1, IntrospectionErrors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(configurationElementAttributeKindEEnum, ConfigurationElementAttributeKind.class, "ConfigurationElementAttributeKind");
		addEEnumLiteral(configurationElementAttributeKindEEnum, ConfigurationElementAttributeKind.STRING);
		addEEnumLiteral(configurationElementAttributeKindEEnum, ConfigurationElementAttributeKind.JAVA);
		addEEnumLiteral(configurationElementAttributeKindEEnum, ConfigurationElementAttributeKind.RESOURCE);
		addEEnumLiteral(configurationElementAttributeKindEEnum, ConfigurationElementAttributeKind.BOOLEAN);
		addEEnumLiteral(configurationElementAttributeKindEEnum, ConfigurationElementAttributeKind.IDENTIFIER);
		addEEnumLiteral(configurationElementAttributeKindEEnum, ConfigurationElementAttributeKind.INTEGER);

		initEEnum(complexCompositorKindEEnum, ComplexCompositorKind.class, "ComplexCompositorKind");
		addEEnumLiteral(complexCompositorKindEEnum, ComplexCompositorKind.SEQUENCE);
		addEEnumLiteral(complexCompositorKindEEnum, ComplexCompositorKind.CHOICE);

		initEEnum(matchRuleEEnum, MatchRule.class, "MatchRule");
		addEEnumLiteral(matchRuleEEnum, MatchRule.UNSET);
		addEEnumLiteral(matchRuleEEnum, MatchRule.COMPATIBLE);
		addEEnumLiteral(matchRuleEEnum, MatchRule.EQUIVALENT);
		addEEnumLiteral(matchRuleEEnum, MatchRule.GREATER_OR_EQUAL);
		addEEnumLiteral(matchRuleEEnum, MatchRule.NONE);
		addEEnumLiteral(matchRuleEEnum, MatchRule.PERFECT);
		addEEnumLiteral(matchRuleEEnum, MatchRule.PREFIX);

		initEEnum(inclusionKindEEnum, InclusionKind.class, "InclusionKind");
		addEEnumLiteral(inclusionKindEEnum, InclusionKind.UNSET);
		addEEnumLiteral(inclusionKindEEnum, InclusionKind.INCLUSIVE);
		addEEnumLiteral(inclusionKindEEnum, InclusionKind.EXCLUSIVE);

		initEEnum(repositoryKindEEnum, RepositoryKind.class, "RepositoryKind");
		addEEnumLiteral(repositoryKindEEnum, RepositoryKind.PLATFORM);
		addEEnumLiteral(repositoryKindEEnum, RepositoryKind.WORKSPACE);
		addEEnumLiteral(repositoryKindEEnum, RepositoryKind.PLATFORM_AND_WORKSPACE);
		addEEnumLiteral(repositoryKindEEnum, RepositoryKind.UPDATE_SITE);
		addEEnumLiteral(repositoryKindEEnum, RepositoryKind.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.thalesgroup.com/mde/2010/extension
		createExtensionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.thalesgroup.com/mde/2010/extension</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtensionAnnotations() {
		String source = "http://www.thalesgroup.com/mde/2010/extension";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "useUUIDs", "true",
			 "useIDAttributes", "false",
			 "extensibleProviderFactory", "true",
			 "childCreationExtenders", "true"
		   });
	}

} //PlatformPackageImpl
