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
 * A representation of the model object '<em><b>Feature Inclusions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions#getFeatureInclusions <em>Feature Inclusions</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeatureInclusions()
 * @model
 * @generated
 */

public interface FeatureInclusions extends EObject {





	/**
	 * Returns the value of the '<em><b>Feature Inclusions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Inclusions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Inclusions</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeatureInclusions_FeatureInclusions()
	 * @model containment="true"
	 * @generated
	 */

	EList<FeatureInclusion> getFeatureInclusions();





} // FeatureInclusions
