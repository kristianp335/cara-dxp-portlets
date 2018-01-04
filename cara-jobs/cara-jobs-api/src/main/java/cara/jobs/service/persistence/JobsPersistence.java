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

package cara.jobs.service.persistence;

import aQute.bnd.annotation.ProviderType;

import cara.jobs.exception.NoSuchJobsException;

import cara.jobs.model.Jobs;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the jobs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see cara.jobs.service.persistence.impl.JobsPersistenceImpl
 * @see JobsUtil
 * @generated
 */
@ProviderType
public interface JobsPersistence extends BasePersistence<Jobs> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JobsUtil} to access the jobs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the jobses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching jobses
	*/
	public java.util.List<Jobs> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the jobses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @return the range of matching jobses
	*/
	public java.util.List<Jobs> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the jobses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jobses
	*/
	public java.util.List<Jobs> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns an ordered range of all the jobses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching jobses
	*/
	public java.util.List<Jobs> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first jobs in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public Jobs findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator)
		throws NoSuchJobsException;

	/**
	* Returns the first jobs in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public Jobs fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns the last jobs in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public Jobs findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator)
		throws NoSuchJobsException;

	/**
	* Returns the last jobs in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public Jobs fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns the jobses before and after the current jobs in the ordered set where uuid = &#63;.
	*
	* @param jobId the primary key of the current jobs
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jobs
	* @throws NoSuchJobsException if a jobs with the primary key could not be found
	*/
	public Jobs[] findByUuid_PrevAndNext(long jobId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator)
		throws NoSuchJobsException;

	/**
	* Removes all the jobses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of jobses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching jobses
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the jobs where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchJobsException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public Jobs findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchJobsException;

	/**
	* Returns the jobs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public Jobs fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the jobs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public Jobs fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the jobs where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the jobs that was removed
	*/
	public Jobs removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchJobsException;

	/**
	* Returns the number of jobses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching jobses
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the jobses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching jobses
	*/
	public java.util.List<Jobs> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the jobses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @return the range of matching jobses
	*/
	public java.util.List<Jobs> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the jobses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jobses
	*/
	public java.util.List<Jobs> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns an ordered range of all the jobses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching jobses
	*/
	public java.util.List<Jobs> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first jobs in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public Jobs findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator)
		throws NoSuchJobsException;

	/**
	* Returns the first jobs in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public Jobs fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns the last jobs in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public Jobs findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator)
		throws NoSuchJobsException;

	/**
	* Returns the last jobs in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public Jobs fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns the jobses before and after the current jobs in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param jobId the primary key of the current jobs
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jobs
	* @throws NoSuchJobsException if a jobs with the primary key could not be found
	*/
	public Jobs[] findByUuid_C_PrevAndNext(long jobId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator)
		throws NoSuchJobsException;

	/**
	* Removes all the jobses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of jobses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching jobses
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the jobses where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the matching jobses
	*/
	public java.util.List<Jobs> findByprojectId(long projectId);

	/**
	* Returns a range of all the jobses where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @return the range of matching jobses
	*/
	public java.util.List<Jobs> findByprojectId(long projectId, int start,
		int end);

	/**
	* Returns an ordered range of all the jobses where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jobses
	*/
	public java.util.List<Jobs> findByprojectId(long projectId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns an ordered range of all the jobses where projectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param projectId the project ID
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching jobses
	*/
	public java.util.List<Jobs> findByprojectId(long projectId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first jobs in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public Jobs findByprojectId_First(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator)
		throws NoSuchJobsException;

	/**
	* Returns the first jobs in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public Jobs fetchByprojectId_First(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns the last jobs in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public Jobs findByprojectId_Last(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator)
		throws NoSuchJobsException;

	/**
	* Returns the last jobs in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public Jobs fetchByprojectId_Last(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns the jobses before and after the current jobs in the ordered set where projectId = &#63;.
	*
	* @param jobId the primary key of the current jobs
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jobs
	* @throws NoSuchJobsException if a jobs with the primary key could not be found
	*/
	public Jobs[] findByprojectId_PrevAndNext(long jobId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator)
		throws NoSuchJobsException;

	/**
	* Removes all the jobses where projectId = &#63; from the database.
	*
	* @param projectId the project ID
	*/
	public void removeByprojectId(long projectId);

	/**
	* Returns the number of jobses where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the number of matching jobses
	*/
	public int countByprojectId(long projectId);

	/**
	* Caches the jobs in the entity cache if it is enabled.
	*
	* @param jobs the jobs
	*/
	public void cacheResult(Jobs jobs);

	/**
	* Caches the jobses in the entity cache if it is enabled.
	*
	* @param jobses the jobses
	*/
	public void cacheResult(java.util.List<Jobs> jobses);

	/**
	* Creates a new jobs with the primary key. Does not add the jobs to the database.
	*
	* @param jobId the primary key for the new jobs
	* @return the new jobs
	*/
	public Jobs create(long jobId);

	/**
	* Removes the jobs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the jobs
	* @return the jobs that was removed
	* @throws NoSuchJobsException if a jobs with the primary key could not be found
	*/
	public Jobs remove(long jobId) throws NoSuchJobsException;

	public Jobs updateImpl(Jobs jobs);

	/**
	* Returns the jobs with the primary key or throws a {@link NoSuchJobsException} if it could not be found.
	*
	* @param jobId the primary key of the jobs
	* @return the jobs
	* @throws NoSuchJobsException if a jobs with the primary key could not be found
	*/
	public Jobs findByPrimaryKey(long jobId) throws NoSuchJobsException;

	/**
	* Returns the jobs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobId the primary key of the jobs
	* @return the jobs, or <code>null</code> if a jobs with the primary key could not be found
	*/
	public Jobs fetchByPrimaryKey(long jobId);

	@Override
	public java.util.Map<java.io.Serializable, Jobs> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the jobses.
	*
	* @return the jobses
	*/
	public java.util.List<Jobs> findAll();

	/**
	* Returns a range of all the jobses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @return the range of jobses
	*/
	public java.util.List<Jobs> findAll(int start, int end);

	/**
	* Returns an ordered range of all the jobses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jobses
	*/
	public java.util.List<Jobs> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator);

	/**
	* Returns an ordered range of all the jobses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of jobses
	*/
	public java.util.List<Jobs> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Jobs> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the jobses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of jobses.
	*
	* @return the number of jobses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}