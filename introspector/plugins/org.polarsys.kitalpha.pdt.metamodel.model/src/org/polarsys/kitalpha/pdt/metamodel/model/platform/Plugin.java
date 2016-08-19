/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getPluginDependencies <em>Plugin Dependencies</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExecutionEnvironmnents <em>Execution Environmnents</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPlugin()
 * @model
 * @generated
 */

public interface Plugin extends IdentifiedVersionnedElement {





	/**
	 * Returns the value of the '<em><b>Extension Points</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Points</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Points</em>' containment reference.
	 * @see #setExtensionPoints(PluginExtensionPoints)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPlugin_ExtensionPoints()
	 * @model containment="true" required="true"
	 * @generated
	 */

	PluginExtensionPoints getExtensionPoints();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExtensionPoints <em>Extension Points</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Points</em>' containment reference.
	 * @see #getExtensionPoints()
	 * @generated
	 */

	void setExtensionPoints(PluginExtensionPoints value);







	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(PluginExtensions)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPlugin_Extensions()
	 * @model containment="true" required="true"
	 * @generated
	 */

	PluginExtensions getExtensions();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExtensions <em>Extensions</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */

	void setExtensions(PluginExtensions value);







	/**
	 * Returns the value of the '<em><b>Plugin Dependencies</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Dependencies</em>' containment reference.
	 * @see #setPluginDependencies(PluginDependencies)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPlugin_PluginDependencies()
	 * @model containment="true" required="true"
	 * @generated
	 */

	PluginDependencies getPluginDependencies();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getPluginDependencies <em>Plugin Dependencies</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Dependencies</em>' containment reference.
	 * @see #getPluginDependencies()
	 * @generated
	 */

	void setPluginDependencies(PluginDependencies value);







	/**
	 * Returns the value of the '<em><b>Exported Packages</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported Packages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported Packages</em>' containment reference.
	 * @see #setExportedPackages(ExportedPackages)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPlugin_ExportedPackages()
	 * @model containment="true" required="true"
	 * @generated
	 */

	ExportedPackages getExportedPackages();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExportedPackages <em>Exported Packages</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported Packages</em>' containment reference.
	 * @see #getExportedPackages()
	 * @generated
	 */

	void setExportedPackages(ExportedPackages value);







	/**
	 * Returns the value of the '<em><b>Execution Environmnents</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Environmnents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Environmnents</em>' containment reference.
	 * @see #setExecutionEnvironmnents(ExecutionEnvironments)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPlugin_ExecutionEnvironmnents()
	 * @model containment="true" required="true"
	 * @generated
	 */

	ExecutionEnvironments getExecutionEnvironmnents();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin#getExecutionEnvironmnents <em>Execution Environmnents</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Environmnents</em>' containment reference.
	 * @see #getExecutionEnvironmnents()
	 * @generated
	 */

	void setExecutionEnvironmnents(ExecutionEnvironments value);





} // Plugin
