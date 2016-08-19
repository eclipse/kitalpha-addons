/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.metamodel.validation.internal.constraints;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.validation.constraints.contributions.EclipsePlatformConstraintProvider;
import org.polarsys.kitalpha.validation.ocl.provider.generic.EValidatorAdapter;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintProviderService;


/**
 * @author Xavier DECOOL
 * 
 * Installs an EMF <code>EValidator</code> on the Library package when we start
 * up. This validator adapts EMF's <code>EValidator</code> API to the EMF Model
 * Validation Service API.
 */
public class Startup implements IStartup {

	/**
	 * Install the validator.
	 */
	public void earlyStartup() {

		EValidatorAdapter adapter = new EValidatorAdapter();
		EValidator.Registry.INSTANCE.put(PlatformPackage.eINSTANCE,adapter);
		GenericConstraintProviderService.getInstance().registerProvider(new EclipsePlatformConstraintProvider());
	}
}
