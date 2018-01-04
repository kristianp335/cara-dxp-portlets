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

package com.liferay.unilever.demo.cara.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.unilever.demo.cara.model.project;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the project service. This utility wraps {@link com.liferay.unilever.demo.cara.service.persistence.impl.projectPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see projectPersistence
 * @see com.liferay.unilever.demo.cara.service.persistence.impl.projectPersistenceImpl
 * @generated
 */
@ProviderType
public class projectUtil {
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
	public static void clearCache(project project) {
		getPersistence().clearCache(project);
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
	public static List<project> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<project> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<project> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static project update(project project) {
		return getPersistence().update(project);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static project update(project project, ServiceContext serviceContext) {
		return getPersistence().update(project, serviceContext);
	}

	/**
	* Returns all the projects where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching projects
	*/
	public static List<project> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the projects where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public static List<project> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the projects where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public static List<project> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<project> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the projects where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projects
	*/
	public static List<project> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first project in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByUuid_First(java.lang.String uuid,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<project> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByUuid_Last(java.lang.String uuid,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<project> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where uuid = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project[] findByUuid_PrevAndNext(long projectId,
		java.lang.String uuid, OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByUuid_PrevAndNext(projectId, uuid, orderByComparator);
	}

	/**
	* Removes all the projects where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of projects where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching projects
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the project where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchprojectException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the project where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the project where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the project where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the project that was removed
	*/
	public static project removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of projects where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching projects
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the projects where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching projects
	*/
	public static List<project> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the projects where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public static List<project> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the projects where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public static List<project> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the projects where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projects
	*/
	public static List<project> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<project> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first project in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project[] findByUuid_C_PrevAndNext(long projectId,
		java.lang.String uuid, long companyId,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(projectId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the projects where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of projects where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching projects
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the projects where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching projects
	*/
	public static List<project> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the projects where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public static List<project> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the projects where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public static List<project> findByGroupId(long groupId, int start, int end,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the projects where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projects
	*/
	public static List<project> findByGroupId(long groupId, int start, int end,
		OrderByComparator<project> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first project in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByGroupId_First(long groupId,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByGroupId_First(long groupId,
		OrderByComparator<project> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByGroupId_Last(long groupId,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByGroupId_Last(long groupId,
		OrderByComparator<project> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where groupId = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project[] findByGroupId_PrevAndNext(long projectId,
		long groupId, OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(projectId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the projects where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of projects where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching projects
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the projects where status = &#63;.
	*
	* @param status the status
	* @return the matching projects
	*/
	public static List<project> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the projects where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public static List<project> findByStatus(int status, int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the projects where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public static List<project> findByStatus(int status, int start, int end,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the projects where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projects
	*/
	public static List<project> findByStatus(int status, int start, int end,
		OrderByComparator<project> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first project in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByStatus_First(int status,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByStatus_First(int status,
		OrderByComparator<project> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByStatus_Last(int status,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByStatus_Last(int status,
		OrderByComparator<project> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where status = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project[] findByStatus_PrevAndNext(long projectId,
		int status, OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByStatus_PrevAndNext(projectId, status,
			orderByComparator);
	}

	/**
	* Removes all the projects where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of projects where status = &#63;.
	*
	* @param status the status
	* @return the number of matching projects
	*/
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Returns all the projects where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching projects
	*/
	public static List<project> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	* Returns a range of all the projects where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public static List<project> findByG_S(long groupId, int status, int start,
		int end) {
		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the projects where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public static List<project> findByG_S(long groupId, int status, int start,
		int end, OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the projects where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projects
	*/
	public static List<project> findByG_S(long groupId, int status, int start,
		int end, OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first project in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByG_S_First(long groupId, int status,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByG_S_First(long groupId, int status,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByG_S_Last(long groupId, int status,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByG_S_Last(long groupId, int status,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project[] findByG_S_PrevAndNext(long projectId, long groupId,
		int status, OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByG_S_PrevAndNext(projectId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the projects where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	* Returns the number of projects where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching projects
	*/
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	* Returns all the projects where projectName = &#63;.
	*
	* @param projectName the project name
	* @return the matching projects
	*/
	public static List<project> findByProjectName(java.lang.String projectName) {
		return getPersistence().findByProjectName(projectName);
	}

	/**
	* Returns a range of all the projects where projectName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectName the project name
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public static List<project> findByProjectName(
		java.lang.String projectName, int start, int end) {
		return getPersistence().findByProjectName(projectName, start, end);
	}

	/**
	* Returns an ordered range of all the projects where projectName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectName the project name
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public static List<project> findByProjectName(
		java.lang.String projectName, int start, int end,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .findByProjectName(projectName, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the projects where projectName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectName the project name
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projects
	*/
	public static List<project> findByProjectName(
		java.lang.String projectName, int start, int end,
		OrderByComparator<project> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByProjectName(projectName, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first project in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByProjectName_First(
		java.lang.String projectName,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByProjectName_First(projectName, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByProjectName_First(
		java.lang.String projectName,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByProjectName_First(projectName, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByProjectName_Last(java.lang.String projectName,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByProjectName_Last(projectName, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByProjectName_Last(
		java.lang.String projectName,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByProjectName_Last(projectName, orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where projectName = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project[] findByProjectName_PrevAndNext(long projectId,
		java.lang.String projectName,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByProjectName_PrevAndNext(projectId, projectName,
			orderByComparator);
	}

	/**
	* Removes all the projects where projectName = &#63; from the database.
	*
	* @param projectName the project name
	*/
	public static void removeByProjectName(java.lang.String projectName) {
		getPersistence().removeByProjectName(projectName);
	}

	/**
	* Returns the number of projects where projectName = &#63;.
	*
	* @param projectName the project name
	* @return the number of matching projects
	*/
	public static int countByProjectName(java.lang.String projectName) {
		return getPersistence().countByProjectName(projectName);
	}

	/**
	* Returns all the projects where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @return the matching projects
	*/
	public static List<project> findByProjectCategory(
		java.lang.String projectCategory) {
		return getPersistence().findByProjectCategory(projectCategory);
	}

	/**
	* Returns a range of all the projects where projectCategory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectCategory the project category
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public static List<project> findByProjectCategory(
		java.lang.String projectCategory, int start, int end) {
		return getPersistence()
				   .findByProjectCategory(projectCategory, start, end);
	}

	/**
	* Returns an ordered range of all the projects where projectCategory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectCategory the project category
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public static List<project> findByProjectCategory(
		java.lang.String projectCategory, int start, int end,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .findByProjectCategory(projectCategory, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the projects where projectCategory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectCategory the project category
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projects
	*/
	public static List<project> findByProjectCategory(
		java.lang.String projectCategory, int start, int end,
		OrderByComparator<project> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByProjectCategory(projectCategory, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first project in the ordered set where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByProjectCategory_First(
		java.lang.String projectCategory,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByProjectCategory_First(projectCategory,
			orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByProjectCategory_First(
		java.lang.String projectCategory,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByProjectCategory_First(projectCategory,
			orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByProjectCategory_Last(
		java.lang.String projectCategory,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByProjectCategory_Last(projectCategory,
			orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByProjectCategory_Last(
		java.lang.String projectCategory,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByProjectCategory_Last(projectCategory,
			orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where projectCategory = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project[] findByProjectCategory_PrevAndNext(long projectId,
		java.lang.String projectCategory,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByProjectCategory_PrevAndNext(projectId,
			projectCategory, orderByComparator);
	}

	/**
	* Removes all the projects where projectCategory = &#63; from the database.
	*
	* @param projectCategory the project category
	*/
	public static void removeByProjectCategory(java.lang.String projectCategory) {
		getPersistence().removeByProjectCategory(projectCategory);
	}

	/**
	* Returns the number of projects where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @return the number of matching projects
	*/
	public static int countByProjectCategory(java.lang.String projectCategory) {
		return getPersistence().countByProjectCategory(projectCategory);
	}

	/**
	* Returns the project where projectRefId = &#63; or throws a {@link NoSuchprojectException} if it could not be found.
	*
	* @param projectRefId the project ref ID
	* @return the matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByProjectRefId(java.lang.String projectRefId)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().findByProjectRefId(projectRefId);
	}

	/**
	* Returns the project where projectRefId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param projectRefId the project ref ID
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByProjectRefId(java.lang.String projectRefId) {
		return getPersistence().fetchByProjectRefId(projectRefId);
	}

	/**
	* Returns the project where projectRefId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param projectRefId the project ref ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByProjectRefId(java.lang.String projectRefId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByProjectRefId(projectRefId, retrieveFromCache);
	}

	/**
	* Removes the project where projectRefId = &#63; from the database.
	*
	* @param projectRefId the project ref ID
	* @return the project that was removed
	*/
	public static project removeByProjectRefId(java.lang.String projectRefId)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().removeByProjectRefId(projectRefId);
	}

	/**
	* Returns the number of projects where projectRefId = &#63;.
	*
	* @param projectRefId the project ref ID
	* @return the number of matching projects
	*/
	public static int countByProjectRefId(java.lang.String projectRefId) {
		return getPersistence().countByProjectRefId(projectRefId);
	}

	/**
	* Returns all the projects where projectType = &#63;.
	*
	* @param projectType the project type
	* @return the matching projects
	*/
	public static List<project> findByProjectType(java.lang.String projectType) {
		return getPersistence().findByProjectType(projectType);
	}

	/**
	* Returns a range of all the projects where projectType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectType the project type
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of matching projects
	*/
	public static List<project> findByProjectType(
		java.lang.String projectType, int start, int end) {
		return getPersistence().findByProjectType(projectType, start, end);
	}

	/**
	* Returns an ordered range of all the projects where projectType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectType the project type
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projects
	*/
	public static List<project> findByProjectType(
		java.lang.String projectType, int start, int end,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .findByProjectType(projectType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the projects where projectType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectType the project type
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projects
	*/
	public static List<project> findByProjectType(
		java.lang.String projectType, int start, int end,
		OrderByComparator<project> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByProjectType(projectType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first project in the ordered set where projectType = &#63;.
	*
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByProjectType_First(
		java.lang.String projectType,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByProjectType_First(projectType, orderByComparator);
	}

	/**
	* Returns the first project in the ordered set where projectType = &#63;.
	*
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByProjectType_First(
		java.lang.String projectType,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByProjectType_First(projectType, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where projectType = &#63;.
	*
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public static project findByProjectType_Last(java.lang.String projectType,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByProjectType_Last(projectType, orderByComparator);
	}

	/**
	* Returns the last project in the ordered set where projectType = &#63;.
	*
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public static project fetchByProjectType_Last(
		java.lang.String projectType,
		OrderByComparator<project> orderByComparator) {
		return getPersistence()
				   .fetchByProjectType_Last(projectType, orderByComparator);
	}

	/**
	* Returns the projects before and after the current project in the ordered set where projectType = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project[] findByProjectType_PrevAndNext(long projectId,
		java.lang.String projectType,
		OrderByComparator<project> orderByComparator)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence()
				   .findByProjectType_PrevAndNext(projectId, projectType,
			orderByComparator);
	}

	/**
	* Removes all the projects where projectType = &#63; from the database.
	*
	* @param projectType the project type
	*/
	public static void removeByProjectType(java.lang.String projectType) {
		getPersistence().removeByProjectType(projectType);
	}

	/**
	* Returns the number of projects where projectType = &#63;.
	*
	* @param projectType the project type
	* @return the number of matching projects
	*/
	public static int countByProjectType(java.lang.String projectType) {
		return getPersistence().countByProjectType(projectType);
	}

	/**
	* Caches the project in the entity cache if it is enabled.
	*
	* @param project the project
	*/
	public static void cacheResult(project project) {
		getPersistence().cacheResult(project);
	}

	/**
	* Caches the projects in the entity cache if it is enabled.
	*
	* @param projects the projects
	*/
	public static void cacheResult(List<project> projects) {
		getPersistence().cacheResult(projects);
	}

	/**
	* Creates a new project with the primary key. Does not add the project to the database.
	*
	* @param projectId the primary key for the new project
	* @return the new project
	*/
	public static project create(long projectId) {
		return getPersistence().create(projectId);
	}

	/**
	* Removes the project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the project
	* @return the project that was removed
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project remove(long projectId)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().remove(projectId);
	}

	public static project updateImpl(project project) {
		return getPersistence().updateImpl(project);
	}

	/**
	* Returns the project with the primary key or throws a {@link NoSuchprojectException} if it could not be found.
	*
	* @param projectId the primary key of the project
	* @return the project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public static project findByPrimaryKey(long projectId)
		throws com.liferay.unilever.demo.cara.exception.NoSuchprojectException {
		return getPersistence().findByPrimaryKey(projectId);
	}

	/**
	* Returns the project with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectId the primary key of the project
	* @return the project, or <code>null</code> if a project with the primary key could not be found
	*/
	public static project fetchByPrimaryKey(long projectId) {
		return getPersistence().fetchByPrimaryKey(projectId);
	}

	public static java.util.Map<java.io.Serializable, project> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the projects.
	*
	* @return the projects
	*/
	public static List<project> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of projects
	*/
	public static List<project> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of projects
	*/
	public static List<project> findAll(int start, int end,
		OrderByComparator<project> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of projects
	*/
	public static List<project> findAll(int start, int end,
		OrderByComparator<project> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the projects from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of projects.
	*
	* @return the number of projects
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static projectPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<projectPersistence, projectPersistence> _serviceTracker =
		ServiceTrackerFactory.open(projectPersistence.class);
}