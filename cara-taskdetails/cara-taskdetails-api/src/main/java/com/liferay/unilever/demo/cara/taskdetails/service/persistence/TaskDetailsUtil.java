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

package com.liferay.unilever.demo.cara.taskdetails.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the task details service. This utility wraps {@link com.liferay.unilever.demo.cara.taskdetails.service.persistence.impl.TaskDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TaskDetailsPersistence
 * @see com.liferay.unilever.demo.cara.taskdetails.service.persistence.impl.TaskDetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class TaskDetailsUtil {
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
	public static void clearCache(TaskDetails taskDetails) {
		getPersistence().clearCache(taskDetails);
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
	public static List<TaskDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TaskDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TaskDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TaskDetails update(TaskDetails taskDetails) {
		return getPersistence().update(taskDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TaskDetails update(TaskDetails taskDetails,
		ServiceContext serviceContext) {
		return getPersistence().update(taskDetails, serviceContext);
	}

	/**
	* Returns all the task detailses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching task detailses
	*/
	public static List<TaskDetails> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the task detailses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @return the range of matching task detailses
	*/
	public static List<TaskDetails> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the task detailses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task detailses
	*/
	public static List<TaskDetails> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the task detailses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching task detailses
	*/
	public static List<TaskDetails> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first task details in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public static TaskDetails findByUuid_First(java.lang.String uuid,
		OrderByComparator<TaskDetails> orderByComparator)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first task details in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public static TaskDetails fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last task details in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public static TaskDetails findByUuid_Last(java.lang.String uuid,
		OrderByComparator<TaskDetails> orderByComparator)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last task details in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public static TaskDetails fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the task detailses before and after the current task details in the ordered set where uuid = &#63;.
	*
	* @param taskDetailsId the primary key of the current task details
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task details
	* @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	*/
	public static TaskDetails[] findByUuid_PrevAndNext(long taskDetailsId,
		java.lang.String uuid, OrderByComparator<TaskDetails> orderByComparator)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence()
				   .findByUuid_PrevAndNext(taskDetailsId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the task detailses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of task detailses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching task detailses
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the task details where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTaskDetailsException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public static TaskDetails findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the task details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public static TaskDetails fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the task details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public static TaskDetails fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the task details where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the task details that was removed
	*/
	public static TaskDetails removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of task detailses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching task detailses
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the task detailses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching task detailses
	*/
	public static List<TaskDetails> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the task detailses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @return the range of matching task detailses
	*/
	public static List<TaskDetails> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the task detailses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task detailses
	*/
	public static List<TaskDetails> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the task detailses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching task detailses
	*/
	public static List<TaskDetails> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first task details in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public static TaskDetails findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<TaskDetails> orderByComparator)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first task details in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public static TaskDetails fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last task details in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public static TaskDetails findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<TaskDetails> orderByComparator)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last task details in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public static TaskDetails fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the task detailses before and after the current task details in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param taskDetailsId the primary key of the current task details
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task details
	* @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	*/
	public static TaskDetails[] findByUuid_C_PrevAndNext(long taskDetailsId,
		java.lang.String uuid, long companyId,
		OrderByComparator<TaskDetails> orderByComparator)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(taskDetailsId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the task detailses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of task detailses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching task detailses
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the task detailses where jobId = &#63;.
	*
	* @param jobId the job ID
	* @return the matching task detailses
	*/
	public static List<TaskDetails> findByJobId(long jobId) {
		return getPersistence().findByJobId(jobId);
	}

	/**
	* Returns a range of all the task detailses where jobId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param jobId the job ID
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @return the range of matching task detailses
	*/
	public static List<TaskDetails> findByJobId(long jobId, int start, int end) {
		return getPersistence().findByJobId(jobId, start, end);
	}

	/**
	* Returns an ordered range of all the task detailses where jobId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param jobId the job ID
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task detailses
	*/
	public static List<TaskDetails> findByJobId(long jobId, int start, int end,
		OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence().findByJobId(jobId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the task detailses where jobId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param jobId the job ID
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching task detailses
	*/
	public static List<TaskDetails> findByJobId(long jobId, int start, int end,
		OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByJobId(jobId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first task details in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public static TaskDetails findByJobId_First(long jobId,
		OrderByComparator<TaskDetails> orderByComparator)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence().findByJobId_First(jobId, orderByComparator);
	}

	/**
	* Returns the first task details in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public static TaskDetails fetchByJobId_First(long jobId,
		OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence().fetchByJobId_First(jobId, orderByComparator);
	}

	/**
	* Returns the last task details in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public static TaskDetails findByJobId_Last(long jobId,
		OrderByComparator<TaskDetails> orderByComparator)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence().findByJobId_Last(jobId, orderByComparator);
	}

	/**
	* Returns the last task details in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public static TaskDetails fetchByJobId_Last(long jobId,
		OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence().fetchByJobId_Last(jobId, orderByComparator);
	}

	/**
	* Returns the task detailses before and after the current task details in the ordered set where jobId = &#63;.
	*
	* @param taskDetailsId the primary key of the current task details
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task details
	* @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	*/
	public static TaskDetails[] findByJobId_PrevAndNext(long taskDetailsId,
		long jobId, OrderByComparator<TaskDetails> orderByComparator)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence()
				   .findByJobId_PrevAndNext(taskDetailsId, jobId,
			orderByComparator);
	}

	/**
	* Removes all the task detailses where jobId = &#63; from the database.
	*
	* @param jobId the job ID
	*/
	public static void removeByJobId(long jobId) {
		getPersistence().removeByJobId(jobId);
	}

	/**
	* Returns the number of task detailses where jobId = &#63;.
	*
	* @param jobId the job ID
	* @return the number of matching task detailses
	*/
	public static int countByJobId(long jobId) {
		return getPersistence().countByJobId(jobId);
	}

	/**
	* Caches the task details in the entity cache if it is enabled.
	*
	* @param taskDetails the task details
	*/
	public static void cacheResult(TaskDetails taskDetails) {
		getPersistence().cacheResult(taskDetails);
	}

	/**
	* Caches the task detailses in the entity cache if it is enabled.
	*
	* @param taskDetailses the task detailses
	*/
	public static void cacheResult(List<TaskDetails> taskDetailses) {
		getPersistence().cacheResult(taskDetailses);
	}

	/**
	* Creates a new task details with the primary key. Does not add the task details to the database.
	*
	* @param taskDetailsId the primary key for the new task details
	* @return the new task details
	*/
	public static TaskDetails create(long taskDetailsId) {
		return getPersistence().create(taskDetailsId);
	}

	/**
	* Removes the task details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskDetailsId the primary key of the task details
	* @return the task details that was removed
	* @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	*/
	public static TaskDetails remove(long taskDetailsId)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence().remove(taskDetailsId);
	}

	public static TaskDetails updateImpl(TaskDetails taskDetails) {
		return getPersistence().updateImpl(taskDetails);
	}

	/**
	* Returns the task details with the primary key or throws a {@link NoSuchTaskDetailsException} if it could not be found.
	*
	* @param taskDetailsId the primary key of the task details
	* @return the task details
	* @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	*/
	public static TaskDetails findByPrimaryKey(long taskDetailsId)
		throws com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException {
		return getPersistence().findByPrimaryKey(taskDetailsId);
	}

	/**
	* Returns the task details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taskDetailsId the primary key of the task details
	* @return the task details, or <code>null</code> if a task details with the primary key could not be found
	*/
	public static TaskDetails fetchByPrimaryKey(long taskDetailsId) {
		return getPersistence().fetchByPrimaryKey(taskDetailsId);
	}

	public static java.util.Map<java.io.Serializable, TaskDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the task detailses.
	*
	* @return the task detailses
	*/
	public static List<TaskDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the task detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @return the range of task detailses
	*/
	public static List<TaskDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the task detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of task detailses
	*/
	public static List<TaskDetails> findAll(int start, int end,
		OrderByComparator<TaskDetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the task detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of task detailses
	* @param end the upper bound of the range of task detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of task detailses
	*/
	public static List<TaskDetails> findAll(int start, int end,
		OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the task detailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of task detailses.
	*
	* @return the number of task detailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TaskDetailsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TaskDetailsPersistence, TaskDetailsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TaskDetailsPersistence.class);
}