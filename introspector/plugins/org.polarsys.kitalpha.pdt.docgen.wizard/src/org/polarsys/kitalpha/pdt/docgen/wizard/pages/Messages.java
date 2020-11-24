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
package org.polarsys.kitalpha.pdt.docgen.wizard.pages;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.pdt.docgen.wizard.pages.messages"; //$NON-NLS-1$



	public static String PageTitle;
	public static String PageDescription;

	// first group
	public static String SpecificationsGroupLabel;
	public static String SpecificationsCurrentFolderRadioButtonLabel;
	public static String SpecificationsSpecifiedRadioButtonLabel;
	
	public static String SpecificationsCurrentFolderRadioButtonTooltip;
	public static String SpecificationsSpecifiedRadioButtonTooltip;
	

	// second group
	public static String ResultsGroup;
	public static String ResultsDiagramsInclusionsRadioButton;
	public static String ResultsGenerationOfRelatedModelsRadioButton;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}

}
