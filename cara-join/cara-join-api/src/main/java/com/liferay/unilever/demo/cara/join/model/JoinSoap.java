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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.unilever.demo.cara.join.service.http.JoinServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.unilever.demo.cara.join.service.http.JoinServiceSoap
 * @generated
 */
@ProviderType
public class JoinSoap implements Serializable {
	public static JoinSoap toSoapModel(Join model) {
		JoinSoap soapModel = new JoinSoap();

		soapModel.setJobId(model.getJobId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setJobType(model.getJobType());
		soapModel.setVariant(model.getVariant());
		soapModel.setFormat(model.getFormat());
		soapModel.setVisualDesign(model.getVisualDesign());
		soapModel.setVisualDesignCu(model.getVisualDesignCu());
		soapModel.setNoticableConsumers(model.getNoticableConsumers());
		soapModel.setChangePackaging(model.getChangePackaging());
		soapModel.setChangeFormulation(model.getChangeFormulation());
		soapModel.setVisualDesignComplete(model.getVisualDesignComplete());
		soapModel.setArtworkApproved(model.getArtworkApproved());
		soapModel.setSeparationFilesToPrinter(model.getSeparationFilesToPrinter());
		soapModel.setMarketDeployment(model.getMarketDeployment());
		soapModel.setShipToTrade(model.getShipToTrade());
		soapModel.setDesignAgency(model.getDesignAgency());
		soapModel.setPmaUser(model.getPmaUser());
		soapModel.setLocalMarketing(model.getLocalMarketing());
		soapModel.setRndLocalDeployUser(model.getRndLocalDeployUser());
		soapModel.setProjectName(model.getProjectName());
		soapModel.setProjectCategory(model.getProjectCategory());
		soapModel.setProjectType(model.getProjectType());
		soapModel.setBrand(model.getBrand());
		soapModel.setProjectUserId(model.getProjectUserId());

		return soapModel;
	}

	public static JoinSoap[] toSoapModels(Join[] models) {
		JoinSoap[] soapModels = new JoinSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JoinSoap[][] toSoapModels(Join[][] models) {
		JoinSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JoinSoap[models.length][models[0].length];
		}
		else {
			soapModels = new JoinSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JoinSoap[] toSoapModels(List<Join> models) {
		List<JoinSoap> soapModels = new ArrayList<JoinSoap>(models.size());

		for (Join model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JoinSoap[soapModels.size()]);
	}

	public JoinSoap() {
	}

	public long getPrimaryKey() {
		return _jobId;
	}

	public void setPrimaryKey(long pk) {
		setJobId(pk);
	}

	public long getJobId() {
		return _jobId;
	}

	public void setJobId(long jobId) {
		_jobId = jobId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
	}

	public String getJobType() {
		return _jobType;
	}

	public void setJobType(String jobType) {
		_jobType = jobType;
	}

	public String getVariant() {
		return _variant;
	}

	public void setVariant(String variant) {
		_variant = variant;
	}

	public String getFormat() {
		return _format;
	}

	public void setFormat(String format) {
		_format = format;
	}

	public Boolean getVisualDesign() {
		return _visualDesign;
	}

	public void setVisualDesign(Boolean visualDesign) {
		_visualDesign = visualDesign;
	}

	public Boolean getVisualDesignCu() {
		return _visualDesignCu;
	}

	public void setVisualDesignCu(Boolean visualDesignCu) {
		_visualDesignCu = visualDesignCu;
	}

	public Boolean getNoticableConsumers() {
		return _noticableConsumers;
	}

	public void setNoticableConsumers(Boolean noticableConsumers) {
		_noticableConsumers = noticableConsumers;
	}

	public Boolean getChangePackaging() {
		return _changePackaging;
	}

	public void setChangePackaging(Boolean changePackaging) {
		_changePackaging = changePackaging;
	}

	public Boolean getChangeFormulation() {
		return _changeFormulation;
	}

	public void setChangeFormulation(Boolean changeFormulation) {
		_changeFormulation = changeFormulation;
	}

	public Date getVisualDesignComplete() {
		return _visualDesignComplete;
	}

	public void setVisualDesignComplete(Date visualDesignComplete) {
		_visualDesignComplete = visualDesignComplete;
	}

	public Date getArtworkApproved() {
		return _artworkApproved;
	}

	public void setArtworkApproved(Date artworkApproved) {
		_artworkApproved = artworkApproved;
	}

	public Date getSeparationFilesToPrinter() {
		return _separationFilesToPrinter;
	}

	public void setSeparationFilesToPrinter(Date separationFilesToPrinter) {
		_separationFilesToPrinter = separationFilesToPrinter;
	}

	public Date getMarketDeployment() {
		return _marketDeployment;
	}

	public void setMarketDeployment(Date marketDeployment) {
		_marketDeployment = marketDeployment;
	}

	public Date getShipToTrade() {
		return _shipToTrade;
	}

	public void setShipToTrade(Date shipToTrade) {
		_shipToTrade = shipToTrade;
	}

	public long getDesignAgency() {
		return _designAgency;
	}

	public void setDesignAgency(long designAgency) {
		_designAgency = designAgency;
	}

	public long getPmaUser() {
		return _pmaUser;
	}

	public void setPmaUser(long pmaUser) {
		_pmaUser = pmaUser;
	}

	public long getLocalMarketing() {
		return _localMarketing;
	}

	public void setLocalMarketing(long localMarketing) {
		_localMarketing = localMarketing;
	}

	public long getRndLocalDeployUser() {
		return _rndLocalDeployUser;
	}

	public void setRndLocalDeployUser(long rndLocalDeployUser) {
		_rndLocalDeployUser = rndLocalDeployUser;
	}

	public String getProjectName() {
		return _projectName;
	}

	public void setProjectName(String projectName) {
		_projectName = projectName;
	}

	public String getProjectCategory() {
		return _projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		_projectCategory = projectCategory;
	}

	public String getProjectType() {
		return _projectType;
	}

	public void setProjectType(String projectType) {
		_projectType = projectType;
	}

	public String getBrand() {
		return _brand;
	}

	public void setBrand(String brand) {
		_brand = brand;
	}

	public long getProjectUserId() {
		return _projectUserId;
	}

	public void setProjectUserId(long projectUserId) {
		_projectUserId = projectUserId;
	}

	private long _jobId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _projectId;
	private String _jobType;
	private String _variant;
	private String _format;
	private Boolean _visualDesign;
	private Boolean _visualDesignCu;
	private Boolean _noticableConsumers;
	private Boolean _changePackaging;
	private Boolean _changeFormulation;
	private Date _visualDesignComplete;
	private Date _artworkApproved;
	private Date _separationFilesToPrinter;
	private Date _marketDeployment;
	private Date _shipToTrade;
	private long _designAgency;
	private long _pmaUser;
	private long _localMarketing;
	private long _rndLocalDeployUser;
	private String _projectName;
	private String _projectCategory;
	private String _projectType;
	private String _brand;
	private long _projectUserId;
}