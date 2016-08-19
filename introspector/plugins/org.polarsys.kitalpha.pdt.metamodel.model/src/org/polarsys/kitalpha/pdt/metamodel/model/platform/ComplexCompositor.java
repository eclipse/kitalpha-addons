/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Compositor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getComplexCompositorKind <em>Complex Compositor Kind</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getComplexCompositorChildren <em>Complex Compositor Children</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getElementReferences <em>Element References</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getComplexCompositor()
 * @model
 * @generated
 */

public interface ComplexCompositor extends Cardinality {





	/**
	 * Returns the value of the '<em><b>Complex Compositor Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Compositor Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Compositor Kind</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind
	 * @see #setComplexCompositorKind(ComplexCompositorKind)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getComplexCompositor_ComplexCompositorKind()
	 * @model
	 * @generated
	 */

	ComplexCompositorKind getComplexCompositorKind();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor#getComplexCompositorKind <em>Complex Compositor Kind</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Compositor Kind</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind
	 * @see #getComplexCompositorKind()
	 * @generated
	 */

	void setComplexCompositorKind(ComplexCompositorKind value);







	/**
	 * Returns the value of the '<em><b>Complex Compositor Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Compositor Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Compositor Children</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getComplexCompositor_ComplexCompositorChildren()
	 * @model containment="true"
	 * @generated
	 */

	EList<ComplexCompositor> getComplexCompositorChildren();







	/**
	 * Returns the value of the '<em><b>Element References</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element References</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getComplexCompositor_ElementReferences()
	 * @model containment="true" required="true"
	 * @generated
	 */

	EList<SchemaElementReference> getElementReferences();





} // ComplexCompositor
