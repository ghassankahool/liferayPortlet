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

package net.gbcoder.gblib.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import net.gbcoder.gblib.model.Author;
import net.gbcoder.gblib.model.AuthorModel;
import net.gbcoder.gblib.model.AuthorSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Author service. Represents a row in the &quot;Author&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link net.gbcoder.gblib.model.AuthorModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AuthorImpl}.
 * </p>
 *
 * @author GL
 * @see AuthorImpl
 * @see net.gbcoder.gblib.model.Author
 * @see net.gbcoder.gblib.model.AuthorModel
 * @generated
 */
@JSON(strict = true)
public class AuthorModelImpl extends BaseModelImpl<Author>
	implements AuthorModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a Author model instance should use the {@link net.gbcoder.gblib.model.Author} interface instead.
	 */
	public static final String TABLE_NAME = "Author";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "authorId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "authorName", Types.VARCHAR },
			{ "authorGender", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table Author (uuid_ VARCHAR(75) null,authorId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,authorName VARCHAR(75) null,authorGender BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table Author";
	public static final String ORDER_BY_JPQL = " ORDER BY author.authorId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Author.authorId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.net.gbcoder.gblib.model.Author"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.net.gbcoder.gblib.model.Author"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.net.gbcoder.gblib.model.Author"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;
	public static long AUTHORID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Author toModel(AuthorSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Author model = new AuthorImpl();

		model.setUuid(soapModel.getUuid());
		model.setAuthorId(soapModel.getAuthorId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setAuthorName(soapModel.getAuthorName());
		model.setAuthorGender(soapModel.getAuthorGender());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Author> toModels(AuthorSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Author> models = new ArrayList<Author>(soapModels.length);

		for (AuthorSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.net.gbcoder.gblib.model.Author"));

	public AuthorModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _authorId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAuthorId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _authorId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getAuthorId() {
		return _authorId;
	}

	@Override
	public void setAuthorId(long authorId) {
		_authorId = authorId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getAuthorName() {
		if (_authorName == null) {
			return StringPool.BLANK;
		}
		else {
			return _authorName;
		}
	}

	@Override
	public void setAuthorName(String authorName) {
		_authorName = authorName;
	}

	@JSON
	@Override
	public boolean getAuthorGender() {
		return _authorGender;
	}

	@Override
	public boolean isAuthorGender() {
		return _authorGender;
	}

	@Override
	public void setAuthorGender(boolean authorGender) {
		_authorGender = authorGender;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Author.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Author.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Author toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Author)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AuthorImpl authorImpl = new AuthorImpl();

		authorImpl.setUuid(getUuid());
		authorImpl.setAuthorId(getAuthorId());
		authorImpl.setGroupId(getGroupId());
		authorImpl.setCompanyId(getCompanyId());
		authorImpl.setUserId(getUserId());
		authorImpl.setUserName(getUserName());
		authorImpl.setCreateDate(getCreateDate());
		authorImpl.setModifiedDate(getModifiedDate());
		authorImpl.setAuthorName(getAuthorName());
		authorImpl.setAuthorGender(getAuthorGender());

		authorImpl.resetOriginalValues();

		return authorImpl;
	}

	@Override
	public int compareTo(Author author) {
		long primaryKey = author.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Author)) {
			return false;
		}

		Author author = (Author)obj;

		long primaryKey = author.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		AuthorModelImpl authorModelImpl = this;

		authorModelImpl._originalUuid = authorModelImpl._uuid;

		authorModelImpl._originalGroupId = authorModelImpl._groupId;

		authorModelImpl._setOriginalGroupId = false;

		authorModelImpl._originalCompanyId = authorModelImpl._companyId;

		authorModelImpl._setOriginalCompanyId = false;

		authorModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Author> toCacheModel() {
		AuthorCacheModel authorCacheModel = new AuthorCacheModel();

		authorCacheModel.uuid = getUuid();

		String uuid = authorCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			authorCacheModel.uuid = null;
		}

		authorCacheModel.authorId = getAuthorId();

		authorCacheModel.groupId = getGroupId();

		authorCacheModel.companyId = getCompanyId();

		authorCacheModel.userId = getUserId();

		authorCacheModel.userName = getUserName();

		String userName = authorCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			authorCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			authorCacheModel.createDate = createDate.getTime();
		}
		else {
			authorCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			authorCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			authorCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		authorCacheModel.authorName = getAuthorName();

		String authorName = authorCacheModel.authorName;

		if ((authorName != null) && (authorName.length() == 0)) {
			authorCacheModel.authorName = null;
		}

		authorCacheModel.authorGender = getAuthorGender();

		return authorCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", authorId=");
		sb.append(getAuthorId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", authorName=");
		sb.append(getAuthorName());
		sb.append(", authorGender=");
		sb.append(getAuthorGender());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("net.gbcoder.gblib.model.Author");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>authorId</column-name><column-value><![CDATA[");
		sb.append(getAuthorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>authorName</column-name><column-value><![CDATA[");
		sb.append(getAuthorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>authorGender</column-name><column-value><![CDATA[");
		sb.append(getAuthorGender());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Author.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Author.class };
	private String _uuid;
	private String _originalUuid;
	private long _authorId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _authorName;
	private boolean _authorGender;
	private long _columnBitmask;
	private Author _escapedModel;
}