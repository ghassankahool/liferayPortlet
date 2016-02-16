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

package net.gbcoder.gblib.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.gbcoder.gblib.model.Author;

/**
 * The persistence interface for the Author service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author GL
 * @see AuthorPersistenceImpl
 * @see AuthorUtil
 * @generated
 */
public interface AuthorPersistence extends BasePersistence<Author> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AuthorUtil} to access the Author persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the Authors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching Authors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Author> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Authors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of Authors
	* @param end the upper bound of the range of Authors (not inclusive)
	* @return the range of matching Authors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Author> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Authors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of Authors
	* @param end the upper bound of the range of Authors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Authors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Author> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Author in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Author
	* @throws net.gbcoder.gblib.NoSuchAuthorException if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	/**
	* Returns the first Author in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Author, or <code>null</code> if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Author in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Author
	* @throws net.gbcoder.gblib.NoSuchAuthorException if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	/**
	* Returns the last Author in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Author, or <code>null</code> if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Authors before and after the current Author in the ordered set where uuid = &#63;.
	*
	* @param authorId the primary key of the current Author
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Author
	* @throws net.gbcoder.gblib.NoSuchAuthorException if a Author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author[] findByUuid_PrevAndNext(
		long authorId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	/**
	* Removes all the Authors where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Authors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching Authors
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Author where uuid = &#63; and groupId = &#63; or throws a {@link net.gbcoder.gblib.NoSuchAuthorException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching Author
	* @throws net.gbcoder.gblib.NoSuchAuthorException if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	/**
	* Returns the Author where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching Author, or <code>null</code> if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Author where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching Author, or <code>null</code> if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the Author where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the Author that was removed
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	/**
	* Returns the number of Authors where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching Authors
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Authors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching Authors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Author> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Authors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of Authors
	* @param end the upper bound of the range of Authors (not inclusive)
	* @return the range of matching Authors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Author> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Authors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of Authors
	* @param end the upper bound of the range of Authors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Authors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Author> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Author in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Author
	* @throws net.gbcoder.gblib.NoSuchAuthorException if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	/**
	* Returns the first Author in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Author, or <code>null</code> if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Author in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Author
	* @throws net.gbcoder.gblib.NoSuchAuthorException if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	/**
	* Returns the last Author in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Author, or <code>null</code> if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Authors before and after the current Author in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param authorId the primary key of the current Author
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Author
	* @throws net.gbcoder.gblib.NoSuchAuthorException if a Author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author[] findByUuid_C_PrevAndNext(
		long authorId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	/**
	* Removes all the Authors where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Authors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching Authors
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the Author in the entity cache if it is enabled.
	*
	* @param author the Author
	*/
	public void cacheResult(net.gbcoder.gblib.model.Author author);

	/**
	* Caches the Authors in the entity cache if it is enabled.
	*
	* @param authors the Authors
	*/
	public void cacheResult(
		java.util.List<net.gbcoder.gblib.model.Author> authors);

	/**
	* Creates a new Author with the primary key. Does not add the Author to the database.
	*
	* @param authorId the primary key for the new Author
	* @return the new Author
	*/
	public net.gbcoder.gblib.model.Author create(long authorId);

	/**
	* Removes the Author with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param authorId the primary key of the Author
	* @return the Author that was removed
	* @throws net.gbcoder.gblib.NoSuchAuthorException if a Author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author remove(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	public net.gbcoder.gblib.model.Author updateImpl(
		net.gbcoder.gblib.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Author with the primary key or throws a {@link net.gbcoder.gblib.NoSuchAuthorException} if it could not be found.
	*
	* @param authorId the primary key of the Author
	* @return the Author
	* @throws net.gbcoder.gblib.NoSuchAuthorException if a Author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author findByPrimaryKey(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchAuthorException;

	/**
	* Returns the Author with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param authorId the primary key of the Author
	* @return the Author, or <code>null</code> if a Author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Author fetchByPrimaryKey(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Authors.
	*
	* @return the Authors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Author> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Authors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Authors
	* @param end the upper bound of the range of Authors (not inclusive)
	* @return the range of Authors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Author> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Authors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Authors
	* @param end the upper bound of the range of Authors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Authors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Author> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the Authors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Authors.
	*
	* @return the number of Authors
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}