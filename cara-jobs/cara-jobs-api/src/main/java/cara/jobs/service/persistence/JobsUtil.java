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

import cara.jobs.model.Jobs;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the jobs service. This utility wraps {@link cara.jobs.service.persistence.impl.JobsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JobsPersistence
 * @see cara.jobs.service.persistence.impl.JobsPersistenceImpl
 * @generated
 */
@ProviderType
public class JobsUtil {
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
	public static void clearCache(Jobs jobs) {
		getPersistence().clearCache(jobs);
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
	public static List<Jobs> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Jobs> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Jobs> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Jobs> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Jobs update(Jobs jobs) {
		return getPersistence().update(jobs);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Jobs update(Jobs jobs, ServiceContext serviceContext) {
		return getPersistence().update(jobs, serviceContext);
	}

	/**
	* Returns all the jobses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching jobses
	*/
	public static List<Jobs> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Jobs> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Jobs> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Jobs> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Jobs> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Jobs> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first jobs in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public static Jobs findByUuid_First(java.lang.String uuid,
		OrderByComparator<Jobs> orderByComparator)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first jobs in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public static Jobs fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Jobs> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last jobs in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public static Jobs findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Jobs> orderByComparator)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last jobs in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public static Jobs fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Jobs> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the jobses before and after the current jobs in the ordered set where uuid = &#63;.
	*
	* @param jobId the primary key of the current jobs
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jobs
	* @throws NoSuchJobsException if a jobs with the primary key could not be found
	*/
	public static Jobs[] findByUuid_PrevAndNext(long jobId,
		java.lang.String uuid, OrderByComparator<Jobs> orderByComparator)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence()
				   .findByUuid_PrevAndNext(jobId, uuid, orderByComparator);
	}

	/**
	* Removes all the jobses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of jobses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching jobses
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the jobs where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchJobsException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public static Jobs findByUUID_G(java.lang.String uuid, long groupId)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the jobs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public static Jobs fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the jobs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public static Jobs fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the jobs where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the jobs that was removed
	*/
	public static Jobs removeByUUID_G(java.lang.String uuid, long groupId)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of jobses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching jobses
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the jobses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching jobses
	*/
	public static List<Jobs> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Jobs> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Jobs> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Jobs> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Jobs> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Jobs> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first jobs in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public static Jobs findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Jobs> orderByComparator)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first jobs in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public static Jobs fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Jobs> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last jobs in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public static Jobs findByUuid_C_Last(java.lang.String uuid, long companyId,
		OrderByComparator<Jobs> orderByComparator)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last jobs in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public static Jobs fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Jobs> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static Jobs[] findByUuid_C_PrevAndNext(long jobId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Jobs> orderByComparator)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(jobId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the jobses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of jobses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching jobses
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the jobses where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the matching jobses
	*/
	public static List<Jobs> findByprojectId(long projectId) {
		return getPersistence().findByprojectId(projectId);
	}

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
	public static List<Jobs> findByprojectId(long projectId, int start, int end) {
		return getPersistence().findByprojectId(projectId, start, end);
	}

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
	public static List<Jobs> findByprojectId(long projectId, int start,
		int end, OrderByComparator<Jobs> orderByComparator) {
		return getPersistence()
				   .findByprojectId(projectId, start, end, orderByComparator);
	}

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
	public static List<Jobs> findByprojectId(long projectId, int start,
		int end, OrderByComparator<Jobs> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByprojectId(projectId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first jobs in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public static Jobs findByprojectId_First(long projectId,
		OrderByComparator<Jobs> orderByComparator)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence()
				   .findByprojectId_First(projectId, orderByComparator);
	}

	/**
	* Returns the first jobs in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public static Jobs fetchByprojectId_First(long projectId,
		OrderByComparator<Jobs> orderByComparator) {
		return getPersistence()
				   .fetchByprojectId_First(projectId, orderByComparator);
	}

	/**
	* Returns the last jobs in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs
	* @throws NoSuchJobsException if a matching jobs could not be found
	*/
	public static Jobs findByprojectId_Last(long projectId,
		OrderByComparator<Jobs> orderByComparator)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence()
				   .findByprojectId_Last(projectId, orderByComparator);
	}

	/**
	* Returns the last jobs in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public static Jobs fetchByprojectId_Last(long projectId,
		OrderByComparator<Jobs> orderByComparator) {
		return getPersistence()
				   .fetchByprojectId_Last(projectId, orderByComparator);
	}

	/**
	* Returns the jobses before and after the current jobs in the ordered set where projectId = &#63;.
	*
	* @param jobId the primary key of the current jobs
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jobs
	* @throws NoSuchJobsException if a jobs with the primary key could not be found
	*/
	public static Jobs[] findByprojectId_PrevAndNext(long jobId,
		long projectId, OrderByComparator<Jobs> orderByComparator)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence()
				   .findByprojectId_PrevAndNext(jobId, projectId,
			orderByComparator);
	}

	/**
	* Removes all the jobses where projectId = &#63; from the database.
	*
	* @param projectId the project ID
	*/
	public static void removeByprojectId(long projectId) {
		getPersistence().removeByprojectId(projectId);
	}

	/**
	* Returns the number of jobses where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the number of matching jobses
	*/
	public static int countByprojectId(long projectId) {
		return getPersistence().countByprojectId(projectId);
	}

	/**
	* Caches the jobs in the entity cache if it is enabled.
	*
	* @param jobs the jobs
	*/
	public static void cacheResult(Jobs jobs) {
		getPersistence().cacheResult(jobs);
	}

	/**
	* Caches the jobses in the entity cache if it is enabled.
	*
	* @param jobses the jobses
	*/
	public static void cacheResult(List<Jobs> jobses) {
		getPersistence().cacheResult(jobses);
	}

	/**
	* Creates a new jobs with the primary key. Does not add the jobs to the database.
	*
	* @param jobId the primary key for the new jobs
	* @return the new jobs
	*/
	public static Jobs create(long jobId) {
		return getPersistence().create(jobId);
	}

	/**
	* Removes the jobs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the jobs
	* @return the jobs that was removed
	* @throws NoSuchJobsException if a jobs with the primary key could not be found
	*/
	public static Jobs remove(long jobId)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence().remove(jobId);
	}

	public static Jobs updateImpl(Jobs jobs) {
		return getPersistence().updateImpl(jobs);
	}

	/**
	* Returns the jobs with the primary key or throws a {@link NoSuchJobsException} if it could not be found.
	*
	* @param jobId the primary key of the jobs
	* @return the jobs
	* @throws NoSuchJobsException if a jobs with the primary key could not be found
	*/
	public static Jobs findByPrimaryKey(long jobId)
		throws cara.jobs.exception.NoSuchJobsException {
		return getPersistence().findByPrimaryKey(jobId);
	}

	/**
	* Returns the jobs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobId the primary key of the jobs
	* @return the jobs, or <code>null</code> if a jobs with the primary key could not be found
	*/
	public static Jobs fetchByPrimaryKey(long jobId) {
		return getPersistence().fetchByPrimaryKey(jobId);
	}

	public static java.util.Map<java.io.Serializable, Jobs> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the jobses.
	*
	* @return the jobses
	*/
	public static List<Jobs> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Jobs> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Jobs> findAll(int start, int end,
		OrderByComparator<Jobs> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Jobs> findAll(int start, int end,
		OrderByComparator<Jobs> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the jobses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of jobses.
	*
	* @return the number of jobses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static JobsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JobsPersistence, JobsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(JobsPersistence.class);
}