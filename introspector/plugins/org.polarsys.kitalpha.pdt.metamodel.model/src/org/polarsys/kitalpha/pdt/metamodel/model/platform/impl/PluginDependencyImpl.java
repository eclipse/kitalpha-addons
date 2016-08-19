/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependencyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependencyImpl#getMinimumVersion <em>Minimum Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependencyImpl#getMaximumVersion <em>Maximum Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependencyImpl#getMinimumInclusion <em>Minimum Inclusion</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependencyImpl#getMaximumInclusion <em>Maximum Inclusion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginDependencyImpl extends EclipseElementImpl implements PluginDependency {

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Plugin target;




	/**
	 * The default value of the '{@link #getMinimumVersion() <em>Minimum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumVersion() <em>Minimum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVersion()
	 * @generated
	 * @ordered
	 */
	protected String minimumVersion = MINIMUM_VERSION_EDEFAULT;




	/**
	 * The default value of the '{@link #getMaximumVersion() <em>Maximum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumVersion() <em>Maximum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVersion()
	 * @generated
	 * @ordered
	 */
	protected String maximumVersion = MAXIMUM_VERSION_EDEFAULT;




	/**
	 * The default value of the '{@link #getMinimumInclusion() <em>Minimum Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumInclusion()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionKind MINIMUM_INCLUSION_EDEFAULT = InclusionKind.UNSET;

	/**
	 * The cached value of the '{@link #getMinimumInclusion() <em>Minimum Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumInclusion()
	 * @generated
	 * @ordered
	 */
	protected InclusionKind minimumInclusion = MINIMUM_INCLUSION_EDEFAULT;




	/**
	 * The default value of the '{@link #getMaximumInclusion() <em>Maximum Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumInclusion()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionKind MAXIMUM_INCLUSION_EDEFAULT = InclusionKind.UNSET;

	/**
	 * The cached value of the '{@link #getMaximumInclusion() <em>Maximum Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumInclusion()
	 * @generated
	 * @ordered
	 */
	protected InclusionKind maximumInclusion = MAXIMUM_INCLUSION_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginDependencyImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PLUGIN_DEPENDENCY;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Plugin getTarget() {

		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Plugin)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.PLUGIN_DEPENDENCY__TARGET, oldTarget, target));
			}
		}
		return target;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Plugin basicGetTarget() {

		return target;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTarget(Plugin newTarget) {

		Plugin oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN_DEPENDENCY__TARGET, oldTarget, target));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getMinimumVersion() {

		return minimumVersion;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMinimumVersion(String newMinimumVersion) {

		String oldMinimumVersion = minimumVersion;
		minimumVersion = newMinimumVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_VERSION, oldMinimumVersion, minimumVersion));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getMaximumVersion() {

		return maximumVersion;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMaximumVersion(String newMaximumVersion) {

		String oldMaximumVersion = maximumVersion;
		maximumVersion = newMaximumVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_VERSION, oldMaximumVersion, maximumVersion));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public InclusionKind getMinimumInclusion() {

		return minimumInclusion;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMinimumInclusion(InclusionKind newMinimumInclusion) {

		InclusionKind oldMinimumInclusion = minimumInclusion;
		minimumInclusion = newMinimumInclusion == null ? MINIMUM_INCLUSION_EDEFAULT : newMinimumInclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_INCLUSION, oldMinimumInclusion, minimumInclusion));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public InclusionKind getMaximumInclusion() {

		return maximumInclusion;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMaximumInclusion(InclusionKind newMaximumInclusion) {

		InclusionKind oldMaximumInclusion = maximumInclusion;
		maximumInclusion = newMaximumInclusion == null ? MAXIMUM_INCLUSION_EDEFAULT : newMaximumInclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION, oldMaximumInclusion, maximumInclusion));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.PLUGIN_DEPENDENCY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_VERSION:
				return getMinimumVersion();
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_VERSION:
				return getMaximumVersion();
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_INCLUSION:
				return getMinimumInclusion();
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION:
				return getMaximumInclusion();
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
			case PlatformPackage.PLUGIN_DEPENDENCY__TARGET:
				setTarget((Plugin)newValue);
				return;
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_VERSION:
				setMinimumVersion((String)newValue);
				return;
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_VERSION:
				setMaximumVersion((String)newValue);
				return;
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_INCLUSION:
				setMinimumInclusion((InclusionKind)newValue);
				return;
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION:
				setMaximumInclusion((InclusionKind)newValue);
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
			case PlatformPackage.PLUGIN_DEPENDENCY__TARGET:
				setTarget((Plugin)null);
				return;
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_VERSION:
				setMinimumVersion(MINIMUM_VERSION_EDEFAULT);
				return;
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_VERSION:
				setMaximumVersion(MAXIMUM_VERSION_EDEFAULT);
				return;
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_INCLUSION:
				setMinimumInclusion(MINIMUM_INCLUSION_EDEFAULT);
				return;
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION:
				setMaximumInclusion(MAXIMUM_INCLUSION_EDEFAULT);
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
			case PlatformPackage.PLUGIN_DEPENDENCY__TARGET:
				return target != null;
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_VERSION:
				return MINIMUM_VERSION_EDEFAULT == null ? minimumVersion != null : !MINIMUM_VERSION_EDEFAULT.equals(minimumVersion);
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_VERSION:
				return MAXIMUM_VERSION_EDEFAULT == null ? maximumVersion != null : !MAXIMUM_VERSION_EDEFAULT.equals(maximumVersion);
			case PlatformPackage.PLUGIN_DEPENDENCY__MINIMUM_INCLUSION:
				return minimumInclusion != MINIMUM_INCLUSION_EDEFAULT;
			case PlatformPackage.PLUGIN_DEPENDENCY__MAXIMUM_INCLUSION:
				return maximumInclusion != MAXIMUM_INCLUSION_EDEFAULT;
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
		result.append(" (minimumVersion: ");
		result.append(minimumVersion);
		result.append(", maximumVersion: ");
		result.append(maximumVersion);
		result.append(", minimumInclusion: ");
		result.append(minimumInclusion);
		result.append(", maximumInclusion: ");
		result.append(maximumInclusion);
		result.append(')');
		return result.toString();
	}


} //PluginDependencyImpl
