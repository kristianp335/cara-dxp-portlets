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

package com.liferay.unilever.demo.cara.join.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.unilever.demo.cara.join.exception.NoSuchJoinException;
import com.liferay.unilever.demo.cara.join.model.Join;
import com.liferay.unilever.demo.cara.join.model.impl.JoinImpl;
import com.liferay.unilever.demo.cara.join.model.impl.JoinModelImpl;
import com.liferay.unilever.demo.cara.join.service.persistence.JoinPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the join service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JoinPersistence
 * @see com.liferay.unilever.demo.cara.join.service.persistence.JoinUtil
 * @generated
 */
@ProviderType
public class JoinPersistenceImpl extends BasePersistenceImpl<Join>
	implements JoinPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JoinUtil} to access the join persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JoinImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JoinModelImpl.ENTITY_CACHE_ENABLED,
			JoinModelImpl.FINDER_CACHE_ENABLED, JoinImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JoinModelImpl.ENTITY_CACHE_ENABLED,
			JoinModelImpl.FINDER_CACHE_ENABLED, JoinImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JoinModelImpl.ENTITY_CACHE_ENABLED,
			JoinModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROJECTID =
		new FinderPath(JoinModelImpl.ENTITY_CACHE_ENABLED,
			JoinModelImpl.FINDER_CACHE_ENABLED, JoinImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByprojectId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECTID =
		new FinderPath(JoinModelImpl.ENTITY_CACHE_ENABLED,
			JoinModelImpl.FINDER_CACHE_ENABLED, JoinImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByprojectId",
			new String[] { Long.class.getName() },
			JoinModelImpl.PROJECTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PROJECTID = new FinderPath(JoinModelImpl.ENTITY_CACHE_ENABLED,
			JoinModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByprojectId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the joins where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching joins
	 */
	@Override
	public List<Join> findByprojectId(long projectId) {
		return findByprojectId(projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<Join> findByprojectId(long projectId, int start, int end) {
		return findByprojectId(projectId, start, end, null);
	}

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
	@Override
	public List<Join> findByprojectId(long projectId, int start, int end,
		OrderByComparator<Join> orderByComparator) {
		return findByprojectId(projectId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Join> findByprojectId(long projectId, int start, int end,
		OrderByComparator<Join> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECTID;
			finderArgs = new Object[] { projectId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROJECTID;
			finderArgs = new Object[] { projectId, start, end, orderByComparator };
		}

		List<Join> list = null;

		if (retrieveFromCache) {
			list = (List<Join>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Join join : list) {
					if ((projectId != join.getProjectId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_JOIN__WHERE);

			query.append(_FINDER_COLUMN_PROJECTID_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(JoinModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(projectId);

				if (!pagination) {
					list = (List<Join>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Join>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first join in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching join
	 * @throws NoSuchJoinException if a matching join could not be found
	 */
	@Override
	public Join findByprojectId_First(long projectId,
		OrderByComparator<Join> orderByComparator) throws NoSuchJoinException {
		Join join = fetchByprojectId_First(projectId, orderByComparator);

		if (join != null) {
			return join;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("projectId=");
		msg.append(projectId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJoinException(msg.toString());
	}

	/**
	 * Returns the first join in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching join, or <code>null</code> if a matching join could not be found
	 */
	@Override
	public Join fetchByprojectId_First(long projectId,
		OrderByComparator<Join> orderByComparator) {
		List<Join> list = findByprojectId(projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last join in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching join
	 * @throws NoSuchJoinException if a matching join could not be found
	 */
	@Override
	public Join findByprojectId_Last(long projectId,
		OrderByComparator<Join> orderByComparator) throws NoSuchJoinException {
		Join join = fetchByprojectId_Last(projectId, orderByComparator);

		if (join != null) {
			return join;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("projectId=");
		msg.append(projectId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJoinException(msg.toString());
	}

	/**
	 * Returns the last join in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching join, or <code>null</code> if a matching join could not be found
	 */
	@Override
	public Join fetchByprojectId_Last(long projectId,
		OrderByComparator<Join> orderByComparator) {
		int count = countByprojectId(projectId);

		if (count == 0) {
			return null;
		}

		List<Join> list = findByprojectId(projectId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the joins before and after the current join in the ordered set where projectId = &#63;.
	 *
	 * @param jobId the primary key of the current join
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next join
	 * @throws NoSuchJoinException if a join with the primary key could not be found
	 */
	@Override
	public Join[] findByprojectId_PrevAndNext(long jobId, long projectId,
		OrderByComparator<Join> orderByComparator) throws NoSuchJoinException {
		Join join = findByPrimaryKey(jobId);

		Session session = null;

		try {
			session = openSession();

			Join[] array = new JoinImpl[3];

			array[0] = getByprojectId_PrevAndNext(session, join, projectId,
					orderByComparator, true);

			array[1] = join;

			array[2] = getByprojectId_PrevAndNext(session, join, projectId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Join getByprojectId_PrevAndNext(Session session, Join join,
		long projectId, OrderByComparator<Join> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JOIN__WHERE);

		query.append(_FINDER_COLUMN_PROJECTID_PROJECTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(JoinModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(projectId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(join);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Join> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the joins where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	@Override
	public void removeByprojectId(long projectId) {
		for (Join join : findByprojectId(projectId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(join);
		}
	}

	/**
	 * Returns the number of joins where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching joins
	 */
	@Override
	public int countByprojectId(long projectId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PROJECTID;

		Object[] finderArgs = new Object[] { projectId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JOIN__WHERE);

			query.append(_FINDER_COLUMN_PROJECTID_PROJECTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(projectId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PROJECTID_PROJECTID_2 = "join_.projectId = ?";

	public JoinPersistenceImpl() {
		setModelClass(Join.class);
	}

	/**
	 * Caches the join in the entity cache if it is enabled.
	 *
	 * @param join the join
	 */
	@Override
	public void cacheResult(Join join) {
		entityCache.putResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
			JoinImpl.class, join.getPrimaryKey(), join);

		join.resetOriginalValues();
	}

	/**
	 * Caches the joins in the entity cache if it is enabled.
	 *
	 * @param joins the joins
	 */
	@Override
	public void cacheResult(List<Join> joins) {
		for (Join join : joins) {
			if (entityCache.getResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
						JoinImpl.class, join.getPrimaryKey()) == null) {
				cacheResult(join);
			}
			else {
				join.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all joins.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JoinImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the join.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Join join) {
		entityCache.removeResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
			JoinImpl.class, join.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Join> joins) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Join join : joins) {
			entityCache.removeResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
				JoinImpl.class, join.getPrimaryKey());
		}
	}

	/**
	 * Creates a new join with the primary key. Does not add the join to the database.
	 *
	 * @param jobId the primary key for the new join
	 * @return the new join
	 */
	@Override
	public Join create(long jobId) {
		Join join = new JoinImpl();

		join.setNew(true);
		join.setPrimaryKey(jobId);

		join.setCompanyId(companyProvider.getCompanyId());

		return join;
	}

	/**
	 * Removes the join with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobId the primary key of the join
	 * @return the join that was removed
	 * @throws NoSuchJoinException if a join with the primary key could not be found
	 */
	@Override
	public Join remove(long jobId) throws NoSuchJoinException {
		return remove((Serializable)jobId);
	}

	/**
	 * Removes the join with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the join
	 * @return the join that was removed
	 * @throws NoSuchJoinException if a join with the primary key could not be found
	 */
	@Override
	public Join remove(Serializable primaryKey) throws NoSuchJoinException {
		Session session = null;

		try {
			session = openSession();

			Join join = (Join)session.get(JoinImpl.class, primaryKey);

			if (join == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJoinException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(join);
		}
		catch (NoSuchJoinException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Join removeImpl(Join join) {
		join = toUnwrappedModel(join);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(join)) {
				join = (Join)session.get(JoinImpl.class, join.getPrimaryKeyObj());
			}

			if (join != null) {
				session.delete(join);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (join != null) {
			clearCache(join);
		}

		return join;
	}

	@Override
	public Join updateImpl(Join join) {
		join = toUnwrappedModel(join);

		boolean isNew = join.isNew();

		JoinModelImpl joinModelImpl = (JoinModelImpl)join;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (join.getCreateDate() == null)) {
			if (serviceContext == null) {
				join.setCreateDate(now);
			}
			else {
				join.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!joinModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				join.setModifiedDate(now);
			}
			else {
				join.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (join.isNew()) {
				session.save(join);

				join.setNew(false);
			}
			else {
				join = (Join)session.merge(join);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !JoinModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((joinModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						joinModelImpl.getOriginalProjectId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PROJECTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECTID,
					args);

				args = new Object[] { joinModelImpl.getProjectId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PROJECTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROJECTID,
					args);
			}
		}

		entityCache.putResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
			JoinImpl.class, join.getPrimaryKey(), join, false);

		join.resetOriginalValues();

		return join;
	}

	protected Join toUnwrappedModel(Join join) {
		if (join instanceof JoinImpl) {
			return join;
		}

		JoinImpl joinImpl = new JoinImpl();

		joinImpl.setNew(join.isNew());
		joinImpl.setPrimaryKey(join.getPrimaryKey());

		joinImpl.setJobId(join.getJobId());
		joinImpl.setGroupId(join.getGroupId());
		joinImpl.setCompanyId(join.getCompanyId());
		joinImpl.setUserId(join.getUserId());
		joinImpl.setUserName(join.getUserName());
		joinImpl.setCreateDate(join.getCreateDate());
		joinImpl.setModifiedDate(join.getModifiedDate());
		joinImpl.setProjectId(join.getProjectId());
		joinImpl.setJobType(join.getJobType());
		joinImpl.setVariant(join.getVariant());
		joinImpl.setFormat(join.getFormat());
		joinImpl.setVisualDesign(join.getVisualDesign());
		joinImpl.setVisualDesignCu(join.getVisualDesignCu());
		joinImpl.setNoticableConsumers(join.getNoticableConsumers());
		joinImpl.setChangePackaging(join.getChangePackaging());
		joinImpl.setChangeFormulation(join.getChangeFormulation());
		joinImpl.setVisualDesignComplete(join.getVisualDesignComplete());
		joinImpl.setArtworkApproved(join.getArtworkApproved());
		joinImpl.setSeparationFilesToPrinter(join.getSeparationFilesToPrinter());
		joinImpl.setMarketDeployment(join.getMarketDeployment());
		joinImpl.setShipToTrade(join.getShipToTrade());
		joinImpl.setDesignAgency(join.getDesignAgency());
		joinImpl.setPmaUser(join.getPmaUser());
		joinImpl.setLocalMarketing(join.getLocalMarketing());
		joinImpl.setRndLocalDeployUser(join.getRndLocalDeployUser());
		joinImpl.setProjectName(join.getProjectName());
		joinImpl.setProjectCategory(join.getProjectCategory());
		joinImpl.setProjectType(join.getProjectType());
		joinImpl.setBrand(join.getBrand());
		joinImpl.setProjectUserId(join.getProjectUserId());

		return joinImpl;
	}

	/**
	 * Returns the join with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the join
	 * @return the join
	 * @throws NoSuchJoinException if a join with the primary key could not be found
	 */
	@Override
	public Join findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJoinException {
		Join join = fetchByPrimaryKey(primaryKey);

		if (join == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJoinException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return join;
	}

	/**
	 * Returns the join with the primary key or throws a {@link NoSuchJoinException} if it could not be found.
	 *
	 * @param jobId the primary key of the join
	 * @return the join
	 * @throws NoSuchJoinException if a join with the primary key could not be found
	 */
	@Override
	public Join findByPrimaryKey(long jobId) throws NoSuchJoinException {
		return findByPrimaryKey((Serializable)jobId);
	}

	/**
	 * Returns the join with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the join
	 * @return the join, or <code>null</code> if a join with the primary key could not be found
	 */
	@Override
	public Join fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
				JoinImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Join join = (Join)serializable;

		if (join == null) {
			Session session = null;

			try {
				session = openSession();

				join = (Join)session.get(JoinImpl.class, primaryKey);

				if (join != null) {
					cacheResult(join);
				}
				else {
					entityCache.putResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
						JoinImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
					JoinImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return join;
	}

	/**
	 * Returns the join with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jobId the primary key of the join
	 * @return the join, or <code>null</code> if a join with the primary key could not be found
	 */
	@Override
	public Join fetchByPrimaryKey(long jobId) {
		return fetchByPrimaryKey((Serializable)jobId);
	}

	@Override
	public Map<Serializable, Join> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Join> map = new HashMap<Serializable, Join>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Join join = fetchByPrimaryKey(primaryKey);

			if (join != null) {
				map.put(primaryKey, join);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
					JoinImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Join)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_JOIN__WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Join join : (List<Join>)q.list()) {
				map.put(join.getPrimaryKeyObj(), join);

				cacheResult(join);

				uncachedPrimaryKeys.remove(join.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(JoinModelImpl.ENTITY_CACHE_ENABLED,
					JoinImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the joins.
	 *
	 * @return the joins
	 */
	@Override
	public List<Join> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Join> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Join> findAll(int start, int end,
		OrderByComparator<Join> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Join> findAll(int start, int end,
		OrderByComparator<Join> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Join> list = null;

		if (retrieveFromCache) {
			list = (List<Join>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_JOIN_);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JOIN_;

				if (pagination) {
					sql = sql.concat(JoinModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Join>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Join>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the joins from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Join join : findAll()) {
			remove(join);
		}
	}

	/**
	 * Returns the number of joins.
	 *
	 * @return the number of joins
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JOIN_);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JoinModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the join persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(JoinImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_JOIN_ = "SELECT join_ FROM Join join_";
	private static final String _SQL_SELECT_JOIN__WHERE_PKS_IN = "SELECT join_ FROM Join join_ WHERE jobId IN (";
	private static final String _SQL_SELECT_JOIN__WHERE = "SELECT join_ FROM Join join_ WHERE ";
	private static final String _SQL_COUNT_JOIN_ = "SELECT COUNT(join_) FROM Join join_";
	private static final String _SQL_COUNT_JOIN__WHERE = "SELECT COUNT(join_) FROM Join join_ WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "join_.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Join exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Join exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(JoinPersistenceImpl.class);
}