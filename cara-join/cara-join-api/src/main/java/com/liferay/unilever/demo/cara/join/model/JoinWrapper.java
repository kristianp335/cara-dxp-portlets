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

package com.liferay.unilever.demo.cara.join.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Join}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Join
 * @generated
 */
@ProviderType
public class JoinWrapper implements Join, ModelWrapper<Join> {
	public JoinWrapper(Join join) {
		_join = join;
	}

	@Override
	public Class<?> getModelClass() {
		return Join.class;
	}

	@Override
	public String getModelClassName() {
		return Join.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobId", getJobId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("projectId", getProjectId());
		attributes.put("jobType", getJobType());
		attributes.put("variant", getVariant());
		attributes.put("format", getFormat());
		attributes.put("visualDesign", getVisualDesign());
		attributes.put("visualDesignCu", getVisualDesignCu());
		attributes.put("noticableConsumers", getNoticableConsumers());
		attributes.put("changePackaging", getChangePackaging());
		attributes.put("changeFormulation", getChangeFormulation());
		attributes.put("visualDesignComplete", getVisualDesignComplete());
		attributes.put("artworkApproved", getArtworkApproved());
		attributes.put("separationFilesToPrinter", getSeparationFilesToPrinter());
		attributes.put("marketDeployment", getMarketDeployment());
		attributes.put("shipToTrade", getShipToTrade());
		attributes.put("designAgency", getDesignAgency());
		attributes.put("pmaUser", getPmaUser());
		attributes.put("localMarketing", getLocalMarketing());
		attributes.put("rndLocalDeployUser", getRndLocalDeployUser());
		attributes.put("projectName", getProjectName());
		attributes.put("projectCategory", getProjectCategory());
		attributes.put("projectType", getProjectType());
		attributes.put("brand", getBrand());
		attributes.put("projectUserId", getProjectUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobId = (Long)attributes.get("jobId");

		if (jobId != null) {
			setJobId(jobId);
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

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		String jobType = (String)attributes.get("jobType");

		if (jobType != null) {
			setJobType(jobType);
		}

		String variant = (String)attributes.get("variant");

		if (variant != null) {
			setVariant(variant);
		}

		String format = (String)attributes.get("format");

		if (format != null) {
			setFormat(format);
		}

		Boolean visualDesign = (Boolean)attributes.get("visualDesign");

		if (visualDesign != null) {
			setVisualDesign(visualDesign);
		}

		Boolean visualDesignCu = (Boolean)attributes.get("visualDesignCu");

		if (visualDesignCu != null) {
			setVisualDesignCu(visualDesignCu);
		}

		Boolean noticableConsumers = (Boolean)attributes.get(
				"noticableConsumers");

		if (noticableConsumers != null) {
			setNoticableConsumers(noticableConsumers);
		}

		Boolean changePackaging = (Boolean)attributes.get("changePackaging");

		if (changePackaging != null) {
			setChangePackaging(changePackaging);
		}

		Boolean changeFormulation = (Boolean)attributes.get("changeFormulation");

		if (changeFormulation != null) {
			setChangeFormulation(changeFormulation);
		}

		Date visualDesignComplete = (Date)attributes.get("visualDesignComplete");

		if (visualDesignComplete != null) {
			setVisualDesignComplete(visualDesignComplete);
		}

		Date artworkApproved = (Date)attributes.get("artworkApproved");

		if (artworkApproved != null) {
			setArtworkApproved(artworkApproved);
		}

		Date separationFilesToPrinter = (Date)attributes.get(
				"separationFilesToPrinter");

		if (separationFilesToPrinter != null) {
			setSeparationFilesToPrinter(separationFilesToPrinter);
		}

		Date marketDeployment = (Date)attributes.get("marketDeployment");

		if (marketDeployment != null) {
			setMarketDeployment(marketDeployment);
		}

		Date shipToTrade = (Date)attributes.get("shipToTrade");

		if (shipToTrade != null) {
			setShipToTrade(shipToTrade);
		}

		Long designAgency = (Long)attributes.get("designAgency");

		if (designAgency != null) {
			setDesignAgency(designAgency);
		}

		Long pmaUser = (Long)attributes.get("pmaUser");

		if (pmaUser != null) {
			setPmaUser(pmaUser);
		}

		Long localMarketing = (Long)attributes.get("localMarketing");

		if (localMarketing != null) {
			setLocalMarketing(localMarketing);
		}

		Long rndLocalDeployUser = (Long)attributes.get("rndLocalDeployUser");

		if (rndLocalDeployUser != null) {
			setRndLocalDeployUser(rndLocalDeployUser);
		}

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String projectCategory = (String)attributes.get("projectCategory");

		if (projectCategory != null) {
			setProjectCategory(projectCategory);
		}

		String projectType = (String)attributes.get("projectType");

		if (projectType != null) {
			setProjectType(projectType);
		}

		String brand = (String)attributes.get("brand");

		if (brand != null) {
			setBrand(brand);
		}

		Long projectUserId = (Long)attributes.get("projectUserId");

		if (projectUserId != null) {
			setProjectUserId(projectUserId);
		}
	}

	@Override
	public Join toEscapedModel() {
		return new JoinWrapper(_join.toEscapedModel());
	}

	@Override
	public Join toUnescapedModel() {
		return new JoinWrapper(_join.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _join.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _join.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _join.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _join.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Join> toCacheModel() {
		return _join.toCacheModel();
	}

	@Override
	public int compareTo(Join join) {
		return _join.compareTo(join);
	}

	@Override
	public int hashCode() {
		return _join.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _join.getPrimaryKeyObj();
	}

	/**
	* Returns the change formulation of this join.
	*
	* @return the change formulation of this join
	*/
	@Override
	public java.lang.Boolean getChangeFormulation() {
		return _join.getChangeFormulation();
	}

	/**
	* Returns the change packaging of this join.
	*
	* @return the change packaging of this join
	*/
	@Override
	public java.lang.Boolean getChangePackaging() {
		return _join.getChangePackaging();
	}

	/**
	* Returns the noticable consumers of this join.
	*
	* @return the noticable consumers of this join
	*/
	@Override
	public java.lang.Boolean getNoticableConsumers() {
		return _join.getNoticableConsumers();
	}

	/**
	* Returns the visual design of this join.
	*
	* @return the visual design of this join
	*/
	@Override
	public java.lang.Boolean getVisualDesign() {
		return _join.getVisualDesign();
	}

	/**
	* Returns the visual design cu of this join.
	*
	* @return the visual design cu of this join
	*/
	@Override
	public java.lang.Boolean getVisualDesignCu() {
		return _join.getVisualDesignCu();
	}

	@Override
	public java.lang.Object clone() {
		return new JoinWrapper((Join)_join.clone());
	}

	/**
	* Returns the brand of this join.
	*
	* @return the brand of this join
	*/
	@Override
	public java.lang.String getBrand() {
		return _join.getBrand();
	}

	/**
	* Returns the format of this join.
	*
	* @return the format of this join
	*/
	@Override
	public java.lang.String getFormat() {
		return _join.getFormat();
	}

	/**
	* Returns the job type of this join.
	*
	* @return the job type of this join
	*/
	@Override
	public java.lang.String getJobType() {
		return _join.getJobType();
	}

	/**
	* Returns the project category of this join.
	*
	* @return the project category of this join
	*/
	@Override
	public java.lang.String getProjectCategory() {
		return _join.getProjectCategory();
	}

	/**
	* Returns the project name of this join.
	*
	* @return the project name of this join
	*/
	@Override
	public java.lang.String getProjectName() {
		return _join.getProjectName();
	}

	/**
	* Returns the project type of this join.
	*
	* @return the project type of this join
	*/
	@Override
	public java.lang.String getProjectType() {
		return _join.getProjectType();
	}

	/**
	* Returns the project user uuid of this join.
	*
	* @return the project user uuid of this join
	*/
	@Override
	public java.lang.String getProjectUserUuid() {
		return _join.getProjectUserUuid();
	}

	/**
	* Returns the user name of this join.
	*
	* @return the user name of this join
	*/
	@Override
	public java.lang.String getUserName() {
		return _join.getUserName();
	}

	/**
	* Returns the user uuid of this join.
	*
	* @return the user uuid of this join
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _join.getUserUuid();
	}

	/**
	* Returns the variant of this join.
	*
	* @return the variant of this join
	*/
	@Override
	public java.lang.String getVariant() {
		return _join.getVariant();
	}

	@Override
	public java.lang.String toString() {
		return _join.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _join.toXmlString();
	}

	/**
	* Returns the artwork approved of this join.
	*
	* @return the artwork approved of this join
	*/
	@Override
	public Date getArtworkApproved() {
		return _join.getArtworkApproved();
	}

	/**
	* Returns the create date of this join.
	*
	* @return the create date of this join
	*/
	@Override
	public Date getCreateDate() {
		return _join.getCreateDate();
	}

	/**
	* Returns the market deployment of this join.
	*
	* @return the market deployment of this join
	*/
	@Override
	public Date getMarketDeployment() {
		return _join.getMarketDeployment();
	}

	/**
	* Returns the modified date of this join.
	*
	* @return the modified date of this join
	*/
	@Override
	public Date getModifiedDate() {
		return _join.getModifiedDate();
	}

	/**
	* Returns the separation files to printer of this join.
	*
	* @return the separation files to printer of this join
	*/
	@Override
	public Date getSeparationFilesToPrinter() {
		return _join.getSeparationFilesToPrinter();
	}

	/**
	* Returns the ship to trade of this join.
	*
	* @return the ship to trade of this join
	*/
	@Override
	public Date getShipToTrade() {
		return _join.getShipToTrade();
	}

	/**
	* Returns the visual design complete of this join.
	*
	* @return the visual design complete of this join
	*/
	@Override
	public Date getVisualDesignComplete() {
		return _join.getVisualDesignComplete();
	}

	/**
	* Returns the company ID of this join.
	*
	* @return the company ID of this join
	*/
	@Override
	public long getCompanyId() {
		return _join.getCompanyId();
	}

	/**
	* Returns the design agency of this join.
	*
	* @return the design agency of this join
	*/
	@Override
	public long getDesignAgency() {
		return _join.getDesignAgency();
	}

	/**
	* Returns the group ID of this join.
	*
	* @return the group ID of this join
	*/
	@Override
	public long getGroupId() {
		return _join.getGroupId();
	}

	/**
	* Returns the job ID of this join.
	*
	* @return the job ID of this join
	*/
	@Override
	public long getJobId() {
		return _join.getJobId();
	}

	/**
	* Returns the local marketing of this join.
	*
	* @return the local marketing of this join
	*/
	@Override
	public long getLocalMarketing() {
		return _join.getLocalMarketing();
	}

	/**
	* Returns the pma user of this join.
	*
	* @return the pma user of this join
	*/
	@Override
	public long getPmaUser() {
		return _join.getPmaUser();
	}

	/**
	* Returns the primary key of this join.
	*
	* @return the primary key of this join
	*/
	@Override
	public long getPrimaryKey() {
		return _join.getPrimaryKey();
	}

	/**
	* Returns the project ID of this join.
	*
	* @return the project ID of this join
	*/
	@Override
	public long getProjectId() {
		return _join.getProjectId();
	}

	/**
	* Returns the project user ID of this join.
	*
	* @return the project user ID of this join
	*/
	@Override
	public long getProjectUserId() {
		return _join.getProjectUserId();
	}

	/**
	* Returns the rnd local deploy user of this join.
	*
	* @return the rnd local deploy user of this join
	*/
	@Override
	public long getRndLocalDeployUser() {
		return _join.getRndLocalDeployUser();
	}

	/**
	* Returns the user ID of this join.
	*
	* @return the user ID of this join
	*/
	@Override
	public long getUserId() {
		return _join.getUserId();
	}

	@Override
	public void persist() {
		_join.persist();
	}

	/**
	* Sets the artwork approved of this join.
	*
	* @param artworkApproved the artwork approved of this join
	*/
	@Override
	public void setArtworkApproved(Date artworkApproved) {
		_join.setArtworkApproved(artworkApproved);
	}

	/**
	* Sets the brand of this join.
	*
	* @param brand the brand of this join
	*/
	@Override
	public void setBrand(java.lang.String brand) {
		_join.setBrand(brand);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_join.setCachedModel(cachedModel);
	}

	/**
	* Sets the change formulation of this join.
	*
	* @param changeFormulation the change formulation of this join
	*/
	@Override
	public void setChangeFormulation(java.lang.Boolean changeFormulation) {
		_join.setChangeFormulation(changeFormulation);
	}

	/**
	* Sets the change packaging of this join.
	*
	* @param changePackaging the change packaging of this join
	*/
	@Override
	public void setChangePackaging(java.lang.Boolean changePackaging) {
		_join.setChangePackaging(changePackaging);
	}

	/**
	* Sets the company ID of this join.
	*
	* @param companyId the company ID of this join
	*/
	@Override
	public void setCompanyId(long companyId) {
		_join.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this join.
	*
	* @param createDate the create date of this join
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_join.setCreateDate(createDate);
	}

	/**
	* Sets the design agency of this join.
	*
	* @param designAgency the design agency of this join
	*/
	@Override
	public void setDesignAgency(long designAgency) {
		_join.setDesignAgency(designAgency);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_join.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_join.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_join.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the format of this join.
	*
	* @param format the format of this join
	*/
	@Override
	public void setFormat(java.lang.String format) {
		_join.setFormat(format);
	}

	/**
	* Sets the group ID of this join.
	*
	* @param groupId the group ID of this join
	*/
	@Override
	public void setGroupId(long groupId) {
		_join.setGroupId(groupId);
	}

	/**
	* Sets the job ID of this join.
	*
	* @param jobId the job ID of this join
	*/
	@Override
	public void setJobId(long jobId) {
		_join.setJobId(jobId);
	}

	/**
	* Sets the job type of this join.
	*
	* @param jobType the job type of this join
	*/
	@Override
	public void setJobType(java.lang.String jobType) {
		_join.setJobType(jobType);
	}

	/**
	* Sets the local marketing of this join.
	*
	* @param localMarketing the local marketing of this join
	*/
	@Override
	public void setLocalMarketing(long localMarketing) {
		_join.setLocalMarketing(localMarketing);
	}

	/**
	* Sets the market deployment of this join.
	*
	* @param marketDeployment the market deployment of this join
	*/
	@Override
	public void setMarketDeployment(Date marketDeployment) {
		_join.setMarketDeployment(marketDeployment);
	}

	/**
	* Sets the modified date of this join.
	*
	* @param modifiedDate the modified date of this join
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_join.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_join.setNew(n);
	}

	/**
	* Sets the noticable consumers of this join.
	*
	* @param noticableConsumers the noticable consumers of this join
	*/
	@Override
	public void setNoticableConsumers(java.lang.Boolean noticableConsumers) {
		_join.setNoticableConsumers(noticableConsumers);
	}

	/**
	* Sets the pma user of this join.
	*
	* @param pmaUser the pma user of this join
	*/
	@Override
	public void setPmaUser(long pmaUser) {
		_join.setPmaUser(pmaUser);
	}

	/**
	* Sets the primary key of this join.
	*
	* @param primaryKey the primary key of this join
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_join.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_join.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the project category of this join.
	*
	* @param projectCategory the project category of this join
	*/
	@Override
	public void setProjectCategory(java.lang.String projectCategory) {
		_join.setProjectCategory(projectCategory);
	}

	/**
	* Sets the project ID of this join.
	*
	* @param projectId the project ID of this join
	*/
	@Override
	public void setProjectId(long projectId) {
		_join.setProjectId(projectId);
	}

	/**
	* Sets the project name of this join.
	*
	* @param projectName the project name of this join
	*/
	@Override
	public void setProjectName(java.lang.String projectName) {
		_join.setProjectName(projectName);
	}

	/**
	* Sets the project type of this join.
	*
	* @param projectType the project type of this join
	*/
	@Override
	public void setProjectType(java.lang.String projectType) {
		_join.setProjectType(projectType);
	}

	/**
	* Sets the project user ID of this join.
	*
	* @param projectUserId the project user ID of this join
	*/
	@Override
	public void setProjectUserId(long projectUserId) {
		_join.setProjectUserId(projectUserId);
	}

	/**
	* Sets the project user uuid of this join.
	*
	* @param projectUserUuid the project user uuid of this join
	*/
	@Override
	public void setProjectUserUuid(java.lang.String projectUserUuid) {
		_join.setProjectUserUuid(projectUserUuid);
	}

	/**
	* Sets the rnd local deploy user of this join.
	*
	* @param rndLocalDeployUser the rnd local deploy user of this join
	*/
	@Override
	public void setRndLocalDeployUser(long rndLocalDeployUser) {
		_join.setRndLocalDeployUser(rndLocalDeployUser);
	}

	/**
	* Sets the separation files to printer of this join.
	*
	* @param separationFilesToPrinter the separation files to printer of this join
	*/
	@Override
	public void setSeparationFilesToPrinter(Date separationFilesToPrinter) {
		_join.setSeparationFilesToPrinter(separationFilesToPrinter);
	}

	/**
	* Sets the ship to trade of this join.
	*
	* @param shipToTrade the ship to trade of this join
	*/
	@Override
	public void setShipToTrade(Date shipToTrade) {
		_join.setShipToTrade(shipToTrade);
	}

	/**
	* Sets the user ID of this join.
	*
	* @param userId the user ID of this join
	*/
	@Override
	public void setUserId(long userId) {
		_join.setUserId(userId);
	}

	/**
	* Sets the user name of this join.
	*
	* @param userName the user name of this join
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_join.setUserName(userName);
	}

	/**
	* Sets the user uuid of this join.
	*
	* @param userUuid the user uuid of this join
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_join.setUserUuid(userUuid);
	}

	/**
	* Sets the variant of this join.
	*
	* @param variant the variant of this join
	*/
	@Override
	public void setVariant(java.lang.String variant) {
		_join.setVariant(variant);
	}

	/**
	* Sets the visual design of this join.
	*
	* @param visualDesign the visual design of this join
	*/
	@Override
	public void setVisualDesign(java.lang.Boolean visualDesign) {
		_join.setVisualDesign(visualDesign);
	}

	/**
	* Sets the visual design complete of this join.
	*
	* @param visualDesignComplete the visual design complete of this join
	*/
	@Override
	public void setVisualDesignComplete(Date visualDesignComplete) {
		_join.setVisualDesignComplete(visualDesignComplete);
	}

	/**
	* Sets the visual design cu of this join.
	*
	* @param visualDesignCu the visual design cu of this join
	*/
	@Override
	public void setVisualDesignCu(java.lang.Boolean visualDesignCu) {
		_join.setVisualDesignCu(visualDesignCu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JoinWrapper)) {
			return false;
		}

		JoinWrapper joinWrapper = (JoinWrapper)obj;

		if (Objects.equals(_join, joinWrapper._join)) {
			return true;
		}

		return false;
	}

	@Override
	public Join getWrappedModel() {
		return _join;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _join.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _join.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_join.resetOriginalValues();
	}

	private final Join _join;
}