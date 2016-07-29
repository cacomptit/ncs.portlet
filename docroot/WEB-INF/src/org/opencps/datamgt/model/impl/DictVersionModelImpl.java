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

package org.opencps.datamgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
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

import org.opencps.datamgt.model.DictVersion;
import org.opencps.datamgt.model.DictVersionModel;
import org.opencps.datamgt.model.DictVersionSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DictVersion service. Represents a row in the &quot;opencps_dictversion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.datamgt.model.DictVersionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DictVersionImpl}.
 * </p>
 *
 * @author khoavd
 * @see DictVersionImpl
 * @see org.opencps.datamgt.model.DictVersion
 * @see org.opencps.datamgt.model.DictVersionModel
 * @generated
 */
@JSON(strict = true)
public class DictVersionModelImpl extends BaseModelImpl<DictVersion>
	implements DictVersionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dict version model instance should use the {@link org.opencps.datamgt.model.DictVersion} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_dictversion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dictVersionId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dictCollectionId", Types.BIGINT },
			{ "version", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "validatedFrom", Types.TIMESTAMP },
			{ "validatedTo", Types.TIMESTAMP },
			{ "issueStatus", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_dictversion (dictVersionId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,dictCollectionId LONG,version VARCHAR(75) null,description STRING null,validatedFrom DATE null,validatedTo DATE null,issueStatus INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table opencps_dictversion";
	public static final String ORDER_BY_JPQL = " ORDER BY dictVersion.dictVersionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_dictversion.dictVersionId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.datamgt.model.DictVersion"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.datamgt.model.DictVersion"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.datamgt.model.DictVersion"),
			true);
	public static long DICTCOLLECTIONID_COLUMN_BITMASK = 1L;
	public static long DICTVERSIONID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DictVersion toModel(DictVersionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DictVersion model = new DictVersionImpl();

		model.setDictVersionId(soapModel.getDictVersionId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDictCollectionId(soapModel.getDictCollectionId());
		model.setVersion(soapModel.getVersion());
		model.setDescription(soapModel.getDescription());
		model.setValidatedFrom(soapModel.getValidatedFrom());
		model.setValidatedTo(soapModel.getValidatedTo());
		model.setIssueStatus(soapModel.getIssueStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DictVersion> toModels(DictVersionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DictVersion> models = new ArrayList<DictVersion>(soapModels.length);

		for (DictVersionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.datamgt.model.DictVersion"));

	public DictVersionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dictVersionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDictVersionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dictVersionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DictVersion.class;
	}

	@Override
	public String getModelClassName() {
		return DictVersion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dictVersionId", getDictVersionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dictCollectionId", getDictCollectionId());
		attributes.put("version", getVersion());
		attributes.put("description", getDescription());
		attributes.put("validatedFrom", getValidatedFrom());
		attributes.put("validatedTo", getValidatedTo());
		attributes.put("issueStatus", getIssueStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dictVersionId = (Long)attributes.get("dictVersionId");

		if (dictVersionId != null) {
			setDictVersionId(dictVersionId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long dictCollectionId = (Long)attributes.get("dictCollectionId");

		if (dictCollectionId != null) {
			setDictCollectionId(dictCollectionId);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date validatedFrom = (Date)attributes.get("validatedFrom");

		if (validatedFrom != null) {
			setValidatedFrom(validatedFrom);
		}

		Date validatedTo = (Date)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}

		Integer issueStatus = (Integer)attributes.get("issueStatus");

		if (issueStatus != null) {
			setIssueStatus(issueStatus);
		}
	}

	@JSON
	@Override
	public long getDictVersionId() {
		return _dictVersionId;
	}

	@Override
	public void setDictVersionId(long dictVersionId) {
		_dictVersionId = dictVersionId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
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
	public long getDictCollectionId() {
		return _dictCollectionId;
	}

	@Override
	public void setDictCollectionId(long dictCollectionId) {
		_columnBitmask |= DICTCOLLECTIONID_COLUMN_BITMASK;

		if (!_setOriginalDictCollectionId) {
			_setOriginalDictCollectionId = true;

			_originalDictCollectionId = _dictCollectionId;
		}

		_dictCollectionId = dictCollectionId;
	}

	public long getOriginalDictCollectionId() {
		return _originalDictCollectionId;
	}

	@JSON
	@Override
	public String getVersion() {
		if (_version == null) {
			return StringPool.BLANK;
		}
		else {
			return _version;
		}
	}

	@Override
	public void setVersion(String version) {
		_version = version;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public Date getValidatedFrom() {
		return _validatedFrom;
	}

	@Override
	public void setValidatedFrom(Date validatedFrom) {
		_validatedFrom = validatedFrom;
	}

	@JSON
	@Override
	public Date getValidatedTo() {
		return _validatedTo;
	}

	@Override
	public void setValidatedTo(Date validatedTo) {
		_validatedTo = validatedTo;
	}

	@JSON
	@Override
	public int getIssueStatus() {
		return _issueStatus;
	}

	@Override
	public void setIssueStatus(int issueStatus) {
		_issueStatus = issueStatus;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DictVersion.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DictVersion toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DictVersion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DictVersionImpl dictVersionImpl = new DictVersionImpl();

		dictVersionImpl.setDictVersionId(getDictVersionId());
		dictVersionImpl.setCompanyId(getCompanyId());
		dictVersionImpl.setGroupId(getGroupId());
		dictVersionImpl.setUserId(getUserId());
		dictVersionImpl.setCreateDate(getCreateDate());
		dictVersionImpl.setModifiedDate(getModifiedDate());
		dictVersionImpl.setDictCollectionId(getDictCollectionId());
		dictVersionImpl.setVersion(getVersion());
		dictVersionImpl.setDescription(getDescription());
		dictVersionImpl.setValidatedFrom(getValidatedFrom());
		dictVersionImpl.setValidatedTo(getValidatedTo());
		dictVersionImpl.setIssueStatus(getIssueStatus());

		dictVersionImpl.resetOriginalValues();

		return dictVersionImpl;
	}

	@Override
	public int compareTo(DictVersion dictVersion) {
		long primaryKey = dictVersion.getPrimaryKey();

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

		if (!(obj instanceof DictVersion)) {
			return false;
		}

		DictVersion dictVersion = (DictVersion)obj;

		long primaryKey = dictVersion.getPrimaryKey();

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
		DictVersionModelImpl dictVersionModelImpl = this;

		dictVersionModelImpl._originalDictCollectionId = dictVersionModelImpl._dictCollectionId;

		dictVersionModelImpl._setOriginalDictCollectionId = false;

		dictVersionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DictVersion> toCacheModel() {
		DictVersionCacheModel dictVersionCacheModel = new DictVersionCacheModel();

		dictVersionCacheModel.dictVersionId = getDictVersionId();

		dictVersionCacheModel.companyId = getCompanyId();

		dictVersionCacheModel.groupId = getGroupId();

		dictVersionCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dictVersionCacheModel.createDate = createDate.getTime();
		}
		else {
			dictVersionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dictVersionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dictVersionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dictVersionCacheModel.dictCollectionId = getDictCollectionId();

		dictVersionCacheModel.version = getVersion();

		String version = dictVersionCacheModel.version;

		if ((version != null) && (version.length() == 0)) {
			dictVersionCacheModel.version = null;
		}

		dictVersionCacheModel.description = getDescription();

		String description = dictVersionCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			dictVersionCacheModel.description = null;
		}

		Date validatedFrom = getValidatedFrom();

		if (validatedFrom != null) {
			dictVersionCacheModel.validatedFrom = validatedFrom.getTime();
		}
		else {
			dictVersionCacheModel.validatedFrom = Long.MIN_VALUE;
		}

		Date validatedTo = getValidatedTo();

		if (validatedTo != null) {
			dictVersionCacheModel.validatedTo = validatedTo.getTime();
		}
		else {
			dictVersionCacheModel.validatedTo = Long.MIN_VALUE;
		}

		dictVersionCacheModel.issueStatus = getIssueStatus();

		return dictVersionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{dictVersionId=");
		sb.append(getDictVersionId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dictCollectionId=");
		sb.append(getDictCollectionId());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", validatedFrom=");
		sb.append(getValidatedFrom());
		sb.append(", validatedTo=");
		sb.append(getValidatedTo());
		sb.append(", issueStatus=");
		sb.append(getIssueStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("org.opencps.datamgt.model.DictVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dictVersionId</column-name><column-value><![CDATA[");
		sb.append(getDictVersionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
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
			"<column><column-name>dictCollectionId</column-name><column-value><![CDATA[");
		sb.append(getDictCollectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validatedFrom</column-name><column-value><![CDATA[");
		sb.append(getValidatedFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validatedTo</column-name><column-value><![CDATA[");
		sb.append(getValidatedTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueStatus</column-name><column-value><![CDATA[");
		sb.append(getIssueStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DictVersion.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DictVersion.class
		};
	private long _dictVersionId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dictCollectionId;
	private long _originalDictCollectionId;
	private boolean _setOriginalDictCollectionId;
	private String _version;
	private String _description;
	private Date _validatedFrom;
	private Date _validatedTo;
	private int _issueStatus;
	private long _columnBitmask;
	private DictVersion _escapedModel;
}