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
 * A representation of the model object '<em><b>Feature Plugin Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies#getPluginDependencies <em>Plugin Dependencies</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeaturePluginDependencies()
 * @model
 * @generated
 */

public interface FeaturePluginDependencies extends EObject {





	/**
	 * Returns the value of the '<em><b>Plugin Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Dependencies</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeaturePluginDependencies_PluginDependencies()
	 * @model containment="true"
	 * @generated
	 */

	EList<FeatureToPluginDependency> getPluginDependencies();





} // FeaturePluginDependencies
