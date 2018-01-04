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

package cara.jobs.model.impl;

import aQute.bnd.annotation.ProviderType;

import cara.jobs.model.Jobs;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Jobs in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Jobs
 * @generated
 */
@ProviderType
public class JobsCacheModel implements CacheModel<Jobs>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobsCacheModel)) {
			return false;
		}

		JobsCacheModel jobsCacheModel = (JobsCacheModel)obj;

		if (jobId == jobsCacheModel.jobId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jobId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jobId=");
		sb.append(jobId);
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
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", jobType=");
		sb.append(jobType);
		sb.append(", variant=");
		sb.append(variant);
		sb.append(", format=");
		sb.append(format);
		sb.append(", visualDesign=");
		sb.append(visualDesign);
		sb.append(", visualDesignCu=");
		sb.append(visualDesignCu);
		sb.append(", noticableConsumers=");
		sb.append(noticableConsumers);
		sb.append(", changePackaging=");
		sb.append(changePackaging);
		sb.append(", changeFormulation=");
		sb.append(changeFormulation);
		sb.append(", visualDesignComplete=");
		sb.append(visualDesignComplete);
		sb.append(", artworkApproved=");
		sb.append(artworkApproved);
		sb.append(", separationFilesToPrinter=");
		sb.append(separationFilesToPrinter);
		sb.append(", marketDeployment=");
		sb.append(marketDeployment);
		sb.append(", shipToTrade=");
		sb.append(shipToTrade);
		sb.append(", designAgency=");
		sb.append(designAgency);
		sb.append(", pmaUser=");
		sb.append(pmaUser);
		sb.append(", localMarketing=");
		sb.append(localMarketing);
		sb.append(", rndLocalDeployUser=");
		sb.append(rndLocalDeployUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Jobs toEntityModel() {
		JobsImpl jobsImpl = new JobsImpl();

		if (uuid == null) {
			jobsImpl.setUuid(StringPool.BLANK);
		}
		else {
			jobsImpl.setUuid(uuid);
		}

		jobsImpl.setJobId(jobId);
		jobsImpl.setGroupId(groupId);
		jobsImpl.setCompanyId(companyId);
		jobsImpl.setUserId(userId);

		if (userName == null) {
			jobsImpl.setUserName(StringPool.BLANK);
		}
		else {
			jobsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jobsImpl.setCreateDate(null);
		}
		else {
			jobsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jobsImpl.setModifiedDate(null);
		}
		else {
			jobsImpl.setModifiedDate(new Date(modifiedDate));
		}

		jobsImpl.setProjectId(projectId);

		if (jobType == null) {
			jobsImpl.setJobType(StringPool.BLANK);
		}
		else {
			jobsImpl.setJobType(jobType);
		}

		if (variant == null) {
			jobsImpl.setVariant(StringPool.BLANK);
		}
		else {
			jobsImpl.setVariant(variant);
		}

		if (format == null) {
			jobsImpl.setFormat(StringPool.BLANK);
		}
		else {
			jobsImpl.setFormat(format);
		}

		jobsImpl.setVisualDesign(visualDesign);
		jobsImpl.setVisualDesignCu(visualDesignCu);
		jobsImpl.setNoticableConsumers(noticableConsumers);
		jobsImpl.setChangePackaging(changePackaging);
		jobsImpl.setChangeFormulation(changeFormulation);

		if (visualDesignComplete == Long.MIN_VALUE) {
			jobsImpl.setVisualDesignComplete(null);
		}
		else {
			jobsImpl.setVisualDesignComplete(new Date(visualDesignComplete));
		}

		if (artworkApproved == Long.MIN_VALUE) {
			jobsImpl.setArtworkApproved(null);
		}
		else {
			jobsImpl.setArtworkApproved(new Date(artworkApproved));
		}

		if (separationFilesToPrinter == Long.MIN_VALUE) {
			jobsImpl.setSeparationFilesToPrinter(null);
		}
		else {
			jobsImpl.setSeparationFilesToPrinter(new Date(
					separationFilesToPrinter));
		}

		if (marketDeployment == Long.MIN_VALUE) {
			jobsImpl.setMarketDeployment(null);
		}
		else {
			jobsImpl.setMarketDeployment(new Date(marketDeployment));
		}

		if (shipToTrade == Long.MIN_VALUE) {
			jobsImpl.setShipToTrade(null);
		}
		else {
			jobsImpl.setShipToTrade(new Date(shipToTrade));
		}

		jobsImpl.setDesignAgency(designAgency);
		jobsImpl.setPmaUser(pmaUser);
		jobsImpl.setLocalMarketing(localMarketing);
		jobsImpl.setRndLocalDeployUser(rndLocalDeployUser);

		jobsImpl.resetOriginalValues();

		return jobsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jobId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		projectId = objectInput.readLong();
		jobType = objectInput.readUTF();
		variant = objectInput.readUTF();
		format = objectInput.readUTF();

		visualDesign = objectInput.readBoolean();

		visualDesignCu = objectInput.readBoolean();

		noticableConsumers = objectInput.readBoolean();

		changePackaging = objectInput.readBoolean();

		changeFormulation = objectInput.readBoolean();
		visualDesignComplete = objectInput.readLong();
		artworkApproved = objectInput.readLong();
		separationFilesToPrinter = objectInput.readLong();
		marketDeployment = objectInput.readLong();
		shipToTrade = objectInput.readLong();

		designAgency = objectInput.readLong();

		pmaUser = objectInput.readLong();

		localMarketing = objectInput.readLong();

		rndLocalDeployUser = objectInput.readLong();
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

		objectOutput.writeLong(jobId);

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

		objectOutput.writeLong(projectId);

		if (jobType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jobType);
		}

		if (variant == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(variant);
		}

		if (format == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(format);
		}

		objectOutput.writeBoolean(visualDesign);

		objectOutput.writeBoolean(visualDesignCu);

		objectOutput.writeBoolean(noticableConsumers);

		objectOutput.writeBoolean(changePackaging);

		objectOutput.writeBoolean(changeFormulation);
		objectOutput.writeLong(visualDesignComplete);
		objectOutput.writeLong(artworkApproved);
		objectOutput.writeLong(separationFilesToPrinter);
		objectOutput.writeLong(marketDeployment);
		objectOutput.writeLong(shipToTrade);

		objectOutput.writeLong(designAgency);

		objectOutput.writeLong(pmaUser);

		objectOutput.writeLong(localMarketing);

		objectOutput.writeLong(rndLocalDeployUser);
	}

	public String uuid;
	public long jobId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long projectId;
	public String jobType;
	public String variant;
	public String format;
	public boolean visualDesign;
	public boolean visualDesignCu;
	public boolean noticableConsumers;
	public boolean changePackaging;
	public boolean changeFormulation;
	public long visualDesignComplete;
	public long artworkApproved;
	public long separationFilesToPrinter;
	public long marketDeployment;
	public long shipToTrade;
	public long designAgency;
	public long pmaUser;
	public long localMarketing;
	public long rndLocalDeployUser;
}