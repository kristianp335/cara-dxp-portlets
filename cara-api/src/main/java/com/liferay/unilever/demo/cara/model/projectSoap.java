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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.unilever.demo.cara.service.http.projectServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.unilever.demo.cara.service.http.projectServiceSoap
 * @generated
 */
@ProviderType
public class projectSoap implements Serializable {
	public static projectSoap toSoapModel(project model) {
		projectSoap soapModel = new projectSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setProjectRefId(model.getProjectRefId());
		soapModel.setProjectName(model.getProjectName());
		soapModel.setProjectType(model.getProjectType());
		soapModel.setBrand(model.getBrand());
		soapModel.setBrandPosition(model.getBrandPosition());
		soapModel.setProjectCategory(model.getProjectCategory());
		soapModel.setCharterGateApproval(model.getCharterGateApproval());
		soapModel.setProductDesignLock(model.getProductDesignLock());
		soapModel.setContractGateApproval(model.getContractGateApproval());
		soapModel.setMarketReadyApproval(model.getMarketReadyApproval());
		soapModel.setMarketDeployment(model.getMarketDeployment());
		soapModel.setShipToTrade(model.getShipToTrade());
		soapModel.setMarketingUserId(model.getMarketingUserId());
		soapModel.setRndUserId(model.getRndUserId());
		soapModel.setRndProductUserId(model.getRndProductUserId());
		soapModel.setSupplyChainUserId(model.getSupplyChainUserId());
		soapModel.setCustomerDevelopmentUserId(model.getCustomerDevelopmentUserId());
		soapModel.setTechLeaderUserId(model.getTechLeaderUserId());

		return soapModel;
	}

	public static projectSoap[] toSoapModels(project[] models) {
		projectSoap[] soapModels = new projectSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static projectSoap[][] toSoapModels(project[][] models) {
		projectSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new projectSoap[models.length][models[0].length];
		}
		else {
			soapModels = new projectSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static projectSoap[] toSoapModels(List<project> models) {
		List<projectSoap> soapModels = new ArrayList<projectSoap>(models.size());

		for (project model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new projectSoap[soapModels.size()]);
	}

	public projectSoap() {
	}

	public long getPrimaryKey() {
		return _projectId;
	}

	public void setPrimaryKey(long pk) {
		setProjectId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
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

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getProjectRefId() {
		return _projectRefId;
	}

	public void setProjectRefId(String projectRefId) {
		_projectRefId = projectRefId;
	}

	public String getProjectName() {
		return _projectName;
	}

	public void setProjectName(String projectName) {
		_projectName = projectName;
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

	public String getBrandPosition() {
		return _brandPosition;
	}

	public void setBrandPosition(String brandPosition) {
		_brandPosition = brandPosition;
	}

	public String getProjectCategory() {
		return _projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		_projectCategory = projectCategory;
	}

	public Date getCharterGateApproval() {
		return _charterGateApproval;
	}

	public void setCharterGateApproval(Date charterGateApproval) {
		_charterGateApproval = charterGateApproval;
	}

	public Date getProductDesignLock() {
		return _productDesignLock;
	}

	public void setProductDesignLock(Date productDesignLock) {
		_productDesignLock = productDesignLock;
	}

	public Date getContractGateApproval() {
		return _contractGateApproval;
	}

	public void setContractGateApproval(Date contractGateApproval) {
		_contractGateApproval = contractGateApproval;
	}

	public Date getMarketReadyApproval() {
		return _marketReadyApproval;
	}

	public void setMarketReadyApproval(Date marketReadyApproval) {
		_marketReadyApproval = marketReadyApproval;
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

	public long getMarketingUserId() {
		return _marketingUserId;
	}

	public void setMarketingUserId(long marketingUserId) {
		_marketingUserId = marketingUserId;
	}

	public long getRndUserId() {
		return _rndUserId;
	}

	public void setRndUserId(long rndUserId) {
		_rndUserId = rndUserId;
	}

	public long getRndProductUserId() {
		return _rndProductUserId;
	}

	public void setRndProductUserId(long rndProductUserId) {
		_rndProductUserId = rndProductUserId;
	}

	public long getSupplyChainUserId() {
		return _supplyChainUserId;
	}

	public void setSupplyChainUserId(long supplyChainUserId) {
		_supplyChainUserId = supplyChainUserId;
	}

	public long getCustomerDevelopmentUserId() {
		return _customerDevelopmentUserId;
	}

	public void setCustomerDevelopmentUserId(long customerDevelopmentUserId) {
		_customerDevelopmentUserId = customerDevelopmentUserId;
	}

	public long getTechLeaderUserId() {
		return _techLeaderUserId;
	}

	public void setTechLeaderUserId(long techLeaderUserId) {
		_techLeaderUserId = techLeaderUserId;
	}

	private String _uuid;
	private long _projectId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _projectRefId;
	private String _projectName;
	private String _projectType;
	private String _brand;
	private String _brandPosition;
	private String _projectCategory;
	private Date _charterGateApproval;
	private Date _productDesignLock;
	private Date _contractGateApproval;
	private Date _marketReadyApproval;
	private Date _marketDeployment;
	private Date _shipToTrade;
	private long _marketingUserId;
	private long _rndUserId;
	private long _rndProductUserId;
	private long _supplyChainUserId;
	private long _customerDevelopmentUserId;
	private long _techLeaderUserId;
}