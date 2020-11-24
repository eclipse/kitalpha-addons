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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IdentifiedElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.NamedElement;
import org.polarsys.kitalpha.pdt.modeler.utils.services.IntrospectionServices;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class Helpers {
	
	private static boolean diagramsInclusion;
	
	public static boolean diagramsInclusionIsChecked(){
		return diagramsInclusion;
	}
	
	public static void setDiagramsInclusion(boolean dInclusion){
		diagramsInclusion = dInclusion;
	}

	public static String getLabel(EclipseElement element) {
		String label = "";
		if (element instanceof NamedElement) {
			label = ((NamedElement) element).getName();
		} else if (element instanceof Extension) {
			label = IntrospectionServices.getLabelForGivenExtension((Extension) element);
		} else {
			if (element instanceof IdentifiedElement) {
				label = ((IdentifiedElement) element).getId();
			} else {
				EClass eClass = element.eClass();
				if (eClass != null) {
					String name = eClass.getName();
					if (name != null) {
						label = name;
					}
				}
			}
		}
		return label;
	}

	public static String getTypeHyperLink(EclipseElement element, String content) {
		StringBuffer buffer = new StringBuffer();
		String modelName = "";
		ObjectHelpers oh = new ObjectHelpers();
		if (element != null) {
			if (element.eResource() != null) {
				EObject root = element.eResource().getContents().get(0);
				if (root instanceof EclipseElement) {
					modelName = LabelProviderHelper.getText(root);
				}
			}
			buffer.append("<a href=\"");
			if (modelName != "") {
				buffer.append("../" + modelName + "/");
			}
			Pattern p = Pattern.compile("\\(.+?\\)");
			String text = oh.getFileName(element);
			Matcher m = p.matcher(oh.getFileName(element));
			if (element instanceof Extension && m.find()) {
				String group = m.group(0);
				String substring = group.substring(1, group.length()-1);
				String replace = text.replace("(no_name)", substring);
				text = replace;
				buffer.append(text);
			} else
				buffer.append(oh.getFileName(element));

			buffer.append(".html\">");
			if (content != null)
				buffer.append(content);
			else
				buffer.append(LabelProviderHelper.getText(element));
			buffer.append("</a>");
		}
		return buffer.toString();
	}

}
