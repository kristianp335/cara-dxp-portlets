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

package com.liferay.unilever.demo.cara.taskdetails.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TaskDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TaskDetailsLocalService
 * @generated
 */
@ProviderType
public class TaskDetailsLocalServiceWrapper implements TaskDetailsLocalService,
	ServiceWrapper<TaskDetailsLocalService> {
	public TaskDetailsLocalServiceWrapper(
		TaskDetailsLocalService taskDetailsLocalService) {
		_taskDetailsLocalService = taskDetailsLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _taskDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _taskDetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _taskDetailsLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _taskDetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _taskDetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _taskDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the task details to the database. Also notifies the appropriate model listeners.
	*
	* @param taskDetails the task details
	* @return the task details that was added
	*/
	@Override
	public com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails addTaskDetails(
		com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails taskDetails) {
		return _taskDetailsLocalService.addTaskDetails(taskDetails);
	}

	/**
	* Creates a new task details with the primary key. Does not add the task details to the database.
	*
	* @param taskDetailsId the primary key for the new task details
	* @return the new task details
	*/
	@Override
	public com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails createTaskDetails(
		long taskDetailsId) {
		return _taskDetailsLocalService.createTaskDetails(taskDetailsId);
	}

	/**
	* Deletes the task details from the database. Also notifies the appropriate model listeners.
	*
	* @param taskDetails the task details
	* @return the task details that was removed
	*/
	@Override
	public com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails deleteTaskDetails(
		com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails taskDetails) {
		return _taskDetailsLocalService.deleteTaskDetails(taskDetails);
	}

	/**
	* Deletes the task details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskDetailsId the primary key of the task details
	* @return the task details that was removed
	* @throws PortalException if a task details with the primary key could not be found
	*/
	@Override
	public com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails deleteTaskDetails(
		long taskDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _taskDetailsLocalService.deleteTaskDetails(taskDetailsId);
	}

	@Override
	public com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails fetchTaskDetails(
		long taskDetailsId) {
		return _taskDetailsLocalService.fetchTaskDetails(taskDetailsId);
	}

	/**
	* Returns the task details matching the UUID and group.
	*
	* @param uuid the task details's UUID
	* @param groupId the primary key of the group
	* @return the matching task details, or <code>null</code> if a matching task details could not be found
	*/
	@Override
	public com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails fetchTaskDetailsByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _taskDetailsLocalService.fetchTaskDetailsByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the task details with the primary key.
	*
	* @param taskDetailsId the primary key of the task details
	* @return the task details
	* @throws PortalException if a task details with the primary key could not be found
	*/
	@Override
	public com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails getTaskDetails(
		long taskDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _taskDetailsLocalService.getTaskDetails(taskDetailsId);
	}

	/**
	* Returns the task details matching the UUID and group.
	*
	* @param uuid the task details's UUID
	* @param groupId the primary key of the group
	* @return the matching task details
	* @throws PortalException if a matching task details could not be found
	*/
	@Override
	public com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails getTaskDetailsByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _taskDetailsLocalService.getTaskDetailsByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the task details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param taskDetails the task details
	* @return the task details that was updated
	*/
	@Override
	public com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails updateTaskDetails(
		com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails taskDetails) {
		return _taskDetailsLocalService.updateTaskDetails(taskDetails);
	}

	/**
	* Returns the number of task detailses.
	*
	* @return the number of task detailses
	*/
	@Override
	public int getTaskDetailsesCount() {
		return _taskDetailsLocalService.getTaskDetailsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _taskDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _taskDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.taskdetails.model.impl.TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _taskDetailsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.taskdetails.model.impl.TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _taskDetailsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the task detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.taskdetails.model.impl.TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @return the range of task detailses
	*/
	@Override
	public java.util.List<com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails> getTaskDetailses(
		int start, int end) {
		return _taskDetailsLocalService.getTaskDetailses(start, end);
	}

	/**
	* Returns all the task detailses matching the UUID and company.
	*
	* @param uuid the UUID of the task detailses
	* @param companyId the primary key of the company
	* @return the matching task detailses, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails> getTaskDetailsesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _taskDetailsLocalService.getTaskDetailsesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of task detailses matching the UUID and company.
	*
	* @param uuid the UUID of the task detailses
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching task detailses, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails> getTaskDetailsesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails> orderByComparator) {
		return _taskDetailsLocalService.getTaskDetailsesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _taskDetailsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _taskDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public TaskDetailsLocalService getWrappedService() {
		return _taskDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		TaskDetailsLocalService taskDetailsLocalService) {
		_taskDetailsLocalService = taskDetailsLocalService;
	}

	private TaskDetailsLocalService _taskDetailsLocalService;
}