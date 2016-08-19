/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versionned Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getVersionnedElement()
 * @model abstract="true"
 * @generated
 */

public interface VersionnedElement extends EclipseElement {





	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getVersionnedElement_Version()
	 * @model
	 * @generated
	 */

	String getVersion();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.VersionnedElement#getVersion <em>Version</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */

	void setVersion(String value);





} // VersionnedElement
