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
 * This class is a wrapper for {@link Author}.
 * </p>
 *
 * @author GL
 * @see Author
 * @generated
 */
public class AuthorWrapper implements Author, ModelWrapper<Author> {
	public AuthorWrapper(Author author) {
		_author = author;
	}

	@Override
	public Class<?> getModelClass() {
		return Author.class;
	}

	@Override
	public String getModelClassName() {
		return Author.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("authorId", getAuthorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("authorName", getAuthorName());
		attributes.put("authorGender", getAuthorGender());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
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

		String authorName = (String)attributes.get("authorName");

		if (authorName != null) {
			setAuthorName(authorName);
		}

		Boolean authorGender = (Boolean)attributes.get("authorGender");

		if (authorGender != null) {
			setAuthorGender(authorGender);
		}
	}

	/**
	* Returns the primary key of this Author.
	*
	* @return the primary key of this Author
	*/
	@Override
	public long getPrimaryKey() {
		return _author.getPrimaryKey();
	}

	/**
	* Sets the primary key of this Author.
	*
	* @param primaryKey the primary key of this Author
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_author.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this Author.
	*
	* @return the uuid of this Author
	*/
	@Override
	public java.lang.String getUuid() {
		return _author.getUuid();
	}

	/**
	* Sets the uuid of this Author.
	*
	* @param uuid the uuid of this Author
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_author.setUuid(uuid);
	}

	/**
	* Returns the author ID of this Author.
	*
	* @return the author ID of this Author
	*/
	@Override
	public long getAuthorId() {
		return _author.getAuthorId();
	}

	/**
	* Sets the author ID of this Author.
	*
	* @param authorId the author ID of this Author
	*/
	@Override
	public void setAuthorId(long authorId) {
		_author.setAuthorId(authorId);
	}

	/**
	* Returns the group ID of this Author.
	*
	* @return the group ID of this Author
	*/
	@Override
	public long getGroupId() {
		return _author.getGroupId();
	}

	/**
	* Sets the group ID of this Author.
	*
	* @param groupId the group ID of this Author
	*/
	@Override
	public void setGroupId(long groupId) {
		_author.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this Author.
	*
	* @return the company ID of this Author
	*/
	@Override
	public long getCompanyId() {
		return _author.getCompanyId();
	}

	/**
	* Sets the company ID of this Author.
	*
	* @param companyId the company ID of this Author
	*/
	@Override
	public void setCompanyId(long companyId) {
		_author.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this Author.
	*
	* @return the user ID of this Author
	*/
	@Override
	public long getUserId() {
		return _author.getUserId();
	}

	/**
	* Sets the user ID of this Author.
	*
	* @param userId the user ID of this Author
	*/
	@Override
	public void setUserId(long userId) {
		_author.setUserId(userId);
	}

	/**
	* Returns the user uuid of this Author.
	*
	* @return the user uuid of this Author
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _author.getUserUuid();
	}

	/**
	* Sets the user uuid of this Author.
	*
	* @param userUuid the user uuid of this Author
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_author.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this Author.
	*
	* @return the user name of this Author
	*/
	@Override
	public java.lang.String getUserName() {
		return _author.getUserName();
	}

	/**
	* Sets the user name of this Author.
	*
	* @param userName the user name of this Author
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_author.setUserName(userName);
	}

	/**
	* Returns the create date of this Author.
	*
	* @return the create date of this Author
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _author.getCreateDate();
	}

	/**
	* Sets the create date of this Author.
	*
	* @param createDate the create date of this Author
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_author.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this Author.
	*
	* @return the modified date of this Author
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _author.getModifiedDate();
	}

	/**
	* Sets the modified date of this Author.
	*
	* @param modifiedDate the modified date of this Author
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_author.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the author name of this Author.
	*
	* @return the author name of this Author
	*/
	@Override
	public java.lang.String getAuthorName() {
		return _author.getAuthorName();
	}

	/**
	* Sets the author name of this Author.
	*
	* @param authorName the author name of this Author
	*/
	@Override
	public void setAuthorName(java.lang.String authorName) {
		_author.setAuthorName(authorName);
	}

	/**
	* Returns the author gender of this Author.
	*
	* @return the author gender of this Author
	*/
	@Override
	public boolean getAuthorGender() {
		return _author.getAuthorGender();
	}

	/**
	* Returns <code>true</code> if this Author is author gender.
	*
	* @return <code>true</code> if this Author is author gender; <code>false</code> otherwise
	*/
	@Override
	public boolean isAuthorGender() {
		return _author.isAuthorGender();
	}

	/**
	* Sets whether this Author is author gender.
	*
	* @param authorGender the author gender of this Author
	*/
	@Override
	public void setAuthorGender(boolean authorGender) {
		_author.setAuthorGender(authorGender);
	}

	@Override
	public boolean isNew() {
		return _author.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_author.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _author.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_author.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _author.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _author.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_author.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _author.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_author.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_author.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_author.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AuthorWrapper((Author)_author.clone());
	}

	@Override
	public int compareTo(net.gbcoder.gblib.model.Author author) {
		return _author.compareTo(author);
	}

	@Override
	public int hashCode() {
		return _author.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<net.gbcoder.gblib.model.Author> toCacheModel() {
		return _author.toCacheModel();
	}

	@Override
	public net.gbcoder.gblib.model.Author toEscapedModel() {
		return new AuthorWrapper(_author.toEscapedModel());
	}

	@Override
	public net.gbcoder.gblib.model.Author toUnescapedModel() {
		return new AuthorWrapper(_author.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _author.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _author.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_author.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AuthorWrapper)) {
			return false;
		}

		AuthorWrapper authorWrapper = (AuthorWrapper)obj;

		if (Validator.equals(_author, authorWrapper._author)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _author.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Author getWrappedAuthor() {
		return _author;
	}

	@Override
	public Author getWrappedModel() {
		return _author;
	}

	@Override
	public void resetOriginalValues() {
		_author.resetOriginalValues();
	}

	private Author _author;
}