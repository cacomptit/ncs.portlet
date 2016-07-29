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

package org.opencps.processmgt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ServiceProcess service. Represents a row in the &quot;opencps_serviceprocess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.processmgt.model.impl.ServiceProcessModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.processmgt.model.impl.ServiceProcessImpl}.
 * </p>
 *
 * @author khoavd
 * @see ServiceProcess
 * @see org.opencps.processmgt.model.impl.ServiceProcessImpl
 * @see org.opencps.processmgt.model.impl.ServiceProcessModelImpl
 * @generated
 */
public interface ServiceProcessModel extends BaseModel<ServiceProcess> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service process model instance should use the {@link ServiceProcess} interface instead.
	 */

	/**
	 * Returns the primary key of this service process.
	 *
	 * @return the primary key of this service process
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this service process.
	 *
	 * @param primaryKey the primary key of this service process
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the service process ID of this service process.
	 *
	 * @return the service process ID of this service process
	 */
	public long getServiceProcessId();

	/**
	 * Sets the service process ID of this service process.
	 *
	 * @param serviceProcessId the service process ID of this service process
	 */
	public void setServiceProcessId(long serviceProcessId);

	/**
	 * Returns the company ID of this service process.
	 *
	 * @return the company ID of this service process
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this service process.
	 *
	 * @param companyId the company ID of this service process
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this service process.
	 *
	 * @return the group ID of this service process
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this service process.
	 *
	 * @param groupId the group ID of this service process
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this service process.
	 *
	 * @return the user ID of this service process
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this service process.
	 *
	 * @param userId the user ID of this service process
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this service process.
	 *
	 * @return the user uuid of this service process
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this service process.
	 *
	 * @param userUuid the user uuid of this service process
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this service process.
	 *
	 * @return the create date of this service process
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this service process.
	 *
	 * @param createDate the create date of this service process
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this service process.
	 *
	 * @return the modified date of this service process
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this service process.
	 *
	 * @param modifiedDate the modified date of this service process
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the process no of this service process.
	 *
	 * @return the process no of this service process
	 */
	@AutoEscape
	public String getProcessNo();

	/**
	 * Sets the process no of this service process.
	 *
	 * @param processNo the process no of this service process
	 */
	public void setProcessNo(String processNo);

	/**
	 * Returns the process name of this service process.
	 *
	 * @return the process name of this service process
	 */
	@AutoEscape
	public String getProcessName();

	/**
	 * Sets the process name of this service process.
	 *
	 * @param processName the process name of this service process
	 */
	public void setProcessName(String processName);

	/**
	 * Returns the description of this service process.
	 *
	 * @return the description of this service process
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this service process.
	 *
	 * @param description the description of this service process
	 */
	public void setDescription(String description);

	/**
	 * Returns the dossier template ID of this service process.
	 *
	 * @return the dossier template ID of this service process
	 */
	public long getDossierTemplateId();

	/**
	 * Sets the dossier template ID of this service process.
	 *
	 * @param dossierTemplateId the dossier template ID of this service process
	 */
	public void setDossierTemplateId(long dossierTemplateId);

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
	public int compareTo(
		org.opencps.processmgt.model.ServiceProcess serviceProcess);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.processmgt.model.ServiceProcess> toCacheModel();

	@Override
	public org.opencps.processmgt.model.ServiceProcess toEscapedModel();

	@Override
	public org.opencps.processmgt.model.ServiceProcess toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}