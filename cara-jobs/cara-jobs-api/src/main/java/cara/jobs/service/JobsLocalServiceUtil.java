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

package cara.jobs.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Jobs. This utility wraps
 * {@link cara.jobs.service.impl.JobsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JobsLocalService
 * @see cara.jobs.service.base.JobsLocalServiceBaseImpl
 * @see cara.jobs.service.impl.JobsLocalServiceImpl
 * @generated
 */
@ProviderType
public class JobsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link cara.jobs.service.impl.JobsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the jobs to the database. Also notifies the appropriate model listeners.
	*
	* @param jobs the jobs
	* @return the jobs that was added
	*/
	public static cara.jobs.model.Jobs addJobs(cara.jobs.model.Jobs jobs) {
		return getService().addJobs(jobs);
	}

	/**
	* Creates a new jobs with the primary key. Does not add the jobs to the database.
	*
	* @param jobId the primary key for the new jobs
	* @return the new jobs
	*/
	public static cara.jobs.model.Jobs createJobs(long jobId) {
		return getService().createJobs(jobId);
	}

	/**
	* Deletes the jobs from the database. Also notifies the appropriate model listeners.
	*
	* @param jobs the jobs
	* @return the jobs that was removed
	*/
	public static cara.jobs.model.Jobs deleteJobs(cara.jobs.model.Jobs jobs) {
		return getService().deleteJobs(jobs);
	}

	/**
	* Deletes the jobs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the jobs
	* @return the jobs that was removed
	* @throws PortalException if a jobs with the primary key could not be found
	*/
	public static cara.jobs.model.Jobs deleteJobs(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteJobs(jobId);
	}

	public static cara.jobs.model.Jobs fetchJobs(long jobId) {
		return getService().fetchJobs(jobId);
	}

	/**
	* Returns the jobs matching the UUID and group.
	*
	* @param uuid the jobs's UUID
	* @param groupId the primary key of the group
	* @return the matching jobs, or <code>null</code> if a matching jobs could not be found
	*/
	public static cara.jobs.model.Jobs fetchJobsByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchJobsByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the jobs with the primary key.
	*
	* @param jobId the primary key of the jobs
	* @return the jobs
	* @throws PortalException if a jobs with the primary key could not be found
	*/
	public static cara.jobs.model.Jobs getJobs(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getJobs(jobId);
	}

	/**
	* Returns the jobs matching the UUID and group.
	*
	* @param uuid the jobs's UUID
	* @param groupId the primary key of the group
	* @return the matching jobs
	* @throws PortalException if a matching jobs could not be found
	*/
	public static cara.jobs.model.Jobs getJobsByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getJobsByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the jobs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jobs the jobs
	* @return the jobs that was updated
	*/
	public static cara.jobs.model.Jobs updateJobs(cara.jobs.model.Jobs jobs) {
		return getService().updateJobs(jobs);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of jobses.
	*
	* @return the number of jobses
	*/
	public static int getJobsesCount() {
		return getService().getJobsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cara.jobs.model.impl.JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cara.jobs.model.impl.JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the jobses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cara.jobs.model.impl.JobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @return the range of jobses
	*/
	public static java.util.List<cara.jobs.model.Jobs> getJobses(int start,
		int end) {
		return getService().getJobses(start, end);
	}

	/**
	* Returns all the jobses matching the UUID and company.
	*
	* @param uuid the UUID of the jobses
	* @param companyId the primary key of the company
	* @return the matching jobses, or an empty list if no matches were found
	*/
	public static java.util.List<cara.jobs.model.Jobs> getJobsesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getJobsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of jobses matching the UUID and company.
	*
	* @param uuid the UUID of the jobses
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of jobses
	* @param end the upper bound of the range of jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching jobses, or an empty list if no matches were found
	*/
	public static java.util.List<cara.jobs.model.Jobs> getJobsesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cara.jobs.model.Jobs> orderByComparator) {
		return getService()
				   .getJobsesByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static JobsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JobsLocalService, JobsLocalService> _serviceTracker =
		ServiceTrackerFactory.open(JobsLocalService.class);
}