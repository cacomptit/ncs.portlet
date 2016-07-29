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

package org.opencps.dossiermgt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ServiceConfig service. Represents a row in the &quot;opencps_service_config&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.dossiermgt.model.impl.ServiceConfigImpl}.
 * </p>
 *
 * @author trungnt
 * @see ServiceConfig
 * @see org.opencps.dossiermgt.model.impl.ServiceConfigImpl
 * @see org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl
 * @generated
 */
public interface ServiceConfigModel extends BaseModel<ServiceConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service config model instance should use the {@link ServiceConfig} interface instead.
	 */

	/**
	 * Returns the primary key of this service config.
	 *
	 * @return the primary key of this service config
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this service config.
	 *
	 * @param primaryKey the primary key of this service config
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the service config ID of this service config.
	 *
	 * @return the service config ID of this service config
	 */
	public long getServiceConfigId();

	/**
	 * Sets the service config ID of this service config.
	 *
	 * @param serviceConfigId the service config ID of this service config
	 */
	public void setServiceConfigId(long serviceConfigId);

	/**
	 * Returns the company ID of this service config.
	 *
	 * @return the company ID of this service config
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this service config.
	 *
	 * @param companyId the company ID of this service config
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this service config.
	 *
	 * @return the group ID of this service config
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this service config.
	 *
	 * @param groupId the group ID of this service config
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this service config.
	 *
	 * @return the user ID of this service config
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this service config.
	 *
	 * @param userId the user ID of this service config
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this service config.
	 *
	 * @return the user uuid of this service config
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this service config.
	 *
	 * @param userUuid the user uuid of this service config
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this service config.
	 *
	 * @return the create date of this service config
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this service config.
	 *
	 * @param createDate the create date of this service config
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this service config.
	 *
	 * @return the modified date of this service config
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this service config.
	 *
	 * @param modifiedDate the modified date of this service config
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the service info ID of this service config.
	 *
	 * @return the service info ID of this service config
	 */
	public long getServiceInfoId();

	/**
	 * Sets the service info ID of this service config.
	 *
	 * @param serviceInfoId the service info ID of this service config
	 */
	public void setServiceInfoId(long serviceInfoId);

	/**
	 * Returns the service domain index of this service config.
	 *
	 * @return the service domain index of this service config
	 */
	@AutoEscape
	public String getServiceDomainIndex();

	/**
	 * Sets the service domain index of this service config.
	 *
	 * @param serviceDomainIndex the service domain index of this service config
	 */
	public void setServiceDomainIndex(String serviceDomainIndex);

	/**
	 * Returns the service administration index of this service config.
	 *
	 * @return the service administration index of this service config
	 */
	@AutoEscape
	public String getServiceAdministrationIndex();

	/**
	 * Sets the service administration index of this service config.
	 *
	 * @param serviceAdministrationIndex the service administration index of this service config
	 */
	public void setServiceAdministrationIndex(String serviceAdministrationIndex);

	/**
	 * Returns the dossier template ID of this service config.
	 *
	 * @return the dossier template ID of this service config
	 */
	public long getDossierTemplateId();

	/**
	 * Sets the dossier template ID of this service config.
	 *
	 * @param dossierTemplateId the dossier template ID of this service config
	 */
	public void setDossierTemplateId(long dossierTemplateId);

	/**
	 * Returns the gov agency code of this service config.
	 *
	 * @return the gov agency code of this service config
	 */
	@AutoEscape
	public String getGovAgencyCode();

	/**
	 * Sets the gov agency code of this service config.
	 *
	 * @param govAgencyCode the gov agency code of this service config
	 */
	public void setGovAgencyCode(String govAgencyCode);

	/**
	 * Returns the gov agency name of this service config.
	 *
	 * @return the gov agency name of this service config
	 */
	@AutoEscape
	public String getGovAgencyName();

	/**
	 * Sets the gov agency name of this service config.
	 *
	 * @param govAgencyName the gov agency name of this service config
	 */
	public void setGovAgencyName(String govAgencyName);

	/**
	 * Returns the service instruction of this service config.
	 *
	 * @return the service instruction of this service config
	 */
	@AutoEscape
	public String getServiceInstruction();

	/**
	 * Sets the service instruction of this service config.
	 *
	 * @param serviceInstruction the service instruction of this service config
	 */
	public void setServiceInstruction(String serviceInstruction);

	/**
	 * Returns the service level of this service config.
	 *
	 * @return the service level of this service config
	 */
	public int getServiceLevel();

	/**
	 * Sets the service level of this service config.
	 *
	 * @param serviceLevel the service level of this service config
	 */
	public void setServiceLevel(int serviceLevel);

	/**
	 * Returns the service portal of this service config.
	 *
	 * @return the service portal of this service config
	 */
	public boolean getServicePortal();

	/**
	 * Returns <code>true</code> if this service config is service portal.
	 *
	 * @return <code>true</code> if this service config is service portal; <code>false</code> otherwise
	 */
	public boolean isServicePortal();

	/**
	 * Sets whether this service config is service portal.
	 *
	 * @param servicePortal the service portal of this service config
	 */
	public void setServicePortal(boolean servicePortal);

	/**
	 * Returns the service onegate of this service config.
	 *
	 * @return the service onegate of this service config
	 */
	public boolean getServiceOnegate();

	/**
	 * Returns <code>true</code> if this service config is service onegate.
	 *
	 * @return <code>true</code> if this service config is service onegate; <code>false</code> otherwise
	 */
	public boolean isServiceOnegate();

	/**
	 * Sets whether this service config is service onegate.
	 *
	 * @param serviceOnegate the service onegate of this service config
	 */
	public void setServiceOnegate(boolean serviceOnegate);

	/**
	 * Returns the service backoffice of this service config.
	 *
	 * @return the service backoffice of this service config
	 */
	public boolean getServiceBackoffice();

	/**
	 * Returns <code>true</code> if this service config is service backoffice.
	 *
	 * @return <code>true</code> if this service config is service backoffice; <code>false</code> otherwise
	 */
	public boolean isServiceBackoffice();

	/**
	 * Sets whether this service config is service backoffice.
	 *
	 * @param serviceBackoffice the service backoffice of this service config
	 */
	public void setServiceBackoffice(boolean serviceBackoffice);

	/**
	 * Returns the gov agency organization ID of this service config.
	 *
	 * @return the gov agency organization ID of this service config
	 */
	public long getGovAgencyOrganizationId();

	/**
	 * Sets the gov agency organization ID of this service config.
	 *
	 * @param govAgencyOrganizationId the gov agency organization ID of this service config
	 */
	public void setGovAgencyOrganizationId(long govAgencyOrganizationId);

	/**
	 * Returns the service citizen of this service config.
	 *
	 * @return the service citizen of this service config
	 */
	public boolean getServiceCitizen();

	/**
	 * Returns <code>true</code> if this service config is service citizen.
	 *
	 * @return <code>true</code> if this service config is service citizen; <code>false</code> otherwise
	 */
	public boolean isServiceCitizen();

	/**
	 * Sets whether this service config is service citizen.
	 *
	 * @param serviceCitizen the service citizen of this service config
	 */
	public void setServiceCitizen(boolean serviceCitizen);

	/**
	 * Returns the service businees of this service config.
	 *
	 * @return the service businees of this service config
	 */
	public boolean getServiceBusinees();

	/**
	 * Returns <code>true</code> if this service config is service businees.
	 *
	 * @return <code>true</code> if this service config is service businees; <code>false</code> otherwise
	 */
	public boolean isServiceBusinees();

	/**
	 * Sets whether this service config is service businees.
	 *
	 * @param serviceBusinees the service businees of this service config
	 */
	public void setServiceBusinees(boolean serviceBusinees);

	/**
	 * Returns the service process ID of this service config.
	 *
	 * @return the service process ID of this service config
	 */
	public long getServiceProcessId();

	/**
	 * Sets the service process ID of this service config.
	 *
	 * @param serviceProcessId the service process ID of this service config
	 */
	public void setServiceProcessId(long serviceProcessId);

	/**
	 * Returns the domain code of this service config.
	 *
	 * @return the domain code of this service config
	 */
	@AutoEscape
	public String getDomainCode();

	/**
	 * Sets the domain code of this service config.
	 *
	 * @param domainCode the domain code of this service config
	 */
	public void setDomainCode(String domainCode);

	/**
	 * Returns the service mode of this service config.
	 *
	 * @return the service mode of this service config
	 */
	public int getServiceMode();

	/**
	 * Sets the service mode of this service config.
	 *
	 * @param serviceMode the service mode of this service config
	 */
	public void setServiceMode(int serviceMode);

	/**
	 * Returns the gov agency index of this service config.
	 *
	 * @return the gov agency index of this service config
	 */
	@AutoEscape
	public String getGovAgencyIndex();

	/**
	 * Sets the gov agency index of this service config.
	 *
	 * @param govAgencyIndex the gov agency index of this service config
	 */
	public void setGovAgencyIndex(String govAgencyIndex);

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
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.dossiermgt.model.ServiceConfig> toCacheModel();

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig toEscapedModel();

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}