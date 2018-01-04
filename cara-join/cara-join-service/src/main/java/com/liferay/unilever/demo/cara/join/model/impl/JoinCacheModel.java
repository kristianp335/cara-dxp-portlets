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

package com.liferay.unilever.demo.cara.join.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.unilever.demo.cara.join.model.Join;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Join in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Join
 * @generated
 */
@ProviderType
public class JoinCacheModel implements CacheModel<Join>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JoinCacheModel)) {
			return false;
		}

		JoinCacheModel joinCacheModel = (JoinCacheModel)obj;

		if (jobId == joinCacheModel.jobId) {
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
		StringBundler sb = new StringBundler(61);

		sb.append("{jobId=");
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
		sb.append(", projectName=");
		sb.append(projectName);
		sb.append(", projectCategory=");
		sb.append(projectCategory);
		sb.append(", projectType=");
		sb.append(projectType);
		sb.append(", brand=");
		sb.append(brand);
		sb.append(", projectUserId=");
		sb.append(projectUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Join toEntityModel() {
		JoinImpl joinImpl = new JoinImpl();

		joinImpl.setJobId(jobId);
		joinImpl.setGroupId(groupId);
		joinImpl.setCompanyId(companyId);
		joinImpl.setUserId(userId);

		if (userName == null) {
			joinImpl.setUserName(StringPool.BLANK);
		}
		else {
			joinImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			joinImpl.setCreateDate(null);
		}
		else {
			joinImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			joinImpl.setModifiedDate(null);
		}
		else {
			joinImpl.setModifiedDate(new Date(modifiedDate));
		}

		joinImpl.setProjectId(projectId);

		if (jobType == null) {
			joinImpl.setJobType(StringPool.BLANK);
		}
		else {
			joinImpl.setJobType(jobType);
		}

		if (variant == null) {
			joinImpl.setVariant(StringPool.BLANK);
		}
		else {
			joinImpl.setVariant(variant);
		}

		if (format == null) {
			joinImpl.setFormat(StringPool.BLANK);
		}
		else {
			joinImpl.setFormat(format);
		}

		joinImpl.setVisualDesign(visualDesign);
		joinImpl.setVisualDesignCu(visualDesignCu);
		joinImpl.setNoticableConsumers(noticableConsumers);
		joinImpl.setChangePackaging(changePackaging);
		joinImpl.setChangeFormulation(changeFormulation);

		if (visualDesignComplete == Long.MIN_VALUE) {
			joinImpl.setVisualDesignComplete(null);
		}
		else {
			joinImpl.setVisualDesignComplete(new Date(visualDesignComplete));
		}

		if (artworkApproved == Long.MIN_VALUE) {
			joinImpl.setArtworkApproved(null);
		}
		else {
			joinImpl.setArtworkApproved(new Date(artworkApproved));
		}

		if (separationFilesToPrinter == Long.MIN_VALUE) {
			joinImpl.setSeparationFilesToPrinter(null);
		}
		else {
			joinImpl.setSeparationFilesToPrinter(new Date(
					separationFilesToPrinter));
		}

		if (marketDeployment == Long.MIN_VALUE) {
			joinImpl.setMarketDeployment(null);
		}
		else {
			joinImpl.setMarketDeployment(new Date(marketDeployment));
		}

		if (shipToTrade == Long.MIN_VALUE) {
			joinImpl.setShipToTrade(null);
		}
		else {
			joinImpl.setShipToTrade(new Date(shipToTrade));
		}

		joinImpl.setDesignAgency(designAgency);
		joinImpl.setPmaUser(pmaUser);
		joinImpl.setLocalMarketing(localMarketing);
		joinImpl.setRndLocalDeployUser(rndLocalDeployUser);

		if (projectName == null) {
			joinImpl.setProjectName(StringPool.BLANK);
		}
		else {
			joinImpl.setProjectName(projectName);
		}

		if (projectCategory == null) {
			joinImpl.setProjectCategory(StringPool.BLANK);
		}
		else {
			joinImpl.setProjectCategory(projectCategory);
		}

		if (projectType == null) {
			joinImpl.setProjectType(StringPool.BLANK);
		}
		else {
			joinImpl.setProjectType(projectType);
		}

		if (brand == null) {
			joinImpl.setBrand(StringPool.BLANK);
		}
		else {
			joinImpl.setBrand(brand);
		}

		joinImpl.setProjectUserId(projectUserId);

		joinImpl.resetOriginalValues();

		return joinImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
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
		projectName = objectInput.readUTF();
		projectCategory = objectInput.readUTF();
		projectType = objectInput.readUTF();
		brand = objectInput.readUTF();

		projectUserId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
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

		if (projectName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectName);
		}

		if (projectCategory == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectCategory);
		}

		if (projectType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectType);
		}

		if (brand == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(brand);
		}

		objectOutput.writeLong(projectUserId);
	}

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
	public String projectName;
	public String projectCategory;
	public String projectType;
	public String brand;
	public long projectUserId;
}