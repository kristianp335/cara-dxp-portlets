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

package com.liferay.unilever.demo.cara.tasks.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Tasks}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tasks
 * @generated
 */
@ProviderType
public class TasksWrapper implements Tasks, ModelWrapper<Tasks> {
	public TasksWrapper(Tasks tasks) {
		_tasks = tasks;
	}

	@Override
	public Class<?> getModelClass() {
		return Tasks.class;
	}

	@Override
	public String getModelClassName() {
		return Tasks.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("taskId", getTaskId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("jobId", getJobId());
		attributes.put("taskname", getTaskname());
		attributes.put("taskStatus", getTaskStatus());
		attributes.put("completeDate", getCompleteDate());
		attributes.put("userAssigned", getUserAssigned());
		attributes.put("superAssigned", getSuperAssigned());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long taskId = (Long)attributes.get("taskId");

		if (taskId != null) {
			setTaskId(taskId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long jobId = (Long)attributes.get("jobId");

		if (jobId != null) {
			setJobId(jobId);
		}

		String taskname = (String)attributes.get("taskname");

		if (taskname != null) {
			setTaskname(taskname);
		}

		Long taskStatus = (Long)attributes.get("taskStatus");

		if (taskStatus != null) {
			setTaskStatus(taskStatus);
		}

		Date completeDate = (Date)attributes.get("completeDate");

		if (completeDate != null) {
			setCompleteDate(completeDate);
		}

		Long userAssigned = (Long)attributes.get("userAssigned");

		if (userAssigned != null) {
			setUserAssigned(userAssigned);
		}

		Long superAssigned = (Long)attributes.get("superAssigned");

		if (superAssigned != null) {
			setSuperAssigned(superAssigned);
		}
	}

	@Override
	public Tasks toEscapedModel() {
		return new TasksWrapper(_tasks.toEscapedModel());
	}

	@Override
	public Tasks toUnescapedModel() {
		return new TasksWrapper(_tasks.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _tasks.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tasks.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tasks.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tasks.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Tasks> toCacheModel() {
		return _tasks.toCacheModel();
	}

	@Override
	public int compareTo(Tasks tasks) {
		return _tasks.compareTo(tasks);
	}

	@Override
	public int hashCode() {
		return _tasks.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tasks.getPrimaryKeyObj();
	}

	/**
	* Returns the job ID of this tasks.
	*
	* @return the job ID of this tasks
	*/
	@Override
	public java.lang.Long getJobId() {
		return _tasks.getJobId();
	}

	@Override
	public java.lang.Object clone() {
		return new TasksWrapper((Tasks)_tasks.clone());
	}

	/**
	* Returns the taskname of this tasks.
	*
	* @return the taskname of this tasks
	*/
	@Override
	public java.lang.String getTaskname() {
		return _tasks.getTaskname();
	}

	/**
	* Returns the user name of this tasks.
	*
	* @return the user name of this tasks
	*/
	@Override
	public java.lang.String getUserName() {
		return _tasks.getUserName();
	}

	/**
	* Returns the user uuid of this tasks.
	*
	* @return the user uuid of this tasks
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _tasks.getUserUuid();
	}

	/**
	* Returns the uuid of this tasks.
	*
	* @return the uuid of this tasks
	*/
	@Override
	public java.lang.String getUuid() {
		return _tasks.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _tasks.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tasks.toXmlString();
	}

	/**
	* Returns the complete date of this tasks.
	*
	* @return the complete date of this tasks
	*/
	@Override
	public Date getCompleteDate() {
		return _tasks.getCompleteDate();
	}

	/**
	* Returns the create date of this tasks.
	*
	* @return the create date of this tasks
	*/
	@Override
	public Date getCreateDate() {
		return _tasks.getCreateDate();
	}

	/**
	* Returns the modified date of this tasks.
	*
	* @return the modified date of this tasks
	*/
	@Override
	public Date getModifiedDate() {
		return _tasks.getModifiedDate();
	}

	/**
	* Returns the company ID of this tasks.
	*
	* @return the company ID of this tasks
	*/
	@Override
	public long getCompanyId() {
		return _tasks.getCompanyId();
	}

	/**
	* Returns the group ID of this tasks.
	*
	* @return the group ID of this tasks
	*/
	@Override
	public long getGroupId() {
		return _tasks.getGroupId();
	}

	/**
	* Returns the primary key of this tasks.
	*
	* @return the primary key of this tasks
	*/
	@Override
	public long getPrimaryKey() {
		return _tasks.getPrimaryKey();
	}

	/**
	* Returns the super assigned of this tasks.
	*
	* @return the super assigned of this tasks
	*/
	@Override
	public long getSuperAssigned() {
		return _tasks.getSuperAssigned();
	}

	/**
	* Returns the task ID of this tasks.
	*
	* @return the task ID of this tasks
	*/
	@Override
	public long getTaskId() {
		return _tasks.getTaskId();
	}

	/**
	* Returns the task status of this tasks.
	*
	* @return the task status of this tasks
	*/
	@Override
	public long getTaskStatus() {
		return _tasks.getTaskStatus();
	}

	/**
	* Returns the user assigned of this tasks.
	*
	* @return the user assigned of this tasks
	*/
	@Override
	public long getUserAssigned() {
		return _tasks.getUserAssigned();
	}

	/**
	* Returns the user ID of this tasks.
	*
	* @return the user ID of this tasks
	*/
	@Override
	public long getUserId() {
		return _tasks.getUserId();
	}

	@Override
	public void persist() {
		_tasks.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tasks.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this tasks.
	*
	* @param companyId the company ID of this tasks
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tasks.setCompanyId(companyId);
	}

	/**
	* Sets the complete date of this tasks.
	*
	* @param completeDate the complete date of this tasks
	*/
	@Override
	public void setCompleteDate(Date completeDate) {
		_tasks.setCompleteDate(completeDate);
	}

	/**
	* Sets the create date of this tasks.
	*
	* @param createDate the create date of this tasks
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_tasks.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tasks.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tasks.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tasks.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this tasks.
	*
	* @param groupId the group ID of this tasks
	*/
	@Override
	public void setGroupId(long groupId) {
		_tasks.setGroupId(groupId);
	}

	/**
	* Sets the job ID of this tasks.
	*
	* @param jobId the job ID of this tasks
	*/
	@Override
	public void setJobId(java.lang.Long jobId) {
		_tasks.setJobId(jobId);
	}

	/**
	* Sets the modified date of this tasks.
	*
	* @param modifiedDate the modified date of this tasks
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_tasks.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_tasks.setNew(n);
	}

	/**
	* Sets the primary key of this tasks.
	*
	* @param primaryKey the primary key of this tasks
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tasks.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tasks.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the super assigned of this tasks.
	*
	* @param superAssigned the super assigned of this tasks
	*/
	@Override
	public void setSuperAssigned(long superAssigned) {
		_tasks.setSuperAssigned(superAssigned);
	}

	/**
	* Sets the task ID of this tasks.
	*
	* @param taskId the task ID of this tasks
	*/
	@Override
	public void setTaskId(long taskId) {
		_tasks.setTaskId(taskId);
	}

	/**
	* Sets the task status of this tasks.
	*
	* @param taskStatus the task status of this tasks
	*/
	@Override
	public void setTaskStatus(long taskStatus) {
		_tasks.setTaskStatus(taskStatus);
	}

	/**
	* Sets the taskname of this tasks.
	*
	* @param taskname the taskname of this tasks
	*/
	@Override
	public void setTaskname(java.lang.String taskname) {
		_tasks.setTaskname(taskname);
	}

	/**
	* Sets the user assigned of this tasks.
	*
	* @param userAssigned the user assigned of this tasks
	*/
	@Override
	public void setUserAssigned(long userAssigned) {
		_tasks.setUserAssigned(userAssigned);
	}

	/**
	* Sets the user ID of this tasks.
	*
	* @param userId the user ID of this tasks
	*/
	@Override
	public void setUserId(long userId) {
		_tasks.setUserId(userId);
	}

	/**
	* Sets the user name of this tasks.
	*
	* @param userName the user name of this tasks
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_tasks.setUserName(userName);
	}

	/**
	* Sets the user uuid of this tasks.
	*
	* @param userUuid the user uuid of this tasks
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_tasks.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this tasks.
	*
	* @param uuid the uuid of this tasks
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_tasks.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TasksWrapper)) {
			return false;
		}

		TasksWrapper tasksWrapper = (TasksWrapper)obj;

		if (Objects.equals(_tasks, tasksWrapper._tasks)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _tasks.getStagedModelType();
	}

	@Override
	public Tasks getWrappedModel() {
		return _tasks;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tasks.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tasks.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tasks.resetOriginalValues();
	}

	private final Tasks _tasks;
}