/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.introspector.ui.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;
import org.polarsys.kitalpha.pdt.introspector.preferences.utils.IntrospectorPreferenceUtils;
import org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.LoadingResourceReuseDialog;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class ResourceReuseSettingsDialog extends LoadingResourceReuseDialog {

	private SearchCriteria criteria;
	
	
	public ResourceReuseSettingsDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.MAX | SWT.RESIZE);
	}
	
	public SearchCriteria getCriteria(){
		return criteria;
	}
	
	@Override
	protected void okPressed() {
		TableItem[] resultTableSelection = super.resultsTable.getSelection();
		
		for (TableItem currentItem : resultTableSelection) {
			criteria = (SearchCriteria) currentItem
					.getData();
			IntrospectorPreferenceUtils.setCriteria(criteria);
		}
		super.okPressed();
	}
}

