/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Repository Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getRepositoryKind()
 * @model
 * @generated
 */
public enum RepositoryKind implements Enumerator {
	/**
	 * The '<em><b>Platform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATFORM_VALUE
	 * @generated
	 * @ordered
	 */
	PLATFORM(0, "Platform", "Platform"),

	/**
	 * The '<em><b>Workspace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKSPACE_VALUE
	 * @generated
	 * @ordered
	 */
	WORKSPACE(1, "Workspace", "Workspace"),

	/**
	 * The '<em><b>Platform And Workspace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATFORM_AND_WORKSPACE_VALUE
	 * @generated
	 * @ordered
	 */
	PLATFORM_AND_WORKSPACE(2, "PlatformAndWorkspace", "PlatformAndWorkspace"),

	/**
	 * The '<em><b>Update Site</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_SITE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_SITE(3, "UpdateSite", "UpdateSite"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "Other", "Other");

	/**
	 * The '<em><b>Platform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Platform</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLATFORM
	 * @model name="Platform"
	 * @generated
	 * @ordered
	 */
	public static final int PLATFORM_VALUE = 0;

	/**
	 * The '<em><b>Workspace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Workspace</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKSPACE
	 * @model name="Workspace"
	 * @generated
	 * @ordered
	 */
	public static final int WORKSPACE_VALUE = 1;

	/**
	 * The '<em><b>Platform And Workspace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Platform And Workspace</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLATFORM_AND_WORKSPACE
	 * @model name="PlatformAndWorkspace"
	 * @generated
	 * @ordered
	 */
	public static final int PLATFORM_AND_WORKSPACE_VALUE = 2;

	/**
	 * The '<em><b>Update Site</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update Site</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE_SITE
	 * @model name="UpdateSite"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_SITE_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Repository Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RepositoryKind[] VALUES_ARRAY =
		new RepositoryKind[] {
			PLATFORM,
			WORKSPACE,
			PLATFORM_AND_WORKSPACE,
			UPDATE_SITE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Repository Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RepositoryKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Repository Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RepositoryKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepositoryKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repository Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RepositoryKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepositoryKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repository Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RepositoryKind get(int value) {
		switch (value) {
			case PLATFORM_VALUE: return PLATFORM;
			case WORKSPACE_VALUE: return WORKSPACE;
			case PLATFORM_AND_WORKSPACE_VALUE: return PLATFORM_AND_WORKSPACE;
			case UPDATE_SITE_VALUE: return UPDATE_SITE;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RepositoryKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RepositoryKind
