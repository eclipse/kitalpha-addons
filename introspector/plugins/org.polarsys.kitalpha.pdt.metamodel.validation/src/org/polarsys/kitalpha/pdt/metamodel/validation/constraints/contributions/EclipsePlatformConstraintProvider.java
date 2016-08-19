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
package org.polarsys.kitalpha.pdt.metamodel.validation.constraints.contributions;

import java.net.URL;
import java.util.ResourceBundle;

import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.pdt.metamodel.validation.internal.constraints.Activator;
import org.polarsys.kitalpha.validation.ocl.provider.generic.GenericOCLConstraintProvider;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class EclipsePlatformConstraintProvider extends GenericOCLConstraintProvider {
	
	
	private static String CONSTRAINTS_CONFIGURATION_FILE =	"OCLConstraints.Configuration.constraints";

	public ResourceBundle getConfigurationFileResourceBundle() {
		
		return ResourceBundle.getBundle(CONSTRAINTS_CONFIGURATION_FILE); 

	}

	public Bundle getContributorBundle() {
		
		return Activator.getDefault().getBundle();
		
	}

	public URL getUrlFromPath(String filePath) {
		
		return Activator.getDefault().getBundle().getEntry(filePath);
		
	}

}
