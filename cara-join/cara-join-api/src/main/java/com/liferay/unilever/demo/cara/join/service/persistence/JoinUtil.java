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

package com.liferay.unilever.demo.cara.join.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.unilever.demo.cara.join.model.Join;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the join service. This utility wraps {@link com.liferay.unilever.demo.cara.join.service.persistence.impl.JoinPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JoinPersistence
 * @see com.liferay.unilever.demo.cara.join.service.persistence.impl.JoinPersistenceImpl
 * @generated
 */
@ProviderType
public class JoinUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Join join) {
		getPersistence().clearCache(join);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Join> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Join> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Join> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Join> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Join update(Join join) {
		return getPersistence().update(join);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Join update(Join join, ServiceContext serviceContext) {
		return getPersistence().update(join, serviceContext);
	}

	/**
	* Returns all the joins where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the matching joins
	*/
	public static List<Join> findByprojectId(long projectId) {
		return getPersistence().findByprojectId(projectId);
	}

	/**
	* Returns a range of all the joins where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JoinModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of joins
	* @param end the upper bound of the range of joins (not inclusive)
	* @return the range of matching joins
	*/
	public static List<Join> findByprojectId(long projectId, int start, int end) {
		return getPersistence().findByprojectId(projectId, start, end);
	}

	/**
	* Returns an ordered range of all the joins where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JoinModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of joins
	* @param end the upper bound of the range of joins (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching joins
	*/
	public static List<Join> findByprojectId(long projectId, int start,
		int end, OrderByComparator<Join> orderByComparator) {
		return getPersistence()
				   .findByprojectId(projectId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the joins where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JoinModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of joins
	* @param end the upper bound of the range of joins (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching joins
	*/
	public static List<Join> findByprojectId(long projectId, int start,
		int end, OrderByComparator<Join> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByprojectId(projectId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first join in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching join
	* @throws NoSuchJoinException if a matching join could not be found
	*/
	public static Join findByprojectId_First(long projectId,
		OrderByComparator<Join> orderByComparator)
		throws com.liferay.unilever.demo.cara.join.exception.NoSuchJoinException {
		return getPersistence()
				   .findByprojectId_First(projectId, orderByComparator);
	}

	/**
	* Returns the first join in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching join, or <code>null</code> if a matching join could not be found
	*/
	public static Join fetchByprojectId_First(long projectId,
		OrderByComparator<Join> orderByComparator) {
		return getPersistence()
				   .fetchByprojectId_First(projectId, orderByComparator);
	}

	/**
	* Returns the last join in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching join
	* @throws NoSuchJoinException if a matching join could not be found
	*/
	public static Join findByprojectId_Last(long projectId,
		OrderByComparator<Join> orderByComparator)
		throws com.liferay.unilever.demo.cara.join.exception.NoSuchJoinException {
		return getPersistence()
				   .findByprojectId_Last(projectId, orderByComparator);
	}

	/**
	* Returns the last join in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching join, or <code>null</code> if a matching join could not be found
	*/
	public static Join fetchByprojectId_Last(long projectId,
		OrderByComparator<Join> orderByComparator) {
		return getPersistence()
				   .fetchByprojectId_Last(projectId, orderByComparator);
	}

	/**
	* Returns the joins before and after the current join in the ordered set where projectId = &#63;.
	*
	* @param jobId the primary key of the current join
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next join
	* @throws NoSuchJoinException if a join with the primary key could not be found
	*/
	public static Join[] findByprojectId_PrevAndNext(long jobId,
		long projectId, OrderByComparator<Join> orderByComparator)
		throws com.liferay.unilever.demo.cara.join.exception.NoSuchJoinException {
		return getPersistence()
				   .findByprojectId_PrevAndNext(jobId, projectId,
			orderByComparator);
	}

	/**
	* Removes all the joins where projectId = &#63; from the database.
	*
	* @param projectId the project ID
	*/
	public static void removeByprojectId(long projectId) {
		getPersistence().removeByprojectId(projectId);
	}

	/**
	* Returns the number of joins where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the number of matching joins
	*/
	public static int countByprojectId(long projectId) {
		return getPersistence().countByprojectId(projectId);
	}

	/**
	* Caches the join in the entity cache if it is enabled.
	*
	* @param join the join
	*/
	public static void cacheResult(Join join) {
		getPersistence().cacheResult(join);
	}

	/**
	* Caches the joins in the entity cache if it is enabled.
	*
	* @param joins the joins
	*/
	public static void cacheResult(List<Join> joins) {
		getPersistence().cacheResult(joins);
	}

	/**
	* Creates a new join with the primary key. Does not add the join to the database.
	*
	* @param jobId the primary key for the new join
	* @return the new join
	*/
	public static Join create(long jobId) {
		return getPersistence().create(jobId);
	}

	/**
	* Removes the join with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the join
	* @return the join that was removed
	* @throws NoSuchJoinException if a join with the primary key could not be found
	*/
	public static Join remove(long jobId)
		throws com.liferay.unilever.demo.cara.join.exception.NoSuchJoinException {
		return getPersistence().remove(jobId);
	}

	public static Join updateImpl(Join join) {
		return getPersistence().updateImpl(join);
	}

	/**
	* Returns the join with the primary key or throws a {@link NoSuchJoinException} if it could not be found.
	*
	* @param jobId the primary key of the join
	* @return the join
	* @throws NoSuchJoinException if a join with the primary key could not be found
	*/
	public static Join findByPrimaryKey(long jobId)
		throws com.liferay.unilever.demo.cara.join.exception.NoSuchJoinException {
		return getPersistence().findByPrimaryKey(jobId);
	}

	/**
	* Returns the join with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobId the primary key of the join
	* @return the join, or <code>null</code> if a join with the primary key could not be found
	*/
	public static Join fetchByPrimaryKey(long jobId) {
		return getPersistence().fetchByPrimaryKey(jobId);
	}

	public static java.util.Map<java.io.Serializable, Join> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the joins.
	*
	* @return the joins
	*/
	public static List<Join> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the joins.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JoinModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of joins
	* @param end the upper bound of the range of joins (not inclusive)
	* @return the range of joins
	*/
	public static List<Join> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the joins.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JoinModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of joins
	* @param end the upper bound of the range of joins (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of joins
	*/
	public static List<Join> findAll(int start, int end,
		OrderByComparator<Join> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the joins.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JoinModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of joins
	* @param end the upper bound of the range of joins (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of joins
	*/
	public static List<Join> findAll(int start, int end,
		OrderByComparator<Join> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the joins from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of joins.
	*
	* @return the number of joins
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JoinPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JoinPersistence, JoinPersistence> _serviceTracker =
		ServiceTrackerFactory.open(JoinPersistence.class);
}