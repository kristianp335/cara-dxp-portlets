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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TaskDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TaskDetails
 * @generated
 */
@ProviderType
public class TaskDetailsCacheModel implements CacheModel<TaskDetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaskDetailsCacheModel)) {
			return false;
		}

		TaskDetailsCacheModel taskDetailsCacheModel = (TaskDetailsCacheModel)obj;

		if (taskDetailsId == taskDetailsCacheModel.taskDetailsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, taskDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", taskDetailsId=");
		sb.append(taskDetailsId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", jobId=");
		sb.append(jobId);
		sb.append(", taskId=");
		sb.append(taskId);
		sb.append(", fileUrl=");
		sb.append(fileUrl);
		sb.append(", fileId=");
		sb.append(fileId);
		sb.append(", productDetails=");
		sb.append(productDetails);
		sb.append(", whyUse=");
		sb.append(whyUse);
		sb.append(", howToUse=");
		sb.append(howToUse);
		sb.append(", howItWorks=");
		sb.append(howItWorks);
		sb.append(", expertTips=");
		sb.append(expertTips);
		sb.append(", approvedBy=");
		sb.append(approvedBy);
		sb.append(", approved=");
		sb.append(approved);
		sb.append(", comments=");
		sb.append(comments);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TaskDetails toEntityModel() {
		TaskDetailsImpl taskDetailsImpl = new TaskDetailsImpl();

		if (uuid == null) {
			taskDetailsImpl.setUuid(StringPool.BLANK);
		}
		else {
			taskDetailsImpl.setUuid(uuid);
		}

		taskDetailsImpl.setTaskDetailsId(taskDetailsId);
		taskDetailsImpl.setGroupId(groupId);
		taskDetailsImpl.setCompanyId(companyId);
		taskDetailsImpl.setUserId(userId);

		if (userName == null) {
			taskDetailsImpl.setUserName(StringPool.BLANK);
		}
		else {
			taskDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			taskDetailsImpl.setCreateDate(null);
		}
		else {
			taskDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			taskDetailsImpl.setModifiedDate(null);
		}
		else {
			taskDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		taskDetailsImpl.setJobId(jobId);
		taskDetailsImpl.setTaskId(taskId);

		if (fileUrl == null) {
			taskDetailsImpl.setFileUrl(StringPool.BLANK);
		}
		else {
			taskDetailsImpl.setFileUrl(fileUrl);
		}

		taskDetailsImpl.setFileId(fileId);

		if (productDetails == null) {
			taskDetailsImpl.setProductDetails(StringPool.BLANK);
		}
		else {
			taskDetailsImpl.setProductDetails(productDetails);
		}

		if (whyUse == null) {
			taskDetailsImpl.setWhyUse(StringPool.BLANK);
		}
		else {
			taskDetailsImpl.setWhyUse(whyUse);
		}

		if (howToUse == null) {
			taskDetailsImpl.setHowToUse(StringPool.BLANK);
		}
		else {
			taskDetailsImpl.setHowToUse(howToUse);
		}

		if (howItWorks == null) {
			taskDetailsImpl.setHowItWorks(StringPool.BLANK);
		}
		else {
			taskDetailsImpl.setHowItWorks(howItWorks);
		}

		if (expertTips == null) {
			taskDetailsImpl.setExpertTips(StringPool.BLANK);
		}
		else {
			taskDetailsImpl.setExpertTips(expertTips);
		}

		taskDetailsImpl.setApprovedBy(approvedBy);
		taskDetailsImpl.setApproved(approved);

		if (comments == null) {
			taskDetailsImpl.setComments(StringPool.BLANK);
		}
		else {
			taskDetailsImpl.setComments(comments);
		}

		taskDetailsImpl.resetOriginalValues();

		return taskDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		taskDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		jobId = objectInput.readLong();

		taskId = objectInput.readLong();
		fileUrl = objectInput.readUTF();

		fileId = objectInput.readLong();
		productDetails = objectInput.readUTF();
		whyUse = objectInput.readUTF();
		howToUse = objectInput.readUTF();
		howItWorks = objectInput.readUTF();
		expertTips = objectInput.readUTF();

		approvedBy = objectInput.readLong();

		approved = objectInput.readBoolean();
		comments = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(taskDetailsId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(jobId);

		objectOutput.writeLong(taskId);

		if (fileUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileUrl);
		}

		objectOutput.writeLong(fileId);

		if (productDetails == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productDetails);
		}

		if (whyUse == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(whyUse);
		}

		if (howToUse == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(howToUse);
		}

		if (howItWorks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(howItWorks);
		}

		if (expertTips == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(expertTips);
		}

		objectOutput.writeLong(approvedBy);

		objectOutput.writeBoolean(approved);

		if (comments == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comments);
		}
	}

	public String uuid;
	public long taskDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long jobId;
	public long taskId;
	public String fileUrl;
	public long fileId;
	public String productDetails;
	public String whyUse;
	public String howToUse;
	public String howItWorks;
	public String expertTips;
	public long approvedBy;
	public boolean approved;
	public String comments;
}