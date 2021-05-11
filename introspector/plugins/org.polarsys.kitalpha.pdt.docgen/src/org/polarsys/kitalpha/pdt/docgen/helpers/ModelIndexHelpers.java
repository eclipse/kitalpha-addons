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

import java.util.List;

import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class ModelIndexHelpers {
	
	private ModelIndexHelpers() {}
	
	/**
	 * @deprecated will be made private in a future major version
	 */
	@Deprecated
	public static int i = 1;
	public static final StringBuilder stringBuilder = new StringBuilder();

	public static String getModelIndexContent(String fileName, List<String> domainList) {
		return getModelIndexContent(null, fileName, domainList);
	}
	
	/**
	 * @deprecated
	 * @param rootModel
	 * @param fileName
	 * @param domainList
	 * @return
	 */
	@Deprecated
	public static String getModelIndexContent(EclipseModel rootModel,
			String fileName, List<String> domainList) {

		stringBuilder.append("<li>");
		stringBuilder.append("<div style=\"float:left; margin-left:5px; font-size:12px; font-family:Arial\">");

		for (String domain : domainList) {
			stringBuilder.append("<a href=\"" + domain + "/" + fileName
					+ ".html\" target=\"_top\">" + fileName + "</a>");
		}
		stringBuilder.append("</div>");
		stringBuilder.append("</li>");

		return stringBuilder.toString();
	}

	public static void clearModelIndexBuffer(int modelsNumber) {
		if (modelsNumber == i) {
			stringBuilder.setLength(0);
			i = 0;
		}
		i++;
	}
}
