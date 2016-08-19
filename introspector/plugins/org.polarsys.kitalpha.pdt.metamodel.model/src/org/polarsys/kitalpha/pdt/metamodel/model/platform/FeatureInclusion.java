/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion#getIncludedFeature <em>Included Feature</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeatureInclusion()
 * @model
 * @generated
 */

public interface FeatureInclusion extends VersionnedElement {





	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeatureInclusion_Optional()
	 * @model
	 * @generated
	 */

	boolean isOptional();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion#isOptional <em>Optional</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */

	void setOptional(boolean value);







	/**
	 * Returns the value of the '<em><b>Included Feature</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Feature</em>' reference.
	 * @see #setIncludedFeature(Feature)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getFeatureInclusion_IncludedFeature()
	 * @model required="true"
	 * @generated
	 */

	Feature getIncludedFeature();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion#getIncludedFeature <em>Included Feature</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included Feature</em>' reference.
	 * @see #getIncludedFeature()
	 * @generated
	 */

	void setIncludedFeature(Feature value);





} // FeatureInclusion
