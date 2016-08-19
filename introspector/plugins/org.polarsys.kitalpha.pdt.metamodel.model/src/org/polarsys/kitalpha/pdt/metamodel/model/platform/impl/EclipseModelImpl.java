/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseModelImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseModelImpl#getIntrospectionErrors <em>Introspection Errors</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseModelImpl#isQualifierIgnored <em>Qualifier Ignored</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EclipseModelImpl extends NamedElementImpl implements EclipseModel {

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;




	/**
	 * The cached value of the '{@link #getIntrospectionErrors() <em>Introspection Errors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntrospectionErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<IntrospectionErrors> introspectionErrors;




	/**
	 * The default value of the '{@link #isQualifierIgnored() <em>Qualifier Ignored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQualifierIgnored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUALIFIER_IGNORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQualifierIgnored() <em>Qualifier Ignored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQualifierIgnored()
	 * @generated
	 * @ordered
	 */
	protected boolean qualifierIgnored = QUALIFIER_IGNORED_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseModelImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.ECLIPSE_MODEL;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Repository> getRepositories() {

		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this, PlatformPackage.ECLIPSE_MODEL__REPOSITORIES);
		}
		return repositories;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<IntrospectionErrors> getIntrospectionErrors() {

		if (introspectionErrors == null) {
			introspectionErrors = new EObjectContainmentEList<IntrospectionErrors>(IntrospectionErrors.class, this, PlatformPackage.ECLIPSE_MODEL__INTROSPECTION_ERRORS);
		}
		return introspectionErrors;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isQualifierIgnored() {

		return qualifierIgnored;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setQualifierIgnored(boolean newQualifierIgnored) {

		boolean oldQualifierIgnored = qualifierIgnored;
		qualifierIgnored = newQualifierIgnored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ECLIPSE_MODEL__QUALIFIER_IGNORED, oldQualifierIgnored, qualifierIgnored));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.ECLIPSE_MODEL__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case PlatformPackage.ECLIPSE_MODEL__INTROSPECTION_ERRORS:
				return ((InternalEList<?>)getIntrospectionErrors()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.ECLIPSE_MODEL__REPOSITORIES:
				return getRepositories();
			case PlatformPackage.ECLIPSE_MODEL__INTROSPECTION_ERRORS:
				return getIntrospectionErrors();
			case PlatformPackage.ECLIPSE_MODEL__QUALIFIER_IGNORED:
				return isQualifierIgnored();
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
			case PlatformPackage.ECLIPSE_MODEL__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case PlatformPackage.ECLIPSE_MODEL__INTROSPECTION_ERRORS:
				getIntrospectionErrors().clear();
				getIntrospectionErrors().addAll((Collection<? extends IntrospectionErrors>)newValue);
				return;
			case PlatformPackage.ECLIPSE_MODEL__QUALIFIER_IGNORED:
				setQualifierIgnored((Boolean)newValue);
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
			case PlatformPackage.ECLIPSE_MODEL__REPOSITORIES:
				getRepositories().clear();
				return;
			case PlatformPackage.ECLIPSE_MODEL__INTROSPECTION_ERRORS:
				getIntrospectionErrors().clear();
				return;
			case PlatformPackage.ECLIPSE_MODEL__QUALIFIER_IGNORED:
				setQualifierIgnored(QUALIFIER_IGNORED_EDEFAULT);
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
			case PlatformPackage.ECLIPSE_MODEL__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case PlatformPackage.ECLIPSE_MODEL__INTROSPECTION_ERRORS:
				return introspectionErrors != null && !introspectionErrors.isEmpty();
			case PlatformPackage.ECLIPSE_MODEL__QUALIFIER_IGNORED:
				return qualifierIgnored != QUALIFIER_IGNORED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (qualifierIgnored: ");
		result.append(qualifierIgnored);
		result.append(')');
		return result.toString();
	}


} //EclipseModelImpl
