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
package org.polarsys.kitalpha.pdt.introspector.core.comparators;

import java.util.Comparator;

import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency;


/**
 * 
 * @author Xavier DECOOL
 *
 */
public class PluginFeatureDependenciesComparator implements
		Comparator<FeatureToPluginDependency> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(FeatureToPluginDependency left,
			FeatureToPluginDependency right) {
		int idComparisonResult = (left.getTarget().getId()).compareTo(right
				.getTarget().getId());
		if (idComparisonResult == 0) {
			int versionComparisonResult = (left.getTarget().getVersion())
					.compareTo(right.getTarget().getVersion());
			return versionComparisonResult;
		}
		return idComparisonResult;
	}

}
