/*******************************************************************************
 * Copyright (c) 2016, 2021 Thales Global Services S.A.S.
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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Package;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.util.PlatformSwitch;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class ObjectHelpers implements IFileNameService {
	
	int index = 0;
	
	public String getFileName(Plugin eObject) {
		String pluginID = eObject.getId();
		return pluginID.replace(".", "_");
	}
	
	public String getFileName(Feature eObject) {
		String featureID = eObject.getId();
		return featureID.replace(".", "_");
	}
	
	public String getFileName(ExtensionPoint eObject) {
		String epCompleteID = eObject.getId();
		return epCompleteID.replace(".", "_");
	}
	
	public String getFileName(Extension eObject) {
		EObject plugin = eObject.eContainer().eContainer();
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
				if (extension == eObject)
					extensionID = text + "_" + ((Plugin) plugin).getId()
							+ i;
			}
			String extensionName;
			if (!extensionID.equals("")) {
				extensionName = extensionID.replace(".", "_");
				return extensionName;
			}
		}
		return null;
	}
	
	public String getFileName(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package eObject) {
		String packageID = eObject.getAbsoluteName();
		String packageName;
		if (packageID != null) {
			packageName = packageID.replace(".", "_");
			return packageName;
		}
		return null;
	}
	
	public String getFileName(Repository eObject) {
		String repoID = eObject.getName();
		String repoName;
		if (repoID != null) {
			repoName = repoID.replace(".", "_");
			return repoName;
		}
		return null;
	}
	
	public String getFileName(EclipseModel eObject) {
		String emID = eObject.getName();
		String emName;
		if (emID != null) {
			emName = emID.replace(".", "_");
			return emName;
		}
		return null;
	}

	@Override
	public String getFileName(EObject eObject) {
		FileNameSwitch fileNameSwitch = new FileNameSwitch();
		String result = fileNameSwitch.doSwitch(eObject);
		if (result == null) {
			result = "Object not found";
		}
		return result;
	}
	
	class FileNameSwitch extends PlatformSwitch<String> {
		
		@Override
		public String casePlugin(Plugin object) {
			return getFileName(object);
		}
		
		@Override
		public String caseFeature(Feature object) {
			return getFileName(object);
		}
		
		@Override
		public String caseExtensionPoint(ExtensionPoint object) {
			return getFileName(object);
		}
		
		@Override
		public String caseExtension(Extension object) {
			return getFileName(object);
		}
		
		@Override
		public String casePackage(Package object) {
			return getFileName(object);
		}
		
		@Override
		public String caseRepository(Repository object) {
			return getFileName(object);
		}
		
		@Override
		public String caseEclipseModel(EclipseModel object) {
			return getFileName(object);
		}
	}
}
