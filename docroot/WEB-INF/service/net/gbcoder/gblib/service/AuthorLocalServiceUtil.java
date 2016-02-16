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
 * Provides the local service utility for Author. This utility wraps
 * {@link net.gbcoder.gblib.service.impl.AuthorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author GL
 * @see AuthorLocalService
 * @see net.gbcoder.gblib.service.base.AuthorLocalServiceBaseImpl
 * @see net.gbcoder.gblib.service.impl.AuthorLocalServiceImpl
 * @generated
 */
public class AuthorLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link net.gbcoder.gblib.service.impl.AuthorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the Author to the database. Also notifies the appropriate model listeners.
	*
	* @param author the Author
	* @return the Author that was added
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Author addAuthor(
		net.gbcoder.gblib.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAuthor(author);
	}

	/**
	* Creates a new Author with the primary key. Does not add the Author to the database.
	*
	* @param authorId the primary key for the new Author
	* @return the new Author
	*/
	public static net.gbcoder.gblib.model.Author createAuthor(long authorId) {
		return getService().createAuthor(authorId);
	}

	/**
	* Deletes the Author with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param authorId the primary key of the Author
	* @return the Author that was removed
	* @throws PortalException if a Author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Author deleteAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAuthor(authorId);
	}

	/**
	* Deletes the Author from the database. Also notifies the appropriate model listeners.
	*
	* @param author the Author
	* @return the Author that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Author deleteAuthor(
		net.gbcoder.gblib.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAuthor(author);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.gbcoder.gblib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static net.gbcoder.gblib.model.Author fetchAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAuthor(authorId);
	}

	/**
	* Returns the Author with the matching UUID and company.
	*
	* @param uuid the Author's UUID
	* @param companyId the primary key of the company
	* @return the matching Author, or <code>null</code> if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Author fetchAuthorByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAuthorByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the Author matching the UUID and group.
	*
	* @param uuid the Author's UUID
	* @param groupId the primary key of the group
	* @return the matching Author, or <code>null</code> if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Author fetchAuthorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAuthorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the Author with the primary key.
	*
	* @param authorId the primary key of the Author
	* @return the Author
	* @throws PortalException if a Author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Author getAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAuthor(authorId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the Author with the matching UUID and company.
	*
	* @param uuid the Author's UUID
	* @param companyId the primary key of the company
	* @return the matching Author
	* @throws PortalException if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Author getAuthorByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAuthorByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the Author matching the UUID and group.
	*
	* @param uuid the Author's UUID
	* @param groupId the primary key of the group
	* @return the matching Author
	* @throws PortalException if a matching Author could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Author getAuthorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAuthorByUuidAndGroupId(uuid, groupId);
	}

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
	public static java.util.List<net.gbcoder.gblib.model.Author> getAuthors(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAuthors(start, end);
	}

	/**
	* Returns the number of Authors.
	*
	* @return the number of Authors
	* @throws SystemException if a system exception occurred
	*/
	public static int getAuthorsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAuthorsCount();
	}

	/**
	* Updates the Author in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param author the Author
	* @return the Author that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static net.gbcoder.gblib.model.Author updateAuthor(
		net.gbcoder.gblib.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAuthor(author);
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

	public static AuthorLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AuthorLocalService.class.getName());

			if (invokableLocalService instanceof AuthorLocalService) {
				_service = (AuthorLocalService)invokableLocalService;
			}
			else {
				_service = new AuthorLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AuthorLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AuthorLocalService service) {
	}

	private static AuthorLocalService _service;
}