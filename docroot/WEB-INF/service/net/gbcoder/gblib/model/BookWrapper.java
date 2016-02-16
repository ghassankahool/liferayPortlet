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

package net.gbcoder.gblib.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Book}.
 * </p>
 *
 * @author GL
 * @see Book
 * @generated
 */
public class BookWrapper implements Book, ModelWrapper<Book> {
	public BookWrapper(Book book) {
		_book = book;
	}

	@Override
	public Class<?> getModelClass() {
		return Book.class;
	}

	@Override
	public String getModelClassName() {
		return Book.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookId", getBookId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bookName", getBookName());
		attributes.put("bookPricae", getBookPricae());
		attributes.put("bookDate", getBookDate());
		attributes.put("authorId", getAuthorId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String bookName = (String)attributes.get("bookName");

		if (bookName != null) {
			setBookName(bookName);
		}

		Double bookPricae = (Double)attributes.get("bookPricae");

		if (bookPricae != null) {
			setBookPricae(bookPricae);
		}

		Date bookDate = (Date)attributes.get("bookDate");

		if (bookDate != null) {
			setBookDate(bookDate);
		}

		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
		}
	}

	/**
	* Returns the primary key of this Book.
	*
	* @return the primary key of this Book
	*/
	@Override
	public long getPrimaryKey() {
		return _book.getPrimaryKey();
	}

	/**
	* Sets the primary key of this Book.
	*
	* @param primaryKey the primary key of this Book
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_book.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this Book.
	*
	* @return the uuid of this Book
	*/
	@Override
	public java.lang.String getUuid() {
		return _book.getUuid();
	}

	/**
	* Sets the uuid of this Book.
	*
	* @param uuid the uuid of this Book
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_book.setUuid(uuid);
	}

	/**
	* Returns the book ID of this Book.
	*
	* @return the book ID of this Book
	*/
	@Override
	public long getBookId() {
		return _book.getBookId();
	}

	/**
	* Sets the book ID of this Book.
	*
	* @param bookId the book ID of this Book
	*/
	@Override
	public void setBookId(long bookId) {
		_book.setBookId(bookId);
	}

	/**
	* Returns the group ID of this Book.
	*
	* @return the group ID of this Book
	*/
	@Override
	public long getGroupId() {
		return _book.getGroupId();
	}

	/**
	* Sets the group ID of this Book.
	*
	* @param groupId the group ID of this Book
	*/
	@Override
	public void setGroupId(long groupId) {
		_book.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this Book.
	*
	* @return the company ID of this Book
	*/
	@Override
	public long getCompanyId() {
		return _book.getCompanyId();
	}

	/**
	* Sets the company ID of this Book.
	*
	* @param companyId the company ID of this Book
	*/
	@Override
	public void setCompanyId(long companyId) {
		_book.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this Book.
	*
	* @return the user ID of this Book
	*/
	@Override
	public long getUserId() {
		return _book.getUserId();
	}

	/**
	* Sets the user ID of this Book.
	*
	* @param userId the user ID of this Book
	*/
	@Override
	public void setUserId(long userId) {
		_book.setUserId(userId);
	}

	/**
	* Returns the user uuid of this Book.
	*
	* @return the user uuid of this Book
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _book.getUserUuid();
	}

	/**
	* Sets the user uuid of this Book.
	*
	* @param userUuid the user uuid of this Book
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_book.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this Book.
	*
	* @return the user name of this Book
	*/
	@Override
	public java.lang.String getUserName() {
		return _book.getUserName();
	}

	/**
	* Sets the user name of this Book.
	*
	* @param userName the user name of this Book
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_book.setUserName(userName);
	}

	/**
	* Returns the create date of this Book.
	*
	* @return the create date of this Book
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _book.getCreateDate();
	}

	/**
	* Sets the create date of this Book.
	*
	* @param createDate the create date of this Book
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_book.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this Book.
	*
	* @return the modified date of this Book
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _book.getModifiedDate();
	}

	/**
	* Sets the modified date of this Book.
	*
	* @param modifiedDate the modified date of this Book
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_book.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the book name of this Book.
	*
	* @return the book name of this Book
	*/
	@Override
	public java.lang.String getBookName() {
		return _book.getBookName();
	}

	/**
	* Sets the book name of this Book.
	*
	* @param bookName the book name of this Book
	*/
	@Override
	public void setBookName(java.lang.String bookName) {
		_book.setBookName(bookName);
	}

	/**
	* Returns the book pricae of this Book.
	*
	* @return the book pricae of this Book
	*/
	@Override
	public double getBookPricae() {
		return _book.getBookPricae();
	}

	/**
	* Sets the book pricae of this Book.
	*
	* @param bookPricae the book pricae of this Book
	*/
	@Override
	public void setBookPricae(double bookPricae) {
		_book.setBookPricae(bookPricae);
	}

	/**
	* Returns the book date of this Book.
	*
	* @return the book date of this Book
	*/
	@Override
	public java.util.Date getBookDate() {
		return _book.getBookDate();
	}

	/**
	* Sets the book date of this Book.
	*
	* @param bookDate the book date of this Book
	*/
	@Override
	public void setBookDate(java.util.Date bookDate) {
		_book.setBookDate(bookDate);
	}

	/**
	* Returns the author ID of this Book.
	*
	* @return the author ID of this Book
	*/
	@Override
	public long getAuthorId() {
		return _book.getAuthorId();
	}

	/**
	* Sets the author ID of this Book.
	*
	* @param authorId the author ID of this Book
	*/
	@Override
	public void setAuthorId(long authorId) {
		_book.setAuthorId(authorId);
	}

	@Override
	public boolean isNew() {
		return _book.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_book.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _book.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_book.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _book.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _book.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_book.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _book.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_book.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_book.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_book.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BookWrapper((Book)_book.clone());
	}

	@Override
	public int compareTo(net.gbcoder.gblib.model.Book book) {
		return _book.compareTo(book);
	}

	@Override
	public int hashCode() {
		return _book.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<net.gbcoder.gblib.model.Book> toCacheModel() {
		return _book.toCacheModel();
	}

	@Override
	public net.gbcoder.gblib.model.Book toEscapedModel() {
		return new BookWrapper(_book.toEscapedModel());
	}

	@Override
	public net.gbcoder.gblib.model.Book toUnescapedModel() {
		return new BookWrapper(_book.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _book.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _book.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_book.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookWrapper)) {
			return false;
		}

		BookWrapper bookWrapper = (BookWrapper)obj;

		if (Validator.equals(_book, bookWrapper._book)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _book.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Book getWrappedBook() {
		return _book;
	}

	@Override
	public Book getWrappedModel() {
		return _book;
	}

	@Override
	public void resetOriginalValues() {
		_book.resetOriginalValues();
	}

	private Book _book;
}