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

package com.liferay.unilever.demo.cara.taskdetails.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the TaskDetails service. Represents a row in the &quot;Cara_TaskDetails&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TaskDetailsModel
 * @see com.liferay.unilever.demo.cara.taskdetails.model.impl.TaskDetailsImpl
 * @see com.liferay.unilever.demo.cara.taskdetails.model.impl.TaskDetailsModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.unilever.demo.cara.taskdetails.model.impl.TaskDetailsImpl")
@ProviderType
public interface TaskDetails extends TaskDetailsModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.unilever.demo.cara.taskdetails.model.impl.TaskDetailsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TaskDetails, Long> TASK_DETAILS_ID_ACCESSOR = new Accessor<TaskDetails, Long>() {
			@Override
			public Long get(TaskDetails taskDetails) {
				return taskDetails.getTaskDetailsId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TaskDetails> getTypeClass() {
				return TaskDetails.class;
			}
		};
}