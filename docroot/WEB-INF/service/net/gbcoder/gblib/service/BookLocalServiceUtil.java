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

package net.gbcoder.gblib.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Book. This utility wraps
 * {@link net.gbcoder.gblib.service.impl.BookLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author GL
 * @see BookLocalService
 * @see net.gbcoder.gblib.service.base.BookLocalServiceBaseImpl
 * @see net.gbcoder.gblib.service.impl.BookLocalServiceImpl
 * @generated
 */
public class BookLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link net.gbcoder.gblib.service.impl.BookLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the Book to the database. Also notifies the appropriate model listeners.
	*
	* @param book the Book
	* @return the Book that was added
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Book addBook(
		net.gbcoder.gblib.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBook(book);
	}

	/**
	* Creates a new Book with the primary key. Does not add the Book to the database.
	*
	* @param bookId the primary key for the new Book
	* @return the new Book
	*/
	public static net.gbcoder.gblib.model.Book createBook(long bookId) {
		return getService().createBook(bookId);
	}

	/**
	* Deletes the Book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the Book
	* @return the Book that was removed
	* @throws PortalException if a Book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Book deleteBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBook(bookId);
	}

	/**
	* Deletes the Book from the database. Also notifies the appropriate model listeners.
	*
	* @param book the Book
	* @return the Book that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Book deleteBook(
		net.gbcoder.gblib.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBook(book);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static net.gbcoder.gblib.model.Book fetchBook(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBook(bookId);
	}

	/**
	* Returns the Book with the matching UUID and company.
	*
	* @param uuid the Book's UUID
	* @param companyId the primary key of the company
	* @return the matching Book, or <code>null</code> if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Book fetchBookByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBookByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the Book matching the UUID and group.
	*
	* @param uuid the Book's UUID
	* @param groupId the primary key of the group
	* @return the matching Book, or <code>null</code> if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Book fetchBookByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBookByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the Book with the primary key.
	*
	* @param bookId the primary key of the Book
	* @return the Book
	* @throws PortalException if a Book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Book getBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBook(bookId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the Book with the matching UUID and company.
	*
	* @param uuid the Book's UUID
	* @param companyId the primary key of the company
	* @return the matching Book
	* @throws PortalException if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Book getBookByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBookByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the Book matching the UUID and group.
	*
	* @param uuid the Book's UUID
	* @param groupId the primary key of the group
	* @return the matching Book
	* @throws PortalException if a matching Book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Book getBookByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBookByUuidAndGroupId(uuid, groupId);
	}

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
	public static java.util.List<net.gbcoder.gblib.model.Book> getBooks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooks(start, end);
	}

	/**
	* Returns the number of Books.
	*
	* @return the number of Books
	* @throws SystemException if a system exception occurred
	*/
	public static int getBooksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooksCount();
	}

	/**
	* Updates the Book in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param book the Book
	* @return the Book that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Book updateBook(
		net.gbcoder.gblib.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBook(book);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static BookLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BookLocalService.class.getName());

			if (invokableLocalService instanceof BookLocalService) {
				_service = (BookLocalService)invokableLocalService;
			}
			else {
				_service = new BookLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BookLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BookLocalService service) {
	}

	private static BookLocalService _service;
}