/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Extension Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints#getExtensionPoints <em>Extension Points</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPluginExtensionPoints()
 * @model
 * @generated
 */

public interface PluginExtensionPoints extends EObject {





	/**
	 * Returns the value of the '<em><b>Extension Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Points</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getPluginExtensionPoints_ExtensionPoints()
	 * @model containment="true"
	 * @generated
	 */

	EList<ExtensionPoint> getExtensionPoints();





} // PluginExtensionPoints
