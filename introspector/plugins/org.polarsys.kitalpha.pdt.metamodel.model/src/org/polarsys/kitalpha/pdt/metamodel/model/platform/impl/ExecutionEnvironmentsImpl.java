/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironment;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Environments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExecutionEnvironmentsImpl#getExecutionEnvironments <em>Execution Environments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionEnvironmentsImpl extends EObjectImpl implements ExecutionEnvironments {

	/**
	 * The cached value of the '{@link #getExecutionEnvironments() <em>Execution Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionEnvironment> executionEnvironments;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionEnvironmentsImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.EXECUTION_ENVIRONMENTS;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ExecutionEnvironment> getExecutionEnvironments() {

		if (executionEnvironments == null) {
			executionEnvironments = new EObjectContainmentEList<ExecutionEnvironment>(ExecutionEnvironment.class, this, PlatformPackage.EXECUTION_ENVIRONMENTS__EXECUTION_ENVIRONMENTS);
		}
		return executionEnvironments;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.EXECUTION_ENVIRONMENTS__EXECUTION_ENVIRONMENTS:
				return ((InternalEList<?>)getExecutionEnvironments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.EXECUTION_ENVIRONMENTS__EXECUTION_ENVIRONMENTS:
				return getExecutionEnvironments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.EXECUTION_ENVIRONMENTS__EXECUTION_ENVIRONMENTS:
				getExecutionEnvironments().clear();
				getExecutionEnvironments().addAll((Collection<? extends ExecutionEnvironment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlatformPackage.EXECUTION_ENVIRONMENTS__EXECUTION_ENVIRONMENTS:
				getExecutionEnvironments().clear();
				return;
		}
		super.eUnset(featureID);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatformPackage.EXECUTION_ENVIRONMENTS__EXECUTION_ENVIRONMENTS:
				return executionEnvironments != null && !executionEnvironments.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //ExecutionEnvironmentsImpl
