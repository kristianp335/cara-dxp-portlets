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

package com.liferay.unilever.demo.cara.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.unilever.demo.cara.model.project;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing project in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see project
 * @generated
 */
@ProviderType
public class projectCacheModel implements CacheModel<project>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof projectCacheModel)) {
			return false;
		}

		projectCacheModel projectCacheModel = (projectCacheModel)obj;

		if (projectId == projectCacheModel.projectId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, projectId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", projectId=");
		sb.append(projectId);
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
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", projectRefId=");
		sb.append(projectRefId);
		sb.append(", projectName=");
		sb.append(projectName);
		sb.append(", projectType=");
		sb.append(projectType);
		sb.append(", brand=");
		sb.append(brand);
		sb.append(", brandPosition=");
		sb.append(brandPosition);
		sb.append(", projectCategory=");
		sb.append(projectCategory);
		sb.append(", charterGateApproval=");
		sb.append(charterGateApproval);
		sb.append(", productDesignLock=");
		sb.append(productDesignLock);
		sb.append(", contractGateApproval=");
		sb.append(contractGateApproval);
		sb.append(", marketReadyApproval=");
		sb.append(marketReadyApproval);
		sb.append(", marketDeployment=");
		sb.append(marketDeployment);
		sb.append(", shipToTrade=");
		sb.append(shipToTrade);
		sb.append(", marketingUserId=");
		sb.append(marketingUserId);
		sb.append(", rndUserId=");
		sb.append(rndUserId);
		sb.append(", rndProductUserId=");
		sb.append(rndProductUserId);
		sb.append(", supplyChainUserId=");
		sb.append(supplyChainUserId);
		sb.append(", customerDevelopmentUserId=");
		sb.append(customerDevelopmentUserId);
		sb.append(", techLeaderUserId=");
		sb.append(techLeaderUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public project toEntityModel() {
		projectImpl projectImpl = new projectImpl();

		if (uuid == null) {
			projectImpl.setUuid(StringPool.BLANK);
		}
		else {
			projectImpl.setUuid(uuid);
		}

		projectImpl.setProjectId(projectId);
		projectImpl.setGroupId(groupId);
		projectImpl.setCompanyId(companyId);
		projectImpl.setUserId(userId);

		if (userName == null) {
			projectImpl.setUserName(StringPool.BLANK);
		}
		else {
			projectImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			projectImpl.setCreateDate(null);
		}
		else {
			projectImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			projectImpl.setModifiedDate(null);
		}
		else {
			projectImpl.setModifiedDate(new Date(modifiedDate));
		}

		projectImpl.setStatus(status);
		projectImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			projectImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			projectImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			projectImpl.setStatusDate(null);
		}
		else {
			projectImpl.setStatusDate(new Date(statusDate));
		}

		if (projectRefId == null) {
			projectImpl.setProjectRefId(StringPool.BLANK);
		}
		else {
			projectImpl.setProjectRefId(projectRefId);
		}

		if (projectName == null) {
			projectImpl.setProjectName(StringPool.BLANK);
		}
		else {
			projectImpl.setProjectName(projectName);
		}

		if (projectType == null) {
			projectImpl.setProjectType(StringPool.BLANK);
		}
		else {
			projectImpl.setProjectType(projectType);
		}

		if (brand == null) {
			projectImpl.setBrand(StringPool.BLANK);
		}
		else {
			projectImpl.setBrand(brand);
		}

		if (brandPosition == null) {
			projectImpl.setBrandPosition(StringPool.BLANK);
		}
		else {
			projectImpl.setBrandPosition(brandPosition);
		}

		if (projectCategory == null) {
			projectImpl.setProjectCategory(StringPool.BLANK);
		}
		else {
			projectImpl.setProjectCategory(projectCategory);
		}

		if (charterGateApproval == Long.MIN_VALUE) {
			projectImpl.setCharterGateApproval(null);
		}
		else {
			projectImpl.setCharterGateApproval(new Date(charterGateApproval));
		}

		if (productDesignLock == Long.MIN_VALUE) {
			projectImpl.setProductDesignLock(null);
		}
		else {
			projectImpl.setProductDesignLock(new Date(productDesignLock));
		}

		if (contractGateApproval == Long.MIN_VALUE) {
			projectImpl.setContractGateApproval(null);
		}
		else {
			projectImpl.setContractGateApproval(new Date(contractGateApproval));
		}

		if (marketReadyApproval == Long.MIN_VALUE) {
			projectImpl.setMarketReadyApproval(null);
		}
		else {
			projectImpl.setMarketReadyApproval(new Date(marketReadyApproval));
		}

		if (marketDeployment == Long.MIN_VALUE) {
			projectImpl.setMarketDeployment(null);
		}
		else {
			projectImpl.setMarketDeployment(new Date(marketDeployment));
		}

		if (shipToTrade == Long.MIN_VALUE) {
			projectImpl.setShipToTrade(null);
		}
		else {
			projectImpl.setShipToTrade(new Date(shipToTrade));
		}

		projectImpl.setMarketingUserId(marketingUserId);
		projectImpl.setRndUserId(rndUserId);
		projectImpl.setRndProductUserId(rndProductUserId);
		projectImpl.setSupplyChainUserId(supplyChainUserId);
		projectImpl.setCustomerDevelopmentUserId(customerDevelopmentUserId);
		projectImpl.setTechLeaderUserId(techLeaderUserId);

		projectImpl.resetOriginalValues();

		return projectImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		projectId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		projectRefId = objectInput.readUTF();
		projectName = objectInput.readUTF();
		projectType = objectInput.readUTF();
		brand = objectInput.readUTF();
		brandPosition = objectInput.readUTF();
		projectCategory = objectInput.readUTF();
		charterGateApproval = objectInput.readLong();
		productDesignLock = objectInput.readLong();
		contractGateApproval = objectInput.readLong();
		marketReadyApproval = objectInput.readLong();
		marketDeployment = objectInput.readLong();
		shipToTrade = objectInput.readLong();

		marketingUserId = objectInput.readLong();

		rndUserId = objectInput.readLong();

		rndProductUserId = objectInput.readLong();

		supplyChainUserId = objectInput.readLong();

		customerDevelopmentUserId = objectInput.readLong();

		techLeaderUserId = objectInput.readLong();
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

		objectOutput.writeLong(projectId);

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

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (projectRefId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectRefId);
		}

		if (projectName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectName);
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

		if (brandPosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(brandPosition);
		}

		if (projectCategory == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectCategory);
		}

		objectOutput.writeLong(charterGateApproval);
		objectOutput.writeLong(productDesignLock);
		objectOutput.writeLong(contractGateApproval);
		objectOutput.writeLong(marketReadyApproval);
		objectOutput.writeLong(marketDeployment);
		objectOutput.writeLong(shipToTrade);

		objectOutput.writeLong(marketingUserId);

		objectOutput.writeLong(rndUserId);

		objectOutput.writeLong(rndProductUserId);

		objectOutput.writeLong(supplyChainUserId);

		objectOutput.writeLong(customerDevelopmentUserId);

		objectOutput.writeLong(techLeaderUserId);
	}

	public String uuid;
	public long projectId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String projectRefId;
	public String projectName;
	public String projectType;
	public String brand;
	public String brandPosition;
	public String projectCategory;
	public long charterGateApproval;
	public long productDesignLock;
	public long contractGateApproval;
	public long marketReadyApproval;
	public long marketDeployment;
	public long shipToTrade;
	public long marketingUserId;
	public long rndUserId;
	public long rndProductUserId;
	public long supplyChainUserId;
	public long customerDevelopmentUserId;
	public long techLeaderUserId;
}