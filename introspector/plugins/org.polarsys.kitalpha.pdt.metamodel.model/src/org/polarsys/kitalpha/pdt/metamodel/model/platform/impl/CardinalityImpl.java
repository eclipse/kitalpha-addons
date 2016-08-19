/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.CardinalityImpl#getMinCard <em>Min Card</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.CardinalityImpl#getMaxCard <em>Max Card</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.CardinalityImpl#isUnbounded <em>Unbounded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinalityImpl extends EclipseElementImpl implements Cardinality {

	/**
	 * The default value of the '{@link #getMinCard() <em>Min Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCard()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CARD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCard() <em>Min Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCard()
	 * @generated
	 * @ordered
	 */
	protected int minCard = MIN_CARD_EDEFAULT;




	/**
	 * The default value of the '{@link #getMaxCard() <em>Max Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCard()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CARD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCard() <em>Max Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCard()
	 * @generated
	 * @ordered
	 */
	protected int maxCard = MAX_CARD_EDEFAULT;

	/**
	 * This is true if the Max Card attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxCardESet;




	/**
	 * The default value of the '{@link #isUnbounded() <em>Unbounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnbounded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNBOUNDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnbounded() <em>Unbounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnbounded()
	 * @generated
	 * @ordered
	 */
	protected boolean unbounded = UNBOUNDED_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.CARDINALITY;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getMinCard() {

		return minCard;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMinCard(int newMinCard) {

		int oldMinCard = minCard;
		minCard = newMinCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CARDINALITY__MIN_CARD, oldMinCard, minCard));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getMaxCard() {

		return maxCard;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMaxCard(int newMaxCard) {

		int oldMaxCard = maxCard;
		maxCard = newMaxCard;
		boolean oldMaxCardESet = maxCardESet;
		maxCardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CARDINALITY__MAX_CARD, oldMaxCard, maxCard, !oldMaxCardESet));

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void unsetMaxCard() {
		int oldMaxCard = maxCard;
		boolean oldMaxCardESet = maxCardESet;
		maxCard = MAX_CARD_EDEFAULT;
		maxCardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PlatformPackage.CARDINALITY__MAX_CARD, oldMaxCard, MAX_CARD_EDEFAULT, oldMaxCardESet));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isSetMaxCard() {
		return maxCardESet;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isUnbounded() {

		return unbounded;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUnbounded(boolean newUnbounded) {

		boolean oldUnbounded = unbounded;
		unbounded = newUnbounded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CARDINALITY__UNBOUNDED, oldUnbounded, unbounded));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.CARDINALITY__MIN_CARD:
				return getMinCard();
			case PlatformPackage.CARDINALITY__MAX_CARD:
				return getMaxCard();
			case PlatformPackage.CARDINALITY__UNBOUNDED:
				return isUnbounded();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.CARDINALITY__MIN_CARD:
				setMinCard((Integer)newValue);
				return;
			case PlatformPackage.CARDINALITY__MAX_CARD:
				setMaxCard((Integer)newValue);
				return;
			case PlatformPackage.CARDINALITY__UNBOUNDED:
				setUnbounded((Boolean)newValue);
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
			case PlatformPackage.CARDINALITY__MIN_CARD:
				setMinCard(MIN_CARD_EDEFAULT);
				return;
			case PlatformPackage.CARDINALITY__MAX_CARD:
				unsetMaxCard();
				return;
			case PlatformPackage.CARDINALITY__UNBOUNDED:
				setUnbounded(UNBOUNDED_EDEFAULT);
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
			case PlatformPackage.CARDINALITY__MIN_CARD:
				return minCard != MIN_CARD_EDEFAULT;
			case PlatformPackage.CARDINALITY__MAX_CARD:
				return isSetMaxCard();
			case PlatformPackage.CARDINALITY__UNBOUNDED:
				return unbounded != UNBOUNDED_EDEFAULT;
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
		result.append(" (minCard: ");
		result.append(minCard);
		result.append(", maxCard: ");
		if (maxCardESet) result.append(maxCard); else result.append("<unset>");
		result.append(", unbounded: ");
		result.append(unbounded);
		result.append(')');
		return result.toString();
	}


} //CardinalityImpl
