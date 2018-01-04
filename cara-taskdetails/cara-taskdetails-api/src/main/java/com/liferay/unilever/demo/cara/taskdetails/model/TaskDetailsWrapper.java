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
 * This class is a wrapper for {@link TaskDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TaskDetails
 * @generated
 */
@ProviderType
public class TaskDetailsWrapper implements TaskDetails,
	ModelWrapper<TaskDetails> {
	public TaskDetailsWrapper(TaskDetails taskDetails) {
		_taskDetails = taskDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return TaskDetails.class;
	}

	@Override
	public String getModelClassName() {
		return TaskDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("taskDetailsId", getTaskDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("jobId", getJobId());
		attributes.put("taskId", getTaskId());
		attributes.put("fileUrl", getFileUrl());
		attributes.put("fileId", getFileId());
		attributes.put("productDetails", getProductDetails());
		attributes.put("whyUse", getWhyUse());
		attributes.put("howToUse", getHowToUse());
		attributes.put("howItWorks", getHowItWorks());
		attributes.put("expertTips", getExpertTips());
		attributes.put("approvedBy", getApprovedBy());
		attributes.put("approved", getApproved());
		attributes.put("comments", getComments());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long taskDetailsId = (Long)attributes.get("taskDetailsId");

		if (taskDetailsId != null) {
			setTaskDetailsId(taskDetailsId);
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

		Long taskId = (Long)attributes.get("taskId");

		if (taskId != null) {
			setTaskId(taskId);
		}

		String fileUrl = (String)attributes.get("fileUrl");

		if (fileUrl != null) {
			setFileUrl(fileUrl);
		}

		Long fileId = (Long)attributes.get("fileId");

		if (fileId != null) {
			setFileId(fileId);
		}

		String productDetails = (String)attributes.get("productDetails");

		if (productDetails != null) {
			setProductDetails(productDetails);
		}

		String whyUse = (String)attributes.get("whyUse");

		if (whyUse != null) {
			setWhyUse(whyUse);
		}

		String howToUse = (String)attributes.get("howToUse");

		if (howToUse != null) {
			setHowToUse(howToUse);
		}

		String howItWorks = (String)attributes.get("howItWorks");

		if (howItWorks != null) {
			setHowItWorks(howItWorks);
		}

		String expertTips = (String)attributes.get("expertTips");

		if (expertTips != null) {
			setExpertTips(expertTips);
		}

		Long approvedBy = (Long)attributes.get("approvedBy");

		if (approvedBy != null) {
			setApprovedBy(approvedBy);
		}

		Boolean approved = (Boolean)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}
	}

	@Override
	public TaskDetails toEscapedModel() {
		return new TaskDetailsWrapper(_taskDetails.toEscapedModel());
	}

	@Override
	public TaskDetails toUnescapedModel() {
		return new TaskDetailsWrapper(_taskDetails.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _taskDetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _taskDetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _taskDetails.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _taskDetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<TaskDetails> toCacheModel() {
		return _taskDetails.toCacheModel();
	}

	@Override
	public int compareTo(TaskDetails taskDetails) {
		return _taskDetails.compareTo(taskDetails);
	}

	@Override
	public int hashCode() {
		return _taskDetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _taskDetails.getPrimaryKeyObj();
	}

	/**
	* Returns the approved of this task details.
	*
	* @return the approved of this task details
	*/
	@Override
	public java.lang.Boolean getApproved() {
		return _taskDetails.getApproved();
	}

	@Override
	public java.lang.Object clone() {
		return new TaskDetailsWrapper((TaskDetails)_taskDetails.clone());
	}

	/**
	* Returns the comments of this task details.
	*
	* @return the comments of this task details
	*/
	@Override
	public java.lang.String getComments() {
		return _taskDetails.getComments();
	}

	/**
	* Returns the expert tips of this task details.
	*
	* @return the expert tips of this task details
	*/
	@Override
	public java.lang.String getExpertTips() {
		return _taskDetails.getExpertTips();
	}

	/**
	* Returns the file url of this task details.
	*
	* @return the file url of this task details
	*/
	@Override
	public java.lang.String getFileUrl() {
		return _taskDetails.getFileUrl();
	}

	/**
	* Returns the how it works of this task details.
	*
	* @return the how it works of this task details
	*/
	@Override
	public java.lang.String getHowItWorks() {
		return _taskDetails.getHowItWorks();
	}

	/**
	* Returns the how to use of this task details.
	*
	* @return the how to use of this task details
	*/
	@Override
	public java.lang.String getHowToUse() {
		return _taskDetails.getHowToUse();
	}

	/**
	* Returns the product details of this task details.
	*
	* @return the product details of this task details
	*/
	@Override
	public java.lang.String getProductDetails() {
		return _taskDetails.getProductDetails();
	}

	/**
	* Returns the user name of this task details.
	*
	* @return the user name of this task details
	*/
	@Override
	public java.lang.String getUserName() {
		return _taskDetails.getUserName();
	}

	/**
	* Returns the user uuid of this task details.
	*
	* @return the user uuid of this task details
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _taskDetails.getUserUuid();
	}

	/**
	* Returns the uuid of this task details.
	*
	* @return the uuid of this task details
	*/
	@Override
	public java.lang.String getUuid() {
		return _taskDetails.getUuid();
	}

	/**
	* Returns the why use of this task details.
	*
	* @return the why use of this task details
	*/
	@Override
	public java.lang.String getWhyUse() {
		return _taskDetails.getWhyUse();
	}

	@Override
	public java.lang.String toString() {
		return _taskDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _taskDetails.toXmlString();
	}

	/**
	* Returns the create date of this task details.
	*
	* @return the create date of this task details
	*/
	@Override
	public Date getCreateDate() {
		return _taskDetails.getCreateDate();
	}

	/**
	* Returns the modified date of this task details.
	*
	* @return the modified date of this task details
	*/
	@Override
	public Date getModifiedDate() {
		return _taskDetails.getModifiedDate();
	}

	/**
	* Returns the approved by of this task details.
	*
	* @return the approved by of this task details
	*/
	@Override
	public long getApprovedBy() {
		return _taskDetails.getApprovedBy();
	}

	/**
	* Returns the company ID of this task details.
	*
	* @return the company ID of this task details
	*/
	@Override
	public long getCompanyId() {
		return _taskDetails.getCompanyId();
	}

	/**
	* Returns the file ID of this task details.
	*
	* @return the file ID of this task details
	*/
	@Override
	public long getFileId() {
		return _taskDetails.getFileId();
	}

	/**
	* Returns the group ID of this task details.
	*
	* @return the group ID of this task details
	*/
	@Override
	public long getGroupId() {
		return _taskDetails.getGroupId();
	}

	/**
	* Returns the job ID of this task details.
	*
	* @return the job ID of this task details
	*/
	@Override
	public long getJobId() {
		return _taskDetails.getJobId();
	}

	/**
	* Returns the primary key of this task details.
	*
	* @return the primary key of this task details
	*/
	@Override
	public long getPrimaryKey() {
		return _taskDetails.getPrimaryKey();
	}

	/**
	* Returns the task details ID of this task details.
	*
	* @return the task details ID of this task details
	*/
	@Override
	public long getTaskDetailsId() {
		return _taskDetails.getTaskDetailsId();
	}

	/**
	* Returns the task ID of this task details.
	*
	* @return the task ID of this task details
	*/
	@Override
	public long getTaskId() {
		return _taskDetails.getTaskId();
	}

	/**
	* Returns the user ID of this task details.
	*
	* @return the user ID of this task details
	*/
	@Override
	public long getUserId() {
		return _taskDetails.getUserId();
	}

	@Override
	public void persist() {
		_taskDetails.persist();
	}

	/**
	* Sets the approved of this task details.
	*
	* @param approved the approved of this task details
	*/
	@Override
	public void setApproved(java.lang.Boolean approved) {
		_taskDetails.setApproved(approved);
	}

	/**
	* Sets the approved by of this task details.
	*
	* @param approvedBy the approved by of this task details
	*/
	@Override
	public void setApprovedBy(long approvedBy) {
		_taskDetails.setApprovedBy(approvedBy);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_taskDetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the comments of this task details.
	*
	* @param comments the comments of this task details
	*/
	@Override
	public void setComments(java.lang.String comments) {
		_taskDetails.setComments(comments);
	}

	/**
	* Sets the company ID of this task details.
	*
	* @param companyId the company ID of this task details
	*/
	@Override
	public void setCompanyId(long companyId) {
		_taskDetails.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this task details.
	*
	* @param createDate the create date of this task details
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_taskDetails.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_taskDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_taskDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_taskDetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expert tips of this task details.
	*
	* @param expertTips the expert tips of this task details
	*/
	@Override
	public void setExpertTips(java.lang.String expertTips) {
		_taskDetails.setExpertTips(expertTips);
	}

	/**
	* Sets the file ID of this task details.
	*
	* @param fileId the file ID of this task details
	*/
	@Override
	public void setFileId(long fileId) {
		_taskDetails.setFileId(fileId);
	}

	/**
	* Sets the file url of this task details.
	*
	* @param fileUrl the file url of this task details
	*/
	@Override
	public void setFileUrl(java.lang.String fileUrl) {
		_taskDetails.setFileUrl(fileUrl);
	}

	/**
	* Sets the group ID of this task details.
	*
	* @param groupId the group ID of this task details
	*/
	@Override
	public void setGroupId(long groupId) {
		_taskDetails.setGroupId(groupId);
	}

	/**
	* Sets the how it works of this task details.
	*
	* @param howItWorks the how it works of this task details
	*/
	@Override
	public void setHowItWorks(java.lang.String howItWorks) {
		_taskDetails.setHowItWorks(howItWorks);
	}

	/**
	* Sets the how to use of this task details.
	*
	* @param howToUse the how to use of this task details
	*/
	@Override
	public void setHowToUse(java.lang.String howToUse) {
		_taskDetails.setHowToUse(howToUse);
	}

	/**
	* Sets the job ID of this task details.
	*
	* @param jobId the job ID of this task details
	*/
	@Override
	public void setJobId(long jobId) {
		_taskDetails.setJobId(jobId);
	}

	/**
	* Sets the modified date of this task details.
	*
	* @param modifiedDate the modified date of this task details
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_taskDetails.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_taskDetails.setNew(n);
	}

	/**
	* Sets the primary key of this task details.
	*
	* @param primaryKey the primary key of this task details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_taskDetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_taskDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product details of this task details.
	*
	* @param productDetails the product details of this task details
	*/
	@Override
	public void setProductDetails(java.lang.String productDetails) {
		_taskDetails.setProductDetails(productDetails);
	}

	/**
	* Sets the task details ID of this task details.
	*
	* @param taskDetailsId the task details ID of this task details
	*/
	@Override
	public void setTaskDetailsId(long taskDetailsId) {
		_taskDetails.setTaskDetailsId(taskDetailsId);
	}

	/**
	* Sets the task ID of this task details.
	*
	* @param taskId the task ID of this task details
	*/
	@Override
	public void setTaskId(long taskId) {
		_taskDetails.setTaskId(taskId);
	}

	/**
	* Sets the user ID of this task details.
	*
	* @param userId the user ID of this task details
	*/
	@Override
	public void setUserId(long userId) {
		_taskDetails.setUserId(userId);
	}

	/**
	* Sets the user name of this task details.
	*
	* @param userName the user name of this task details
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_taskDetails.setUserName(userName);
	}

	/**
	* Sets the user uuid of this task details.
	*
	* @param userUuid the user uuid of this task details
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_taskDetails.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this task details.
	*
	* @param uuid the uuid of this task details
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_taskDetails.setUuid(uuid);
	}

	/**
	* Sets the why use of this task details.
	*
	* @param whyUse the why use of this task details
	*/
	@Override
	public void setWhyUse(java.lang.String whyUse) {
		_taskDetails.setWhyUse(whyUse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaskDetailsWrapper)) {
			return false;
		}

		TaskDetailsWrapper taskDetailsWrapper = (TaskDetailsWrapper)obj;

		if (Objects.equals(_taskDetails, taskDetailsWrapper._taskDetails)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _taskDetails.getStagedModelType();
	}

	@Override
	public TaskDetails getWrappedModel() {
		return _taskDetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _taskDetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _taskDetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_taskDetails.resetOriginalValues();
	}

	private final TaskDetails _taskDetails;
}