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

package com.liferay.unilever.demo.cara.taskdetails.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails;
import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetailsModel;
import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetailsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TaskDetails service. Represents a row in the &quot;Cara_TaskDetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link TaskDetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TaskDetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TaskDetailsImpl
 * @see TaskDetails
 * @see TaskDetailsModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class TaskDetailsModelImpl extends BaseModelImpl<TaskDetails>
	implements TaskDetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a task details model instance should use the {@link TaskDetails} interface instead.
	 */
	public static final String TABLE_NAME = "Cara_TaskDetails";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "taskDetailsId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "jobId", Types.BIGINT },
			{ "taskId", Types.BIGINT },
			{ "fileUrl", Types.VARCHAR },
			{ "fileId", Types.BIGINT },
			{ "productDetails", Types.VARCHAR },
			{ "whyUse", Types.VARCHAR },
			{ "howToUse", Types.VARCHAR },
			{ "howItWorks", Types.VARCHAR },
			{ "expertTips", Types.VARCHAR },
			{ "approvedBy", Types.BIGINT },
			{ "approved", Types.BOOLEAN },
			{ "comments", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("taskDetailsId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("jobId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("taskId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fileUrl", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fileId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("productDetails", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("whyUse", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("howToUse", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("howItWorks", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("expertTips", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("approvedBy", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("approved", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("comments", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table Cara_TaskDetails (uuid_ VARCHAR(75) null,taskDetailsId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,jobId LONG,taskId LONG,fileUrl VARCHAR(500) null,fileId LONG,productDetails VARCHAR(1000) null,whyUse VARCHAR(1000) null,howToUse VARCHAR(1000) null,howItWorks VARCHAR(1000) null,expertTips VARCHAR(1000) null,approvedBy LONG,approved BOOLEAN,comments VARCHAR(1000) null)";
	public static final String TABLE_SQL_DROP = "drop table Cara_TaskDetails";
	public static final String ORDER_BY_JPQL = " ORDER BY taskDetails.taskId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Cara_TaskDetails.taskId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.unilever.demo.cara.taskdetails.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.unilever.demo.cara.taskdetails.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.unilever.demo.cara.taskdetails.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long JOBID_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long TASKID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TaskDetails toModel(TaskDetailsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TaskDetails model = new TaskDetailsImpl();

		model.setUuid(soapModel.getUuid());
		model.setTaskDetailsId(soapModel.getTaskDetailsId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setJobId(soapModel.getJobId());
		model.setTaskId(soapModel.getTaskId());
		model.setFileUrl(soapModel.getFileUrl());
		model.setFileId(soapModel.getFileId());
		model.setProductDetails(soapModel.getProductDetails());
		model.setWhyUse(soapModel.getWhyUse());
		model.setHowToUse(soapModel.getHowToUse());
		model.setHowItWorks(soapModel.getHowItWorks());
		model.setExpertTips(soapModel.getExpertTips());
		model.setApprovedBy(soapModel.getApprovedBy());
		model.setApproved(soapModel.getApproved());
		model.setComments(soapModel.getComments());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TaskDetails> toModels(TaskDetailsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TaskDetails> models = new ArrayList<TaskDetails>(soapModels.length);

		for (TaskDetailsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.unilever.demo.cara.taskdetails.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails"));

	public TaskDetailsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _taskDetailsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTaskDetailsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _taskDetailsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getTaskDetailsId() {
		return _taskDetailsId;
	}

	@Override
	public void setTaskDetailsId(long taskDetailsId) {
		_taskDetailsId = taskDetailsId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getJobId() {
		return _jobId;
	}

	@Override
	public void setJobId(long jobId) {
		_columnBitmask |= JOBID_COLUMN_BITMASK;

		if (!_setOriginalJobId) {
			_setOriginalJobId = true;

			_originalJobId = _jobId;
		}

		_jobId = jobId;
	}

	public long getOriginalJobId() {
		return _originalJobId;
	}

	@JSON
	@Override
	public long getTaskId() {
		return _taskId;
	}

	@Override
	public void setTaskId(long taskId) {
		_columnBitmask = -1L;

		_taskId = taskId;
	}

	@JSON
	@Override
	public String getFileUrl() {
		if (_fileUrl == null) {
			return StringPool.BLANK;
		}
		else {
			return _fileUrl;
		}
	}

	@Override
	public void setFileUrl(String fileUrl) {
		_fileUrl = fileUrl;
	}

	@JSON
	@Override
	public long getFileId() {
		return _fileId;
	}

	@Override
	public void setFileId(long fileId) {
		_fileId = fileId;
	}

	@JSON
	@Override
	public String getProductDetails() {
		if (_productDetails == null) {
			return StringPool.BLANK;
		}
		else {
			return _productDetails;
		}
	}

	@Override
	public void setProductDetails(String productDetails) {
		_productDetails = productDetails;
	}

	@JSON
	@Override
	public String getWhyUse() {
		if (_whyUse == null) {
			return StringPool.BLANK;
		}
		else {
			return _whyUse;
		}
	}

	@Override
	public void setWhyUse(String whyUse) {
		_whyUse = whyUse;
	}

	@JSON
	@Override
	public String getHowToUse() {
		if (_howToUse == null) {
			return StringPool.BLANK;
		}
		else {
			return _howToUse;
		}
	}

	@Override
	public void setHowToUse(String howToUse) {
		_howToUse = howToUse;
	}

	@JSON
	@Override
	public String getHowItWorks() {
		if (_howItWorks == null) {
			return StringPool.BLANK;
		}
		else {
			return _howItWorks;
		}
	}

	@Override
	public void setHowItWorks(String howItWorks) {
		_howItWorks = howItWorks;
	}

	@JSON
	@Override
	public String getExpertTips() {
		if (_expertTips == null) {
			return StringPool.BLANK;
		}
		else {
			return _expertTips;
		}
	}

	@Override
	public void setExpertTips(String expertTips) {
		_expertTips = expertTips;
	}

	@JSON
	@Override
	public long getApprovedBy() {
		return _approvedBy;
	}

	@Override
	public void setApprovedBy(long approvedBy) {
		_approvedBy = approvedBy;
	}

	@JSON
	@Override
	public Boolean getApproved() {
		return _approved;
	}

	@Override
	public void setApproved(Boolean approved) {
		_approved = approved;
	}

	@JSON
	@Override
	public String getComments() {
		if (_comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _comments;
		}
	}

	@Override
	public void setComments(String comments) {
		_comments = comments;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				TaskDetails.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			TaskDetails.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TaskDetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TaskDetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TaskDetailsImpl taskDetailsImpl = new TaskDetailsImpl();

		taskDetailsImpl.setUuid(getUuid());
		taskDetailsImpl.setTaskDetailsId(getTaskDetailsId());
		taskDetailsImpl.setGroupId(getGroupId());
		taskDetailsImpl.setCompanyId(getCompanyId());
		taskDetailsImpl.setUserId(getUserId());
		taskDetailsImpl.setUserName(getUserName());
		taskDetailsImpl.setCreateDate(getCreateDate());
		taskDetailsImpl.setModifiedDate(getModifiedDate());
		taskDetailsImpl.setJobId(getJobId());
		taskDetailsImpl.setTaskId(getTaskId());
		taskDetailsImpl.setFileUrl(getFileUrl());
		taskDetailsImpl.setFileId(getFileId());
		taskDetailsImpl.setProductDetails(getProductDetails());
		taskDetailsImpl.setWhyUse(getWhyUse());
		taskDetailsImpl.setHowToUse(getHowToUse());
		taskDetailsImpl.setHowItWorks(getHowItWorks());
		taskDetailsImpl.setExpertTips(getExpertTips());
		taskDetailsImpl.setApprovedBy(getApprovedBy());
		taskDetailsImpl.setApproved(getApproved());
		taskDetailsImpl.setComments(getComments());

		taskDetailsImpl.resetOriginalValues();

		return taskDetailsImpl;
	}

	@Override
	public int compareTo(TaskDetails taskDetails) {
		int value = 0;

		if (getTaskId() < taskDetails.getTaskId()) {
			value = -1;
		}
		else if (getTaskId() > taskDetails.getTaskId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaskDetails)) {
			return false;
		}

		TaskDetails taskDetails = (TaskDetails)obj;

		long primaryKey = taskDetails.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		TaskDetailsModelImpl taskDetailsModelImpl = this;

		taskDetailsModelImpl._originalUuid = taskDetailsModelImpl._uuid;

		taskDetailsModelImpl._originalGroupId = taskDetailsModelImpl._groupId;

		taskDetailsModelImpl._setOriginalGroupId = false;

		taskDetailsModelImpl._originalCompanyId = taskDetailsModelImpl._companyId;

		taskDetailsModelImpl._setOriginalCompanyId = false;

		taskDetailsModelImpl._setModifiedDate = false;

		taskDetailsModelImpl._originalJobId = taskDetailsModelImpl._jobId;

		taskDetailsModelImpl._setOriginalJobId = false;

		taskDetailsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TaskDetails> toCacheModel() {
		TaskDetailsCacheModel taskDetailsCacheModel = new TaskDetailsCacheModel();

		taskDetailsCacheModel.uuid = getUuid();

		String uuid = taskDetailsCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			taskDetailsCacheModel.uuid = null;
		}

		taskDetailsCacheModel.taskDetailsId = getTaskDetailsId();

		taskDetailsCacheModel.groupId = getGroupId();

		taskDetailsCacheModel.companyId = getCompanyId();

		taskDetailsCacheModel.userId = getUserId();

		taskDetailsCacheModel.userName = getUserName();

		String userName = taskDetailsCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			taskDetailsCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			taskDetailsCacheModel.createDate = createDate.getTime();
		}
		else {
			taskDetailsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			taskDetailsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			taskDetailsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		taskDetailsCacheModel.jobId = getJobId();

		taskDetailsCacheModel.taskId = getTaskId();

		taskDetailsCacheModel.fileUrl = getFileUrl();

		String fileUrl = taskDetailsCacheModel.fileUrl;

		if ((fileUrl != null) && (fileUrl.length() == 0)) {
			taskDetailsCacheModel.fileUrl = null;
		}

		taskDetailsCacheModel.fileId = getFileId();

		taskDetailsCacheModel.productDetails = getProductDetails();

		String productDetails = taskDetailsCacheModel.productDetails;

		if ((productDetails != null) && (productDetails.length() == 0)) {
			taskDetailsCacheModel.productDetails = null;
		}

		taskDetailsCacheModel.whyUse = getWhyUse();

		String whyUse = taskDetailsCacheModel.whyUse;

		if ((whyUse != null) && (whyUse.length() == 0)) {
			taskDetailsCacheModel.whyUse = null;
		}

		taskDetailsCacheModel.howToUse = getHowToUse();

		String howToUse = taskDetailsCacheModel.howToUse;

		if ((howToUse != null) && (howToUse.length() == 0)) {
			taskDetailsCacheModel.howToUse = null;
		}

		taskDetailsCacheModel.howItWorks = getHowItWorks();

		String howItWorks = taskDetailsCacheModel.howItWorks;

		if ((howItWorks != null) && (howItWorks.length() == 0)) {
			taskDetailsCacheModel.howItWorks = null;
		}

		taskDetailsCacheModel.expertTips = getExpertTips();

		String expertTips = taskDetailsCacheModel.expertTips;

		if ((expertTips != null) && (expertTips.length() == 0)) {
			taskDetailsCacheModel.expertTips = null;
		}

		taskDetailsCacheModel.approvedBy = getApprovedBy();

		taskDetailsCacheModel.approved = getApproved();

		taskDetailsCacheModel.comments = getComments();

		String comments = taskDetailsCacheModel.comments;

		if ((comments != null) && (comments.length() == 0)) {
			taskDetailsCacheModel.comments = null;
		}

		return taskDetailsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", taskDetailsId=");
		sb.append(getTaskDetailsId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", jobId=");
		sb.append(getJobId());
		sb.append(", taskId=");
		sb.append(getTaskId());
		sb.append(", fileUrl=");
		sb.append(getFileUrl());
		sb.append(", fileId=");
		sb.append(getFileId());
		sb.append(", productDetails=");
		sb.append(getProductDetails());
		sb.append(", whyUse=");
		sb.append(getWhyUse());
		sb.append(", howToUse=");
		sb.append(getHowToUse());
		sb.append(", howItWorks=");
		sb.append(getHowItWorks());
		sb.append(", expertTips=");
		sb.append(getExpertTips());
		sb.append(", approvedBy=");
		sb.append(getApprovedBy());
		sb.append(", approved=");
		sb.append(getApproved());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskDetailsId</column-name><column-value><![CDATA[");
		sb.append(getTaskDetailsId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobId</column-name><column-value><![CDATA[");
		sb.append(getJobId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskId</column-name><column-value><![CDATA[");
		sb.append(getTaskId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileUrl</column-name><column-value><![CDATA[");
		sb.append(getFileUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileId</column-name><column-value><![CDATA[");
		sb.append(getFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productDetails</column-name><column-value><![CDATA[");
		sb.append(getProductDetails());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>whyUse</column-name><column-value><![CDATA[");
		sb.append(getWhyUse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>howToUse</column-name><column-value><![CDATA[");
		sb.append(getHowToUse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>howItWorks</column-name><column-value><![CDATA[");
		sb.append(getHowItWorks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expertTips</column-name><column-value><![CDATA[");
		sb.append(getExpertTips());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedBy</column-name><column-value><![CDATA[");
		sb.append(getApprovedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approved</column-name><column-value><![CDATA[");
		sb.append(getApproved());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = TaskDetails.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			TaskDetails.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _taskDetailsId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _jobId;
	private long _originalJobId;
	private boolean _setOriginalJobId;
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
	private long _columnBitmask;
	private TaskDetails _escapedModel;
}