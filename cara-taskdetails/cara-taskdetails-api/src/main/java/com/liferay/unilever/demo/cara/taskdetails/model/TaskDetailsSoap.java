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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.unilever.demo.cara.taskdetails.service.http.TaskDetailsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.unilever.demo.cara.taskdetails.service.http.TaskDetailsServiceSoap
 * @generated
 */
@ProviderType
public class TaskDetailsSoap implements Serializable {
	public static TaskDetailsSoap toSoapModel(TaskDetails model) {
		TaskDetailsSoap soapModel = new TaskDetailsSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTaskDetailsId(model.getTaskDetailsId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setJobId(model.getJobId());
		soapModel.setTaskId(model.getTaskId());
		soapModel.setFileUrl(model.getFileUrl());
		soapModel.setFileId(model.getFileId());
		soapModel.setProductDetails(model.getProductDetails());
		soapModel.setWhyUse(model.getWhyUse());
		soapModel.setHowToUse(model.getHowToUse());
		soapModel.setHowItWorks(model.getHowItWorks());
		soapModel.setExpertTips(model.getExpertTips());
		soapModel.setApprovedBy(model.getApprovedBy());
		soapModel.setApproved(model.getApproved());
		soapModel.setComments(model.getComments());

		return soapModel;
	}

	public static TaskDetailsSoap[] toSoapModels(TaskDetails[] models) {
		TaskDetailsSoap[] soapModels = new TaskDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TaskDetailsSoap[][] toSoapModels(TaskDetails[][] models) {
		TaskDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TaskDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TaskDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TaskDetailsSoap[] toSoapModels(List<TaskDetails> models) {
		List<TaskDetailsSoap> soapModels = new ArrayList<TaskDetailsSoap>(models.size());

		for (TaskDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TaskDetailsSoap[soapModels.size()]);
	}

	public TaskDetailsSoap() {
	}

	public long getPrimaryKey() {
		return _taskDetailsId;
	}

	public void setPrimaryKey(long pk) {
		setTaskDetailsId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTaskDetailsId() {
		return _taskDetailsId;
	}

	public void setTaskDetailsId(long taskDetailsId) {
		_taskDetailsId = taskDetailsId;
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

	public long getJobId() {
		return _jobId;
	}

	public void setJobId(long jobId) {
		_jobId = jobId;
	}

	public long getTaskId() {
		return _taskId;
	}

	public void setTaskId(long taskId) {
		_taskId = taskId;
	}

	public String getFileUrl() {
		return _fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		_fileUrl = fileUrl;
	}

	public long getFileId() {
		return _fileId;
	}

	public void setFileId(long fileId) {
		_fileId = fileId;
	}

	public String getProductDetails() {
		return _productDetails;
	}

	public void setProductDetails(String productDetails) {
		_productDetails = productDetails;
	}

	public String getWhyUse() {
		return _whyUse;
	}

	public void setWhyUse(String whyUse) {
		_whyUse = whyUse;
	}

	public String getHowToUse() {
		return _howToUse;
	}

	public void setHowToUse(String howToUse) {
		_howToUse = howToUse;
	}

	public String getHowItWorks() {
		return _howItWorks;
	}

	public void setHowItWorks(String howItWorks) {
		_howItWorks = howItWorks;
	}

	public String getExpertTips() {
		return _expertTips;
	}

	public void setExpertTips(String expertTips) {
		_expertTips = expertTips;
	}

	public long getApprovedBy() {
		return _approvedBy;
	}

	public void setApprovedBy(long approvedBy) {
		_approvedBy = approvedBy;
	}

	public Boolean getApproved() {
		return _approved;
	}

	public void setApproved(Boolean approved) {
		_approved = approved;
	}

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	private String _uuid;
	private long _taskDetailsId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _jobId;
	private long _taskId;
	private String _fileUrl;
	private long _fileId;
	private String _productDetails;
	private String _whyUse;
	private String _howToUse;
	private String _howItWorks;
	private String _expertTips;
	private long _approvedBy;
	private Boolean _approved;
	private String _comments;
}