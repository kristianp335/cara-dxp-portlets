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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.unilever.demo.cara.exception.NoSuchprojectException;
import com.liferay.unilever.demo.cara.model.project;

/**
 * The persistence interface for the project service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.unilever.demo.cara.service.persistence.impl.projectPersistenceImpl
 * @see projectUtil
 * @generated
 */
@ProviderType
public interface projectPersistence extends BasePersistence<project> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link projectUtil} to access the project persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the projects where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching projects
	*/
	public java.util.List<project> findByUuid(java.lang.String uuid);

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
	public java.util.List<project> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<project> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public java.util.List<project> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the first project in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the last project in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the last project in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the projects before and after the current project in the ordered set where uuid = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public project[] findByUuid_PrevAndNext(long projectId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Removes all the projects where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of projects where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching projects
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the project where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchprojectException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchprojectException;

	/**
	* Returns the project where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the project where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the project where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the project that was removed
	*/
	public project removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchprojectException;

	/**
	* Returns the number of projects where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching projects
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the projects where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching projects
	*/
	public java.util.List<project> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<project> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<project> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public java.util.List<project> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the first project in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the last project in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the last project in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public project[] findByUuid_C_PrevAndNext(long projectId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Removes all the projects where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of projects where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching projects
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the projects where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching projects
	*/
	public java.util.List<project> findByGroupId(long groupId);

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
	public java.util.List<project> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<project> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public java.util.List<project> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the first project in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the last project in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the last project in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the projects before and after the current project in the ordered set where groupId = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public project[] findByGroupId_PrevAndNext(long projectId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Removes all the projects where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of projects where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching projects
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the projects where status = &#63;.
	*
	* @param status the status
	* @return the matching projects
	*/
	public java.util.List<project> findByStatus(int status);

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
	public java.util.List<project> findByStatus(int status, int start, int end);

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
	public java.util.List<project> findByStatus(int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public java.util.List<project> findByStatus(int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the first project in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the last project in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the last project in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the projects before and after the current project in the ordered set where status = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public project[] findByStatus_PrevAndNext(long projectId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Removes all the projects where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(int status);

	/**
	* Returns the number of projects where status = &#63;.
	*
	* @param status the status
	* @return the number of matching projects
	*/
	public int countByStatus(int status);

	/**
	* Returns all the projects where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching projects
	*/
	public java.util.List<project> findByG_S(long groupId, int status);

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
	public java.util.List<project> findByG_S(long groupId, int status,
		int start, int end);

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
	public java.util.List<project> findByG_S(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public java.util.List<project> findByG_S(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the first project in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the last project in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the last project in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public project[] findByG_S_PrevAndNext(long projectId, long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Removes all the projects where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeByG_S(long groupId, int status);

	/**
	* Returns the number of projects where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching projects
	*/
	public int countByG_S(long groupId, int status);

	/**
	* Returns all the projects where projectName = &#63;.
	*
	* @param projectName the project name
	* @return the matching projects
	*/
	public java.util.List<project> findByProjectName(
		java.lang.String projectName);

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
	public java.util.List<project> findByProjectName(
		java.lang.String projectName, int start, int end);

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
	public java.util.List<project> findByProjectName(
		java.lang.String projectName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public java.util.List<project> findByProjectName(
		java.lang.String projectName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByProjectName_First(java.lang.String projectName,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the first project in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByProjectName_First(java.lang.String projectName,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the last project in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByProjectName_Last(java.lang.String projectName,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the last project in the ordered set where projectName = &#63;.
	*
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByProjectName_Last(java.lang.String projectName,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the projects before and after the current project in the ordered set where projectName = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param projectName the project name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public project[] findByProjectName_PrevAndNext(long projectId,
		java.lang.String projectName,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Removes all the projects where projectName = &#63; from the database.
	*
	* @param projectName the project name
	*/
	public void removeByProjectName(java.lang.String projectName);

	/**
	* Returns the number of projects where projectName = &#63;.
	*
	* @param projectName the project name
	* @return the number of matching projects
	*/
	public int countByProjectName(java.lang.String projectName);

	/**
	* Returns all the projects where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @return the matching projects
	*/
	public java.util.List<project> findByProjectCategory(
		java.lang.String projectCategory);

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
	public java.util.List<project> findByProjectCategory(
		java.lang.String projectCategory, int start, int end);

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
	public java.util.List<project> findByProjectCategory(
		java.lang.String projectCategory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public java.util.List<project> findByProjectCategory(
		java.lang.String projectCategory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project in the ordered set where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByProjectCategory_First(
		java.lang.String projectCategory,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the first project in the ordered set where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByProjectCategory_First(
		java.lang.String projectCategory,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the last project in the ordered set where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByProjectCategory_Last(
		java.lang.String projectCategory,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the last project in the ordered set where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByProjectCategory_Last(
		java.lang.String projectCategory,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the projects before and after the current project in the ordered set where projectCategory = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param projectCategory the project category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public project[] findByProjectCategory_PrevAndNext(long projectId,
		java.lang.String projectCategory,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Removes all the projects where projectCategory = &#63; from the database.
	*
	* @param projectCategory the project category
	*/
	public void removeByProjectCategory(java.lang.String projectCategory);

	/**
	* Returns the number of projects where projectCategory = &#63;.
	*
	* @param projectCategory the project category
	* @return the number of matching projects
	*/
	public int countByProjectCategory(java.lang.String projectCategory);

	/**
	* Returns the project where projectRefId = &#63; or throws a {@link NoSuchprojectException} if it could not be found.
	*
	* @param projectRefId the project ref ID
	* @return the matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByProjectRefId(java.lang.String projectRefId)
		throws NoSuchprojectException;

	/**
	* Returns the project where projectRefId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param projectRefId the project ref ID
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByProjectRefId(java.lang.String projectRefId);

	/**
	* Returns the project where projectRefId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param projectRefId the project ref ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByProjectRefId(java.lang.String projectRefId,
		boolean retrieveFromCache);

	/**
	* Removes the project where projectRefId = &#63; from the database.
	*
	* @param projectRefId the project ref ID
	* @return the project that was removed
	*/
	public project removeByProjectRefId(java.lang.String projectRefId)
		throws NoSuchprojectException;

	/**
	* Returns the number of projects where projectRefId = &#63;.
	*
	* @param projectRefId the project ref ID
	* @return the number of matching projects
	*/
	public int countByProjectRefId(java.lang.String projectRefId);

	/**
	* Returns all the projects where projectType = &#63;.
	*
	* @param projectType the project type
	* @return the matching projects
	*/
	public java.util.List<project> findByProjectType(
		java.lang.String projectType);

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
	public java.util.List<project> findByProjectType(
		java.lang.String projectType, int start, int end);

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
	public java.util.List<project> findByProjectType(
		java.lang.String projectType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public java.util.List<project> findByProjectType(
		java.lang.String projectType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first project in the ordered set where projectType = &#63;.
	*
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByProjectType_First(java.lang.String projectType,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the first project in the ordered set where projectType = &#63;.
	*
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByProjectType_First(java.lang.String projectType,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the last project in the ordered set where projectType = &#63;.
	*
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project
	* @throws NoSuchprojectException if a matching project could not be found
	*/
	public project findByProjectType_Last(java.lang.String projectType,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Returns the last project in the ordered set where projectType = &#63;.
	*
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching project, or <code>null</code> if a matching project could not be found
	*/
	public project fetchByProjectType_Last(java.lang.String projectType,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

	/**
	* Returns the projects before and after the current project in the ordered set where projectType = &#63;.
	*
	* @param projectId the primary key of the current project
	* @param projectType the project type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public project[] findByProjectType_PrevAndNext(long projectId,
		java.lang.String projectType,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator)
		throws NoSuchprojectException;

	/**
	* Removes all the projects where projectType = &#63; from the database.
	*
	* @param projectType the project type
	*/
	public void removeByProjectType(java.lang.String projectType);

	/**
	* Returns the number of projects where projectType = &#63;.
	*
	* @param projectType the project type
	* @return the number of matching projects
	*/
	public int countByProjectType(java.lang.String projectType);

	/**
	* Caches the project in the entity cache if it is enabled.
	*
	* @param project the project
	*/
	public void cacheResult(project project);

	/**
	* Caches the projects in the entity cache if it is enabled.
	*
	* @param projects the projects
	*/
	public void cacheResult(java.util.List<project> projects);

	/**
	* Creates a new project with the primary key. Does not add the project to the database.
	*
	* @param projectId the primary key for the new project
	* @return the new project
	*/
	public project create(long projectId);

	/**
	* Removes the project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the project
	* @return the project that was removed
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public project remove(long projectId) throws NoSuchprojectException;

	public project updateImpl(project project);

	/**
	* Returns the project with the primary key or throws a {@link NoSuchprojectException} if it could not be found.
	*
	* @param projectId the primary key of the project
	* @return the project
	* @throws NoSuchprojectException if a project with the primary key could not be found
	*/
	public project findByPrimaryKey(long projectId)
		throws NoSuchprojectException;

	/**
	* Returns the project with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectId the primary key of the project
	* @return the project, or <code>null</code> if a project with the primary key could not be found
	*/
	public project fetchByPrimaryKey(long projectId);

	@Override
	public java.util.Map<java.io.Serializable, project> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the projects.
	*
	* @return the projects
	*/
	public java.util.List<project> findAll();

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
	public java.util.List<project> findAll(int start, int end);

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
	public java.util.List<project> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator);

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
	public java.util.List<project> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<project> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the projects from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of projects.
	*
	* @return the number of projects
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}