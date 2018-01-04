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

package com.liferay.unilever.demo.cara.join.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JoinLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JoinLocalService
 * @generated
 */
@ProviderType
public class JoinLocalServiceWrapper implements JoinLocalService,
	ServiceWrapper<JoinLocalService> {
	public JoinLocalServiceWrapper(JoinLocalService joinLocalService) {
		_joinLocalService = joinLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _joinLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _joinLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _joinLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _joinLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _joinLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the join to the database. Also notifies the appropriate model listeners.
	*
	* @param join the join
	* @return the join that was added
	*/
	@Override
	public com.liferay.unilever.demo.cara.join.model.Join addJoin(
		com.liferay.unilever.demo.cara.join.model.Join join) {
		return _joinLocalService.addJoin(join);
	}

	/**
	* Creates a new join with the primary key. Does not add the join to the database.
	*
	* @param jobId the primary key for the new join
	* @return the new join
	*/
	@Override
	public com.liferay.unilever.demo.cara.join.model.Join createJoin(long jobId) {
		return _joinLocalService.createJoin(jobId);
	}

	/**
	* Deletes the join from the database. Also notifies the appropriate model listeners.
	*
	* @param join the join
	* @return the join that was removed
	*/
	@Override
	public com.liferay.unilever.demo.cara.join.model.Join deleteJoin(
		com.liferay.unilever.demo.cara.join.model.Join join) {
		return _joinLocalService.deleteJoin(join);
	}

	/**
	* Deletes the join with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the join
	* @return the join that was removed
	* @throws PortalException if a join with the primary key could not be found
	*/
	@Override
	public com.liferay.unilever.demo.cara.join.model.Join deleteJoin(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _joinLocalService.deleteJoin(jobId);
	}

	@Override
	public com.liferay.unilever.demo.cara.join.model.Join fetchJoin(long jobId) {
		return _joinLocalService.fetchJoin(jobId);
	}

	/**
	* Returns the join with the primary key.
	*
	* @param jobId the primary key of the join
	* @return the join
	* @throws PortalException if a join with the primary key could not be found
	*/
	@Override
	public com.liferay.unilever.demo.cara.join.model.Join getJoin(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _joinLocalService.getJoin(jobId);
	}

	/**
	* Updates the join in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param join the join
	* @return the join that was updated
	*/
	@Override
	public com.liferay.unilever.demo.cara.join.model.Join updateJoin(
		com.liferay.unilever.demo.cara.join.model.Join join) {
		return _joinLocalService.updateJoin(join);
	}

	/**
	* Returns the number of joins.
	*
	* @return the number of joins
	*/
	@Override
	public int getJoinsCount() {
		return _joinLocalService.getJoinsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _joinLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _joinLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.join.model.impl.JoinModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _joinLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.join.model.impl.JoinModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _joinLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the joins.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.join.model.impl.JoinModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of joins
	* @param end the upper bound of the range of joins (not inclusive)
	* @return the range of joins
	*/
	@Override
	public java.util.List<com.liferay.unilever.demo.cara.join.model.Join> getJoins(
		int start, int end) {
		return _joinLocalService.getJoins(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _joinLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _joinLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public JoinLocalService getWrappedService() {
		return _joinLocalService;
	}

	@Override
	public void setWrappedService(JoinLocalService joinLocalService) {
		_joinLocalService = joinLocalService;
	}

	private JoinLocalService _joinLocalService;
}