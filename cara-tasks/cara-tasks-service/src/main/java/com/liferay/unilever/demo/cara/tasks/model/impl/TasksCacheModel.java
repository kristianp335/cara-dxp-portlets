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

package com.liferay.unilever.demo.cara.tasks.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.unilever.demo.cara.tasks.model.Tasks;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Tasks in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Tasks
 * @generated
 */
@ProviderType
public class TasksCacheModel implements CacheModel<Tasks>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TasksCacheModel)) {
			return false;
		}

		TasksCacheModel tasksCacheModel = (TasksCacheModel)obj;

		if (taskId == tasksCacheModel.taskId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, taskId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", taskId=");
		sb.append(taskId);
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
		sb.append(", taskname=");
		sb.append(taskname);
		sb.append(", taskStatus=");
		sb.append(taskStatus);
		sb.append(", completeDate=");
		sb.append(completeDate);
		sb.append(", userAssigned=");
		sb.append(userAssigned);
		sb.append(", superAssigned=");
		sb.append(superAssigned);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tasks toEntityModel() {
		TasksImpl tasksImpl = new TasksImpl();

		if (uuid == null) {
			tasksImpl.setUuid(StringPool.BLANK);
		}
		else {
			tasksImpl.setUuid(uuid);
		}

		tasksImpl.setTaskId(taskId);
		tasksImpl.setGroupId(groupId);
		tasksImpl.setCompanyId(companyId);
		tasksImpl.setUserId(userId);

		if (userName == null) {
			tasksImpl.setUserName(StringPool.BLANK);
		}
		else {
			tasksImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tasksImpl.setCreateDate(null);
		}
		else {
			tasksImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tasksImpl.setModifiedDate(null);
		}
		else {
			tasksImpl.setModifiedDate(new Date(modifiedDate));
		}

		tasksImpl.setJobId(jobId);

		if (taskname == null) {
			tasksImpl.setTaskname(StringPool.BLANK);
		}
		else {
			tasksImpl.setTaskname(taskname);
		}

		tasksImpl.setTaskStatus(taskStatus);

		if (completeDate == Long.MIN_VALUE) {
			tasksImpl.setCompleteDate(null);
		}
		else {
			tasksImpl.setCompleteDate(new Date(completeDate));
		}

		tasksImpl.setUserAssigned(userAssigned);
		tasksImpl.setSuperAssigned(superAssigned);

		tasksImpl.resetOriginalValues();

		return tasksImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		taskId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		jobId = objectInput.readLong();
		taskname = objectInput.readUTF();

		taskStatus = objectInput.readLong();
		completeDate = objectInput.readLong();

		userAssigned = objectInput.readLong();

		superAssigned = objectInput.readLong();
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

		objectOutput.writeLong(taskId);

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

		if (taskname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taskname);
		}

		objectOutput.writeLong(taskStatus);
		objectOutput.writeLong(completeDate);

		objectOutput.writeLong(userAssigned);

		objectOutput.writeLong(superAssigned);
	}

	public String uuid;
	public long taskId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long jobId;
	public String taskname;
	public long taskStatus;
	public long completeDate;
	public long userAssigned;
	public long superAssigned;
}