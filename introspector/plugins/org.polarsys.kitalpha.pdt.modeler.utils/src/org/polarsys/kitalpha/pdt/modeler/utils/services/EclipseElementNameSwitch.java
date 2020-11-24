/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.modeler.utils.services;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Package;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.util.PlatformSwitch;

/**
 * 
 * @author Xavier Decool
 *
 */
public class EclipseElementNameSwitch extends PlatformSwitch<String>{

	@Override
	public String casePlugin(Plugin object) {
		return object.getId();
	}

	@Override
	public String caseFeature(Feature object) {
		return object.getId();
	}

	@Override
	public String casePackage(Package object) {
		return object.getAbsoluteName();
	}

	@Override
	public String caseRepository(Repository object) {
		return object.getName();
	}
	
	@Override
	public String caseEclipseModel(EclipseModel object) {
		return object.getName();
	}

	@Override
	public String defaultCase(EObject object) {
		return "Not Implemented In Java Service : 'getNameForEclipseElement'";
	}
}
