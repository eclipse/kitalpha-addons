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

import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class FeatureInclusionsComparator implements
		Comparator<FeatureInclusion> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(FeatureInclusion left, FeatureInclusion right) {
		int idComparisonResult = (left.getIncludedFeature().getId())
				.compareTo(right.getIncludedFeature().getId());
		if (idComparisonResult == 0) {
			int versionComparisonResult = (left.getIncludedFeature()
					.getVersion()).compareTo(right.getIncludedFeature()
					.getVersion());
			return versionComparisonResult;
		}
		return idComparisonResult;
	}

}
