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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.unilever.demo.cara.tasks.exception.NoSuchTasksException;
import com.liferay.unilever.demo.cara.tasks.model.Tasks;

/**
 * The persistence interface for the tasks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.unilever.demo.cara.tasks.service.persistence.impl.TasksPersistenceImpl
 * @see TasksUtil
 * @generated
 */
@ProviderType
public interface TasksPersistence extends BasePersistence<Tasks> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TasksUtil} to access the tasks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the taskses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching taskses
	*/
	public java.util.List<Tasks> findByUuid(java.lang.String uuid);

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
	public java.util.List<Tasks> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<Tasks> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

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
	public java.util.List<Tasks> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tasks in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public Tasks findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator)
		throws NoSuchTasksException;

	/**
	* Returns the first tasks in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public Tasks fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

	/**
	* Returns the last tasks in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public Tasks findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator)
		throws NoSuchTasksException;

	/**
	* Returns the last tasks in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public Tasks fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

	/**
	* Returns the taskses before and after the current tasks in the ordered set where uuid = &#63;.
	*
	* @param taskId the primary key of the current tasks
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tasks
	* @throws NoSuchTasksException if a tasks with the primary key could not be found
	*/
	public Tasks[] findByUuid_PrevAndNext(long taskId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator)
		throws NoSuchTasksException;

	/**
	* Removes all the taskses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of taskses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching taskses
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the tasks where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTasksException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public Tasks findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTasksException;

	/**
	* Returns the tasks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public Tasks fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the tasks where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public Tasks fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the tasks where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the tasks that was removed
	*/
	public Tasks removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTasksException;

	/**
	* Returns the number of taskses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching taskses
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the taskses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching taskses
	*/
	public java.util.List<Tasks> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Tasks> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Tasks> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

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
	public java.util.List<Tasks> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tasks in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public Tasks findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator)
		throws NoSuchTasksException;

	/**
	* Returns the first tasks in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public Tasks fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

	/**
	* Returns the last tasks in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public Tasks findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator)
		throws NoSuchTasksException;

	/**
	* Returns the last tasks in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public Tasks fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

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
	public Tasks[] findByUuid_C_PrevAndNext(long taskId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator)
		throws NoSuchTasksException;

	/**
	* Removes all the taskses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of taskses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching taskses
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the taskses where jobId = &#63;.
	*
	* @param jobId the job ID
	* @return the matching taskses
	*/
	public java.util.List<Tasks> findByJobId(java.lang.Long jobId);

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
	public java.util.List<Tasks> findByJobId(java.lang.Long jobId, int start,
		int end);

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
	public java.util.List<Tasks> findByJobId(java.lang.Long jobId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

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
	public java.util.List<Tasks> findByJobId(java.lang.Long jobId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tasks in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public Tasks findByJobId_First(java.lang.Long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator)
		throws NoSuchTasksException;

	/**
	* Returns the first tasks in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public Tasks fetchByJobId_First(java.lang.Long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

	/**
	* Returns the last tasks in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks
	* @throws NoSuchTasksException if a matching tasks could not be found
	*/
	public Tasks findByJobId_Last(java.lang.Long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator)
		throws NoSuchTasksException;

	/**
	* Returns the last tasks in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public Tasks fetchByJobId_Last(java.lang.Long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

	/**
	* Returns the taskses before and after the current tasks in the ordered set where jobId = &#63;.
	*
	* @param taskId the primary key of the current tasks
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tasks
	* @throws NoSuchTasksException if a tasks with the primary key could not be found
	*/
	public Tasks[] findByJobId_PrevAndNext(long taskId, java.lang.Long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator)
		throws NoSuchTasksException;

	/**
	* Removes all the taskses where jobId = &#63; from the database.
	*
	* @param jobId the job ID
	*/
	public void removeByJobId(java.lang.Long jobId);

	/**
	* Returns the number of taskses where jobId = &#63;.
	*
	* @param jobId the job ID
	* @return the number of matching taskses
	*/
	public int countByJobId(java.lang.Long jobId);

	/**
	* Caches the tasks in the entity cache if it is enabled.
	*
	* @param tasks the tasks
	*/
	public void cacheResult(Tasks tasks);

	/**
	* Caches the taskses in the entity cache if it is enabled.
	*
	* @param taskses the taskses
	*/
	public void cacheResult(java.util.List<Tasks> taskses);

	/**
	* Creates a new tasks with the primary key. Does not add the tasks to the database.
	*
	* @param taskId the primary key for the new tasks
	* @return the new tasks
	*/
	public Tasks create(long taskId);

	/**
	* Removes the tasks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskId the primary key of the tasks
	* @return the tasks that was removed
	* @throws NoSuchTasksException if a tasks with the primary key could not be found
	*/
	public Tasks remove(long taskId) throws NoSuchTasksException;

	public Tasks updateImpl(Tasks tasks);

	/**
	* Returns the tasks with the primary key or throws a {@link NoSuchTasksException} if it could not be found.
	*
	* @param taskId the primary key of the tasks
	* @return the tasks
	* @throws NoSuchTasksException if a tasks with the primary key could not be found
	*/
	public Tasks findByPrimaryKey(long taskId) throws NoSuchTasksException;

	/**
	* Returns the tasks with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taskId the primary key of the tasks
	* @return the tasks, or <code>null</code> if a tasks with the primary key could not be found
	*/
	public Tasks fetchByPrimaryKey(long taskId);

	@Override
	public java.util.Map<java.io.Serializable, Tasks> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the taskses.
	*
	* @return the taskses
	*/
	public java.util.List<Tasks> findAll();

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
	public java.util.List<Tasks> findAll(int start, int end);

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
	public java.util.List<Tasks> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator);

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
	public java.util.List<Tasks> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tasks> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the taskses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of taskses.
	*
	* @return the number of taskses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}