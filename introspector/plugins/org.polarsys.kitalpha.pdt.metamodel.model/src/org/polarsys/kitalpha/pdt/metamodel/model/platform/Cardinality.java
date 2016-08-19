/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMinCard <em>Min Card</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMaxCard <em>Max Card</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#isUnbounded <em>Unbounded</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getCardinality()
 * @model
 * @generated
 */

public interface Cardinality extends EclipseElement {





	/**
	 * Returns the value of the '<em><b>Min Card</b></em>' attribute.
	 * The default value is <code>"0"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Card</em>' attribute.
	 * @see #setMinCard(int)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getCardinality_MinCard()
	 * @model default="0" required="true"
	 * @generated
	 */

	int getMinCard();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMinCard <em>Min Card</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Card</em>' attribute.
	 * @see #getMinCard()
	 * @generated
	 */

	void setMinCard(int value);







	/**
	 * Returns the value of the '<em><b>Max Card</b></em>' attribute.
	 * The default value is <code>"0"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Card</em>' attribute.
	 * @see #isSetMaxCard()
	 * @see #unsetMaxCard()
	 * @see #setMaxCard(int)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getCardinality_MaxCard()
	 * @model default="0" unsettable="true" required="true"
	 * @generated
	 */

	int getMaxCard();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMaxCard <em>Max Card</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Card</em>' attribute.
	 * @see #isSetMaxCard()
	 * @see #unsetMaxCard()
	 * @see #getMaxCard()
	 * @generated
	 */

	void setMaxCard(int value);




	/**
	 * Unsets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMaxCard <em>Max Card</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxCard()
	 * @see #getMaxCard()
	 * @see #setMaxCard(int)
	 * @generated
	 */

	void unsetMaxCard();




	/**
	 * Returns whether the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#getMaxCard <em>Max Card</em>}' attribute is set.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Card</em>' attribute is set.
	 * @see #unsetMaxCard()
	 * @see #getMaxCard()
	 * @see #setMaxCard(int)
	 * @generated
	 */

	boolean isSetMaxCard();







	/**
	 * Returns the value of the '<em><b>Unbounded</b></em>' attribute.
	 * The default value is <code>"false"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unbounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbounded</em>' attribute.
	 * @see #setUnbounded(boolean)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getCardinality_Unbounded()
	 * @model default="false" required="true"
	 * @generated
	 */

	boolean isUnbounded();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Cardinality#isUnbounded <em>Unbounded</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbounded</em>' attribute.
	 * @see #isUnbounded()
	 * @generated
	 */

	void setUnbounded(boolean value);





} // Cardinality
