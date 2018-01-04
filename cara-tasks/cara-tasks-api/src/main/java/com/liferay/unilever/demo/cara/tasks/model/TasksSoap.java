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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.unilever.demo.cara.tasks.service.http.TasksServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.unilever.demo.cara.tasks.service.http.TasksServiceSoap
 * @generated
 */
@ProviderType
public class TasksSoap implements Serializable {
	public static TasksSoap toSoapModel(Tasks model) {
		TasksSoap soapModel = new TasksSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTaskId(model.getTaskId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setJobId(model.getJobId());
		soapModel.setTaskname(model.getTaskname());
		soapModel.setTaskStatus(model.getTaskStatus());
		soapModel.setCompleteDate(model.getCompleteDate());
		soapModel.setUserAssigned(model.getUserAssigned());
		soapModel.setSuperAssigned(model.getSuperAssigned());

		return soapModel;
	}

	public static TasksSoap[] toSoapModels(Tasks[] models) {
		TasksSoap[] soapModels = new TasksSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TasksSoap[][] toSoapModels(Tasks[][] models) {
		TasksSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TasksSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TasksSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TasksSoap[] toSoapModels(List<Tasks> models) {
		List<TasksSoap> soapModels = new ArrayList<TasksSoap>(models.size());

		for (Tasks model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TasksSoap[soapModels.size()]);
	}

	public TasksSoap() {
	}

	public long getPrimaryKey() {
		return _taskId;
	}

	public void setPrimaryKey(long pk) {
		setTaskId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTaskId() {
		return _taskId;
	}

	public void setTaskId(long taskId) {
		_taskId = taskId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Long getJobId() {
		return _jobId;
	}

	public void setJobId(Long jobId) {
		_jobId = jobId;
	}

	public String getTaskname() {
		return _taskname;
	}

	public void setTaskname(String taskname) {
		_taskname = taskname;
	}

	public long getTaskStatus() {
		return _taskStatus;
	}

	public void setTaskStatus(long taskStatus) {
		_taskStatus = taskStatus;
	}

	public Date getCompleteDate() {
		return _completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		_completeDate = completeDate;
	}

	public long getUserAssigned() {
		return _userAssigned;
	}

	public void setUserAssigned(long userAssigned) {
		_userAssigned = userAssigned;
	}

	public long getSuperAssigned() {
		return _superAssigned;
	}

	public void setSuperAssigned(long superAssigned) {
		_superAssigned = superAssigned;
	}

	private String _uuid;
	private long _taskId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Long _jobId;
	private String _taskname;
	private long _taskStatus;
	private Date _completeDate;
	private long _userAssigned;
	private long _superAssigned;
}