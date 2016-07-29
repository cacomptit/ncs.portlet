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

import org.opencps.processmgt.model.ProcessWorkflow;
import org.opencps.processmgt.model.ProcessWorkflowModel;
import org.opencps.processmgt.model.ProcessWorkflowSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ProcessWorkflow service. Represents a row in the &quot;opencps_processworkflow&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.processmgt.model.ProcessWorkflowModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProcessWorkflowImpl}.
 * </p>
 *
 * @author khoavd
 * @see ProcessWorkflowImpl
 * @see org.opencps.processmgt.model.ProcessWorkflow
 * @see org.opencps.processmgt.model.ProcessWorkflowModel
 * @generated
 */
@JSON(strict = true)
public class ProcessWorkflowModelImpl extends BaseModelImpl<ProcessWorkflow>
	implements ProcessWorkflowModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a process workflow model instance should use the {@link org.opencps.processmgt.model.ProcessWorkflow} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_processworkflow";
	public static final Object[][] TABLE_COLUMNS = {
			{ "processWorkflowId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "serviceProcessId", Types.BIGINT },
			{ "preProcessStepId", Types.BIGINT },
			{ "postProcessStepId", Types.BIGINT },
			{ "autoEvent", Types.VARCHAR },
			{ "actionName", Types.VARCHAR },
			{ "assignUser", Types.BOOLEAN },
			{ "actionUserId", Types.BIGINT },
			{ "requestPayment", Types.BOOLEAN },
			{ "paymentFee", Types.VARCHAR },
			{ "generateReceptionNo", Types.BOOLEAN },
			{ "receptionNoPattern", Types.VARCHAR },
			{ "generateDeadline", Types.BOOLEAN },
			{ "deadlinePattern", Types.VARCHAR },
			{ "isFinishStep", Types.BOOLEAN },
			{ "preCondition", Types.VARCHAR },
			{ "isMultipled", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_processworkflow (processWorkflowId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,serviceProcessId LONG,preProcessStepId LONG,postProcessStepId LONG,autoEvent VARCHAR(75) null,actionName VARCHAR(75) null,assignUser BOOLEAN,actionUserId LONG,requestPayment BOOLEAN,paymentFee VARCHAR(1000) null,generateReceptionNo BOOLEAN,receptionNoPattern VARCHAR(75) null,generateDeadline BOOLEAN,deadlinePattern VARCHAR(75) null,isFinishStep BOOLEAN,preCondition VARCHAR(75) null,isMultipled BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table opencps_processworkflow";
	public static final String ORDER_BY_JPQL = " ORDER BY processWorkflow.processWorkflowId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_processworkflow.processWorkflowId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.processmgt.model.ProcessWorkflow"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.processmgt.model.ProcessWorkflow"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.processmgt.model.ProcessWorkflow"),
			true);
	public static long AUTOEVENT_COLUMN_BITMASK = 1L;
	public static long POSTPROCESSSTEPID_COLUMN_BITMASK = 2L;
	public static long PREPROCESSSTEPID_COLUMN_BITMASK = 4L;
	public static long SERVICEPROCESSID_COLUMN_BITMASK = 8L;
	public static long PROCESSWORKFLOWID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ProcessWorkflow toModel(ProcessWorkflowSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ProcessWorkflow model = new ProcessWorkflowImpl();

		model.setProcessWorkflowId(soapModel.getProcessWorkflowId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setServiceProcessId(soapModel.getServiceProcessId());
		model.setPreProcessStepId(soapModel.getPreProcessStepId());
		model.setPostProcessStepId(soapModel.getPostProcessStepId());
		model.setAutoEvent(soapModel.getAutoEvent());
		model.setActionName(soapModel.getActionName());
		model.setAssignUser(soapModel.getAssignUser());
		model.setActionUserId(soapModel.getActionUserId());
		model.setRequestPayment(soapModel.getRequestPayment());
		model.setPaymentFee(soapModel.getPaymentFee());
		model.setGenerateReceptionNo(soapModel.getGenerateReceptionNo());
		model.setReceptionNoPattern(soapModel.getReceptionNoPattern());
		model.setGenerateDeadline(soapModel.getGenerateDeadline());
		model.setDeadlinePattern(soapModel.getDeadlinePattern());
		model.setIsFinishStep(soapModel.getIsFinishStep());
		model.setPreCondition(soapModel.getPreCondition());
		model.setIsMultipled(soapModel.getIsMultipled());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ProcessWorkflow> toModels(
		ProcessWorkflowSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ProcessWorkflow> models = new ArrayList<ProcessWorkflow>(soapModels.length);

		for (ProcessWorkflowSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.processmgt.model.ProcessWorkflow"));

	public ProcessWorkflowModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _processWorkflowId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProcessWorkflowId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _processWorkflowId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ProcessWorkflow.class;
	}

	@Override
	public String getModelClassName() {
		return ProcessWorkflow.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("processWorkflowId", getProcessWorkflowId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("serviceProcessId", getServiceProcessId());
		attributes.put("preProcessStepId", getPreProcessStepId());
		attributes.put("postProcessStepId", getPostProcessStepId());
		attributes.put("autoEvent", getAutoEvent());
		attributes.put("actionName", getActionName());
		attributes.put("assignUser", getAssignUser());
		attributes.put("actionUserId", getActionUserId());
		attributes.put("requestPayment", getRequestPayment());
		attributes.put("paymentFee", getPaymentFee());
		attributes.put("generateReceptionNo", getGenerateReceptionNo());
		attributes.put("receptionNoPattern", getReceptionNoPattern());
		attributes.put("generateDeadline", getGenerateDeadline());
		attributes.put("deadlinePattern", getDeadlinePattern());
		attributes.put("isFinishStep", getIsFinishStep());
		attributes.put("preCondition", getPreCondition());
		attributes.put("isMultipled", getIsMultipled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long processWorkflowId = (Long)attributes.get("processWorkflowId");

		if (processWorkflowId != null) {
			setProcessWorkflowId(processWorkflowId);
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

		Long serviceProcessId = (Long)attributes.get("serviceProcessId");

		if (serviceProcessId != null) {
			setServiceProcessId(serviceProcessId);
		}

		Long preProcessStepId = (Long)attributes.get("preProcessStepId");

		if (preProcessStepId != null) {
			setPreProcessStepId(preProcessStepId);
		}

		Long postProcessStepId = (Long)attributes.get("postProcessStepId");

		if (postProcessStepId != null) {
			setPostProcessStepId(postProcessStepId);
		}

		String autoEvent = (String)attributes.get("autoEvent");

		if (autoEvent != null) {
			setAutoEvent(autoEvent);
		}

		String actionName = (String)attributes.get("actionName");

		if (actionName != null) {
			setActionName(actionName);
		}

		Boolean assignUser = (Boolean)attributes.get("assignUser");

		if (assignUser != null) {
			setAssignUser(assignUser);
		}

		Long actionUserId = (Long)attributes.get("actionUserId");

		if (actionUserId != null) {
			setActionUserId(actionUserId);
		}

		Boolean requestPayment = (Boolean)attributes.get("requestPayment");

		if (requestPayment != null) {
			setRequestPayment(requestPayment);
		}

		String paymentFee = (String)attributes.get("paymentFee");

		if (paymentFee != null) {
			setPaymentFee(paymentFee);
		}

		Boolean generateReceptionNo = (Boolean)attributes.get(
				"generateReceptionNo");

		if (generateReceptionNo != null) {
			setGenerateReceptionNo(generateReceptionNo);
		}

		String receptionNoPattern = (String)attributes.get("receptionNoPattern");

		if (receptionNoPattern != null) {
			setReceptionNoPattern(receptionNoPattern);
		}

		Boolean generateDeadline = (Boolean)attributes.get("generateDeadline");

		if (generateDeadline != null) {
			setGenerateDeadline(generateDeadline);
		}

		String deadlinePattern = (String)attributes.get("deadlinePattern");

		if (deadlinePattern != null) {
			setDeadlinePattern(deadlinePattern);
		}

		Boolean isFinishStep = (Boolean)attributes.get("isFinishStep");

		if (isFinishStep != null) {
			setIsFinishStep(isFinishStep);
		}

		String preCondition = (String)attributes.get("preCondition");

		if (preCondition != null) {
			setPreCondition(preCondition);
		}

		Boolean isMultipled = (Boolean)attributes.get("isMultipled");

		if (isMultipled != null) {
			setIsMultipled(isMultipled);
		}
	}

	@JSON
	@Override
	public long getProcessWorkflowId() {
		return _processWorkflowId;
	}

	@Override
	public void setProcessWorkflowId(long processWorkflowId) {
		_processWorkflowId = processWorkflowId;
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
	public long getServiceProcessId() {
		return _serviceProcessId;
	}

	@Override
	public void setServiceProcessId(long serviceProcessId) {
		_columnBitmask |= SERVICEPROCESSID_COLUMN_BITMASK;

		if (!_setOriginalServiceProcessId) {
			_setOriginalServiceProcessId = true;

			_originalServiceProcessId = _serviceProcessId;
		}

		_serviceProcessId = serviceProcessId;
	}

	public long getOriginalServiceProcessId() {
		return _originalServiceProcessId;
	}

	@JSON
	@Override
	public long getPreProcessStepId() {
		return _preProcessStepId;
	}

	@Override
	public void setPreProcessStepId(long preProcessStepId) {
		_columnBitmask |= PREPROCESSSTEPID_COLUMN_BITMASK;

		if (!_setOriginalPreProcessStepId) {
			_setOriginalPreProcessStepId = true;

			_originalPreProcessStepId = _preProcessStepId;
		}

		_preProcessStepId = preProcessStepId;
	}

	public long getOriginalPreProcessStepId() {
		return _originalPreProcessStepId;
	}

	@JSON
	@Override
	public long getPostProcessStepId() {
		return _postProcessStepId;
	}

	@Override
	public void setPostProcessStepId(long postProcessStepId) {
		_columnBitmask |= POSTPROCESSSTEPID_COLUMN_BITMASK;

		if (!_setOriginalPostProcessStepId) {
			_setOriginalPostProcessStepId = true;

			_originalPostProcessStepId = _postProcessStepId;
		}

		_postProcessStepId = postProcessStepId;
	}

	public long getOriginalPostProcessStepId() {
		return _originalPostProcessStepId;
	}

	@JSON
	@Override
	public String getAutoEvent() {
		if (_autoEvent == null) {
			return StringPool.BLANK;
		}
		else {
			return _autoEvent;
		}
	}

	@Override
	public void setAutoEvent(String autoEvent) {
		_columnBitmask |= AUTOEVENT_COLUMN_BITMASK;

		if (_originalAutoEvent == null) {
			_originalAutoEvent = _autoEvent;
		}

		_autoEvent = autoEvent;
	}

	public String getOriginalAutoEvent() {
		return GetterUtil.getString(_originalAutoEvent);
	}

	@JSON
	@Override
	public String getActionName() {
		if (_actionName == null) {
			return StringPool.BLANK;
		}
		else {
			return _actionName;
		}
	}

	@Override
	public void setActionName(String actionName) {
		_actionName = actionName;
	}

	@JSON
	@Override
	public boolean getAssignUser() {
		return _assignUser;
	}

	@Override
	public boolean isAssignUser() {
		return _assignUser;
	}

	@Override
	public void setAssignUser(boolean assignUser) {
		_assignUser = assignUser;
	}

	@JSON
	@Override
	public long getActionUserId() {
		return _actionUserId;
	}

	@Override
	public void setActionUserId(long actionUserId) {
		_actionUserId = actionUserId;
	}

	@Override
	public String getActionUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getActionUserId(), "uuid",
			_actionUserUuid);
	}

	@Override
	public void setActionUserUuid(String actionUserUuid) {
		_actionUserUuid = actionUserUuid;
	}

	@JSON
	@Override
	public boolean getRequestPayment() {
		return _requestPayment;
	}

	@Override
	public boolean isRequestPayment() {
		return _requestPayment;
	}

	@Override
	public void setRequestPayment(boolean requestPayment) {
		_requestPayment = requestPayment;
	}

	@JSON
	@Override
	public String getPaymentFee() {
		if (_paymentFee == null) {
			return StringPool.BLANK;
		}
		else {
			return _paymentFee;
		}
	}

	@Override
	public void setPaymentFee(String paymentFee) {
		_paymentFee = paymentFee;
	}

	@JSON
	@Override
	public boolean getGenerateReceptionNo() {
		return _generateReceptionNo;
	}

	@Override
	public boolean isGenerateReceptionNo() {
		return _generateReceptionNo;
	}

	@Override
	public void setGenerateReceptionNo(boolean generateReceptionNo) {
		_generateReceptionNo = generateReceptionNo;
	}

	@JSON
	@Override
	public String getReceptionNoPattern() {
		if (_receptionNoPattern == null) {
			return StringPool.BLANK;
		}
		else {
			return _receptionNoPattern;
		}
	}

	@Override
	public void setReceptionNoPattern(String receptionNoPattern) {
		_receptionNoPattern = receptionNoPattern;
	}

	@JSON
	@Override
	public boolean getGenerateDeadline() {
		return _generateDeadline;
	}

	@Override
	public boolean isGenerateDeadline() {
		return _generateDeadline;
	}

	@Override
	public void setGenerateDeadline(boolean generateDeadline) {
		_generateDeadline = generateDeadline;
	}

	@JSON
	@Override
	public String getDeadlinePattern() {
		if (_deadlinePattern == null) {
			return StringPool.BLANK;
		}
		else {
			return _deadlinePattern;
		}
	}

	@Override
	public void setDeadlinePattern(String deadlinePattern) {
		_deadlinePattern = deadlinePattern;
	}

	@JSON
	@Override
	public boolean getIsFinishStep() {
		return _isFinishStep;
	}

	@Override
	public boolean isIsFinishStep() {
		return _isFinishStep;
	}

	@Override
	public void setIsFinishStep(boolean isFinishStep) {
		_isFinishStep = isFinishStep;
	}

	@JSON
	@Override
	public String getPreCondition() {
		if (_preCondition == null) {
			return StringPool.BLANK;
		}
		else {
			return _preCondition;
		}
	}

	@Override
	public void setPreCondition(String preCondition) {
		_preCondition = preCondition;
	}

	@JSON
	@Override
	public boolean getIsMultipled() {
		return _isMultipled;
	}

	@Override
	public boolean isIsMultipled() {
		return _isMultipled;
	}

	@Override
	public void setIsMultipled(boolean isMultipled) {
		_isMultipled = isMultipled;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ProcessWorkflow.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ProcessWorkflow toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ProcessWorkflow)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProcessWorkflowImpl processWorkflowImpl = new ProcessWorkflowImpl();

		processWorkflowImpl.setProcessWorkflowId(getProcessWorkflowId());
		processWorkflowImpl.setCompanyId(getCompanyId());
		processWorkflowImpl.setGroupId(getGroupId());
		processWorkflowImpl.setUserId(getUserId());
		processWorkflowImpl.setCreateDate(getCreateDate());
		processWorkflowImpl.setModifiedDate(getModifiedDate());
		processWorkflowImpl.setServiceProcessId(getServiceProcessId());
		processWorkflowImpl.setPreProcessStepId(getPreProcessStepId());
		processWorkflowImpl.setPostProcessStepId(getPostProcessStepId());
		processWorkflowImpl.setAutoEvent(getAutoEvent());
		processWorkflowImpl.setActionName(getActionName());
		processWorkflowImpl.setAssignUser(getAssignUser());
		processWorkflowImpl.setActionUserId(getActionUserId());
		processWorkflowImpl.setRequestPayment(getRequestPayment());
		processWorkflowImpl.setPaymentFee(getPaymentFee());
		processWorkflowImpl.setGenerateReceptionNo(getGenerateReceptionNo());
		processWorkflowImpl.setReceptionNoPattern(getReceptionNoPattern());
		processWorkflowImpl.setGenerateDeadline(getGenerateDeadline());
		processWorkflowImpl.setDeadlinePattern(getDeadlinePattern());
		processWorkflowImpl.setIsFinishStep(getIsFinishStep());
		processWorkflowImpl.setPreCondition(getPreCondition());
		processWorkflowImpl.setIsMultipled(getIsMultipled());

		processWorkflowImpl.resetOriginalValues();

		return processWorkflowImpl;
	}

	@Override
	public int compareTo(ProcessWorkflow processWorkflow) {
		long primaryKey = processWorkflow.getPrimaryKey();

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

		if (!(obj instanceof ProcessWorkflow)) {
			return false;
		}

		ProcessWorkflow processWorkflow = (ProcessWorkflow)obj;

		long primaryKey = processWorkflow.getPrimaryKey();

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
		ProcessWorkflowModelImpl processWorkflowModelImpl = this;

		processWorkflowModelImpl._originalServiceProcessId = processWorkflowModelImpl._serviceProcessId;

		processWorkflowModelImpl._setOriginalServiceProcessId = false;

		processWorkflowModelImpl._originalPreProcessStepId = processWorkflowModelImpl._preProcessStepId;

		processWorkflowModelImpl._setOriginalPreProcessStepId = false;

		processWorkflowModelImpl._originalPostProcessStepId = processWorkflowModelImpl._postProcessStepId;

		processWorkflowModelImpl._setOriginalPostProcessStepId = false;

		processWorkflowModelImpl._originalAutoEvent = processWorkflowModelImpl._autoEvent;

		processWorkflowModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ProcessWorkflow> toCacheModel() {
		ProcessWorkflowCacheModel processWorkflowCacheModel = new ProcessWorkflowCacheModel();

		processWorkflowCacheModel.processWorkflowId = getProcessWorkflowId();

		processWorkflowCacheModel.companyId = getCompanyId();

		processWorkflowCacheModel.groupId = getGroupId();

		processWorkflowCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			processWorkflowCacheModel.createDate = createDate.getTime();
		}
		else {
			processWorkflowCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			processWorkflowCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			processWorkflowCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		processWorkflowCacheModel.serviceProcessId = getServiceProcessId();

		processWorkflowCacheModel.preProcessStepId = getPreProcessStepId();

		processWorkflowCacheModel.postProcessStepId = getPostProcessStepId();

		processWorkflowCacheModel.autoEvent = getAutoEvent();

		String autoEvent = processWorkflowCacheModel.autoEvent;

		if ((autoEvent != null) && (autoEvent.length() == 0)) {
			processWorkflowCacheModel.autoEvent = null;
		}

		processWorkflowCacheModel.actionName = getActionName();

		String actionName = processWorkflowCacheModel.actionName;

		if ((actionName != null) && (actionName.length() == 0)) {
			processWorkflowCacheModel.actionName = null;
		}

		processWorkflowCacheModel.assignUser = getAssignUser();

		processWorkflowCacheModel.actionUserId = getActionUserId();

		processWorkflowCacheModel.requestPayment = getRequestPayment();

		processWorkflowCacheModel.paymentFee = getPaymentFee();

		String paymentFee = processWorkflowCacheModel.paymentFee;

		if ((paymentFee != null) && (paymentFee.length() == 0)) {
			processWorkflowCacheModel.paymentFee = null;
		}

		processWorkflowCacheModel.generateReceptionNo = getGenerateReceptionNo();

		processWorkflowCacheModel.receptionNoPattern = getReceptionNoPattern();

		String receptionNoPattern = processWorkflowCacheModel.receptionNoPattern;

		if ((receptionNoPattern != null) && (receptionNoPattern.length() == 0)) {
			processWorkflowCacheModel.receptionNoPattern = null;
		}

		processWorkflowCacheModel.generateDeadline = getGenerateDeadline();

		processWorkflowCacheModel.deadlinePattern = getDeadlinePattern();

		String deadlinePattern = processWorkflowCacheModel.deadlinePattern;

		if ((deadlinePattern != null) && (deadlinePattern.length() == 0)) {
			processWorkflowCacheModel.deadlinePattern = null;
		}

		processWorkflowCacheModel.isFinishStep = getIsFinishStep();

		processWorkflowCacheModel.preCondition = getPreCondition();

		String preCondition = processWorkflowCacheModel.preCondition;

		if ((preCondition != null) && (preCondition.length() == 0)) {
			processWorkflowCacheModel.preCondition = null;
		}

		processWorkflowCacheModel.isMultipled = getIsMultipled();

		return processWorkflowCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{processWorkflowId=");
		sb.append(getProcessWorkflowId());
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
		sb.append(", serviceProcessId=");
		sb.append(getServiceProcessId());
		sb.append(", preProcessStepId=");
		sb.append(getPreProcessStepId());
		sb.append(", postProcessStepId=");
		sb.append(getPostProcessStepId());
		sb.append(", autoEvent=");
		sb.append(getAutoEvent());
		sb.append(", actionName=");
		sb.append(getActionName());
		sb.append(", assignUser=");
		sb.append(getAssignUser());
		sb.append(", actionUserId=");
		sb.append(getActionUserId());
		sb.append(", requestPayment=");
		sb.append(getRequestPayment());
		sb.append(", paymentFee=");
		sb.append(getPaymentFee());
		sb.append(", generateReceptionNo=");
		sb.append(getGenerateReceptionNo());
		sb.append(", receptionNoPattern=");
		sb.append(getReceptionNoPattern());
		sb.append(", generateDeadline=");
		sb.append(getGenerateDeadline());
		sb.append(", deadlinePattern=");
		sb.append(getDeadlinePattern());
		sb.append(", isFinishStep=");
		sb.append(getIsFinishStep());
		sb.append(", preCondition=");
		sb.append(getPreCondition());
		sb.append(", isMultipled=");
		sb.append(getIsMultipled());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("org.opencps.processmgt.model.ProcessWorkflow");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>processWorkflowId</column-name><column-value><![CDATA[");
		sb.append(getProcessWorkflowId());
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
			"<column><column-name>serviceProcessId</column-name><column-value><![CDATA[");
		sb.append(getServiceProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preProcessStepId</column-name><column-value><![CDATA[");
		sb.append(getPreProcessStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postProcessStepId</column-name><column-value><![CDATA[");
		sb.append(getPostProcessStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>autoEvent</column-name><column-value><![CDATA[");
		sb.append(getAutoEvent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionName</column-name><column-value><![CDATA[");
		sb.append(getActionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assignUser</column-name><column-value><![CDATA[");
		sb.append(getAssignUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionUserId</column-name><column-value><![CDATA[");
		sb.append(getActionUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestPayment</column-name><column-value><![CDATA[");
		sb.append(getRequestPayment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentFee</column-name><column-value><![CDATA[");
		sb.append(getPaymentFee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>generateReceptionNo</column-name><column-value><![CDATA[");
		sb.append(getGenerateReceptionNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receptionNoPattern</column-name><column-value><![CDATA[");
		sb.append(getReceptionNoPattern());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>generateDeadline</column-name><column-value><![CDATA[");
		sb.append(getGenerateDeadline());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deadlinePattern</column-name><column-value><![CDATA[");
		sb.append(getDeadlinePattern());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isFinishStep</column-name><column-value><![CDATA[");
		sb.append(getIsFinishStep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preCondition</column-name><column-value><![CDATA[");
		sb.append(getPreCondition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isMultipled</column-name><column-value><![CDATA[");
		sb.append(getIsMultipled());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ProcessWorkflow.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ProcessWorkflow.class
		};
	private long _processWorkflowId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _serviceProcessId;
	private long _originalServiceProcessId;
	private boolean _setOriginalServiceProcessId;
	private long _preProcessStepId;
	private long _originalPreProcessStepId;
	private boolean _setOriginalPreProcessStepId;
	private long _postProcessStepId;
	private long _originalPostProcessStepId;
	private boolean _setOriginalPostProcessStepId;
	private String _autoEvent;
	private String _originalAutoEvent;
	private String _actionName;
	private boolean _assignUser;
	private long _actionUserId;
	private String _actionUserUuid;
	private boolean _requestPayment;
	private String _paymentFee;
	private boolean _generateReceptionNo;
	private String _receptionNoPattern;
	private boolean _generateDeadline;
	private String _deadlinePattern;
	private boolean _isFinishStep;
	private String _preCondition;
	private boolean _isMultipled;
	private long _columnBitmask;
	private ProcessWorkflow _escapedModel;
}