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

package com.liferay.unilever.demo.cara.tasks.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TasksService}.
 *
 * @author Brian Wing Shun Chan
 * @see TasksService
 * @generated
 */
@ProviderType
public class TasksServiceWrapper implements TasksService,
	ServiceWrapper<TasksService> {
	public TasksServiceWrapper(TasksService tasksService) {
		_tasksService = tasksService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tasksService.getOSGiServiceIdentifier();
	}

	@Override
	public TasksService getWrappedService() {
		return _tasksService;
	}

	@Override
	public void setWrappedService(TasksService tasksService) {
		_tasksService = tasksService;
	}

	private TasksService _tasksService;
}