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

import net.gbcoder.gblib.model.Book;

/**
 * The persistence interface for the Book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author GL
 * @see BookPersistenceImpl
 * @see BookUtil
 * @generated
 */
public interface BookPersistence extends BasePersistence<Book> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BookUtil} to access the Book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the Books where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching Books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Book> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Books where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of Books
	* @param end the upper bound of the range of Books (not inclusive)
	* @return the range of matching Books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Book> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Books where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of Books
	* @param end the upper bound of the range of Books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Book> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Book
	* @throws net.gbcoder.gblib.NoSuchBookException if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	/**
	* Returns the first Book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Book, or <code>null</code> if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Book
	* @throws net.gbcoder.gblib.NoSuchBookException if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	/**
	* Returns the last Book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Book, or <code>null</code> if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Books before and after the current Book in the ordered set where uuid = &#63;.
	*
	* @param bookId the primary key of the current Book
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Book
	* @throws net.gbcoder.gblib.NoSuchBookException if a Book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book[] findByUuid_PrevAndNext(long bookId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	/**
	* Removes all the Books where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Books where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching Books
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Book where uuid = &#63; and groupId = &#63; or throws a {@link net.gbcoder.gblib.NoSuchBookException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching Book
	* @throws net.gbcoder.gblib.NoSuchBookException if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	/**
	* Returns the Book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching Book, or <code>null</code> if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching Book, or <code>null</code> if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the Book where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the Book that was removed
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	/**
	* Returns the number of Books where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching Books
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Books where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching Books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Book> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Books where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of Books
	* @param end the upper bound of the range of Books (not inclusive)
	* @return the range of matching Books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Book> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Books where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of Books
	* @param end the upper bound of the range of Books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Book> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Book
	* @throws net.gbcoder.gblib.NoSuchBookException if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	/**
	* Returns the first Book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Book, or <code>null</code> if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Book
	* @throws net.gbcoder.gblib.NoSuchBookException if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	/**
	* Returns the last Book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Book, or <code>null</code> if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Books before and after the current Book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param bookId the primary key of the current Book
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Book
	* @throws net.gbcoder.gblib.NoSuchBookException if a Book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book[] findByUuid_C_PrevAndNext(
		long bookId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	/**
	* Removes all the Books where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Books where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching Books
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the Book in the entity cache if it is enabled.
	*
	* @param book the Book
	*/
	public void cacheResult(net.gbcoder.gblib.model.Book book);

	/**
	* Caches the Books in the entity cache if it is enabled.
	*
	* @param books the Books
	*/
	public void cacheResult(java.util.List<net.gbcoder.gblib.model.Book> books);

	/**
	* Creates a new Book with the primary key. Does not add the Book to the database.
	*
	* @param bookId the primary key for the new Book
	* @return the new Book
	*/
	public net.gbcoder.gblib.model.Book create(long bookId);

	/**
	* Removes the Book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the Book
	* @return the Book that was removed
	* @throws net.gbcoder.gblib.NoSuchBookException if a Book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book remove(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	public net.gbcoder.gblib.model.Book updateImpl(
		net.gbcoder.gblib.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Book with the primary key or throws a {@link net.gbcoder.gblib.NoSuchBookException} if it could not be found.
	*
	* @param bookId the primary key of the Book
	* @return the Book
	* @throws net.gbcoder.gblib.NoSuchBookException if a Book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book findByPrimaryKey(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.gbcoder.gblib.NoSuchBookException;

	/**
	* Returns the Book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the Book
	* @return the Book, or <code>null</code> if a Book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.gbcoder.gblib.model.Book fetchByPrimaryKey(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Books.
	*
	* @return the Books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Book> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Books
	* @param end the upper bound of the range of Books (not inclusive)
	* @return the range of Books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Book> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Books
	* @param end the upper bound of the range of Books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.gbcoder.gblib.model.Book> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the Books from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Books.
	*
	* @return the number of Books
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}