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
package org.polarsys.kitalpha.pdt.docgen.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class ObjectHelpers implements IFileNameService {

	int index = 0;

	@Override
	public String getFileName(EObject eObject) {
		if (eObject instanceof Plugin) {
			String pluginID = ((Plugin) eObject).getId();
			String pluginName = pluginID.replace(".", "_");
			return pluginName;
		} else if (eObject instanceof Feature) {
			String featureID = ((Feature) eObject).getId();
			String featureName = featureID.replace(".", "_");
			return featureName;
		} else if (eObject instanceof ExtensionPoint) {
			String epCompleteID = ((ExtensionPoint) eObject).getId();
			String epName = epCompleteID.replace(".", "_");
			return epName;
		} else if (eObject instanceof Extension) {

			EObject plugin = ((Extension) eObject).eContainer().eContainer();
			String extensionID = "";
			EList<Extension> extensions = ((Plugin) plugin).getExtensions()
					.getExtensions();
			int i = 0;
			for (Extension extension : extensions) {
				i++;
				String text = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers
						.getLabel(extension);
				Pattern p = Pattern.compile("\\(.+?\\)");
				Matcher m = p.matcher(text);
				if (text != null) {
					if (m.find()) {
						String group = m.group(0);
						String substring = group.substring(1,
								group.length() - 1);
						String replace = text.replace("(no name)", substring);
						text = replace;
					}
					if (extension == ((Extension) eObject))
						extensionID = text + "_" + ((Plugin) plugin).getId()
								+ i;
				}
				String extensionName;
				if (extensionID != "") {
					extensionName = extensionID.replace(".", "_");
					return extensionName;
				}
			}
		} else if (eObject instanceof org.polarsys.kitalpha.pdt.metamodel.model.platform.Package) {
			String packageID = ((org.polarsys.kitalpha.pdt.metamodel.model.platform.Package) eObject).getAbsoluteName();
			String packageName;
			if (packageID != null) {
				packageName = packageID.replace(".", "_");
				return packageName;
			}
		} else if (eObject instanceof Repository) {
			String repoID = ((Repository) eObject).getName();
			String repoName;
			if (repoID != null) {
				repoName = repoID.replace(".", "_");
				return repoName;
			}
		} else if (eObject instanceof EclipseModel) {
			String emID = ((EclipseModel) eObject).getName();
			String emName;
			if (emID != null) {
				emName = emID.replace(".", "_");
				return emName;
			}
		}
		return "Object not found";
	}
}
