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
 * A representation of the model object '<em><b>Exported Packages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages#getExportedPackages <em>Exported Packages</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExportedPackages()
 * @model
 * @generated
 */

public interface ExportedPackages extends EclipseElement {





	/**
	 * Returns the value of the '<em><b>Exported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackage}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported Packages</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExportedPackages_ExportedPackages()
	 * @model containment="true"
	 * @generated
	 */

	EList<ExportedPackage> getExportedPackages();





} // ExportedPackages
