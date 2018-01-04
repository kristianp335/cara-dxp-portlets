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

package com.liferay.unilever.demo.cara.tasks.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.unilever.demo.cara.tasks.model.Tasks;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the tasks service. This utility wraps {@link com.liferay.unilever.demo.cara.tasks.service.persistence.impl.TasksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TasksPersistence
 * @see com.liferay.unilever.demo.cara.tasks.service.persistence.impl.TasksPersistenceImpl
 * @generated
 */
@ProviderType
public class TasksUtil {
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
	public static void clearCache(Tasks tasks) {
		getPersistence().clearCache(tasks);
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
	public static List<Tasks> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tasks> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tasks> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Tasks> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Tasks update(Tasks tasks) {
		return getPersistence().update(tasks);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Tasks update(Tasks tasks, ServiceContext serviceContext) {
		return getPersistence().update(tasks, serviceContext);
	}

	/**
	* Returns all the taskses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching taskses
	*/
	public static List<Tasks> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the taskses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @return the range of matching taskses
	*/
	public static List<Tasks> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the taskses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching taskses
	*/
	public static List<Tasks> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Tasks> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the taskses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching taskses
	*/
	public static List<Tasks> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Tasks> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first tasks in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public static Tasks findByUuid_First(java.lang.String uuid,
		OrderByComparator<Tasks> orderByComparator)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first tasks in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public static Tasks fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Tasks> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last tasks in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public static Tasks findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Tasks> orderByComparator)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last tasks in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public static Tasks fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Tasks> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the taskses before and after the current tasks in the ordered set where uuid = &#63;.
	*
	* @param taskId the primary key of the current tasks
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tasks
	* @throws NoSuchTasksException if a tasks with the primary key could not be found
	*/
	public static Tasks[] findByUuid_PrevAndNext(long taskId,
		java.lang.String uuid, OrderByComparator<Tasks> orderByComparator)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence()
				   .findByUuid_PrevAndNext(taskId, uuid, orderByComparator);
	}

	/**
	* Removes all the taskses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of taskses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching taskses
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the tasks where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTasksException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public static Tasks findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the tasks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public static Tasks fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the tasks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public static Tasks fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the tasks where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the tasks that was removed
	*/
	public static Tasks removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of taskses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching taskses
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the taskses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching taskses
	*/
	public static List<Tasks> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the taskses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @return the range of matching taskses
	*/
	public static List<Tasks> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the taskses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching taskses
	*/
	public static List<Tasks> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Tasks> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the taskses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching taskses
	*/
	public static List<Tasks> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Tasks> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first tasks in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public static Tasks findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Tasks> orderByComparator)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first tasks in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public static Tasks fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Tasks> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last tasks in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public static Tasks findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Tasks> orderByComparator)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last tasks in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public static Tasks fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Tasks> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the taskses before and after the current tasks in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param taskId the primary key of the current tasks
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tasks
	* @throws NoSuchTasksException if a tasks with the primary key could not be found
	*/
	public static Tasks[] findByUuid_C_PrevAndNext(long taskId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Tasks> orderByComparator)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(taskId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the taskses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of taskses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching taskses
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the taskses where jobId = &#63;.
	*
	* @param jobId the job ID
	* @return the matching taskses
	*/
	public static List<Tasks> findByJobId(java.lang.Long jobId) {
		return getPersistence().findByJobId(jobId);
	}

	/**
	* Returns a range of all the taskses where jobId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param jobId the job ID
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @return the range of matching taskses
	*/
	public static List<Tasks> findByJobId(java.lang.Long jobId, int start,
		int end) {
		return getPersistence().findByJobId(jobId, start, end);
	}

	/**
	* Returns an ordered range of all the taskses where jobId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param jobId the job ID
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching taskses
	*/
	public static List<Tasks> findByJobId(java.lang.Long jobId, int start,
		int end, OrderByComparator<Tasks> orderByComparator) {
		return getPersistence().findByJobId(jobId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the taskses where jobId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param jobId the job ID
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching taskses
	*/
	public static List<Tasks> findByJobId(java.lang.Long jobId, int start,
		int end, OrderByComparator<Tasks> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByJobId(jobId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first tasks in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public static Tasks findByJobId_First(java.lang.Long jobId,
		OrderByComparator<Tasks> orderByComparator)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence().findByJobId_First(jobId, orderByComparator);
	}

	/**
	* Returns the first tasks in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public static Tasks fetchByJobId_First(java.lang.Long jobId,
		OrderByComparator<Tasks> orderByComparator) {
		return getPersistence().fetchByJobId_First(jobId, orderByComparator);
	}

	/**
	* Returns the last tasks in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public static Tasks findByJobId_Last(java.lang.Long jobId,
		OrderByComparator<Tasks> orderByComparator)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence().findByJobId_Last(jobId, orderByComparator);
	}

	/**
	* Returns the last tasks in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public static Tasks fetchByJobId_Last(java.lang.Long jobId,
		OrderByComparator<Tasks> orderByComparator) {
		return getPersistence().fetchByJobId_Last(jobId, orderByComparator);
	}

	/**
	* Returns the taskses before and after the current tasks in the ordered set where jobId = &#63;.
	*
	* @param taskId the primary key of the current tasks
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tasks
	* @throws NoSuchTasksException if a tasks with the primary key could not be found
	*/
	public static Tasks[] findByJobId_PrevAndNext(long taskId,
		java.lang.Long jobId, OrderByComparator<Tasks> orderByComparator)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence()
				   .findByJobId_PrevAndNext(taskId, jobId, orderByComparator);
	}

	/**
	* Removes all the taskses where jobId = &#63; from the database.
	*
	* @param jobId the job ID
	*/
	public static void removeByJobId(java.lang.Long jobId) {
		getPersistence().removeByJobId(jobId);
	}

	/**
	* Returns the number of taskses where jobId = &#63;.
	*
	* @param jobId the job ID
	* @return the number of matching taskses
	*/
	public static int countByJobId(java.lang.Long jobId) {
		return getPersistence().countByJobId(jobId);
	}

	/**
	* Caches the tasks in the entity cache if it is enabled.
	*
	* @param tasks the tasks
	*/
	public static void cacheResult(Tasks tasks) {
		getPersistence().cacheResult(tasks);
	}

	/**
	* Caches the taskses in the entity cache if it is enabled.
	*
	* @param taskses the taskses
	*/
	public static void cacheResult(List<Tasks> taskses) {
		getPersistence().cacheResult(taskses);
	}

	/**
	* Creates a new tasks with the primary key. Does not add the tasks to the database.
	*
	* @param taskId the primary key for the new tasks
	* @return the new tasks
	*/
	public static Tasks create(long taskId) {
		return getPersistence().create(taskId);
	}

	/**
	* Removes the tasks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskId the primary key of the tasks
	* @return the tasks that was removed
	* @throws NoSuchTasksException if a tasks with the primary key could not be found
	*/
	public static Tasks remove(long taskId)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence().remove(taskId);
	}

	public static Tasks updateImpl(Tasks tasks) {
		return getPersistence().updateImpl(tasks);
	}

	/**
	* Returns the tasks with the primary key or throws a {@link NoSuchTasksException} if it could not be found.
	*
	* @param taskId the primary key of the tasks
	* @return the tasks
	* @throws NoSuchTasksException if a tasks with the primary key could not be found
	*/
	public static Tasks findByPrimaryKey(long taskId)
		throws com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException {
		return getPersistence().findByPrimaryKey(taskId);
	}

	/**
	* Returns the tasks with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taskId the primary key of the tasks
	* @return the tasks, or <code>null</code> if a tasks with the primary key could not be found
	*/
	public static Tasks fetchByPrimaryKey(long taskId) {
		return getPersistence().fetchByPrimaryKey(taskId);
	}

	public static java.util.Map<java.io.Serializable, Tasks> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the taskses.
	*
	* @return the taskses
	*/
	public static List<Tasks> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the taskses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @return the range of taskses
	*/
	public static List<Tasks> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the taskses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of taskses
	*/
	public static List<Tasks> findAll(int start, int end,
		OrderByComparator<Tasks> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the taskses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of taskses
	*/
	public static List<Tasks> findAll(int start, int end,
		OrderByComparator<Tasks> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the taskses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of taskses.
	*
	* @return the number of taskses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TasksPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TasksPersistence, TasksPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TasksPersistence.class);
}