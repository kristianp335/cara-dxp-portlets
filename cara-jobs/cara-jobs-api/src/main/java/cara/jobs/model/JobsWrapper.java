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

package cara.jobs.model;

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
 * This class is a wrapper for {@link Jobs}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Jobs
 * @generated
 */
@ProviderType
public class JobsWrapper implements Jobs, ModelWrapper<Jobs> {
	public JobsWrapper(Jobs jobs) {
		_jobs = jobs;
	}

	@Override
	public Class<?> getModelClass() {
		return Jobs.class;
	}

	@Override
	public String getModelClassName() {
		return Jobs.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
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

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

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
	}

	@Override
	public boolean isCachedModel() {
		return _jobs.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _jobs.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _jobs.isNew();
	}

	@Override
	public cara.jobs.model.Jobs toEscapedModel() {
		return new JobsWrapper(_jobs.toEscapedModel());
	}

	@Override
	public cara.jobs.model.Jobs toUnescapedModel() {
		return new JobsWrapper(_jobs.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _jobs.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<cara.jobs.model.Jobs> toCacheModel() {
		return _jobs.toCacheModel();
	}

	@Override
	public int compareTo(cara.jobs.model.Jobs jobs) {
		return _jobs.compareTo(jobs);
	}

	@Override
	public int hashCode() {
		return _jobs.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jobs.getPrimaryKeyObj();
	}

	/**
	* Returns the change formulation of this jobs.
	*
	* @return the change formulation of this jobs
	*/
	@Override
	public java.lang.Boolean getChangeFormulation() {
		return _jobs.getChangeFormulation();
	}

	/**
	* Returns the change packaging of this jobs.
	*
	* @return the change packaging of this jobs
	*/
	@Override
	public java.lang.Boolean getChangePackaging() {
		return _jobs.getChangePackaging();
	}

	/**
	* Returns the noticable consumers of this jobs.
	*
	* @return the noticable consumers of this jobs
	*/
	@Override
	public java.lang.Boolean getNoticableConsumers() {
		return _jobs.getNoticableConsumers();
	}

	/**
	* Returns the visual design of this jobs.
	*
	* @return the visual design of this jobs
	*/
	@Override
	public java.lang.Boolean getVisualDesign() {
		return _jobs.getVisualDesign();
	}

	/**
	* Returns the visual design cu of this jobs.
	*
	* @return the visual design cu of this jobs
	*/
	@Override
	public java.lang.Boolean getVisualDesignCu() {
		return _jobs.getVisualDesignCu();
	}

	@Override
	public java.lang.Object clone() {
		return new JobsWrapper((Jobs)_jobs.clone());
	}

	/**
	* Returns the format of this jobs.
	*
	* @return the format of this jobs
	*/
	@Override
	public java.lang.String getFormat() {
		return _jobs.getFormat();
	}

	/**
	* Returns the job type of this jobs.
	*
	* @return the job type of this jobs
	*/
	@Override
	public java.lang.String getJobType() {
		return _jobs.getJobType();
	}

	/**
	* Returns the user name of this jobs.
	*
	* @return the user name of this jobs
	*/
	@Override
	public java.lang.String getUserName() {
		return _jobs.getUserName();
	}

	/**
	* Returns the user uuid of this jobs.
	*
	* @return the user uuid of this jobs
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _jobs.getUserUuid();
	}

	/**
	* Returns the uuid of this jobs.
	*
	* @return the uuid of this jobs
	*/
	@Override
	public java.lang.String getUuid() {
		return _jobs.getUuid();
	}

	/**
	* Returns the variant of this jobs.
	*
	* @return the variant of this jobs
	*/
	@Override
	public java.lang.String getVariant() {
		return _jobs.getVariant();
	}

	@Override
	public java.lang.String toString() {
		return _jobs.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jobs.toXmlString();
	}

	/**
	* Returns the artwork approved of this jobs.
	*
	* @return the artwork approved of this jobs
	*/
	@Override
	public Date getArtworkApproved() {
		return _jobs.getArtworkApproved();
	}

	/**
	* Returns the create date of this jobs.
	*
	* @return the create date of this jobs
	*/
	@Override
	public Date getCreateDate() {
		return _jobs.getCreateDate();
	}

	/**
	* Returns the market deployment of this jobs.
	*
	* @return the market deployment of this jobs
	*/
	@Override
	public Date getMarketDeployment() {
		return _jobs.getMarketDeployment();
	}

	/**
	* Returns the modified date of this jobs.
	*
	* @return the modified date of this jobs
	*/
	@Override
	public Date getModifiedDate() {
		return _jobs.getModifiedDate();
	}

	/**
	* Returns the separation files to printer of this jobs.
	*
	* @return the separation files to printer of this jobs
	*/
	@Override
	public Date getSeparationFilesToPrinter() {
		return _jobs.getSeparationFilesToPrinter();
	}

	/**
	* Returns the ship to trade of this jobs.
	*
	* @return the ship to trade of this jobs
	*/
	@Override
	public Date getShipToTrade() {
		return _jobs.getShipToTrade();
	}

	/**
	* Returns the visual design complete of this jobs.
	*
	* @return the visual design complete of this jobs
	*/
	@Override
	public Date getVisualDesignComplete() {
		return _jobs.getVisualDesignComplete();
	}

	/**
	* Returns the company ID of this jobs.
	*
	* @return the company ID of this jobs
	*/
	@Override
	public long getCompanyId() {
		return _jobs.getCompanyId();
	}

	/**
	* Returns the design agency of this jobs.
	*
	* @return the design agency of this jobs
	*/
	@Override
	public long getDesignAgency() {
		return _jobs.getDesignAgency();
	}

	/**
	* Returns the group ID of this jobs.
	*
	* @return the group ID of this jobs
	*/
	@Override
	public long getGroupId() {
		return _jobs.getGroupId();
	}

	/**
	* Returns the job ID of this jobs.
	*
	* @return the job ID of this jobs
	*/
	@Override
	public long getJobId() {
		return _jobs.getJobId();
	}

	/**
	* Returns the local marketing of this jobs.
	*
	* @return the local marketing of this jobs
	*/
	@Override
	public long getLocalMarketing() {
		return _jobs.getLocalMarketing();
	}

	/**
	* Returns the pma user of this jobs.
	*
	* @return the pma user of this jobs
	*/
	@Override
	public long getPmaUser() {
		return _jobs.getPmaUser();
	}

	/**
	* Returns the primary key of this jobs.
	*
	* @return the primary key of this jobs
	*/
	@Override
	public long getPrimaryKey() {
		return _jobs.getPrimaryKey();
	}

	/**
	* Returns the project ID of this jobs.
	*
	* @return the project ID of this jobs
	*/
	@Override
	public long getProjectId() {
		return _jobs.getProjectId();
	}

	/**
	* Returns the rnd local deploy user of this jobs.
	*
	* @return the rnd local deploy user of this jobs
	*/
	@Override
	public long getRndLocalDeployUser() {
		return _jobs.getRndLocalDeployUser();
	}

	/**
	* Returns the user ID of this jobs.
	*
	* @return the user ID of this jobs
	*/
	@Override
	public long getUserId() {
		return _jobs.getUserId();
	}

	@Override
	public void persist() {
		_jobs.persist();
	}

	/**
	* Sets the artwork approved of this jobs.
	*
	* @param artworkApproved the artwork approved of this jobs
	*/
	@Override
	public void setArtworkApproved(Date artworkApproved) {
		_jobs.setArtworkApproved(artworkApproved);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jobs.setCachedModel(cachedModel);
	}

	/**
	* Sets the change formulation of this jobs.
	*
	* @param changeFormulation the change formulation of this jobs
	*/
	@Override
	public void setChangeFormulation(java.lang.Boolean changeFormulation) {
		_jobs.setChangeFormulation(changeFormulation);
	}

	/**
	* Sets the change packaging of this jobs.
	*
	* @param changePackaging the change packaging of this jobs
	*/
	@Override
	public void setChangePackaging(java.lang.Boolean changePackaging) {
		_jobs.setChangePackaging(changePackaging);
	}

	/**
	* Sets the company ID of this jobs.
	*
	* @param companyId the company ID of this jobs
	*/
	@Override
	public void setCompanyId(long companyId) {
		_jobs.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this jobs.
	*
	* @param createDate the create date of this jobs
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_jobs.setCreateDate(createDate);
	}

	/**
	* Sets the design agency of this jobs.
	*
	* @param designAgency the design agency of this jobs
	*/
	@Override
	public void setDesignAgency(long designAgency) {
		_jobs.setDesignAgency(designAgency);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_jobs.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_jobs.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_jobs.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the format of this jobs.
	*
	* @param format the format of this jobs
	*/
	@Override
	public void setFormat(java.lang.String format) {
		_jobs.setFormat(format);
	}

	/**
	* Sets the group ID of this jobs.
	*
	* @param groupId the group ID of this jobs
	*/
	@Override
	public void setGroupId(long groupId) {
		_jobs.setGroupId(groupId);
	}

	/**
	* Sets the job ID of this jobs.
	*
	* @param jobId the job ID of this jobs
	*/
	@Override
	public void setJobId(long jobId) {
		_jobs.setJobId(jobId);
	}

	/**
	* Sets the job type of this jobs.
	*
	* @param jobType the job type of this jobs
	*/
	@Override
	public void setJobType(java.lang.String jobType) {
		_jobs.setJobType(jobType);
	}

	/**
	* Sets the local marketing of this jobs.
	*
	* @param localMarketing the local marketing of this jobs
	*/
	@Override
	public void setLocalMarketing(long localMarketing) {
		_jobs.setLocalMarketing(localMarketing);
	}

	/**
	* Sets the market deployment of this jobs.
	*
	* @param marketDeployment the market deployment of this jobs
	*/
	@Override
	public void setMarketDeployment(Date marketDeployment) {
		_jobs.setMarketDeployment(marketDeployment);
	}

	/**
	* Sets the modified date of this jobs.
	*
	* @param modifiedDate the modified date of this jobs
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_jobs.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_jobs.setNew(n);
	}

	/**
	* Sets the noticable consumers of this jobs.
	*
	* @param noticableConsumers the noticable consumers of this jobs
	*/
	@Override
	public void setNoticableConsumers(java.lang.Boolean noticableConsumers) {
		_jobs.setNoticableConsumers(noticableConsumers);
	}

	/**
	* Sets the pma user of this jobs.
	*
	* @param pmaUser the pma user of this jobs
	*/
	@Override
	public void setPmaUser(long pmaUser) {
		_jobs.setPmaUser(pmaUser);
	}

	/**
	* Sets the primary key of this jobs.
	*
	* @param primaryKey the primary key of this jobs
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_jobs.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_jobs.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the project ID of this jobs.
	*
	* @param projectId the project ID of this jobs
	*/
	@Override
	public void setProjectId(long projectId) {
		_jobs.setProjectId(projectId);
	}

	/**
	* Sets the rnd local deploy user of this jobs.
	*
	* @param rndLocalDeployUser the rnd local deploy user of this jobs
	*/
	@Override
	public void setRndLocalDeployUser(long rndLocalDeployUser) {
		_jobs.setRndLocalDeployUser(rndLocalDeployUser);
	}

	/**
	* Sets the separation files to printer of this jobs.
	*
	* @param separationFilesToPrinter the separation files to printer of this jobs
	*/
	@Override
	public void setSeparationFilesToPrinter(Date separationFilesToPrinter) {
		_jobs.setSeparationFilesToPrinter(separationFilesToPrinter);
	}

	/**
	* Sets the ship to trade of this jobs.
	*
	* @param shipToTrade the ship to trade of this jobs
	*/
	@Override
	public void setShipToTrade(Date shipToTrade) {
		_jobs.setShipToTrade(shipToTrade);
	}

	/**
	* Sets the user ID of this jobs.
	*
	* @param userId the user ID of this jobs
	*/
	@Override
	public void setUserId(long userId) {
		_jobs.setUserId(userId);
	}

	/**
	* Sets the user name of this jobs.
	*
	* @param userName the user name of this jobs
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_jobs.setUserName(userName);
	}

	/**
	* Sets the user uuid of this jobs.
	*
	* @param userUuid the user uuid of this jobs
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_jobs.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this jobs.
	*
	* @param uuid the uuid of this jobs
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_jobs.setUuid(uuid);
	}

	/**
	* Sets the variant of this jobs.
	*
	* @param variant the variant of this jobs
	*/
	@Override
	public void setVariant(java.lang.String variant) {
		_jobs.setVariant(variant);
	}

	/**
	* Sets the visual design of this jobs.
	*
	* @param visualDesign the visual design of this jobs
	*/
	@Override
	public void setVisualDesign(java.lang.Boolean visualDesign) {
		_jobs.setVisualDesign(visualDesign);
	}

	/**
	* Sets the visual design complete of this jobs.
	*
	* @param visualDesignComplete the visual design complete of this jobs
	*/
	@Override
	public void setVisualDesignComplete(Date visualDesignComplete) {
		_jobs.setVisualDesignComplete(visualDesignComplete);
	}

	/**
	* Sets the visual design cu of this jobs.
	*
	* @param visualDesignCu the visual design cu of this jobs
	*/
	@Override
	public void setVisualDesignCu(java.lang.Boolean visualDesignCu) {
		_jobs.setVisualDesignCu(visualDesignCu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobsWrapper)) {
			return false;
		}

		JobsWrapper jobsWrapper = (JobsWrapper)obj;

		if (Objects.equals(_jobs, jobsWrapper._jobs)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _jobs.getStagedModelType();
	}

	@Override
	public Jobs getWrappedModel() {
		return _jobs;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _jobs.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _jobs.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_jobs.resetOriginalValues();
	}

	private final Jobs _jobs;
}