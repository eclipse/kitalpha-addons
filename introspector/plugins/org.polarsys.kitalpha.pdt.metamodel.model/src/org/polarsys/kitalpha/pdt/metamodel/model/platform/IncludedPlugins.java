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
 * A representation of the model object '<em><b>Included Plugins</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins#getIncludedPlugins <em>Included Plugins</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getIncludedPlugins()
 * @model
 * @generated
 */

public interface IncludedPlugins extends EObject {





	/**
	 * Returns the value of the '<em><b>Included Plugins</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Plugins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Plugins</em>' reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getIncludedPlugins_IncludedPlugins()
	 * @model
	 * @generated
	 */

	EList<Plugin> getIncludedPlugins();





} // IncludedPlugins
