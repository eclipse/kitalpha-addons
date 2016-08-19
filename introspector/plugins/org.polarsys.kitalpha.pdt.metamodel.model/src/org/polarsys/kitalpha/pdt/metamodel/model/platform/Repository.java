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
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getRepositoryKind <em>Repository Kind</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getRepository()
 * @model
 * @generated
 */

public interface Repository extends NamedElement {





	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Package}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getRepository_Packages()
	 * @model containment="true"
	 * @generated
	 */

	EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package> getPackages();







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
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getRepository_Plugins()
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
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getRepository_Features()
	 * @model containment="true"
	 * @generated
	 */

	EList<Feature> getFeatures();







	/**
	 * Returns the value of the '<em><b>Repository Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Kind</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind
	 * @see #setRepositoryKind(RepositoryKind)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getRepository_RepositoryKind()
	 * @model required="true"
	 * @generated
	 */

	RepositoryKind getRepositoryKind();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository#getRepositoryKind <em>Repository Kind</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Kind</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind
	 * @see #getRepositoryKind()
	 * @generated
	 */

	void setRepositoryKind(RepositoryKind value);





} // Repository
