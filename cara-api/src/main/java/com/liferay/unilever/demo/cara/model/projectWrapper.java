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

package com.liferay.unilever.demo.cara.model;

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
 * This class is a wrapper for {@link project}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see project
 * @generated
 */
@ProviderType
public class projectWrapper implements project, ModelWrapper<project> {
	public projectWrapper(project project) {
		_project = project;
	}

	@Override
	public Class<?> getModelClass() {
		return project.class;
	}

	@Override
	public String getModelClassName() {
		return project.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("projectId", getProjectId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("projectRefId", getProjectRefId());
		attributes.put("projectName", getProjectName());
		attributes.put("projectType", getProjectType());
		attributes.put("brand", getBrand());
		attributes.put("brandPosition", getBrandPosition());
		attributes.put("projectCategory", getProjectCategory());
		attributes.put("charterGateApproval", getCharterGateApproval());
		attributes.put("productDesignLock", getProductDesignLock());
		attributes.put("contractGateApproval", getContractGateApproval());
		attributes.put("marketReadyApproval", getMarketReadyApproval());
		attributes.put("marketDeployment", getMarketDeployment());
		attributes.put("shipToTrade", getShipToTrade());
		attributes.put("marketingUserId", getMarketingUserId());
		attributes.put("rndUserId", getRndUserId());
		attributes.put("rndProductUserId", getRndProductUserId());
		attributes.put("supplyChainUserId", getSupplyChainUserId());
		attributes.put("customerDevelopmentUserId",
			getCustomerDevelopmentUserId());
		attributes.put("techLeaderUserId", getTechLeaderUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
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

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String projectRefId = (String)attributes.get("projectRefId");

		if (projectRefId != null) {
			setProjectRefId(projectRefId);
		}

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String projectType = (String)attributes.get("projectType");

		if (projectType != null) {
			setProjectType(projectType);
		}

		String brand = (String)attributes.get("brand");

		if (brand != null) {
			setBrand(brand);
		}

		String brandPosition = (String)attributes.get("brandPosition");

		if (brandPosition != null) {
			setBrandPosition(brandPosition);
		}

		String projectCategory = (String)attributes.get("projectCategory");

		if (projectCategory != null) {
			setProjectCategory(projectCategory);
		}

		Date charterGateApproval = (Date)attributes.get("charterGateApproval");

		if (charterGateApproval != null) {
			setCharterGateApproval(charterGateApproval);
		}

		Date productDesignLock = (Date)attributes.get("productDesignLock");

		if (productDesignLock != null) {
			setProductDesignLock(productDesignLock);
		}

		Date contractGateApproval = (Date)attributes.get("contractGateApproval");

		if (contractGateApproval != null) {
			setContractGateApproval(contractGateApproval);
		}

		Date marketReadyApproval = (Date)attributes.get("marketReadyApproval");

		if (marketReadyApproval != null) {
			setMarketReadyApproval(marketReadyApproval);
		}

		Date marketDeployment = (Date)attributes.get("marketDeployment");

		if (marketDeployment != null) {
			setMarketDeployment(marketDeployment);
		}

		Date shipToTrade = (Date)attributes.get("shipToTrade");

		if (shipToTrade != null) {
			setShipToTrade(shipToTrade);
		}

		Long marketingUserId = (Long)attributes.get("marketingUserId");

		if (marketingUserId != null) {
			setMarketingUserId(marketingUserId);
		}

		Long rndUserId = (Long)attributes.get("rndUserId");

		if (rndUserId != null) {
			setRndUserId(rndUserId);
		}

		Long rndProductUserId = (Long)attributes.get("rndProductUserId");

		if (rndProductUserId != null) {
			setRndProductUserId(rndProductUserId);
		}

		Long supplyChainUserId = (Long)attributes.get("supplyChainUserId");

		if (supplyChainUserId != null) {
			setSupplyChainUserId(supplyChainUserId);
		}

		Long customerDevelopmentUserId = (Long)attributes.get(
				"customerDevelopmentUserId");

		if (customerDevelopmentUserId != null) {
			setCustomerDevelopmentUserId(customerDevelopmentUserId);
		}

		Long techLeaderUserId = (Long)attributes.get("techLeaderUserId");

		if (techLeaderUserId != null) {
			setTechLeaderUserId(techLeaderUserId);
		}
	}

	/**
	* Returns <code>true</code> if this project is approved.
	*
	* @return <code>true</code> if this project is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _project.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _project.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this project is denied.
	*
	* @return <code>true</code> if this project is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _project.isDenied();
	}

	/**
	* Returns <code>true</code> if this project is a draft.
	*
	* @return <code>true</code> if this project is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _project.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _project.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this project is expired.
	*
	* @return <code>true</code> if this project is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _project.isExpired();
	}

	/**
	* Returns <code>true</code> if this project is inactive.
	*
	* @return <code>true</code> if this project is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _project.isInactive();
	}

	/**
	* Returns <code>true</code> if this project is incomplete.
	*
	* @return <code>true</code> if this project is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _project.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _project.isNew();
	}

	/**
	* Returns <code>true</code> if this project is pending.
	*
	* @return <code>true</code> if this project is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _project.isPending();
	}

	/**
	* Returns <code>true</code> if this project is scheduled.
	*
	* @return <code>true</code> if this project is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _project.isScheduled();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _project.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.liferay.unilever.demo.cara.model.project> toCacheModel() {
		return _project.toCacheModel();
	}

	@Override
	public com.liferay.unilever.demo.cara.model.project toEscapedModel() {
		return new projectWrapper(_project.toEscapedModel());
	}

	@Override
	public com.liferay.unilever.demo.cara.model.project toUnescapedModel() {
		return new projectWrapper(_project.toUnescapedModel());
	}

	@Override
	public int compareTo(com.liferay.unilever.demo.cara.model.project project) {
		return _project.compareTo(project);
	}

	/**
	* Returns the status of this project.
	*
	* @return the status of this project
	*/
	@Override
	public int getStatus() {
		return _project.getStatus();
	}

	@Override
	public int hashCode() {
		return _project.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _project.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new projectWrapper((project)_project.clone());
	}

	/**
	* Returns the brand of this project.
	*
	* @return the brand of this project
	*/
	@Override
	public java.lang.String getBrand() {
		return _project.getBrand();
	}

	/**
	* Returns the brand position of this project.
	*
	* @return the brand position of this project
	*/
	@Override
	public java.lang.String getBrandPosition() {
		return _project.getBrandPosition();
	}

	/**
	* Returns the customer development user uuid of this project.
	*
	* @return the customer development user uuid of this project
	*/
	@Override
	public java.lang.String getCustomerDevelopmentUserUuid() {
		return _project.getCustomerDevelopmentUserUuid();
	}

	/**
	* Returns the marketing user uuid of this project.
	*
	* @return the marketing user uuid of this project
	*/
	@Override
	public java.lang.String getMarketingUserUuid() {
		return _project.getMarketingUserUuid();
	}

	/**
	* Returns the project category of this project.
	*
	* @return the project category of this project
	*/
	@Override
	public java.lang.String getProjectCategory() {
		return _project.getProjectCategory();
	}

	/**
	* Returns the project name of this project.
	*
	* @return the project name of this project
	*/
	@Override
	public java.lang.String getProjectName() {
		return _project.getProjectName();
	}

	/**
	* Returns the project ref ID of this project.
	*
	* @return the project ref ID of this project
	*/
	@Override
	public java.lang.String getProjectRefId() {
		return _project.getProjectRefId();
	}

	/**
	* Returns the project type of this project.
	*
	* @return the project type of this project
	*/
	@Override
	public java.lang.String getProjectType() {
		return _project.getProjectType();
	}

	/**
	* Returns the rnd product user uuid of this project.
	*
	* @return the rnd product user uuid of this project
	*/
	@Override
	public java.lang.String getRndProductUserUuid() {
		return _project.getRndProductUserUuid();
	}

	/**
	* Returns the rnd user uuid of this project.
	*
	* @return the rnd user uuid of this project
	*/
	@Override
	public java.lang.String getRndUserUuid() {
		return _project.getRndUserUuid();
	}

	/**
	* Returns the status by user name of this project.
	*
	* @return the status by user name of this project
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _project.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this project.
	*
	* @return the status by user uuid of this project
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _project.getStatusByUserUuid();
	}

	/**
	* Returns the supply chain user uuid of this project.
	*
	* @return the supply chain user uuid of this project
	*/
	@Override
	public java.lang.String getSupplyChainUserUuid() {
		return _project.getSupplyChainUserUuid();
	}

	/**
	* Returns the tech leader user uuid of this project.
	*
	* @return the tech leader user uuid of this project
	*/
	@Override
	public java.lang.String getTechLeaderUserUuid() {
		return _project.getTechLeaderUserUuid();
	}

	/**
	* Returns the user name of this project.
	*
	* @return the user name of this project
	*/
	@Override
	public java.lang.String getUserName() {
		return _project.getUserName();
	}

	/**
	* Returns the user uuid of this project.
	*
	* @return the user uuid of this project
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _project.getUserUuid();
	}

	/**
	* Returns the uuid of this project.
	*
	* @return the uuid of this project
	*/
	@Override
	public java.lang.String getUuid() {
		return _project.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _project.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _project.toXmlString();
	}

	/**
	* Returns the charter gate approval of this project.
	*
	* @return the charter gate approval of this project
	*/
	@Override
	public Date getCharterGateApproval() {
		return _project.getCharterGateApproval();
	}

	/**
	* Returns the contract gate approval of this project.
	*
	* @return the contract gate approval of this project
	*/
	@Override
	public Date getContractGateApproval() {
		return _project.getContractGateApproval();
	}

	/**
	* Returns the create date of this project.
	*
	* @return the create date of this project
	*/
	@Override
	public Date getCreateDate() {
		return _project.getCreateDate();
	}

	/**
	* Returns the market deployment of this project.
	*
	* @return the market deployment of this project
	*/
	@Override
	public Date getMarketDeployment() {
		return _project.getMarketDeployment();
	}

	/**
	* Returns the market ready approval of this project.
	*
	* @return the market ready approval of this project
	*/
	@Override
	public Date getMarketReadyApproval() {
		return _project.getMarketReadyApproval();
	}

	/**
	* Returns the modified date of this project.
	*
	* @return the modified date of this project
	*/
	@Override
	public Date getModifiedDate() {
		return _project.getModifiedDate();
	}

	/**
	* Returns the product design lock of this project.
	*
	* @return the product design lock of this project
	*/
	@Override
	public Date getProductDesignLock() {
		return _project.getProductDesignLock();
	}

	/**
	* Returns the ship to trade of this project.
	*
	* @return the ship to trade of this project
	*/
	@Override
	public Date getShipToTrade() {
		return _project.getShipToTrade();
	}

	/**
	* Returns the status date of this project.
	*
	* @return the status date of this project
	*/
	@Override
	public Date getStatusDate() {
		return _project.getStatusDate();
	}

	/**
	* Returns the company ID of this project.
	*
	* @return the company ID of this project
	*/
	@Override
	public long getCompanyId() {
		return _project.getCompanyId();
	}

	/**
	* Returns the customer development user ID of this project.
	*
	* @return the customer development user ID of this project
	*/
	@Override
	public long getCustomerDevelopmentUserId() {
		return _project.getCustomerDevelopmentUserId();
	}

	/**
	* Returns the group ID of this project.
	*
	* @return the group ID of this project
	*/
	@Override
	public long getGroupId() {
		return _project.getGroupId();
	}

	/**
	* Returns the marketing user ID of this project.
	*
	* @return the marketing user ID of this project
	*/
	@Override
	public long getMarketingUserId() {
		return _project.getMarketingUserId();
	}

	/**
	* Returns the primary key of this project.
	*
	* @return the primary key of this project
	*/
	@Override
	public long getPrimaryKey() {
		return _project.getPrimaryKey();
	}

	/**
	* Returns the project ID of this project.
	*
	* @return the project ID of this project
	*/
	@Override
	public long getProjectId() {
		return _project.getProjectId();
	}

	/**
	* Returns the rnd product user ID of this project.
	*
	* @return the rnd product user ID of this project
	*/
	@Override
	public long getRndProductUserId() {
		return _project.getRndProductUserId();
	}

	/**
	* Returns the rnd user ID of this project.
	*
	* @return the rnd user ID of this project
	*/
	@Override
	public long getRndUserId() {
		return _project.getRndUserId();
	}

	/**
	* Returns the status by user ID of this project.
	*
	* @return the status by user ID of this project
	*/
	@Override
	public long getStatusByUserId() {
		return _project.getStatusByUserId();
	}

	/**
	* Returns the supply chain user ID of this project.
	*
	* @return the supply chain user ID of this project
	*/
	@Override
	public long getSupplyChainUserId() {
		return _project.getSupplyChainUserId();
	}

	/**
	* Returns the tech leader user ID of this project.
	*
	* @return the tech leader user ID of this project
	*/
	@Override
	public long getTechLeaderUserId() {
		return _project.getTechLeaderUserId();
	}

	/**
	* Returns the user ID of this project.
	*
	* @return the user ID of this project
	*/
	@Override
	public long getUserId() {
		return _project.getUserId();
	}

	@Override
	public void persist() {
		_project.persist();
	}

	/**
	* Sets the brand of this project.
	*
	* @param brand the brand of this project
	*/
	@Override
	public void setBrand(java.lang.String brand) {
		_project.setBrand(brand);
	}

	/**
	* Sets the brand position of this project.
	*
	* @param brandPosition the brand position of this project
	*/
	@Override
	public void setBrandPosition(java.lang.String brandPosition) {
		_project.setBrandPosition(brandPosition);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_project.setCachedModel(cachedModel);
	}

	/**
	* Sets the charter gate approval of this project.
	*
	* @param charterGateApproval the charter gate approval of this project
	*/
	@Override
	public void setCharterGateApproval(Date charterGateApproval) {
		_project.setCharterGateApproval(charterGateApproval);
	}

	/**
	* Sets the company ID of this project.
	*
	* @param companyId the company ID of this project
	*/
	@Override
	public void setCompanyId(long companyId) {
		_project.setCompanyId(companyId);
	}

	/**
	* Sets the contract gate approval of this project.
	*
	* @param contractGateApproval the contract gate approval of this project
	*/
	@Override
	public void setContractGateApproval(Date contractGateApproval) {
		_project.setContractGateApproval(contractGateApproval);
	}

	/**
	* Sets the create date of this project.
	*
	* @param createDate the create date of this project
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_project.setCreateDate(createDate);
	}

	/**
	* Sets the customer development user ID of this project.
	*
	* @param customerDevelopmentUserId the customer development user ID of this project
	*/
	@Override
	public void setCustomerDevelopmentUserId(long customerDevelopmentUserId) {
		_project.setCustomerDevelopmentUserId(customerDevelopmentUserId);
	}

	/**
	* Sets the customer development user uuid of this project.
	*
	* @param customerDevelopmentUserUuid the customer development user uuid of this project
	*/
	@Override
	public void setCustomerDevelopmentUserUuid(
		java.lang.String customerDevelopmentUserUuid) {
		_project.setCustomerDevelopmentUserUuid(customerDevelopmentUserUuid);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_project.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_project.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_project.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this project.
	*
	* @param groupId the group ID of this project
	*/
	@Override
	public void setGroupId(long groupId) {
		_project.setGroupId(groupId);
	}

	/**
	* Sets the market deployment of this project.
	*
	* @param marketDeployment the market deployment of this project
	*/
	@Override
	public void setMarketDeployment(Date marketDeployment) {
		_project.setMarketDeployment(marketDeployment);
	}

	/**
	* Sets the market ready approval of this project.
	*
	* @param marketReadyApproval the market ready approval of this project
	*/
	@Override
	public void setMarketReadyApproval(Date marketReadyApproval) {
		_project.setMarketReadyApproval(marketReadyApproval);
	}

	/**
	* Sets the marketing user ID of this project.
	*
	* @param marketingUserId the marketing user ID of this project
	*/
	@Override
	public void setMarketingUserId(long marketingUserId) {
		_project.setMarketingUserId(marketingUserId);
	}

	/**
	* Sets the marketing user uuid of this project.
	*
	* @param marketingUserUuid the marketing user uuid of this project
	*/
	@Override
	public void setMarketingUserUuid(java.lang.String marketingUserUuid) {
		_project.setMarketingUserUuid(marketingUserUuid);
	}

	/**
	* Sets the modified date of this project.
	*
	* @param modifiedDate the modified date of this project
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_project.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_project.setNew(n);
	}

	/**
	* Sets the primary key of this project.
	*
	* @param primaryKey the primary key of this project
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_project.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_project.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product design lock of this project.
	*
	* @param productDesignLock the product design lock of this project
	*/
	@Override
	public void setProductDesignLock(Date productDesignLock) {
		_project.setProductDesignLock(productDesignLock);
	}

	/**
	* Sets the project category of this project.
	*
	* @param projectCategory the project category of this project
	*/
	@Override
	public void setProjectCategory(java.lang.String projectCategory) {
		_project.setProjectCategory(projectCategory);
	}

	/**
	* Sets the project ID of this project.
	*
	* @param projectId the project ID of this project
	*/
	@Override
	public void setProjectId(long projectId) {
		_project.setProjectId(projectId);
	}

	/**
	* Sets the project name of this project.
	*
	* @param projectName the project name of this project
	*/
	@Override
	public void setProjectName(java.lang.String projectName) {
		_project.setProjectName(projectName);
	}

	/**
	* Sets the project ref ID of this project.
	*
	* @param projectRefId the project ref ID of this project
	*/
	@Override
	public void setProjectRefId(java.lang.String projectRefId) {
		_project.setProjectRefId(projectRefId);
	}

	/**
	* Sets the project type of this project.
	*
	* @param projectType the project type of this project
	*/
	@Override
	public void setProjectType(java.lang.String projectType) {
		_project.setProjectType(projectType);
	}

	/**
	* Sets the rnd product user ID of this project.
	*
	* @param rndProductUserId the rnd product user ID of this project
	*/
	@Override
	public void setRndProductUserId(long rndProductUserId) {
		_project.setRndProductUserId(rndProductUserId);
	}

	/**
	* Sets the rnd product user uuid of this project.
	*
	* @param rndProductUserUuid the rnd product user uuid of this project
	*/
	@Override
	public void setRndProductUserUuid(java.lang.String rndProductUserUuid) {
		_project.setRndProductUserUuid(rndProductUserUuid);
	}

	/**
	* Sets the rnd user ID of this project.
	*
	* @param rndUserId the rnd user ID of this project
	*/
	@Override
	public void setRndUserId(long rndUserId) {
		_project.setRndUserId(rndUserId);
	}

	/**
	* Sets the rnd user uuid of this project.
	*
	* @param rndUserUuid the rnd user uuid of this project
	*/
	@Override
	public void setRndUserUuid(java.lang.String rndUserUuid) {
		_project.setRndUserUuid(rndUserUuid);
	}

	/**
	* Sets the ship to trade of this project.
	*
	* @param shipToTrade the ship to trade of this project
	*/
	@Override
	public void setShipToTrade(Date shipToTrade) {
		_project.setShipToTrade(shipToTrade);
	}

	/**
	* Sets the status of this project.
	*
	* @param status the status of this project
	*/
	@Override
	public void setStatus(int status) {
		_project.setStatus(status);
	}

	/**
	* Sets the status by user ID of this project.
	*
	* @param statusByUserId the status by user ID of this project
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_project.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this project.
	*
	* @param statusByUserName the status by user name of this project
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_project.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this project.
	*
	* @param statusByUserUuid the status by user uuid of this project
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_project.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this project.
	*
	* @param statusDate the status date of this project
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_project.setStatusDate(statusDate);
	}

	/**
	* Sets the supply chain user ID of this project.
	*
	* @param supplyChainUserId the supply chain user ID of this project
	*/
	@Override
	public void setSupplyChainUserId(long supplyChainUserId) {
		_project.setSupplyChainUserId(supplyChainUserId);
	}

	/**
	* Sets the supply chain user uuid of this project.
	*
	* @param supplyChainUserUuid the supply chain user uuid of this project
	*/
	@Override
	public void setSupplyChainUserUuid(java.lang.String supplyChainUserUuid) {
		_project.setSupplyChainUserUuid(supplyChainUserUuid);
	}

	/**
	* Sets the tech leader user ID of this project.
	*
	* @param techLeaderUserId the tech leader user ID of this project
	*/
	@Override
	public void setTechLeaderUserId(long techLeaderUserId) {
		_project.setTechLeaderUserId(techLeaderUserId);
	}

	/**
	* Sets the tech leader user uuid of this project.
	*
	* @param techLeaderUserUuid the tech leader user uuid of this project
	*/
	@Override
	public void setTechLeaderUserUuid(java.lang.String techLeaderUserUuid) {
		_project.setTechLeaderUserUuid(techLeaderUserUuid);
	}

	/**
	* Sets the user ID of this project.
	*
	* @param userId the user ID of this project
	*/
	@Override
	public void setUserId(long userId) {
		_project.setUserId(userId);
	}

	/**
	* Sets the user name of this project.
	*
	* @param userName the user name of this project
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_project.setUserName(userName);
	}

	/**
	* Sets the user uuid of this project.
	*
	* @param userUuid the user uuid of this project
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_project.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this project.
	*
	* @param uuid the uuid of this project
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_project.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof projectWrapper)) {
			return false;
		}

		projectWrapper projectWrapper = (projectWrapper)obj;

		if (Objects.equals(_project, projectWrapper._project)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _project.getStagedModelType();
	}

	@Override
	public project getWrappedModel() {
		return _project;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _project.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _project.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_project.resetOriginalValues();
	}

	private final project _project;
}