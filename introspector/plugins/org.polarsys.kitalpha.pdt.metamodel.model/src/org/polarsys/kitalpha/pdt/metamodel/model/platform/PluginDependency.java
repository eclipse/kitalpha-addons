/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMinimumVersion <em>Minimum Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMaximumVersion <em>Maximum Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMinimumInclusion <em>Minimum Inclusion</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMaximumInclusion <em>Maximum Inclusion</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPluginDependency()
 * @model
 * @generated
 */

public interface PluginDependency extends EclipseElement {





	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Plugin)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPluginDependency_Target()
	 * @model required="true"
	 * @generated
	 */

	Plugin getTarget();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getTarget <em>Target</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */

	void setTarget(Plugin value);







	/**
	 * Returns the value of the '<em><b>Minimum Version</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Version</em>' attribute.
	 * @see #setMinimumVersion(String)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPluginDependency_MinimumVersion()
	 * @model
	 * @generated
	 */

	String getMinimumVersion();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMinimumVersion <em>Minimum Version</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Version</em>' attribute.
	 * @see #getMinimumVersion()
	 * @generated
	 */

	void setMinimumVersion(String value);







	/**
	 * Returns the value of the '<em><b>Maximum Version</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Version</em>' attribute.
	 * @see #setMaximumVersion(String)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPluginDependency_MaximumVersion()
	 * @model
	 * @generated
	 */

	String getMaximumVersion();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMaximumVersion <em>Maximum Version</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Version</em>' attribute.
	 * @see #getMaximumVersion()
	 * @generated
	 */

	void setMaximumVersion(String value);







	/**
	 * Returns the value of the '<em><b>Minimum Inclusion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Inclusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Inclusion</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind
	 * @see #setMinimumInclusion(InclusionKind)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPluginDependency_MinimumInclusion()
	 * @model
	 * @generated
	 */

	InclusionKind getMinimumInclusion();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMinimumInclusion <em>Minimum Inclusion</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Inclusion</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind
	 * @see #getMinimumInclusion()
	 * @generated
	 */

	void setMinimumInclusion(InclusionKind value);







	/**
	 * Returns the value of the '<em><b>Maximum Inclusion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Inclusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Inclusion</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind
	 * @see #setMaximumInclusion(InclusionKind)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPluginDependency_MaximumInclusion()
	 * @model
	 * @generated
	 */

	InclusionKind getMaximumInclusion();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency#getMaximumInclusion <em>Maximum Inclusion</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Inclusion</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind
	 * @see #getMaximumInclusion()
	 * @generated
	 */

	void setMaximumInclusion(InclusionKind value);





} // PluginDependency
