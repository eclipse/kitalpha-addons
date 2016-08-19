/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage
 * @generated
 */
public class PlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformSwitch<Adapter> modelSwitch =
		new PlatformSwitch<Adapter>() {
			@Override
			public Adapter casePlugin(Plugin object) {
				return createPluginAdapter();
			}
			@Override
			public Adapter caseExtensionPoint(ExtensionPoint object) {
				return createExtensionPointAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseConfiguredSchemaElement(ConfiguredSchemaElement object) {
				return createConfiguredSchemaElementAdapter();
			}
			@Override
			public Adapter caseConfigurationElementAttribute(ConfigurationElementAttribute object) {
				return createConfigurationElementAttributeAdapter();
			}
			@Override
			public Adapter caseComplexCompositor(ComplexCompositor object) {
				return createComplexCompositorAdapter();
			}
			@Override
			public Adapter caseSchemaElement(SchemaElement object) {
				return createSchemaElementAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter casePluginDependency(PluginDependency object) {
				return createPluginDependencyAdapter();
			}
			@Override
			public Adapter caseFeatureDependency(FeatureDependency object) {
				return createFeatureDependencyAdapter();
			}
			@Override
			public Adapter casePackage(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseIdentifiedElement(IdentifiedElement object) {
				return createIdentifiedElementAdapter();
			}
			@Override
			public Adapter caseFeatureInclusion(FeatureInclusion object) {
				return createFeatureInclusionAdapter();
			}
			@Override
			public Adapter caseConfigurationElementAttributeInstance(ConfigurationElementAttributeInstance object) {
				return createConfigurationElementAttributeInstanceAdapter();
			}
			@Override
			public Adapter caseIdentifiedVersionnedElement(IdentifiedVersionnedElement object) {
				return createIdentifiedVersionnedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseJavaClassValue(JavaClassValue object) {
				return createJavaClassValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseAbstractValue(AbstractValue object) {
				return createAbstractValueAdapter();
			}
			@Override
			public Adapter caseVersionnedElement(VersionnedElement object) {
				return createVersionnedElementAdapter();
			}
			@Override
			public Adapter caseCardinality(Cardinality object) {
				return createCardinalityAdapter();
			}
			@Override
			public Adapter caseSchemaElementReference(SchemaElementReference object) {
				return createSchemaElementReferenceAdapter();
			}
			@Override
			public Adapter caseEclipseElement(EclipseElement object) {
				return createEclipseElementAdapter();
			}
			@Override
			public Adapter caseFeatureToPluginDependency(FeatureToPluginDependency object) {
				return createFeatureToPluginDependencyAdapter();
			}
			@Override
			public Adapter casePluginExtensions(PluginExtensions object) {
				return createPluginExtensionsAdapter();
			}
			@Override
			public Adapter casePluginExtensionPoints(PluginExtensionPoints object) {
				return createPluginExtensionPointsAdapter();
			}
			@Override
			public Adapter casePluginDependencies(PluginDependencies object) {
				return createPluginDependenciesAdapter();
			}
			@Override
			public Adapter caseFeatureDependencies(FeatureDependencies object) {
				return createFeatureDependenciesAdapter();
			}
			@Override
			public Adapter caseFeatureInclusions(FeatureInclusions object) {
				return createFeatureInclusionsAdapter();
			}
			@Override
			public Adapter caseFeaturePluginDependencies(FeaturePluginDependencies object) {
				return createFeaturePluginDependenciesAdapter();
			}
			@Override
			public Adapter caseIncludedPlugins(IncludedPlugins object) {
				return createIncludedPluginsAdapter();
			}
			@Override
			public Adapter caseEclipseModel(EclipseModel object) {
				return createEclipseModelAdapter();
			}
			@Override
			public Adapter caseExportedPackage(ExportedPackage object) {
				return createExportedPackageAdapter();
			}
			@Override
			public Adapter caseExportedPackages(ExportedPackages object) {
				return createExportedPackagesAdapter();
			}
			@Override
			public Adapter caseIntrospectionError(IntrospectionError object) {
				return createIntrospectionErrorAdapter();
			}
			@Override
			public Adapter caseExecutionEnvironments(ExecutionEnvironments object) {
				return createExecutionEnvironmentsAdapter();
			}
			@Override
			public Adapter caseExecutionEnvironment(ExecutionEnvironment object) {
				return createExecutionEnvironmentAdapter();
			}
			@Override
			public Adapter caseIntrospectionErrors(IntrospectionErrors object) {
				return createIntrospectionErrorsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint
	 * @generated
	 */
	public Adapter createExtensionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement <em>Configured Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement
	 * @generated
	 */
	public Adapter createConfiguredSchemaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute <em>Configuration Element Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute
	 * @generated
	 */
	public Adapter createConfigurationElementAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor <em>Complex Compositor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor
	 * @generated
	 */
	public Adapter createComplexCompositorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement
	 * @generated
	 */
	public Adapter createSchemaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency <em>Plugin Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency
	 * @generated
	 */
	public Adapter createPluginDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency <em>Feature Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency
	 * @generated
	 */
	public Adapter createFeatureDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion <em>Feature Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion
	 * @generated
	 */
	public Adapter createFeatureInclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance <em>Configuration Element Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance
	 * @generated
	 */
	public Adapter createConfigurationElementAttributeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedVersionnedElement <em>Identified Versionned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedVersionnedElement
	 * @generated
	 */
	public Adapter createIdentifiedVersionnedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue <em>Java Class Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue
	 * @generated
	 */
	public Adapter createJavaClassValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.AbstractValue <em>Abstract Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.AbstractValue
	 * @generated
	 */
	public Adapter createAbstractValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement <em>Versionned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement
	 * @generated
	 */
	public Adapter createVersionnedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality
	 * @generated
	 */
	public Adapter createCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference <em>Schema Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference
	 * @generated
	 */
	public Adapter createSchemaElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement <em>Eclipse Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement
	 * @generated
	 */
	public Adapter createEclipseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency <em>Feature To Plugin Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency
	 * @generated
	 */
	public Adapter createFeatureToPluginDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions <em>Plugin Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions
	 * @generated
	 */
	public Adapter createPluginExtensionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints <em>Plugin Extension Points</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints
	 * @generated
	 */
	public Adapter createPluginExtensionPointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies <em>Plugin Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies
	 * @generated
	 */
	public Adapter createPluginDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies <em>Feature Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies
	 * @generated
	 */
	public Adapter createFeatureDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions <em>Feature Inclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions
	 * @generated
	 */
	public Adapter createFeatureInclusionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies <em>Feature Plugin Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies
	 * @generated
	 */
	public Adapter createFeaturePluginDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins <em>Included Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins
	 * @generated
	 */
	public Adapter createIncludedPluginsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel <em>Eclipse Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel
	 * @generated
	 */
	public Adapter createEclipseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackage <em>Exported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackage
	 * @generated
	 */
	public Adapter createExportedPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages <em>Exported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages
	 * @generated
	 */
	public Adapter createExportedPackagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError <em>Introspection Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError
	 * @generated
	 */
	public Adapter createIntrospectionErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments <em>Execution Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments
	 * @generated
	 */
	public Adapter createExecutionEnvironmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironment
	 * @generated
	 */
	public Adapter createExecutionEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors <em>Introspection Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors
	 * @generated
	 */
	public Adapter createIntrospectionErrorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlatformAdapterFactory
