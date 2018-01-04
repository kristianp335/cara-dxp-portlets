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

package com.liferay.unilever.demo.cara.taskdetails.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.unilever.demo.cara.taskdetails.exception.NoSuchTaskDetailsException;
import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails;
import com.liferay.unilever.demo.cara.taskdetails.model.impl.TaskDetailsImpl;
import com.liferay.unilever.demo.cara.taskdetails.model.impl.TaskDetailsModelImpl;
import com.liferay.unilever.demo.cara.taskdetails.service.persistence.TaskDetailsPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the task details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TaskDetailsPersistence
 * @see com.liferay.unilever.demo.cara.taskdetails.service.persistence.TaskDetailsUtil
 * @generated
 */
@ProviderType
public class TaskDetailsPersistenceImpl extends BasePersistenceImpl<TaskDetails>
	implements TaskDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TaskDetailsUtil} to access the task details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TaskDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, TaskDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, TaskDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, TaskDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, TaskDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TaskDetailsModelImpl.UUID_COLUMN_BITMASK |
			TaskDetailsModelImpl.TASKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the task detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching task detailses
	 */
	@Override
	public List<TaskDetails> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TaskDetails> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<TaskDetails> findByUuid(String uuid, int start, int end,
		OrderByComparator<TaskDetails> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<TaskDetails> findByUuid(String uuid, int start, int end,
		OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<TaskDetails> list = null;

		if (retrieveFromCache) {
			list = (List<TaskDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TaskDetails taskDetails : list) {
					if (!Objects.equals(uuid, taskDetails.getUuid())) {
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

			query.append(_SQL_SELECT_TASKDETAILS_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaskDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<TaskDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TaskDetails>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first task details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching task details
	 * @throws NoSuchTaskDetailsException if a matching task details could not be found
	 */
	@Override
	public TaskDetails findByUuid_First(String uuid,
		OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = fetchByUuid_First(uuid, orderByComparator);

		if (taskDetails != null) {
			return taskDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaskDetailsException(msg.toString());
	}

	/**
	 * Returns the first task details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching task details, or <code>null</code> if a matching task details could not be found
	 */
	@Override
	public TaskDetails fetchByUuid_First(String uuid,
		OrderByComparator<TaskDetails> orderByComparator) {
		List<TaskDetails> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last task details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching task details
	 * @throws NoSuchTaskDetailsException if a matching task details could not be found
	 */
	@Override
	public TaskDetails findByUuid_Last(String uuid,
		OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = fetchByUuid_Last(uuid, orderByComparator);

		if (taskDetails != null) {
			return taskDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaskDetailsException(msg.toString());
	}

	/**
	 * Returns the last task details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching task details, or <code>null</code> if a matching task details could not be found
	 */
	@Override
	public TaskDetails fetchByUuid_Last(String uuid,
		OrderByComparator<TaskDetails> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TaskDetails> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TaskDetails[] findByUuid_PrevAndNext(long taskDetailsId,
		String uuid, OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = findByPrimaryKey(taskDetailsId);

		Session session = null;

		try {
			session = openSession();

			TaskDetails[] array = new TaskDetailsImpl[3];

			array[0] = getByUuid_PrevAndNext(session, taskDetails, uuid,
					orderByComparator, true);

			array[1] = taskDetails;

			array[2] = getByUuid_PrevAndNext(session, taskDetails, uuid,
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

	protected TaskDetails getByUuid_PrevAndNext(Session session,
		TaskDetails taskDetails, String uuid,
		OrderByComparator<TaskDetails> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TASKDETAILS_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

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
			query.append(TaskDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(taskDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TaskDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the task detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TaskDetails taskDetails : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(taskDetails);
		}
	}

	/**
	 * Returns the number of task detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching task detailses
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TASKDETAILS_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "taskDetails.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "taskDetails.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(taskDetails.uuid IS NULL OR taskDetails.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, TaskDetailsImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			TaskDetailsModelImpl.UUID_COLUMN_BITMASK |
			TaskDetailsModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the task details where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTaskDetailsException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching task details
	 * @throws NoSuchTaskDetailsException if a matching task details could not be found
	 */
	@Override
	public TaskDetails findByUUID_G(String uuid, long groupId)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = fetchByUUID_G(uuid, groupId);

		if (taskDetails == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTaskDetailsException(msg.toString());
		}

		return taskDetails;
	}

	/**
	 * Returns the task details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching task details, or <code>null</code> if a matching task details could not be found
	 */
	@Override
	public TaskDetails fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the task details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching task details, or <code>null</code> if a matching task details could not be found
	 */
	@Override
	public TaskDetails fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof TaskDetails) {
			TaskDetails taskDetails = (TaskDetails)result;

			if (!Objects.equals(uuid, taskDetails.getUuid()) ||
					(groupId != taskDetails.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TASKDETAILS_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<TaskDetails> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					TaskDetails taskDetails = list.get(0);

					result = taskDetails;

					cacheResult(taskDetails);

					if ((taskDetails.getUuid() == null) ||
							!taskDetails.getUuid().equals(uuid) ||
							(taskDetails.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, taskDetails);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (TaskDetails)result;
		}
	}

	/**
	 * Removes the task details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the task details that was removed
	 */
	@Override
	public TaskDetails removeByUUID_G(String uuid, long groupId)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = findByUUID_G(uuid, groupId);

		return remove(taskDetails);
	}

	/**
	 * Returns the number of task detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching task detailses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TASKDETAILS_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "taskDetails.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "taskDetails.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(taskDetails.uuid IS NULL OR taskDetails.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "taskDetails.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, TaskDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, TaskDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			TaskDetailsModelImpl.UUID_COLUMN_BITMASK |
			TaskDetailsModelImpl.COMPANYID_COLUMN_BITMASK |
			TaskDetailsModelImpl.TASKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the task detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching task detailses
	 */
	@Override
	public List<TaskDetails> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<TaskDetails> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<TaskDetails> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<TaskDetails> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<TaskDetails> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<TaskDetails> list = null;

		if (retrieveFromCache) {
			list = (List<TaskDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TaskDetails taskDetails : list) {
					if (!Objects.equals(uuid, taskDetails.getUuid()) ||
							(companyId != taskDetails.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TASKDETAILS_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaskDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<TaskDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TaskDetails>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first task details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching task details
	 * @throws NoSuchTaskDetailsException if a matching task details could not be found
	 */
	@Override
	public TaskDetails findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (taskDetails != null) {
			return taskDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaskDetailsException(msg.toString());
	}

	/**
	 * Returns the first task details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching task details, or <code>null</code> if a matching task details could not be found
	 */
	@Override
	public TaskDetails fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<TaskDetails> orderByComparator) {
		List<TaskDetails> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TaskDetails findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (taskDetails != null) {
			return taskDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaskDetailsException(msg.toString());
	}

	/**
	 * Returns the last task details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching task details, or <code>null</code> if a matching task details could not be found
	 */
	@Override
	public TaskDetails fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<TaskDetails> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<TaskDetails> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TaskDetails[] findByUuid_C_PrevAndNext(long taskDetailsId,
		String uuid, long companyId,
		OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = findByPrimaryKey(taskDetailsId);

		Session session = null;

		try {
			session = openSession();

			TaskDetails[] array = new TaskDetailsImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, taskDetails, uuid,
					companyId, orderByComparator, true);

			array[1] = taskDetails;

			array[2] = getByUuid_C_PrevAndNext(session, taskDetails, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TaskDetails getByUuid_C_PrevAndNext(Session session,
		TaskDetails taskDetails, String uuid, long companyId,
		OrderByComparator<TaskDetails> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_TASKDETAILS_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(TaskDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(taskDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TaskDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the task detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (TaskDetails taskDetails : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(taskDetails);
		}
	}

	/**
	 * Returns the number of task detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching task detailses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TASKDETAILS_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "taskDetails.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "taskDetails.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(taskDetails.uuid IS NULL OR taskDetails.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "taskDetails.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_JOBID = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, TaskDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByJobId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JOBID = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, TaskDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByJobId",
			new String[] { Long.class.getName() },
			TaskDetailsModelImpl.JOBID_COLUMN_BITMASK |
			TaskDetailsModelImpl.TASKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_JOBID = new FinderPath(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByJobId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the task detailses where jobId = &#63;.
	 *
	 * @param jobId the job ID
	 * @return the matching task detailses
	 */
	@Override
	public List<TaskDetails> findByJobId(long jobId) {
		return findByJobId(jobId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TaskDetails> findByJobId(long jobId, int start, int end) {
		return findByJobId(jobId, start, end, null);
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
	@Override
	public List<TaskDetails> findByJobId(long jobId, int start, int end,
		OrderByComparator<TaskDetails> orderByComparator) {
		return findByJobId(jobId, start, end, orderByComparator, true);
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
	@Override
	public List<TaskDetails> findByJobId(long jobId, int start, int end,
		OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JOBID;
			finderArgs = new Object[] { jobId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_JOBID;
			finderArgs = new Object[] { jobId, start, end, orderByComparator };
		}

		List<TaskDetails> list = null;

		if (retrieveFromCache) {
			list = (List<TaskDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TaskDetails taskDetails : list) {
					if ((jobId != taskDetails.getJobId())) {
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

			query.append(_SQL_SELECT_TASKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_JOBID_JOBID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaskDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(jobId);

				if (!pagination) {
					list = (List<TaskDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TaskDetails>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first task details in the ordered set where jobId = &#63;.
	 *
	 * @param jobId the job ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching task details
	 * @throws NoSuchTaskDetailsException if a matching task details could not be found
	 */
	@Override
	public TaskDetails findByJobId_First(long jobId,
		OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = fetchByJobId_First(jobId, orderByComparator);

		if (taskDetails != null) {
			return taskDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jobId=");
		msg.append(jobId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaskDetailsException(msg.toString());
	}

	/**
	 * Returns the first task details in the ordered set where jobId = &#63;.
	 *
	 * @param jobId the job ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching task details, or <code>null</code> if a matching task details could not be found
	 */
	@Override
	public TaskDetails fetchByJobId_First(long jobId,
		OrderByComparator<TaskDetails> orderByComparator) {
		List<TaskDetails> list = findByJobId(jobId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last task details in the ordered set where jobId = &#63;.
	 *
	 * @param jobId the job ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching task details
	 * @throws NoSuchTaskDetailsException if a matching task details could not be found
	 */
	@Override
	public TaskDetails findByJobId_Last(long jobId,
		OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = fetchByJobId_Last(jobId, orderByComparator);

		if (taskDetails != null) {
			return taskDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("jobId=");
		msg.append(jobId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaskDetailsException(msg.toString());
	}

	/**
	 * Returns the last task details in the ordered set where jobId = &#63;.
	 *
	 * @param jobId the job ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching task details, or <code>null</code> if a matching task details could not be found
	 */
	@Override
	public TaskDetails fetchByJobId_Last(long jobId,
		OrderByComparator<TaskDetails> orderByComparator) {
		int count = countByJobId(jobId);

		if (count == 0) {
			return null;
		}

		List<TaskDetails> list = findByJobId(jobId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TaskDetails[] findByJobId_PrevAndNext(long taskDetailsId,
		long jobId, OrderByComparator<TaskDetails> orderByComparator)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = findByPrimaryKey(taskDetailsId);

		Session session = null;

		try {
			session = openSession();

			TaskDetails[] array = new TaskDetailsImpl[3];

			array[0] = getByJobId_PrevAndNext(session, taskDetails, jobId,
					orderByComparator, true);

			array[1] = taskDetails;

			array[2] = getByJobId_PrevAndNext(session, taskDetails, jobId,
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

	protected TaskDetails getByJobId_PrevAndNext(Session session,
		TaskDetails taskDetails, long jobId,
		OrderByComparator<TaskDetails> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TASKDETAILS_WHERE);

		query.append(_FINDER_COLUMN_JOBID_JOBID_2);

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
			query.append(TaskDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(jobId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(taskDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TaskDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the task detailses where jobId = &#63; from the database.
	 *
	 * @param jobId the job ID
	 */
	@Override
	public void removeByJobId(long jobId) {
		for (TaskDetails taskDetails : findByJobId(jobId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(taskDetails);
		}
	}

	/**
	 * Returns the number of task detailses where jobId = &#63;.
	 *
	 * @param jobId the job ID
	 * @return the number of matching task detailses
	 */
	@Override
	public int countByJobId(long jobId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_JOBID;

		Object[] finderArgs = new Object[] { jobId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TASKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_JOBID_JOBID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(jobId);

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

	private static final String _FINDER_COLUMN_JOBID_JOBID_2 = "taskDetails.jobId = ?";

	public TaskDetailsPersistenceImpl() {
		setModelClass(TaskDetails.class);
	}

	/**
	 * Caches the task details in the entity cache if it is enabled.
	 *
	 * @param taskDetails the task details
	 */
	@Override
	public void cacheResult(TaskDetails taskDetails) {
		entityCache.putResult(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsImpl.class, taskDetails.getPrimaryKey(), taskDetails);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { taskDetails.getUuid(), taskDetails.getGroupId() },
			taskDetails);

		taskDetails.resetOriginalValues();
	}

	/**
	 * Caches the task detailses in the entity cache if it is enabled.
	 *
	 * @param taskDetailses the task detailses
	 */
	@Override
	public void cacheResult(List<TaskDetails> taskDetailses) {
		for (TaskDetails taskDetails : taskDetailses) {
			if (entityCache.getResult(
						TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TaskDetailsImpl.class, taskDetails.getPrimaryKey()) == null) {
				cacheResult(taskDetails);
			}
			else {
				taskDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all task detailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TaskDetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the task details.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TaskDetails taskDetails) {
		entityCache.removeResult(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsImpl.class, taskDetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TaskDetailsModelImpl)taskDetails);
	}

	@Override
	public void clearCache(List<TaskDetails> taskDetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TaskDetails taskDetails : taskDetailses) {
			entityCache.removeResult(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TaskDetailsImpl.class, taskDetails.getPrimaryKey());

			clearUniqueFindersCache((TaskDetailsModelImpl)taskDetails);
		}
	}

	protected void cacheUniqueFindersCache(
		TaskDetailsModelImpl taskDetailsModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					taskDetailsModelImpl.getUuid(),
					taskDetailsModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				taskDetailsModelImpl);
		}
		else {
			if ((taskDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taskDetailsModelImpl.getUuid(),
						taskDetailsModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					taskDetailsModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TaskDetailsModelImpl taskDetailsModelImpl) {
		Object[] args = new Object[] {
				taskDetailsModelImpl.getUuid(),
				taskDetailsModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((taskDetailsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					taskDetailsModelImpl.getOriginalUuid(),
					taskDetailsModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new task details with the primary key. Does not add the task details to the database.
	 *
	 * @param taskDetailsId the primary key for the new task details
	 * @return the new task details
	 */
	@Override
	public TaskDetails create(long taskDetailsId) {
		TaskDetails taskDetails = new TaskDetailsImpl();

		taskDetails.setNew(true);
		taskDetails.setPrimaryKey(taskDetailsId);

		String uuid = PortalUUIDUtil.generate();

		taskDetails.setUuid(uuid);

		taskDetails.setCompanyId(companyProvider.getCompanyId());

		return taskDetails;
	}

	/**
	 * Removes the task details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taskDetailsId the primary key of the task details
	 * @return the task details that was removed
	 * @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	 */
	@Override
	public TaskDetails remove(long taskDetailsId)
		throws NoSuchTaskDetailsException {
		return remove((Serializable)taskDetailsId);
	}

	/**
	 * Removes the task details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the task details
	 * @return the task details that was removed
	 * @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	 */
	@Override
	public TaskDetails remove(Serializable primaryKey)
		throws NoSuchTaskDetailsException {
		Session session = null;

		try {
			session = openSession();

			TaskDetails taskDetails = (TaskDetails)session.get(TaskDetailsImpl.class,
					primaryKey);

			if (taskDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTaskDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(taskDetails);
		}
		catch (NoSuchTaskDetailsException nsee) {
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
	protected TaskDetails removeImpl(TaskDetails taskDetails) {
		taskDetails = toUnwrappedModel(taskDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(taskDetails)) {
				taskDetails = (TaskDetails)session.get(TaskDetailsImpl.class,
						taskDetails.getPrimaryKeyObj());
			}

			if (taskDetails != null) {
				session.delete(taskDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (taskDetails != null) {
			clearCache(taskDetails);
		}

		return taskDetails;
	}

	@Override
	public TaskDetails updateImpl(TaskDetails taskDetails) {
		taskDetails = toUnwrappedModel(taskDetails);

		boolean isNew = taskDetails.isNew();

		TaskDetailsModelImpl taskDetailsModelImpl = (TaskDetailsModelImpl)taskDetails;

		if (Validator.isNull(taskDetails.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			taskDetails.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (taskDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				taskDetails.setCreateDate(now);
			}
			else {
				taskDetails.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!taskDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				taskDetails.setModifiedDate(now);
			}
			else {
				taskDetails.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (taskDetails.isNew()) {
				session.save(taskDetails);

				taskDetails.setNew(false);
			}
			else {
				taskDetails = (TaskDetails)session.merge(taskDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TaskDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((taskDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taskDetailsModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { taskDetailsModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((taskDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taskDetailsModelImpl.getOriginalUuid(),
						taskDetailsModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						taskDetailsModelImpl.getUuid(),
						taskDetailsModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((taskDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JOBID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taskDetailsModelImpl.getOriginalJobId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_JOBID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JOBID,
					args);

				args = new Object[] { taskDetailsModelImpl.getJobId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_JOBID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_JOBID,
					args);
			}
		}

		entityCache.putResult(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaskDetailsImpl.class, taskDetails.getPrimaryKey(), taskDetails,
			false);

		clearUniqueFindersCache(taskDetailsModelImpl);
		cacheUniqueFindersCache(taskDetailsModelImpl, isNew);

		taskDetails.resetOriginalValues();

		return taskDetails;
	}

	protected TaskDetails toUnwrappedModel(TaskDetails taskDetails) {
		if (taskDetails instanceof TaskDetailsImpl) {
			return taskDetails;
		}

		TaskDetailsImpl taskDetailsImpl = new TaskDetailsImpl();

		taskDetailsImpl.setNew(taskDetails.isNew());
		taskDetailsImpl.setPrimaryKey(taskDetails.getPrimaryKey());

		taskDetailsImpl.setUuid(taskDetails.getUuid());
		taskDetailsImpl.setTaskDetailsId(taskDetails.getTaskDetailsId());
		taskDetailsImpl.setGroupId(taskDetails.getGroupId());
		taskDetailsImpl.setCompanyId(taskDetails.getCompanyId());
		taskDetailsImpl.setUserId(taskDetails.getUserId());
		taskDetailsImpl.setUserName(taskDetails.getUserName());
		taskDetailsImpl.setCreateDate(taskDetails.getCreateDate());
		taskDetailsImpl.setModifiedDate(taskDetails.getModifiedDate());
		taskDetailsImpl.setJobId(taskDetails.getJobId());
		taskDetailsImpl.setTaskId(taskDetails.getTaskId());
		taskDetailsImpl.setFileUrl(taskDetails.getFileUrl());
		taskDetailsImpl.setFileId(taskDetails.getFileId());
		taskDetailsImpl.setProductDetails(taskDetails.getProductDetails());
		taskDetailsImpl.setWhyUse(taskDetails.getWhyUse());
		taskDetailsImpl.setHowToUse(taskDetails.getHowToUse());
		taskDetailsImpl.setHowItWorks(taskDetails.getHowItWorks());
		taskDetailsImpl.setExpertTips(taskDetails.getExpertTips());
		taskDetailsImpl.setApprovedBy(taskDetails.getApprovedBy());
		taskDetailsImpl.setApproved(taskDetails.getApproved());
		taskDetailsImpl.setComments(taskDetails.getComments());

		return taskDetailsImpl;
	}

	/**
	 * Returns the task details with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the task details
	 * @return the task details
	 * @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	 */
	@Override
	public TaskDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTaskDetailsException {
		TaskDetails taskDetails = fetchByPrimaryKey(primaryKey);

		if (taskDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTaskDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return taskDetails;
	}

	/**
	 * Returns the task details with the primary key or throws a {@link NoSuchTaskDetailsException} if it could not be found.
	 *
	 * @param taskDetailsId the primary key of the task details
	 * @return the task details
	 * @throws NoSuchTaskDetailsException if a task details with the primary key could not be found
	 */
	@Override
	public TaskDetails findByPrimaryKey(long taskDetailsId)
		throws NoSuchTaskDetailsException {
		return findByPrimaryKey((Serializable)taskDetailsId);
	}

	/**
	 * Returns the task details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the task details
	 * @return the task details, or <code>null</code> if a task details with the primary key could not be found
	 */
	@Override
	public TaskDetails fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TaskDetailsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TaskDetails taskDetails = (TaskDetails)serializable;

		if (taskDetails == null) {
			Session session = null;

			try {
				session = openSession();

				taskDetails = (TaskDetails)session.get(TaskDetailsImpl.class,
						primaryKey);

				if (taskDetails != null) {
					cacheResult(taskDetails);
				}
				else {
					entityCache.putResult(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TaskDetailsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
					TaskDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return taskDetails;
	}

	/**
	 * Returns the task details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param taskDetailsId the primary key of the task details
	 * @return the task details, or <code>null</code> if a task details with the primary key could not be found
	 */
	@Override
	public TaskDetails fetchByPrimaryKey(long taskDetailsId) {
		return fetchByPrimaryKey((Serializable)taskDetailsId);
	}

	@Override
	public Map<Serializable, TaskDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TaskDetails> map = new HashMap<Serializable, TaskDetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TaskDetails taskDetails = fetchByPrimaryKey(primaryKey);

			if (taskDetails != null) {
				map.put(primaryKey, taskDetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
					TaskDetailsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TaskDetails)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TASKDETAILS_WHERE_PKS_IN);

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

			for (TaskDetails taskDetails : (List<TaskDetails>)q.list()) {
				map.put(taskDetails.getPrimaryKeyObj(), taskDetails);

				cacheResult(taskDetails);

				uncachedPrimaryKeys.remove(taskDetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TaskDetailsModelImpl.ENTITY_CACHE_ENABLED,
					TaskDetailsImpl.class, primaryKey, nullModel);
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
	 * Returns all the task detailses.
	 *
	 * @return the task detailses
	 */
	@Override
	public List<TaskDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TaskDetails> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TaskDetails> findAll(int start, int end,
		OrderByComparator<TaskDetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TaskDetails> findAll(int start, int end,
		OrderByComparator<TaskDetails> orderByComparator,
		boolean retrieveFromCache) {
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

		List<TaskDetails> list = null;

		if (retrieveFromCache) {
			list = (List<TaskDetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TASKDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TASKDETAILS;

				if (pagination) {
					sql = sql.concat(TaskDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TaskDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TaskDetails>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the task detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TaskDetails taskDetails : findAll()) {
			remove(taskDetails);
		}
	}

	/**
	 * Returns the number of task detailses.
	 *
	 * @return the number of task detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TASKDETAILS);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TaskDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the task details persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TaskDetailsImpl.class.getName());
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
	private static final String _SQL_SELECT_TASKDETAILS = "SELECT taskDetails FROM TaskDetails taskDetails";
	private static final String _SQL_SELECT_TASKDETAILS_WHERE_PKS_IN = "SELECT taskDetails FROM TaskDetails taskDetails WHERE taskDetailsId IN (";
	private static final String _SQL_SELECT_TASKDETAILS_WHERE = "SELECT taskDetails FROM TaskDetails taskDetails WHERE ";
	private static final String _SQL_COUNT_TASKDETAILS = "SELECT COUNT(taskDetails) FROM TaskDetails taskDetails";
	private static final String _SQL_COUNT_TASKDETAILS_WHERE = "SELECT COUNT(taskDetails) FROM TaskDetails taskDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "taskDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TaskDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TaskDetails exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TaskDetailsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}