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

package org.opencps.processmgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.opencps.processmgt.model.StepAllowance;
import org.opencps.processmgt.model.StepAllowanceModel;
import org.opencps.processmgt.model.StepAllowanceSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the StepAllowance service. Represents a row in the &quot;opencps_stepallowance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.processmgt.model.StepAllowanceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StepAllowanceImpl}.
 * </p>
 *
 * @author khoavd
 * @see StepAllowanceImpl
 * @see org.opencps.processmgt.model.StepAllowance
 * @see org.opencps.processmgt.model.StepAllowanceModel
 * @generated
 */
@JSON(strict = true)
public class StepAllowanceModelImpl extends BaseModelImpl<StepAllowance>
	implements StepAllowanceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a step allowance model instance should use the {@link org.opencps.processmgt.model.StepAllowance} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_stepallowance";
	public static final Object[][] TABLE_COLUMNS = {
			{ "stepAllowanceId", Types.BIGINT },
			{ "processStepId", Types.BIGINT },
			{ "roleId", Types.BIGINT },
			{ "readOnly", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_stepallowance (stepAllowanceId LONG not null primary key,processStepId LONG,roleId LONG,readOnly BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table opencps_stepallowance";
	public static final String ORDER_BY_JPQL = " ORDER BY stepAllowance.stepAllowanceId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_stepallowance.stepAllowanceId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.processmgt.model.StepAllowance"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.processmgt.model.StepAllowance"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.processmgt.model.StepAllowance"),
			true);
	public static long PROCESSSTEPID_COLUMN_BITMASK = 1L;
	public static long READONLY_COLUMN_BITMASK = 2L;
	public static long ROLEID_COLUMN_BITMASK = 4L;
	public static long STEPALLOWANCEID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static StepAllowance toModel(StepAllowanceSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		StepAllowance model = new StepAllowanceImpl();

		model.setStepAllowanceId(soapModel.getStepAllowanceId());
		model.setProcessStepId(soapModel.getProcessStepId());
		model.setRoleId(soapModel.getRoleId());
		model.setReadOnly(soapModel.getReadOnly());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<StepAllowance> toModels(StepAllowanceSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<StepAllowance> models = new ArrayList<StepAllowance>(soapModels.length);

		for (StepAllowanceSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.processmgt.model.StepAllowance"));

	public StepAllowanceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _stepAllowanceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStepAllowanceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _stepAllowanceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return StepAllowance.class;
	}

	@Override
	public String getModelClassName() {
		return StepAllowance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stepAllowanceId", getStepAllowanceId());
		attributes.put("processStepId", getProcessStepId());
		attributes.put("roleId", getRoleId());
		attributes.put("readOnly", getReadOnly());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stepAllowanceId = (Long)attributes.get("stepAllowanceId");

		if (stepAllowanceId != null) {
			setStepAllowanceId(stepAllowanceId);
		}

		Long processStepId = (Long)attributes.get("processStepId");

		if (processStepId != null) {
			setProcessStepId(processStepId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}

		Boolean readOnly = (Boolean)attributes.get("readOnly");

		if (readOnly != null) {
			setReadOnly(readOnly);
		}
	}

	@JSON
	@Override
	public long getStepAllowanceId() {
		return _stepAllowanceId;
	}

	@Override
	public void setStepAllowanceId(long stepAllowanceId) {
		_stepAllowanceId = stepAllowanceId;
	}

	@JSON
	@Override
	public long getProcessStepId() {
		return _processStepId;
	}

	@Override
	public void setProcessStepId(long processStepId) {
		_columnBitmask |= PROCESSSTEPID_COLUMN_BITMASK;

		if (!_setOriginalProcessStepId) {
			_setOriginalProcessStepId = true;

			_originalProcessStepId = _processStepId;
		}

		_processStepId = processStepId;
	}

	public long getOriginalProcessStepId() {
		return _originalProcessStepId;
	}

	@JSON
	@Override
	public long getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(long roleId) {
		_columnBitmask |= ROLEID_COLUMN_BITMASK;

		if (!_setOriginalRoleId) {
			_setOriginalRoleId = true;

			_originalRoleId = _roleId;
		}

		_roleId = roleId;
	}

	public long getOriginalRoleId() {
		return _originalRoleId;
	}

	@JSON
	@Override
	public boolean getReadOnly() {
		return _readOnly;
	}

	@Override
	public boolean isReadOnly() {
		return _readOnly;
	}

	@Override
	public void setReadOnly(boolean readOnly) {
		_columnBitmask |= READONLY_COLUMN_BITMASK;

		if (!_setOriginalReadOnly) {
			_setOriginalReadOnly = true;

			_originalReadOnly = _readOnly;
		}

		_readOnly = readOnly;
	}

	public boolean getOriginalReadOnly() {
		return _originalReadOnly;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			StepAllowance.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public StepAllowance toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (StepAllowance)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		StepAllowanceImpl stepAllowanceImpl = new StepAllowanceImpl();

		stepAllowanceImpl.setStepAllowanceId(getStepAllowanceId());
		stepAllowanceImpl.setProcessStepId(getProcessStepId());
		stepAllowanceImpl.setRoleId(getRoleId());
		stepAllowanceImpl.setReadOnly(getReadOnly());

		stepAllowanceImpl.resetOriginalValues();

		return stepAllowanceImpl;
	}

	@Override
	public int compareTo(StepAllowance stepAllowance) {
		long primaryKey = stepAllowance.getPrimaryKey();

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

		if (!(obj instanceof StepAllowance)) {
			return false;
		}

		StepAllowance stepAllowance = (StepAllowance)obj;

		long primaryKey = stepAllowance.getPrimaryKey();

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
		StepAllowanceModelImpl stepAllowanceModelImpl = this;

		stepAllowanceModelImpl._originalProcessStepId = stepAllowanceModelImpl._processStepId;

		stepAllowanceModelImpl._setOriginalProcessStepId = false;

		stepAllowanceModelImpl._originalRoleId = stepAllowanceModelImpl._roleId;

		stepAllowanceModelImpl._setOriginalRoleId = false;

		stepAllowanceModelImpl._originalReadOnly = stepAllowanceModelImpl._readOnly;

		stepAllowanceModelImpl._setOriginalReadOnly = false;

		stepAllowanceModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<StepAllowance> toCacheModel() {
		StepAllowanceCacheModel stepAllowanceCacheModel = new StepAllowanceCacheModel();

		stepAllowanceCacheModel.stepAllowanceId = getStepAllowanceId();

		stepAllowanceCacheModel.processStepId = getProcessStepId();

		stepAllowanceCacheModel.roleId = getRoleId();

		stepAllowanceCacheModel.readOnly = getReadOnly();

		return stepAllowanceCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{stepAllowanceId=");
		sb.append(getStepAllowanceId());
		sb.append(", processStepId=");
		sb.append(getProcessStepId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append(", readOnly=");
		sb.append(getReadOnly());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.opencps.processmgt.model.StepAllowance");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>stepAllowanceId</column-name><column-value><![CDATA[");
		sb.append(getStepAllowanceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processStepId</column-name><column-value><![CDATA[");
		sb.append(getProcessStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>readOnly</column-name><column-value><![CDATA[");
		sb.append(getReadOnly());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = StepAllowance.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			StepAllowance.class
		};
	private long _stepAllowanceId;
	private long _processStepId;
	private long _originalProcessStepId;
	private boolean _setOriginalProcessStepId;
	private long _roleId;
	private long _originalRoleId;
	private boolean _setOriginalRoleId;
	private boolean _readOnly;
	private boolean _originalReadOnly;
	private boolean _setOriginalReadOnly;
	private long _columnBitmask;
	private StepAllowance _escapedModel;
}