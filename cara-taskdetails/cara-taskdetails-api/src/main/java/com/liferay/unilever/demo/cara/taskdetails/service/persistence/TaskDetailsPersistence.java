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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException;
import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails;

/**
 * The persistence interface for the task details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.unilever.demo.cara.taskdetails.service.persistence.impl.TaskDetailsPersistenceImpl
 * @see TaskDetailsUtil
 * @generated
 */
@ProviderType
public interface TaskDetailsPersistence extends BasePersistence<TaskDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaskDetailsUtil} to access the task details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the task detailses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching task detailses
	*/
	public java.util.List<TaskDetails> findByUuid(java.lang.String uuid);

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
	public java.util.List<TaskDetails> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<TaskDetails> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

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
	public java.util.List<TaskDetails> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task details in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public TaskDetails findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException;

	/**
	* Returns the first task details in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public TaskDetails fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

	/**
	* Returns the last task details in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public TaskDetails findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException;

	/**
	* Returns the last task details in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public TaskDetails fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

	/**
	* Returns the task detailses before and after the current task details in the ordered set where uuid = &#63;.
	*
	* @param taskDetailsId the primary key of the current task details
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task details
	* @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	*/
	public TaskDetails[] findByUuid_PrevAndNext(long taskDetailsId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException;

	/**
	* Removes all the task detailses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of task detailses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching task detailses
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the task details where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTaskDetailsException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public TaskDetails findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTaskDetailsException;

	/**
	* Returns the task details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public TaskDetails fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the task details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public TaskDetails fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the task details where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the task details that was removed
	*/
	public TaskDetails removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTaskDetailsException;

	/**
	* Returns the number of task detailses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching task detailses
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the task detailses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching task detailses
	*/
	public java.util.List<TaskDetails> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<TaskDetails> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<TaskDetails> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

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
	public java.util.List<TaskDetails> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task details in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public TaskDetails findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException;

	/**
	* Returns the first task details in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public TaskDetails fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

	/**
	* Returns the last task details in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public TaskDetails findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException;

	/**
	* Returns the last task details in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public TaskDetails fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

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
	public TaskDetails[] findByUuid_C_PrevAndNext(long taskDetailsId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException;

	/**
	* Removes all the task detailses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of task detailses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching task detailses
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the task detailses where jobId = &#63;.
	*
	* @param jobId the job ID
	* @return the matching task detailses
	*/
	public java.util.List<TaskDetails> findByJobId(long jobId);

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
	public java.util.List<TaskDetails> findByJobId(long jobId, int start,
		int end);

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
	public java.util.List<TaskDetails> findByJobId(long jobId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

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
	public java.util.List<TaskDetails> findByJobId(long jobId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task details in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public TaskDetails findByJobId_First(long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException;

	/**
	* Returns the first task details in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public TaskDetails fetchByJobId_First(long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

	/**
	* Returns the last task details in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details
	* @throws NoSuchTaskDetailsException if a matching task details could not be found
	*/
	public TaskDetails findByJobId_Last(long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException;

	/**
	* Returns the last task details in the ordered set where jobId = &#63;.
	*
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task details, or <code>null</code> if a matching task details could not be found
	*/
	public TaskDetails fetchByJobId_Last(long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

	/**
	* Returns the task detailses before and after the current task details in the ordered set where jobId = &#63;.
	*
	* @param taskDetailsId the primary key of the current task details
	* @param jobId the job ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task details
	* @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	*/
	public TaskDetails[] findByJobId_PrevAndNext(long taskDetailsId,
		long jobId,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException;

	/**
	* Removes all the task detailses where jobId = &#63; from the database.
	*
	* @param jobId the job ID
	*/
	public void removeByJobId(long jobId);

	/**
	* Returns the number of task detailses where jobId = &#63;.
	*
	* @param jobId the job ID
	* @return the number of matching task detailses
	*/
	public int countByJobId(long jobId);

	/**
	* Caches the task details in the entity cache if it is enabled.
	*
	* @param taskDetails the task details
	*/
	public void cacheResult(TaskDetails taskDetails);

	/**
	* Caches the task detailses in the entity cache if it is enabled.
	*
	* @param taskDetailses the task detailses
	*/
	public void cacheResult(java.util.List<TaskDetails> taskDetailses);

	/**
	* Creates a new task details with the primary key. Does not add the task details to the database.
	*
	* @param taskDetailsId the primary key for the new task details
	* @return the new task details
	*/
	public TaskDetails create(long taskDetailsId);

	/**
	* Removes the task details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskDetailsId the primary key of the task details
	* @return the task details that was removed
	* @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	*/
	public TaskDetails remove(long taskDetailsId)
		throws NoSuchTaskDetailsException;

	public TaskDetails updateImpl(TaskDetails taskDetails);

	/**
	* Returns the task details with the primary key or throws a {@link NoSuchTaskDetailsException} if it could not be found.
	*
	* @param taskDetailsId the primary key of the task details
	* @return the task details
	* @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	*/
	public TaskDetails findByPrimaryKey(long taskDetailsId)
		throws NoSuchTaskDetailsException;

	/**
	* Returns the task details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taskDetailsId the primary key of the task details
	* @return the task details, or <code>null</code> if a task details with the primary key could not be found
	*/
	public TaskDetails fetchByPrimaryKey(long taskDetailsId);

	@Override
	public java.util.Map<java.io.Serializable, TaskDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the task detailses.
	*
	* @return the task detailses
	*/
	public java.util.List<TaskDetails> findAll();

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
	public java.util.List<TaskDetails> findAll(int start, int end);

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
	public java.util.List<TaskDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator);

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
	public java.util.List<TaskDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the task detailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of task detailses.
	*
	* @return the number of task detailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}