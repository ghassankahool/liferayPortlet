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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Author service. Represents a row in the &quot;Author&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.gbcoder.gblib.model.impl.AuthorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.gbcoder.gblib.model.impl.AuthorImpl}.
 * </p>
 *
 * @author GL
 * @see Author
 * @see net.gbcoder.gblib.model.impl.AuthorImpl
 * @see net.gbcoder.gblib.model.impl.AuthorModelImpl
 * @generated
 */
public interface AuthorModel extends BaseModel<Author>, StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a Author model instance should use the {@link Author} interface instead.
	 */

	/**
	 * Returns the primary key of this Author.
	 *
	 * @return the primary key of this Author
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this Author.
	 *
	 * @param primaryKey the primary key of this Author
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this Author.
	 *
	 * @return the uuid of this Author
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this Author.
	 *
	 * @param uuid the uuid of this Author
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the author ID of this Author.
	 *
	 * @return the author ID of this Author
	 */
	public long getAuthorId();

	/**
	 * Sets the author ID of this Author.
	 *
	 * @param authorId the author ID of this Author
	 */
	public void setAuthorId(long authorId);

	/**
	 * Returns the group ID of this Author.
	 *
	 * @return the group ID of this Author
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this Author.
	 *
	 * @param groupId the group ID of this Author
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this Author.
	 *
	 * @return the company ID of this Author
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this Author.
	 *
	 * @param companyId the company ID of this Author
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this Author.
	 *
	 * @return the user ID of this Author
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this Author.
	 *
	 * @param userId the user ID of this Author
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this Author.
	 *
	 * @return the user uuid of this Author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this Author.
	 *
	 * @param userUuid the user uuid of this Author
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this Author.
	 *
	 * @return the user name of this Author
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this Author.
	 *
	 * @param userName the user name of this Author
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this Author.
	 *
	 * @return the create date of this Author
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this Author.
	 *
	 * @param createDate the create date of this Author
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this Author.
	 *
	 * @return the modified date of this Author
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this Author.
	 *
	 * @param modifiedDate the modified date of this Author
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the author name of this Author.
	 *
	 * @return the author name of this Author
	 */
	@AutoEscape
	public String getAuthorName();

	/**
	 * Sets the author name of this Author.
	 *
	 * @param authorName the author name of this Author
	 */
	public void setAuthorName(String authorName);

	/**
	 * Returns the author gender of this Author.
	 *
	 * @return the author gender of this Author
	 */
	public boolean getAuthorGender();

	/**
	 * Returns <code>true</code> if this Author is author gender.
	 *
	 * @return <code>true</code> if this Author is author gender; <code>false</code> otherwise
	 */
	public boolean isAuthorGender();

	/**
	 * Sets whether this Author is author gender.
	 *
	 * @param authorGender the author gender of this Author
	 */
	public void setAuthorGender(boolean authorGender);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(net.gbcoder.gblib.model.Author author);

	@Override
	public int hashCode();

	@Override
	public CacheModel<net.gbcoder.gblib.model.Author> toCacheModel();

	@Override
	public net.gbcoder.gblib.model.Author toEscapedModel();

	@Override
	public net.gbcoder.gblib.model.Author toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}