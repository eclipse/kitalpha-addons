/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl#getFeatureDescription <em>Feature Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl#getCopyrightNotice <em>Copyright Notice</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl#getLicenseAgreement <em>License Agreement</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl#getSitesToVisit <em>Sites To Visit</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl#getFeatureInclusions <em>Feature Inclusions</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl#getPluginDependencies <em>Plugin Dependencies</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl#getIncludedPlugins <em>Included Plugins</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureImpl#getFeatureDependencies <em>Feature Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends IdentifiedVersionnedElementImpl implements Feature {

	/**
	 * The default value of the '{@link #getFeatureDescription() <em>Feature Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureDescription() <em>Feature Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDescription()
	 * @generated
	 * @ordered
	 */
	protected String featureDescription = FEATURE_DESCRIPTION_EDEFAULT;




	/**
	 * The default value of the '{@link #getCopyrightNotice() <em>Copyright Notice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightNotice()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_NOTICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightNotice() <em>Copyright Notice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightNotice()
	 * @generated
	 * @ordered
	 */
	protected String copyrightNotice = COPYRIGHT_NOTICE_EDEFAULT;




	/**
	 * The default value of the '{@link #getLicenseAgreement() <em>License Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseAgreement()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_AGREEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseAgreement() <em>License Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseAgreement()
	 * @generated
	 * @ordered
	 */
	protected String licenseAgreement = LICENSE_AGREEMENT_EDEFAULT;




	/**
	 * The default value of the '{@link #getSitesToVisit() <em>Sites To Visit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitesToVisit()
	 * @generated
	 * @ordered
	 */
	protected static final String SITES_TO_VISIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSitesToVisit() <em>Sites To Visit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitesToVisit()
	 * @generated
	 * @ordered
	 */
	protected String sitesToVisit = SITES_TO_VISIT_EDEFAULT;




	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;




	/**
	 * The cached value of the '{@link #getFeatureInclusions() <em>Feature Inclusions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureInclusions()
	 * @generated
	 * @ordered
	 */
	protected FeatureInclusions featureInclusions;




	/**
	 * The cached value of the '{@link #getPluginDependencies() <em>Plugin Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginDependencies()
	 * @generated
	 * @ordered
	 */
	protected FeaturePluginDependencies pluginDependencies;




	/**
	 * The cached value of the '{@link #getIncludedPlugins() <em>Included Plugins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedPlugins()
	 * @generated
	 * @ordered
	 */
	protected IncludedPlugins includedPlugins;




	/**
	 * The cached value of the '{@link #getFeatureDependencies() <em>Feature Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDependencies()
	 * @generated
	 * @ordered
	 */
	protected FeatureDependencies featureDependencies;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.FEATURE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getFeatureDescription() {

		return featureDescription;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setFeatureDescription(String newFeatureDescription) {

		String oldFeatureDescription = featureDescription;
		featureDescription = newFeatureDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__FEATURE_DESCRIPTION, oldFeatureDescription, featureDescription));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getCopyrightNotice() {

		return copyrightNotice;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCopyrightNotice(String newCopyrightNotice) {

		String oldCopyrightNotice = copyrightNotice;
		copyrightNotice = newCopyrightNotice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__COPYRIGHT_NOTICE, oldCopyrightNotice, copyrightNotice));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getLicenseAgreement() {

		return licenseAgreement;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLicenseAgreement(String newLicenseAgreement) {

		String oldLicenseAgreement = licenseAgreement;
		licenseAgreement = newLicenseAgreement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__LICENSE_AGREEMENT, oldLicenseAgreement, licenseAgreement));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getSitesToVisit() {

		return sitesToVisit;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSitesToVisit(String newSitesToVisit) {

		String oldSitesToVisit = sitesToVisit;
		sitesToVisit = newSitesToVisit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__SITES_TO_VISIT, oldSitesToVisit, sitesToVisit));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getProvider() {

		return provider;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setProvider(String newProvider) {

		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__PROVIDER, oldProvider, provider));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public FeatureInclusions getFeatureInclusions() {

		return featureInclusions;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetFeatureInclusions(FeatureInclusions newFeatureInclusions, NotificationChain msgs) {

		FeatureInclusions oldFeatureInclusions = featureInclusions;
		featureInclusions = newFeatureInclusions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__FEATURE_INCLUSIONS, oldFeatureInclusions, newFeatureInclusions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setFeatureInclusions(FeatureInclusions newFeatureInclusions) {

		if (newFeatureInclusions != featureInclusions) {
			NotificationChain msgs = null;
			if (featureInclusions != null)
				msgs = ((InternalEObject)featureInclusions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.FEATURE__FEATURE_INCLUSIONS, null, msgs);
			if (newFeatureInclusions != null)
				msgs = ((InternalEObject)newFeatureInclusions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.FEATURE__FEATURE_INCLUSIONS, null, msgs);
			msgs = basicSetFeatureInclusions(newFeatureInclusions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__FEATURE_INCLUSIONS, newFeatureInclusions, newFeatureInclusions));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public FeaturePluginDependencies getPluginDependencies() {

		return pluginDependencies;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetPluginDependencies(FeaturePluginDependencies newPluginDependencies, NotificationChain msgs) {

		FeaturePluginDependencies oldPluginDependencies = pluginDependencies;
		pluginDependencies = newPluginDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES, oldPluginDependencies, newPluginDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPluginDependencies(FeaturePluginDependencies newPluginDependencies) {

		if (newPluginDependencies != pluginDependencies) {
			NotificationChain msgs = null;
			if (pluginDependencies != null)
				msgs = ((InternalEObject)pluginDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES, null, msgs);
			if (newPluginDependencies != null)
				msgs = ((InternalEObject)newPluginDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES, null, msgs);
			msgs = basicSetPluginDependencies(newPluginDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES, newPluginDependencies, newPluginDependencies));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IncludedPlugins getIncludedPlugins() {

		return includedPlugins;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetIncludedPlugins(IncludedPlugins newIncludedPlugins, NotificationChain msgs) {

		IncludedPlugins oldIncludedPlugins = includedPlugins;
		includedPlugins = newIncludedPlugins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__INCLUDED_PLUGINS, oldIncludedPlugins, newIncludedPlugins);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIncludedPlugins(IncludedPlugins newIncludedPlugins) {

		if (newIncludedPlugins != includedPlugins) {
			NotificationChain msgs = null;
			if (includedPlugins != null)
				msgs = ((InternalEObject)includedPlugins).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.FEATURE__INCLUDED_PLUGINS, null, msgs);
			if (newIncludedPlugins != null)
				msgs = ((InternalEObject)newIncludedPlugins).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.FEATURE__INCLUDED_PLUGINS, null, msgs);
			msgs = basicSetIncludedPlugins(newIncludedPlugins, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__INCLUDED_PLUGINS, newIncludedPlugins, newIncludedPlugins));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public FeatureDependencies getFeatureDependencies() {

		return featureDependencies;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetFeatureDependencies(FeatureDependencies newFeatureDependencies, NotificationChain msgs) {

		FeatureDependencies oldFeatureDependencies = featureDependencies;
		featureDependencies = newFeatureDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__FEATURE_DEPENDENCIES, oldFeatureDependencies, newFeatureDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setFeatureDependencies(FeatureDependencies newFeatureDependencies) {

		if (newFeatureDependencies != featureDependencies) {
			NotificationChain msgs = null;
			if (featureDependencies != null)
				msgs = ((InternalEObject)featureDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.FEATURE__FEATURE_DEPENDENCIES, null, msgs);
			if (newFeatureDependencies != null)
				msgs = ((InternalEObject)newFeatureDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.FEATURE__FEATURE_DEPENDENCIES, null, msgs);
			msgs = basicSetFeatureDependencies(newFeatureDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE__FEATURE_DEPENDENCIES, newFeatureDependencies, newFeatureDependencies));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.FEATURE__FEATURE_INCLUSIONS:
				return basicSetFeatureInclusions(null, msgs);
			case PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES:
				return basicSetPluginDependencies(null, msgs);
			case PlatformPackage.FEATURE__INCLUDED_PLUGINS:
				return basicSetIncludedPlugins(null, msgs);
			case PlatformPackage.FEATURE__FEATURE_DEPENDENCIES:
				return basicSetFeatureDependencies(null, msgs);
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
			case PlatformPackage.FEATURE__FEATURE_DESCRIPTION:
				return getFeatureDescription();
			case PlatformPackage.FEATURE__COPYRIGHT_NOTICE:
				return getCopyrightNotice();
			case PlatformPackage.FEATURE__LICENSE_AGREEMENT:
				return getLicenseAgreement();
			case PlatformPackage.FEATURE__SITES_TO_VISIT:
				return getSitesToVisit();
			case PlatformPackage.FEATURE__PROVIDER:
				return getProvider();
			case PlatformPackage.FEATURE__FEATURE_INCLUSIONS:
				return getFeatureInclusions();
			case PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES:
				return getPluginDependencies();
			case PlatformPackage.FEATURE__INCLUDED_PLUGINS:
				return getIncludedPlugins();
			case PlatformPackage.FEATURE__FEATURE_DEPENDENCIES:
				return getFeatureDependencies();
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
			case PlatformPackage.FEATURE__FEATURE_DESCRIPTION:
				setFeatureDescription((String)newValue);
				return;
			case PlatformPackage.FEATURE__COPYRIGHT_NOTICE:
				setCopyrightNotice((String)newValue);
				return;
			case PlatformPackage.FEATURE__LICENSE_AGREEMENT:
				setLicenseAgreement((String)newValue);
				return;
			case PlatformPackage.FEATURE__SITES_TO_VISIT:
				setSitesToVisit((String)newValue);
				return;
			case PlatformPackage.FEATURE__PROVIDER:
				setProvider((String)newValue);
				return;
			case PlatformPackage.FEATURE__FEATURE_INCLUSIONS:
				setFeatureInclusions((FeatureInclusions)newValue);
				return;
			case PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES:
				setPluginDependencies((FeaturePluginDependencies)newValue);
				return;
			case PlatformPackage.FEATURE__INCLUDED_PLUGINS:
				setIncludedPlugins((IncludedPlugins)newValue);
				return;
			case PlatformPackage.FEATURE__FEATURE_DEPENDENCIES:
				setFeatureDependencies((FeatureDependencies)newValue);
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
			case PlatformPackage.FEATURE__FEATURE_DESCRIPTION:
				setFeatureDescription(FEATURE_DESCRIPTION_EDEFAULT);
				return;
			case PlatformPackage.FEATURE__COPYRIGHT_NOTICE:
				setCopyrightNotice(COPYRIGHT_NOTICE_EDEFAULT);
				return;
			case PlatformPackage.FEATURE__LICENSE_AGREEMENT:
				setLicenseAgreement(LICENSE_AGREEMENT_EDEFAULT);
				return;
			case PlatformPackage.FEATURE__SITES_TO_VISIT:
				setSitesToVisit(SITES_TO_VISIT_EDEFAULT);
				return;
			case PlatformPackage.FEATURE__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case PlatformPackage.FEATURE__FEATURE_INCLUSIONS:
				setFeatureInclusions((FeatureInclusions)null);
				return;
			case PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES:
				setPluginDependencies((FeaturePluginDependencies)null);
				return;
			case PlatformPackage.FEATURE__INCLUDED_PLUGINS:
				setIncludedPlugins((IncludedPlugins)null);
				return;
			case PlatformPackage.FEATURE__FEATURE_DEPENDENCIES:
				setFeatureDependencies((FeatureDependencies)null);
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
			case PlatformPackage.FEATURE__FEATURE_DESCRIPTION:
				return FEATURE_DESCRIPTION_EDEFAULT == null ? featureDescription != null : !FEATURE_DESCRIPTION_EDEFAULT.equals(featureDescription);
			case PlatformPackage.FEATURE__COPYRIGHT_NOTICE:
				return COPYRIGHT_NOTICE_EDEFAULT == null ? copyrightNotice != null : !COPYRIGHT_NOTICE_EDEFAULT.equals(copyrightNotice);
			case PlatformPackage.FEATURE__LICENSE_AGREEMENT:
				return LICENSE_AGREEMENT_EDEFAULT == null ? licenseAgreement != null : !LICENSE_AGREEMENT_EDEFAULT.equals(licenseAgreement);
			case PlatformPackage.FEATURE__SITES_TO_VISIT:
				return SITES_TO_VISIT_EDEFAULT == null ? sitesToVisit != null : !SITES_TO_VISIT_EDEFAULT.equals(sitesToVisit);
			case PlatformPackage.FEATURE__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case PlatformPackage.FEATURE__FEATURE_INCLUSIONS:
				return featureInclusions != null;
			case PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES:
				return pluginDependencies != null;
			case PlatformPackage.FEATURE__INCLUDED_PLUGINS:
				return includedPlugins != null;
			case PlatformPackage.FEATURE__FEATURE_DEPENDENCIES:
				return featureDependencies != null;
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
		result.append(" (featureDescription: ");
		result.append(featureDescription);
		result.append(", copyrightNotice: ");
		result.append(copyrightNotice);
		result.append(", licenseAgreement: ");
		result.append(licenseAgreement);
		result.append(", sitesToVisit: ");
		result.append(sitesToVisit);
		result.append(", provider: ");
		result.append(provider);
		result.append(')');
		return result.toString();
	}


} //FeatureImpl
