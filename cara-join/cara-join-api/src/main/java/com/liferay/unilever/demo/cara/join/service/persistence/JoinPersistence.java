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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.unilever.demo.cara.join.exception.NoSuchJoinException;
import com.liferay.unilever.demo.cara.join.model.Join;

/**
 * The persistence interface for the join service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.unilever.demo.cara.join.service.persistence.impl.JoinPersistenceImpl
 * @see JoinUtil
 * @generated
 */
@ProviderType
public interface JoinPersistence extends BasePersistence<Join> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JoinUtil} to access the join persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the joins where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the matching joins
	*/
	public java.util.List<Join> findByprojectId(long projectId);

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
	public java.util.List<Join> findByprojectId(long projectId, int start,
		int end);

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
	public java.util.List<Join> findByprojectId(long projectId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Join> orderByComparator);

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
	public java.util.List<Join> findByprojectId(long projectId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Join> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first join in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching join
	* @throws NoSuchJoinException if a matching join could not be found
	*/
	public Join findByprojectId_First(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Join> orderByComparator)
		throws NoSuchJoinException;

	/**
	* Returns the first join in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching join, or <code>null</code> if a matching join could not be found
	*/
	public Join fetchByprojectId_First(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Join> orderByComparator);

	/**
	* Returns the last join in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching join
	* @throws NoSuchJoinException if a matching join could not be found
	*/
	public Join findByprojectId_Last(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Join> orderByComparator)
		throws NoSuchJoinException;

	/**
	* Returns the last join in the ordered set where projectId = &#63;.
	*
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching join, or <code>null</code> if a matching join could not be found
	*/
	public Join fetchByprojectId_Last(long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Join> orderByComparator);

	/**
	* Returns the joins before and after the current join in the ordered set where projectId = &#63;.
	*
	* @param jobId the primary key of the current join
	* @param projectId the project ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next join
	* @throws NoSuchJoinException if a join with the primary key could not be found
	*/
	public Join[] findByprojectId_PrevAndNext(long jobId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Join> orderByComparator)
		throws NoSuchJoinException;

	/**
	* Removes all the joins where projectId = &#63; from the database.
	*
	* @param projectId the project ID
	*/
	public void removeByprojectId(long projectId);

	/**
	* Returns the number of joins where projectId = &#63;.
	*
	* @param projectId the project ID
	* @return the number of matching joins
	*/
	public int countByprojectId(long projectId);

	/**
	* Caches the join in the entity cache if it is enabled.
	*
	* @param join the join
	*/
	public void cacheResult(Join join);

	/**
	* Caches the joins in the entity cache if it is enabled.
	*
	* @param joins the joins
	*/
	public void cacheResult(java.util.List<Join> joins);

	/**
	* Creates a new join with the primary key. Does not add the join to the database.
	*
	* @param jobId the primary key for the new join
	* @return the new join
	*/
	public Join create(long jobId);

	/**
	* Removes the join with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the join
	* @return the join that was removed
	* @throws NoSuchJoinException if a join with the primary key could not be found
	*/
	public Join remove(long jobId) throws NoSuchJoinException;

	public Join updateImpl(Join join);

	/**
	* Returns the join with the primary key or throws a {@link NoSuchJoinException} if it could not be found.
	*
	* @param jobId the primary key of the join
	* @return the join
	* @throws NoSuchJoinException if a join with the primary key could not be found
	*/
	public Join findByPrimaryKey(long jobId) throws NoSuchJoinException;

	/**
	* Returns the join with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobId the primary key of the join
	* @return the join, or <code>null</code> if a join with the primary key could not be found
	*/
	public Join fetchByPrimaryKey(long jobId);

	@Override
	public java.util.Map<java.io.Serializable, Join> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the joins.
	*
	* @return the joins
	*/
	public java.util.List<Join> findAll();

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
	public java.util.List<Join> findAll(int start, int end);

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
	public java.util.List<Join> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Join> orderByComparator);

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
	public java.util.List<Join> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Join> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the joins from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of joins.
	*
	* @return the number of joins
	*/
	public int countAll();
}