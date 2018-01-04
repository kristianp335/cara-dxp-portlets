/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package cara.jobs.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Jobs service. Represents a row in the &quot;Jobs_Jobs&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JobsModel
 * @see cara.jobs.model.impl.JobsImpl
 * @see cara.jobs.model.impl.JobsModelImpl
 * @generated
 */
@ImplementationClassName("cara.jobs.model.impl.JobsImpl")
@ProviderType
public interface Jobs extends JobsModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link cara.jobs.model.impl.JobsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Jobs, Long> JOB_ID_ACCESSOR = new Accessor<Jobs, Long>() {
			@Override
			public Long get(Jobs jobs) {
				return jobs.getJobId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Jobs> getTypeClass() {
				return Jobs.class;
			}
		};
}