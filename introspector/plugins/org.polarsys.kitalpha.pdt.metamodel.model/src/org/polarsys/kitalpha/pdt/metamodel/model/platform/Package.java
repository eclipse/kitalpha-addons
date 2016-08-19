/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package#getAbsoluteName <em>Absolute Name</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPackage()
 * @model
 * @generated
 */

public interface Package extends NamedElement {





	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPackage_SubPackages()
	 * @model containment="true"
	 * @generated
	 */

	EList<Package> getSubPackages();







	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPackage_Plugins()
	 * @model containment="true"
	 * @generated
	 */

	EList<Plugin> getPlugins();







	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPackage_Features()
	 * @model containment="true"
	 * @generated
	 */

	EList<Feature> getFeatures();







	/**
	 * Returns the value of the '<em><b>Absolute Name</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Name</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPackage_AbsoluteName()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	String getAbsoluteName();





} // Package
