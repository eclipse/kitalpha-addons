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
 * A representation of the model object '<em><b>Execution Environments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments#getExecutionEnvironments <em>Execution Environments</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExecutionEnvironments()
 * @model
 * @generated
 */

public interface ExecutionEnvironments extends EObject {





	/**
	 * Returns the value of the '<em><b>Execution Environments</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironment}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Environments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Environments</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExecutionEnvironments_ExecutionEnvironments()
	 * @model containment="true"
	 * @generated
	 */

	EList<ExecutionEnvironment> getExecutionEnvironments();





} // ExecutionEnvironments
