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
package org.polarsys.kitalpha.pdt.introspector.core.comparators;

import java.util.Comparator;

import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;

/**
 * Class that compare plugins, based on id used to class them in alphabetical
 * order
 * 
 * @author Xavier DECOOL
 * 
 */
public class PluginComparator implements Comparator<Plugin> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Plugin left, Plugin right) {
		int idComparisonResult = (left.getId()).compareTo(right.getId());
		if (idComparisonResult==0){
			int versionComparisonResult = (left.getVersion()).compareTo(right.getVersion());
			return versionComparisonResult;
		}
		return idComparisonResult;
	}

}
