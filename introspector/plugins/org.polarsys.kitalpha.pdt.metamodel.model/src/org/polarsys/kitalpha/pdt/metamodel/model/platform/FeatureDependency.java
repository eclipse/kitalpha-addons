/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency#getMatchRule <em>Match Rule</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeatureDependency()
 * @model
 * @generated
 */

public interface FeatureDependency extends VersionnedElement {





	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Feature)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeatureDependency_Target()
	 * @model required="true"
	 * @generated
	 */

	Feature getTarget();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency#getTarget <em>Target</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */

	void setTarget(Feature value);







	/**
	 * Returns the value of the '<em><b>Match Rule</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Rule</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule
	 * @see #setMatchRule(MatchRule)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeatureDependency_MatchRule()
	 * @model default="NONE" required="true"
	 * @generated
	 */

	MatchRule getMatchRule();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency#getMatchRule <em>Match Rule</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Rule</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule
	 * @see #getMatchRule()
	 * @generated
	 */

	void setMatchRule(MatchRule value);





} // FeatureDependency
