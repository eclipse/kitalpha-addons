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
package org.polarsys.kitalpha.pdt.docgen.sidebar;

import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Package;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class SideBarHelpers {

	public static boolean isTypeGenerated(EclipseElement element) {
		return (element instanceof EclipseModel 
				|| element instanceof Repository 
				|| element instanceof Package
				|| element instanceof Feature 
				|| element instanceof Plugin
				|| element instanceof Extension
				|| element instanceof ExtensionPoint);
	}
	
	public static boolean hasChildren(EclipseElement element) {
		if (element instanceof EclipseModel) 
		{
			EclipseModel eclipseModel = (EclipseModel) element;
			return ! eclipseModel.getRepositories().isEmpty();
		}
		else if (element instanceof Repository) 
		{
			Repository repository = (Repository) element;
			return ! repository.getPackages().isEmpty() || ! repository.getFeatures().isEmpty() || ! repository.getPackages().isEmpty();
		}
		else if (element instanceof Package) 
		{
			Package pack = (Package) element;
			return ! pack.getFeatures().isEmpty() || ! pack.getPlugins().isEmpty() || ! pack.getSubPackages().isEmpty();
		}
		else if (element instanceof Plugin) 
		{
			Plugin plugin = (Plugin) element;
			PluginExtensionPoints extensionPoints = plugin.getExtensionPoints();
			if (extensionPoints != null)
			{
				if (! extensionPoints.getExtensionPoints().isEmpty())
				{
					return true;
				}
			}
			
			PluginExtensions extensions = plugin.getExtensions();
			if (extensions != null)
			{
				if (! extensions.getExtensions().isEmpty())
				{
					return true;
				}
			}
		}
		return false;
	}
}
