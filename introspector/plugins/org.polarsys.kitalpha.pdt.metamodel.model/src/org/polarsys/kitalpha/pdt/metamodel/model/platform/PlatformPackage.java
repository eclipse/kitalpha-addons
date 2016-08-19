/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory
 * @model kind="package"
 *        annotation="http://www.thalesgroup.com/mde/2010/extension useUUIDs='true' useIDAttributes='false' extensibleProviderFactory='true' childCreationExtenders='true'"
 * @generated
 */
public interface PlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/pdt/platform/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformPackage eINSTANCE = org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseElementImpl <em>Eclipse Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseElementImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getEclipseElement()
	 * @generated
	 */
	int ECLIPSE_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = 0;

	/**
	 * The number of structural features of the '<em>Eclipse Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IdentifiedElementImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = ECLIPSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = ECLIPSE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IdentifiedVersionnedElementImpl <em>Identified Versionned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IdentifiedVersionnedElementImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIdentifiedVersionnedElement()
	 * @generated
	 */
	int IDENTIFIED_VERSIONNED_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_VERSIONNED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = IDENTIFIED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_VERSIONNED_ELEMENT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_VERSIONNED_ELEMENT__VERSION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identified Versionned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 0;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = IDENTIFIED_VERSIONNED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ID = IDENTIFIED_VERSIONNED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__VERSION = IDENTIFIED_VERSIONNED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Extension Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__EXTENSION_POINTS = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__EXTENSIONS = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Plugin Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__PLUGIN_DEPENDENCIES = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exported Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__EXPORTED_PACKAGES = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Execution Environmnents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__EXECUTION_ENVIRONMNENTS = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionPointImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExtensionPoint()
	 * @generated
	 */
	int EXTENSION_POINT = 1;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = IDENTIFIED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Schema Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT__SCHEMA_ELEMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT__CONTRIBUTORS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extension Schema Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT__EXTENSION_SCHEMA_ELEMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extension Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = IDENTIFIED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENSION_POINT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configured Schema Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__CONFIGURED_SCHEMA_ELEMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.NamedElementImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ECLIPSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ECLIPSE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.RepositoryImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = NAMED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PLUGINS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repository Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REPOSITORY_KIND = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfiguredSchemaElementImpl <em>Configured Schema Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfiguredSchemaElementImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getConfiguredSchemaElement()
	 * @generated
	 */
	int CONFIGURED_SCHEMA_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_SCHEMA_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = NAMED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_SCHEMA_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_SCHEMA_ELEMENT__CHILDREN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_SCHEMA_ELEMENT__SCHEMA_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configuration Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_SCHEMA_ELEMENT__CONFIGURATION_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configured Schema Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_SCHEMA_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeImpl <em>Configuration Element Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getConfigurationElementAttribute()
	 * @generated
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = NAMED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configuration Element Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.CardinalityImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 22;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Min Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MIN_CARD = ECLIPSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MAX_CARD = ECLIPSE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__UNBOUNDED = ECLIPSE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = ECLIPSE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ComplexCompositorImpl <em>Complex Compositor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ComplexCompositorImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getComplexCompositor()
	 * @generated
	 */
	int COMPLEX_COMPOSITOR = 6;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_COMPOSITOR__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = CARDINALITY__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Min Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_COMPOSITOR__MIN_CARD = CARDINALITY__MIN_CARD;

	/**
	 * The feature id for the '<em><b>Max Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_COMPOSITOR__MAX_CARD = CARDINALITY__MAX_CARD;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_COMPOSITOR__UNBOUNDED = CARDINALITY__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Complex Compositor Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Compositor Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN = CARDINALITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_COMPOSITOR__ELEMENT_REFERENCES = CARDINALITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Complex Compositor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_COMPOSITOR_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementImpl <em>Schema Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getSchemaElement()
	 * @generated
	 */
	int SCHEMA_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = NAMED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Compositor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT__COMPLEX_COMPOSITOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schema Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = IDENTIFIED_VERSIONNED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = IDENTIFIED_VERSIONNED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = IDENTIFIED_VERSIONNED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Feature Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_DESCRIPTION = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copyright Notice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COPYRIGHT_NOTICE = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>License Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LICENSE_AGREEMENT = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sites To Visit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SITES_TO_VISIT = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROVIDER = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature Inclusions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_INCLUSIONS = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Plugin Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PLUGIN_DEPENDENCIES = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Included Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INCLUDED_PLUGINS = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Feature Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_DEPENDENCIES = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = IDENTIFIED_VERSIONNED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependencyImpl <em>Plugin Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependencyImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPluginDependency()
	 * @generated
	 */
	int PLUGIN_DEPENDENCY = 9;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DEPENDENCY__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DEPENDENCY__TARGET = ECLIPSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DEPENDENCY__MINIMUM_VERSION = ECLIPSE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DEPENDENCY__MAXIMUM_VERSION = ECLIPSE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Inclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DEPENDENCY__MINIMUM_INCLUSION = ECLIPSE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maximum Inclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION = ECLIPSE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Plugin Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DEPENDENCY_FEATURE_COUNT = ECLIPSE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.VersionnedElementImpl <em>Versionned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.VersionnedElementImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getVersionnedElement()
	 * @generated
	 */
	int VERSIONNED_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONNED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONNED_ELEMENT__VERSION = ECLIPSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versionned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONNED_ELEMENT_FEATURE_COUNT = ECLIPSE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureDependencyImpl <em>Feature Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureDependencyImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureDependency()
	 * @generated
	 */
	int FEATURE_DEPENDENCY = 10;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = VERSIONNED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__VERSION = VERSIONNED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__TARGET = VERSIONNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__MATCH_RULE = VERSIONNED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY_FEATURE_COUNT = VERSIONNED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PackageImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 11;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = NAMED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUB_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PLUGINS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ABSOLUTE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionImpl <em>Feature Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureInclusion()
	 * @generated
	 */
	int FEATURE_INCLUSION = 13;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INCLUSION__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = VERSIONNED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INCLUSION__VERSION = VERSIONNED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INCLUSION__OPTIONAL = VERSIONNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Included Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INCLUSION__INCLUDED_FEATURE = VERSIONNED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INCLUSION_FEATURE_COUNT = VERSIONNED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeInstanceImpl <em>Configuration Element Attribute Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeInstanceImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getConfigurationElementAttributeInstance()
	 * @generated
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE = 14;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = CONFIGURATION_ELEMENT_ATTRIBUTE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__NAME = CONFIGURATION_ELEMENT_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__TYPE = CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__BASED_ON = CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__TRANSLATABLE = CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE;

	/**
	 * The feature id for the '<em><b>Attribute Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ATTRIBUTE_DEFINITION = CONFIGURATION_ELEMENT_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE = CONFIGURATION_ELEMENT_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration Element Attribute Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE_FEATURE_COUNT = CONFIGURATION_ELEMENT_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.AbstractValueImpl <em>Abstract Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.AbstractValueImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getAbstractValue()
	 * @generated
	 */
	int ABSTRACT_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VALUE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The number of structural features of the '<em>Abstract Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VALUE_FEATURE_COUNT = ECLIPSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.StringValueImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ABSTRACT_VALUE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = ABSTRACT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = ABSTRACT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.JavaClassValueImpl <em>Java Class Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.JavaClassValueImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getJavaClassValue()
	 * @generated
	 */
	int JAVA_CLASS_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_VALUE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ABSTRACT_VALUE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_VALUE__CLASS_NAME = ABSTRACT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Class Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_VALUE_FEATURE_COUNT = ABSTRACT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.BooleanValueImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ABSTRACT_VALUE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = ABSTRACT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = ABSTRACT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementReferenceImpl <em>Schema Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementReferenceImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getSchemaElementReference()
	 * @generated
	 */
	int SCHEMA_ELEMENT_REFERENCE = 23;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_REFERENCE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = CARDINALITY__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Min Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_REFERENCE__MIN_CARD = CARDINALITY__MIN_CARD;

	/**
	 * The feature id for the '<em><b>Max Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_REFERENCE__MAX_CARD = CARDINALITY__MAX_CARD;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_REFERENCE__UNBOUNDED = CARDINALITY__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_REFERENCE__NAME = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_REFERENCE__REFERENCE = CARDINALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schema Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ELEMENT_REFERENCE_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureToPluginDependencyImpl <em>Feature To Plugin Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureToPluginDependencyImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureToPluginDependency()
	 * @generated
	 */
	int FEATURE_TO_PLUGIN_DEPENDENCY = 25;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_PLUGIN_DEPENDENCY__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = VERSIONNED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_PLUGIN_DEPENDENCY__VERSION = VERSIONNED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Match Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE = VERSIONNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_PLUGIN_DEPENDENCY__TARGET = VERSIONNED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature To Plugin Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_PLUGIN_DEPENDENCY_FEATURE_COUNT = VERSIONNED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginExtensionsImpl <em>Plugin Extensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginExtensionsImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPluginExtensions()
	 * @generated
	 */
	int PLUGIN_EXTENSIONS = 26;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXTENSIONS__EXTENSIONS = 0;

	/**
	 * The number of structural features of the '<em>Plugin Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXTENSIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginExtensionPointsImpl <em>Plugin Extension Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginExtensionPointsImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPluginExtensionPoints()
	 * @generated
	 */
	int PLUGIN_EXTENSION_POINTS = 27;

	/**
	 * The feature id for the '<em><b>Extension Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXTENSION_POINTS__EXTENSION_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Plugin Extension Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_EXTENSION_POINTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependenciesImpl <em>Plugin Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependenciesImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPluginDependencies()
	 * @generated
	 */
	int PLUGIN_DEPENDENCIES = 28;

	/**
	 * The feature id for the '<em><b>Plugin Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Plugin Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DEPENDENCIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureDependenciesImpl <em>Feature Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureDependenciesImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureDependencies()
	 * @generated
	 */
	int FEATURE_DEPENDENCIES = 29;

	/**
	 * The feature id for the '<em><b>Feature Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCIES__FEATURE_DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Feature Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionsImpl <em>Feature Inclusions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionsImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureInclusions()
	 * @generated
	 */
	int FEATURE_INCLUSIONS = 30;

	/**
	 * The feature id for the '<em><b>Feature Inclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INCLUSIONS__FEATURE_INCLUSIONS = 0;

	/**
	 * The number of structural features of the '<em>Feature Inclusions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INCLUSIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeaturePluginDependenciesImpl <em>Feature Plugin Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeaturePluginDependenciesImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeaturePluginDependencies()
	 * @generated
	 */
	int FEATURE_PLUGIN_DEPENDENCIES = 31;

	/**
	 * The feature id for the '<em><b>Plugin Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Feature Plugin Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PLUGIN_DEPENDENCIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IncludedPluginsImpl <em>Included Plugins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IncludedPluginsImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIncludedPlugins()
	 * @generated
	 */
	int INCLUDED_PLUGINS = 32;

	/**
	 * The feature id for the '<em><b>Included Plugins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_PLUGINS__INCLUDED_PLUGINS = 0;

	/**
	 * The number of structural features of the '<em>Included Plugins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_PLUGINS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseModelImpl <em>Eclipse Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseModelImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getEclipseModel()
	 * @generated
	 */
	int ECLIPSE_MODEL = 33;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_MODEL__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = NAMED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_MODEL__REPOSITORIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Introspection Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_MODEL__INTROSPECTION_ERRORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier Ignored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_MODEL__QUALIFIER_IGNORED = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Eclipse Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExportedPackageImpl <em>Exported Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExportedPackageImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExportedPackage()
	 * @generated
	 */
	int EXPORTED_PACKAGE = 34;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = IDENTIFIED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Exported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExportedPackagesImpl <em>Exported Packages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExportedPackagesImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExportedPackages()
	 * @generated
	 */
	int EXPORTED_PACKAGES = 35;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGES__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Exported Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGES__EXPORTED_PACKAGES = ECLIPSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exported Packages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGES_FEATURE_COUNT = ECLIPSE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IntrospectionErrorImpl <em>Introspection Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IntrospectionErrorImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIntrospectionError()
	 * @generated
	 */
	int INTROSPECTION_ERROR = 36;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTROSPECTION_ERROR__SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTROSPECTION_ERROR__DETAILS = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTROSPECTION_ERROR__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Introspection Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTROSPECTION_ERROR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExecutionEnvironmentsImpl <em>Execution Environments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExecutionEnvironmentsImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExecutionEnvironments()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENTS = 37;

	/**
	 * The feature id for the '<em><b>Execution Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENTS__EXECUTION_ENVIRONMENTS = 0;

	/**
	 * The number of structural features of the '<em>Execution Environments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExecutionEnvironmentImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExecutionEnvironment()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENT = 38;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = IDENTIFIED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IntrospectionErrorsImpl <em>Introspection Errors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IntrospectionErrorsImpl
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIntrospectionErrors()
	 * @generated
	 */
	int INTROSPECTION_ERRORS = 39;

	/**
	 * The feature id for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTROSPECTION_ERRORS__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = NAMED_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTROSPECTION_ERRORS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Introspection Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTROSPECTION_ERRORS__INTROSPECTION_ERRORS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Introspection Errors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTROSPECTION_ERRORS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind <em>Configuration Element Attribute Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getConfigurationElementAttributeKind()
	 * @generated
	 */
	int CONFIGURATION_ELEMENT_ATTRIBUTE_KIND = 40;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind <em>Complex Compositor Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getComplexCompositorKind()
	 * @generated
	 */
	int COMPLEX_COMPOSITOR_KIND = 41;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule <em>Match Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getMatchRule()
	 * @generated
	 */
	int MATCH_RULE = 42;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind <em>Inclusion Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getInclusionKind()
	 * @generated
	 */
	int INCLUSION_KIND = 43;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind <em>Repository Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getRepositoryKind()
	 * @generated
	 */
	int REPOSITORY_KIND = 44;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExtensionPoints <em>Extension Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Points</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExtensionPoints()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_ExtensionPoints();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExtensions()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Extensions();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getPluginDependencies <em>Plugin Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin Dependencies</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getPluginDependencies()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_PluginDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExportedPackages <em>Exported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exported Packages</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExportedPackages()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_ExportedPackages();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExecutionEnvironmnents <em>Execution Environmnents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Environmnents</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExecutionEnvironmnents()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_ExecutionEnvironmnents();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Point</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint
	 * @generated
	 */
	EClass getExtensionPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getSchemaElements <em>Schema Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Elements</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getSchemaElements()
	 * @see #getExtensionPoint()
	 * @generated
	 */
	EReference getExtensionPoint_SchemaElements();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributors</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getContributors()
	 * @see #getExtensionPoint()
	 * @generated
	 */
	EReference getExtensionPoint_Contributors();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getExtensionSchemaElement <em>Extension Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension Schema Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getExtensionSchemaElement()
	 * @see #getExtensionPoint()
	 * @generated
	 */
	EReference getExtensionPoint_ExtensionSchemaElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension#getExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension Point</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension#getExtensionPoint()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ExtensionPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension#getConfiguredSchemaElement <em>Configured Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configured Schema Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension#getConfiguredSchemaElement()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_ConfiguredSchemaElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getPackages()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getPlugins()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Plugins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getFeatures()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getRepositoryKind <em>Repository Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Kind</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getRepositoryKind()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_RepositoryKind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement <em>Configured Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configured Schema Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement
	 * @generated
	 */
	EClass getConfiguredSchemaElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getChildren()
	 * @see #getConfiguredSchemaElement()
	 * @generated
	 */
	EReference getConfiguredSchemaElement_Children();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getSchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getSchemaElement()
	 * @see #getConfiguredSchemaElement()
	 * @generated
	 */
	EReference getConfiguredSchemaElement_SchemaElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getConfigurationElements <em>Configuration Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Elements</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getConfigurationElements()
	 * @see #getConfiguredSchemaElement()
	 * @generated
	 */
	EReference getConfiguredSchemaElement_ConfigurationElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute <em>Configuration Element Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Element Attribute</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute
	 * @generated
	 */
	EClass getConfigurationElementAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#getType()
	 * @see #getConfigurationElementAttribute()
	 * @generated
	 */
	EAttribute getConfigurationElementAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Based On</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#getBasedOn()
	 * @see #getConfigurationElementAttribute()
	 * @generated
	 */
	EAttribute getConfigurationElementAttribute_BasedOn();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#isTranslatable <em>Translatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translatable</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#isTranslatable()
	 * @see #getConfigurationElementAttribute()
	 * @generated
	 */
	EAttribute getConfigurationElementAttribute_Translatable();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor <em>Complex Compositor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Compositor</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor
	 * @generated
	 */
	EClass getComplexCompositor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getComplexCompositorKind <em>Complex Compositor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complex Compositor Kind</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getComplexCompositorKind()
	 * @see #getComplexCompositor()
	 * @generated
	 */
	EAttribute getComplexCompositor_ComplexCompositorKind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getComplexCompositorChildren <em>Complex Compositor Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Compositor Children</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getComplexCompositorChildren()
	 * @see #getComplexCompositor()
	 * @generated
	 */
	EReference getComplexCompositor_ComplexCompositorChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getElementReferences <em>Element References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element References</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getElementReferences()
	 * @see #getComplexCompositor()
	 * @generated
	 */
	EReference getComplexCompositor_ElementReferences();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement <em>Schema Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement
	 * @generated
	 */
	EClass getSchemaElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement#getAttributes()
	 * @see #getSchemaElement()
	 * @generated
	 */
	EReference getSchemaElement_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement#getComplexCompositor <em>Complex Compositor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Compositor</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement#getComplexCompositor()
	 * @see #getSchemaElement()
	 * @generated
	 */
	EReference getSchemaElement_ComplexCompositor();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getFeatureDescription <em>Feature Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Description</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getFeatureDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_FeatureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getCopyrightNotice <em>Copyright Notice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright Notice</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getCopyrightNotice()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_CopyrightNotice();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getLicenseAgreement <em>License Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Agreement</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getLicenseAgreement()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_LicenseAgreement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getSitesToVisit <em>Sites To Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sites To Visit</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getSitesToVisit()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_SitesToVisit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getProvider()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Provider();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getFeatureInclusions <em>Feature Inclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Inclusions</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getFeatureInclusions()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureInclusions();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getPluginDependencies <em>Plugin Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin Dependencies</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getPluginDependencies()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_PluginDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getIncludedPlugins <em>Included Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Included Plugins</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getIncludedPlugins()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_IncludedPlugins();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getFeatureDependencies <em>Feature Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Dependencies</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature#getFeatureDependencies()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureDependencies();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency <em>Plugin Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Dependency</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency
	 * @generated
	 */
	EClass getPluginDependency();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getTarget()
	 * @see #getPluginDependency()
	 * @generated
	 */
	EReference getPluginDependency_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMinimumVersion <em>Minimum Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Version</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMinimumVersion()
	 * @see #getPluginDependency()
	 * @generated
	 */
	EAttribute getPluginDependency_MinimumVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMaximumVersion <em>Maximum Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Version</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMaximumVersion()
	 * @see #getPluginDependency()
	 * @generated
	 */
	EAttribute getPluginDependency_MaximumVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMinimumInclusion <em>Minimum Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Inclusion</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMinimumInclusion()
	 * @see #getPluginDependency()
	 * @generated
	 */
	EAttribute getPluginDependency_MinimumInclusion();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMaximumInclusion <em>Maximum Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Inclusion</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMaximumInclusion()
	 * @see #getPluginDependency()
	 * @generated
	 */
	EAttribute getPluginDependency_MaximumInclusion();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency <em>Feature Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Dependency</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency
	 * @generated
	 */
	EClass getFeatureDependency();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency#getTarget()
	 * @see #getFeatureDependency()
	 * @generated
	 */
	EReference getFeatureDependency_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency#getMatchRule <em>Match Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Rule</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency#getMatchRule()
	 * @see #getFeatureDependency()
	 * @generated
	 */
	EAttribute getFeatureDependency_MatchRule();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getSubPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SubPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getPlugins()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Plugins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getFeatures()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getAbsoluteName <em>Absolute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Name</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getAbsoluteName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_AbsoluteName();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion <em>Feature Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Inclusion</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion
	 * @generated
	 */
	EClass getFeatureInclusion();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion#isOptional()
	 * @see #getFeatureInclusion()
	 * @generated
	 */
	EAttribute getFeatureInclusion_Optional();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion#getIncludedFeature <em>Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Included Feature</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion#getIncludedFeature()
	 * @see #getFeatureInclusion()
	 * @generated
	 */
	EReference getFeatureInclusion_IncludedFeature();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance <em>Configuration Element Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Element Attribute Instance</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance
	 * @generated
	 */
	EClass getConfigurationElementAttributeInstance();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance#getAttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Definition</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance#getAttributeDefinition()
	 * @see #getConfigurationElementAttributeInstance()
	 * @generated
	 */
	EReference getConfigurationElementAttributeInstance_AttributeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance#getContainedValue <em>Contained Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Value</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance#getContainedValue()
	 * @see #getConfigurationElementAttributeInstance()
	 * @generated
	 */
	EReference getConfigurationElementAttributeInstance_ContainedValue();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedVersionnedElement <em>Identified Versionned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Versionned Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedVersionnedElement
	 * @generated
	 */
	EClass getIdentifiedVersionnedElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue <em>Java Class Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Class Value</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue
	 * @generated
	 */
	EClass getJavaClassValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue#getClassName()
	 * @see #getJavaClassValue()
	 * @generated
	 */
	EAttribute getJavaClassValue_ClassName();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.AbstractValue <em>Abstract Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Value</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.AbstractValue
	 * @generated
	 */
	EClass getAbstractValue();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement <em>Versionned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versionned Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement
	 * @generated
	 */
	EClass getVersionnedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement#getVersion()
	 * @see #getVersionnedElement()
	 * @generated
	 */
	EAttribute getVersionnedElement_Version();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMinCard <em>Min Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Card</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMinCard()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_MinCard();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMaxCard <em>Max Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Card</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMaxCard()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_MaxCard();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#isUnbounded <em>Unbounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbounded</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#isUnbounded()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Unbounded();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference <em>Schema Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Element Reference</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference
	 * @generated
	 */
	EClass getSchemaElementReference();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference#getReference()
	 * @see #getSchemaElementReference()
	 * @generated
	 */
	EReference getSchemaElementReference_Reference();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement <em>Eclipse Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclipse Element</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement
	 * @generated
	 */
	EClass getEclipseElement();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement#getEclipseElementIntrospectionErrors <em>Eclipse Element Introspection Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Eclipse Element Introspection Errors</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement#getEclipseElementIntrospectionErrors()
	 * @see #getEclipseElement()
	 * @generated
	 */
	EReference getEclipseElement_EclipseElementIntrospectionErrors();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency <em>Feature To Plugin Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature To Plugin Dependency</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency
	 * @generated
	 */
	EClass getFeatureToPluginDependency();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency#getMatchRule <em>Match Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Rule</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency#getMatchRule()
	 * @see #getFeatureToPluginDependency()
	 * @generated
	 */
	EAttribute getFeatureToPluginDependency_MatchRule();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency#getTarget()
	 * @see #getFeatureToPluginDependency()
	 * @generated
	 */
	EReference getFeatureToPluginDependency_Target();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions <em>Plugin Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Extensions</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions
	 * @generated
	 */
	EClass getPluginExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions#getExtensions()
	 * @see #getPluginExtensions()
	 * @generated
	 */
	EReference getPluginExtensions_Extensions();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints <em>Plugin Extension Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Extension Points</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints
	 * @generated
	 */
	EClass getPluginExtensionPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints#getExtensionPoints <em>Extension Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Points</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints#getExtensionPoints()
	 * @see #getPluginExtensionPoints()
	 * @generated
	 */
	EReference getPluginExtensionPoints_ExtensionPoints();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies <em>Plugin Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Dependencies</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies
	 * @generated
	 */
	EClass getPluginDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies#getPluginDependencies <em>Plugin Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin Dependencies</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies#getPluginDependencies()
	 * @see #getPluginDependencies()
	 * @generated
	 */
	EReference getPluginDependencies_PluginDependencies();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies <em>Feature Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Dependencies</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies
	 * @generated
	 */
	EClass getFeatureDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies#getFeatureDependencies <em>Feature Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Dependencies</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies#getFeatureDependencies()
	 * @see #getFeatureDependencies()
	 * @generated
	 */
	EReference getFeatureDependencies_FeatureDependencies();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions <em>Feature Inclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Inclusions</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions
	 * @generated
	 */
	EClass getFeatureInclusions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions#getFeatureInclusions <em>Feature Inclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Inclusions</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions#getFeatureInclusions()
	 * @see #getFeatureInclusions()
	 * @generated
	 */
	EReference getFeatureInclusions_FeatureInclusions();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies <em>Feature Plugin Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Plugin Dependencies</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies
	 * @generated
	 */
	EClass getFeaturePluginDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies#getPluginDependencies <em>Plugin Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin Dependencies</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies#getPluginDependencies()
	 * @see #getFeaturePluginDependencies()
	 * @generated
	 */
	EReference getFeaturePluginDependencies_PluginDependencies();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins <em>Included Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Plugins</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins
	 * @generated
	 */
	EClass getIncludedPlugins();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins#getIncludedPlugins <em>Included Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Plugins</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins#getIncludedPlugins()
	 * @see #getIncludedPlugins()
	 * @generated
	 */
	EReference getIncludedPlugins_IncludedPlugins();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel <em>Eclipse Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclipse Model</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel
	 * @generated
	 */
	EClass getEclipseModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#getRepositories()
	 * @see #getEclipseModel()
	 * @generated
	 */
	EReference getEclipseModel_Repositories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#getIntrospectionErrors <em>Introspection Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Introspection Errors</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#getIntrospectionErrors()
	 * @see #getEclipseModel()
	 * @generated
	 */
	EReference getEclipseModel_IntrospectionErrors();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#isQualifierIgnored <em>Qualifier Ignored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier Ignored</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#isQualifierIgnored()
	 * @see #getEclipseModel()
	 * @generated
	 */
	EAttribute getEclipseModel_QualifierIgnored();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackage <em>Exported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exported Package</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackage
	 * @generated
	 */
	EClass getExportedPackage();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages <em>Exported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exported Packages</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages
	 * @generated
	 */
	EClass getExportedPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages#getExportedPackages <em>Exported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exported Packages</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages#getExportedPackages()
	 * @see #getExportedPackages()
	 * @generated
	 */
	EReference getExportedPackages_ExportedPackages();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError <em>Introspection Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Introspection Error</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError
	 * @generated
	 */
	EClass getIntrospectionError();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getSummary()
	 * @see #getIntrospectionError()
	 * @generated
	 */
	EAttribute getIntrospectionError_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getDetails()
	 * @see #getIntrospectionError()
	 * @generated
	 */
	EAttribute getIntrospectionError_Details();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getTarget()
	 * @see #getIntrospectionError()
	 * @generated
	 */
	EReference getIntrospectionError_Target();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments <em>Execution Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Environments</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments
	 * @generated
	 */
	EClass getExecutionEnvironments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments#getExecutionEnvironments <em>Execution Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Environments</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments#getExecutionEnvironments()
	 * @see #getExecutionEnvironments()
	 * @generated
	 */
	EReference getExecutionEnvironments_ExecutionEnvironments();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Environment</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironment
	 * @generated
	 */
	EClass getExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors <em>Introspection Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Introspection Errors</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors
	 * @generated
	 */
	EClass getIntrospectionErrors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors#getIntrospectionErrors <em>Introspection Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Introspection Errors</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors#getIntrospectionErrors()
	 * @see #getIntrospectionErrors()
	 * @generated
	 */
	EReference getIntrospectionErrors_IntrospectionErrors();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind <em>Configuration Element Attribute Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Configuration Element Attribute Kind</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind
	 * @generated
	 */
	EEnum getConfigurationElementAttributeKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind <em>Complex Compositor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complex Compositor Kind</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind
	 * @generated
	 */
	EEnum getComplexCompositorKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule <em>Match Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Rule</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule
	 * @generated
	 */
	EEnum getMatchRule();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind <em>Inclusion Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inclusion Kind</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind
	 * @generated
	 */
	EEnum getInclusionKind();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind <em>Repository Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repository Kind</em>'.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind
	 * @generated
	 */
	EEnum getRepositoryKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatformFactory getPlatformFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Extension Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__EXTENSION_POINTS = eINSTANCE.getPlugin_ExtensionPoints();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__EXTENSIONS = eINSTANCE.getPlugin_Extensions();

		/**
		 * The meta object literal for the '<em><b>Plugin Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__PLUGIN_DEPENDENCIES = eINSTANCE.getPlugin_PluginDependencies();

		/**
		 * The meta object literal for the '<em><b>Exported Packages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__EXPORTED_PACKAGES = eINSTANCE.getPlugin_ExportedPackages();

		/**
		 * The meta object literal for the '<em><b>Execution Environmnents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__EXECUTION_ENVIRONMNENTS = eINSTANCE.getPlugin_ExecutionEnvironmnents();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionPointImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExtensionPoint()
		 * @generated
		 */
		EClass EXTENSION_POINT = eINSTANCE.getExtensionPoint();

		/**
		 * The meta object literal for the '<em><b>Schema Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_POINT__SCHEMA_ELEMENTS = eINSTANCE.getExtensionPoint_SchemaElements();

		/**
		 * The meta object literal for the '<em><b>Contributors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_POINT__CONTRIBUTORS = eINSTANCE.getExtensionPoint_Contributors();

		/**
		 * The meta object literal for the '<em><b>Extension Schema Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_POINT__EXTENSION_SCHEMA_ELEMENT = eINSTANCE.getExtensionPoint_ExtensionSchemaElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Extension Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__EXTENSION_POINT = eINSTANCE.getExtension_ExtensionPoint();

		/**
		 * The meta object literal for the '<em><b>Configured Schema Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__CONFIGURED_SCHEMA_ELEMENT = eINSTANCE.getExtension_ConfiguredSchemaElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.RepositoryImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__PACKAGES = eINSTANCE.getRepository_Packages();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__PLUGINS = eINSTANCE.getRepository_Plugins();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__FEATURES = eINSTANCE.getRepository_Features();

		/**
		 * The meta object literal for the '<em><b>Repository Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__REPOSITORY_KIND = eINSTANCE.getRepository_RepositoryKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfiguredSchemaElementImpl <em>Configured Schema Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfiguredSchemaElementImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getConfiguredSchemaElement()
		 * @generated
		 */
		EClass CONFIGURED_SCHEMA_ELEMENT = eINSTANCE.getConfiguredSchemaElement();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_SCHEMA_ELEMENT__CHILDREN = eINSTANCE.getConfiguredSchemaElement_Children();

		/**
		 * The meta object literal for the '<em><b>Schema Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_SCHEMA_ELEMENT__SCHEMA_ELEMENT = eINSTANCE.getConfiguredSchemaElement_SchemaElement();

		/**
		 * The meta object literal for the '<em><b>Configuration Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_SCHEMA_ELEMENT__CONFIGURATION_ELEMENTS = eINSTANCE.getConfiguredSchemaElement_ConfigurationElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeImpl <em>Configuration Element Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getConfigurationElementAttribute()
		 * @generated
		 */
		EClass CONFIGURATION_ELEMENT_ATTRIBUTE = eINSTANCE.getConfigurationElementAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE = eINSTANCE.getConfigurationElementAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON = eINSTANCE.getConfigurationElementAttribute_BasedOn();

		/**
		 * The meta object literal for the '<em><b>Translatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE = eINSTANCE.getConfigurationElementAttribute_Translatable();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ComplexCompositorImpl <em>Complex Compositor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ComplexCompositorImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getComplexCompositor()
		 * @generated
		 */
		EClass COMPLEX_COMPOSITOR = eINSTANCE.getComplexCompositor();

		/**
		 * The meta object literal for the '<em><b>Complex Compositor Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND = eINSTANCE.getComplexCompositor_ComplexCompositorKind();

		/**
		 * The meta object literal for the '<em><b>Complex Compositor Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN = eINSTANCE.getComplexCompositor_ComplexCompositorChildren();

		/**
		 * The meta object literal for the '<em><b>Element References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_COMPOSITOR__ELEMENT_REFERENCES = eINSTANCE.getComplexCompositor_ElementReferences();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementImpl <em>Schema Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getSchemaElement()
		 * @generated
		 */
		EClass SCHEMA_ELEMENT = eINSTANCE.getSchemaElement();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_ELEMENT__ATTRIBUTES = eINSTANCE.getSchemaElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Complex Compositor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_ELEMENT__COMPLEX_COMPOSITOR = eINSTANCE.getSchemaElement_ComplexCompositor();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__FEATURE_DESCRIPTION = eINSTANCE.getFeature_FeatureDescription();

		/**
		 * The meta object literal for the '<em><b>Copyright Notice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__COPYRIGHT_NOTICE = eINSTANCE.getFeature_CopyrightNotice();

		/**
		 * The meta object literal for the '<em><b>License Agreement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__LICENSE_AGREEMENT = eINSTANCE.getFeature_LicenseAgreement();

		/**
		 * The meta object literal for the '<em><b>Sites To Visit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SITES_TO_VISIT = eINSTANCE.getFeature_SitesToVisit();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__PROVIDER = eINSTANCE.getFeature_Provider();

		/**
		 * The meta object literal for the '<em><b>Feature Inclusions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_INCLUSIONS = eINSTANCE.getFeature_FeatureInclusions();

		/**
		 * The meta object literal for the '<em><b>Plugin Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PLUGIN_DEPENDENCIES = eINSTANCE.getFeature_PluginDependencies();

		/**
		 * The meta object literal for the '<em><b>Included Plugins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__INCLUDED_PLUGINS = eINSTANCE.getFeature_IncludedPlugins();

		/**
		 * The meta object literal for the '<em><b>Feature Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_DEPENDENCIES = eINSTANCE.getFeature_FeatureDependencies();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependencyImpl <em>Plugin Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependencyImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPluginDependency()
		 * @generated
		 */
		EClass PLUGIN_DEPENDENCY = eINSTANCE.getPluginDependency();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_DEPENDENCY__TARGET = eINSTANCE.getPluginDependency_Target();

		/**
		 * The meta object literal for the '<em><b>Minimum Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DEPENDENCY__MINIMUM_VERSION = eINSTANCE.getPluginDependency_MinimumVersion();

		/**
		 * The meta object literal for the '<em><b>Maximum Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DEPENDENCY__MAXIMUM_VERSION = eINSTANCE.getPluginDependency_MaximumVersion();

		/**
		 * The meta object literal for the '<em><b>Minimum Inclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DEPENDENCY__MINIMUM_INCLUSION = eINSTANCE.getPluginDependency_MinimumInclusion();

		/**
		 * The meta object literal for the '<em><b>Maximum Inclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION = eINSTANCE.getPluginDependency_MaximumInclusion();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureDependencyImpl <em>Feature Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureDependencyImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureDependency()
		 * @generated
		 */
		EClass FEATURE_DEPENDENCY = eINSTANCE.getFeatureDependency();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DEPENDENCY__TARGET = eINSTANCE.getFeatureDependency_Target();

		/**
		 * The meta object literal for the '<em><b>Match Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_DEPENDENCY__MATCH_RULE = eINSTANCE.getFeatureDependency_MatchRule();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PackageImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SUB_PACKAGES = eINSTANCE.getPackage_SubPackages();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PLUGINS = eINSTANCE.getPackage_Plugins();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__FEATURES = eINSTANCE.getPackage_Features();

		/**
		 * The meta object literal for the '<em><b>Absolute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__ABSOLUTE_NAME = eINSTANCE.getPackage_AbsoluteName();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IdentifiedElementImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionImpl <em>Feature Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureInclusion()
		 * @generated
		 */
		EClass FEATURE_INCLUSION = eINSTANCE.getFeatureInclusion();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_INCLUSION__OPTIONAL = eINSTANCE.getFeatureInclusion_Optional();

		/**
		 * The meta object literal for the '<em><b>Included Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INCLUSION__INCLUDED_FEATURE = eINSTANCE.getFeatureInclusion_IncludedFeature();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeInstanceImpl <em>Configuration Element Attribute Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeInstanceImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getConfigurationElementAttributeInstance()
		 * @generated
		 */
		EClass CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE = eINSTANCE.getConfigurationElementAttributeInstance();

		/**
		 * The meta object literal for the '<em><b>Attribute Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ATTRIBUTE_DEFINITION = eINSTANCE.getConfigurationElementAttributeInstance_AttributeDefinition();

		/**
		 * The meta object literal for the '<em><b>Contained Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE = eINSTANCE.getConfigurationElementAttributeInstance_ContainedValue();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IdentifiedVersionnedElementImpl <em>Identified Versionned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IdentifiedVersionnedElementImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIdentifiedVersionnedElement()
		 * @generated
		 */
		EClass IDENTIFIED_VERSIONNED_ELEMENT = eINSTANCE.getIdentifiedVersionnedElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.NamedElementImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.StringValueImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.JavaClassValueImpl <em>Java Class Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.JavaClassValueImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getJavaClassValue()
		 * @generated
		 */
		EClass JAVA_CLASS_VALUE = eINSTANCE.getJavaClassValue();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS_VALUE__CLASS_NAME = eINSTANCE.getJavaClassValue_ClassName();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.BooleanValueImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.AbstractValueImpl <em>Abstract Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.AbstractValueImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getAbstractValue()
		 * @generated
		 */
		EClass ABSTRACT_VALUE = eINSTANCE.getAbstractValue();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.VersionnedElementImpl <em>Versionned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.VersionnedElementImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getVersionnedElement()
		 * @generated
		 */
		EClass VERSIONNED_ELEMENT = eINSTANCE.getVersionnedElement();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONNED_ELEMENT__VERSION = eINSTANCE.getVersionnedElement_Version();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.CardinalityImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Min Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MIN_CARD = eINSTANCE.getCardinality_MinCard();

		/**
		 * The meta object literal for the '<em><b>Max Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MAX_CARD = eINSTANCE.getCardinality_MaxCard();

		/**
		 * The meta object literal for the '<em><b>Unbounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__UNBOUNDED = eINSTANCE.getCardinality_Unbounded();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementReferenceImpl <em>Schema Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementReferenceImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getSchemaElementReference()
		 * @generated
		 */
		EClass SCHEMA_ELEMENT_REFERENCE = eINSTANCE.getSchemaElementReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_ELEMENT_REFERENCE__REFERENCE = eINSTANCE.getSchemaElementReference_Reference();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseElementImpl <em>Eclipse Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseElementImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getEclipseElement()
		 * @generated
		 */
		EClass ECLIPSE_ELEMENT = eINSTANCE.getEclipseElement();

		/**
		 * The meta object literal for the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS = eINSTANCE.getEclipseElement_EclipseElementIntrospectionErrors();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureToPluginDependencyImpl <em>Feature To Plugin Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureToPluginDependencyImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureToPluginDependency()
		 * @generated
		 */
		EClass FEATURE_TO_PLUGIN_DEPENDENCY = eINSTANCE.getFeatureToPluginDependency();

		/**
		 * The meta object literal for the '<em><b>Match Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE = eINSTANCE.getFeatureToPluginDependency_MatchRule();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TO_PLUGIN_DEPENDENCY__TARGET = eINSTANCE.getFeatureToPluginDependency_Target();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginExtensionsImpl <em>Plugin Extensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginExtensionsImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPluginExtensions()
		 * @generated
		 */
		EClass PLUGIN_EXTENSIONS = eINSTANCE.getPluginExtensions();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_EXTENSIONS__EXTENSIONS = eINSTANCE.getPluginExtensions_Extensions();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginExtensionPointsImpl <em>Plugin Extension Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginExtensionPointsImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPluginExtensionPoints()
		 * @generated
		 */
		EClass PLUGIN_EXTENSION_POINTS = eINSTANCE.getPluginExtensionPoints();

		/**
		 * The meta object literal for the '<em><b>Extension Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_EXTENSION_POINTS__EXTENSION_POINTS = eINSTANCE.getPluginExtensionPoints_ExtensionPoints();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependenciesImpl <em>Plugin Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependenciesImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getPluginDependencies()
		 * @generated
		 */
		EClass PLUGIN_DEPENDENCIES = eINSTANCE.getPluginDependencies();

		/**
		 * The meta object literal for the '<em><b>Plugin Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES = eINSTANCE.getPluginDependencies_PluginDependencies();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureDependenciesImpl <em>Feature Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureDependenciesImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureDependencies()
		 * @generated
		 */
		EClass FEATURE_DEPENDENCIES = eINSTANCE.getFeatureDependencies();

		/**
		 * The meta object literal for the '<em><b>Feature Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DEPENDENCIES__FEATURE_DEPENDENCIES = eINSTANCE.getFeatureDependencies_FeatureDependencies();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionsImpl <em>Feature Inclusions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionsImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeatureInclusions()
		 * @generated
		 */
		EClass FEATURE_INCLUSIONS = eINSTANCE.getFeatureInclusions();

		/**
		 * The meta object literal for the '<em><b>Feature Inclusions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INCLUSIONS__FEATURE_INCLUSIONS = eINSTANCE.getFeatureInclusions_FeatureInclusions();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeaturePluginDependenciesImpl <em>Feature Plugin Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeaturePluginDependenciesImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getFeaturePluginDependencies()
		 * @generated
		 */
		EClass FEATURE_PLUGIN_DEPENDENCIES = eINSTANCE.getFeaturePluginDependencies();

		/**
		 * The meta object literal for the '<em><b>Plugin Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES = eINSTANCE.getFeaturePluginDependencies_PluginDependencies();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IncludedPluginsImpl <em>Included Plugins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IncludedPluginsImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIncludedPlugins()
		 * @generated
		 */
		EClass INCLUDED_PLUGINS = eINSTANCE.getIncludedPlugins();

		/**
		 * The meta object literal for the '<em><b>Included Plugins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_PLUGINS__INCLUDED_PLUGINS = eINSTANCE.getIncludedPlugins_IncludedPlugins();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseModelImpl <em>Eclipse Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseModelImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getEclipseModel()
		 * @generated
		 */
		EClass ECLIPSE_MODEL = eINSTANCE.getEclipseModel();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_MODEL__REPOSITORIES = eINSTANCE.getEclipseModel_Repositories();

		/**
		 * The meta object literal for the '<em><b>Introspection Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_MODEL__INTROSPECTION_ERRORS = eINSTANCE.getEclipseModel_IntrospectionErrors();

		/**
		 * The meta object literal for the '<em><b>Qualifier Ignored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_MODEL__QUALIFIER_IGNORED = eINSTANCE.getEclipseModel_QualifierIgnored();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExportedPackageImpl <em>Exported Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExportedPackageImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExportedPackage()
		 * @generated
		 */
		EClass EXPORTED_PACKAGE = eINSTANCE.getExportedPackage();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExportedPackagesImpl <em>Exported Packages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExportedPackagesImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExportedPackages()
		 * @generated
		 */
		EClass EXPORTED_PACKAGES = eINSTANCE.getExportedPackages();

		/**
		 * The meta object literal for the '<em><b>Exported Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORTED_PACKAGES__EXPORTED_PACKAGES = eINSTANCE.getExportedPackages_ExportedPackages();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IntrospectionErrorImpl <em>Introspection Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IntrospectionErrorImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIntrospectionError()
		 * @generated
		 */
		EClass INTROSPECTION_ERROR = eINSTANCE.getIntrospectionError();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTROSPECTION_ERROR__SUMMARY = eINSTANCE.getIntrospectionError_Summary();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTROSPECTION_ERROR__DETAILS = eINSTANCE.getIntrospectionError_Details();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTROSPECTION_ERROR__TARGET = eINSTANCE.getIntrospectionError_Target();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExecutionEnvironmentsImpl <em>Execution Environments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExecutionEnvironmentsImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExecutionEnvironments()
		 * @generated
		 */
		EClass EXECUTION_ENVIRONMENTS = eINSTANCE.getExecutionEnvironments();

		/**
		 * The meta object literal for the '<em><b>Execution Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENTS__EXECUTION_ENVIRONMENTS = eINSTANCE.getExecutionEnvironments_ExecutionEnvironments();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExecutionEnvironmentImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getExecutionEnvironment()
		 * @generated
		 */
		EClass EXECUTION_ENVIRONMENT = eINSTANCE.getExecutionEnvironment();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IntrospectionErrorsImpl <em>Introspection Errors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IntrospectionErrorsImpl
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getIntrospectionErrors()
		 * @generated
		 */
		EClass INTROSPECTION_ERRORS = eINSTANCE.getIntrospectionErrors();

		/**
		 * The meta object literal for the '<em><b>Introspection Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTROSPECTION_ERRORS__INTROSPECTION_ERRORS = eINSTANCE.getIntrospectionErrors_IntrospectionErrors();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind <em>Configuration Element Attribute Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getConfigurationElementAttributeKind()
		 * @generated
		 */
		EEnum CONFIGURATION_ELEMENT_ATTRIBUTE_KIND = eINSTANCE.getConfigurationElementAttributeKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind <em>Complex Compositor Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getComplexCompositorKind()
		 * @generated
		 */
		EEnum COMPLEX_COMPOSITOR_KIND = eINSTANCE.getComplexCompositorKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule <em>Match Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getMatchRule()
		 * @generated
		 */
		EEnum MATCH_RULE = eINSTANCE.getMatchRule();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind <em>Inclusion Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getInclusionKind()
		 * @generated
		 */
		EEnum INCLUSION_KIND = eINSTANCE.getInclusionKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind <em>Repository Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind
		 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PlatformPackageImpl#getRepositoryKind()
		 * @generated
		 */
		EEnum REPOSITORY_KIND = eINSTANCE.getRepositoryKind();

	}

} //PlatformPackage
