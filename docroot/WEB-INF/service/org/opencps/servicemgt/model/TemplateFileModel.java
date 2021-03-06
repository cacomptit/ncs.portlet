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

package org.opencps.servicemgt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TemplateFile service. Represents a row in the &quot;opencps_templatefile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.servicemgt.model.impl.TemplateFileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.servicemgt.model.impl.TemplateFileImpl}.
 * </p>
 *
 * @author khoavd
 * @see TemplateFile
 * @see org.opencps.servicemgt.model.impl.TemplateFileImpl
 * @see org.opencps.servicemgt.model.impl.TemplateFileModelImpl
 * @generated
 */
public interface TemplateFileModel extends BaseModel<TemplateFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a template file model instance should use the {@link TemplateFile} interface instead.
	 */

	/**
	 * Returns the primary key of this template file.
	 *
	 * @return the primary key of this template file
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this template file.
	 *
	 * @param primaryKey the primary key of this template file
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the templatefile ID of this template file.
	 *
	 * @return the templatefile ID of this template file
	 */
	public long getTemplatefileId();

	/**
	 * Sets the templatefile ID of this template file.
	 *
	 * @param templatefileId the templatefile ID of this template file
	 */
	public void setTemplatefileId(long templatefileId);

	/**
	 * Returns the company ID of this template file.
	 *
	 * @return the company ID of this template file
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this template file.
	 *
	 * @param companyId the company ID of this template file
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this template file.
	 *
	 * @return the group ID of this template file
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this template file.
	 *
	 * @param groupId the group ID of this template file
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this template file.
	 *
	 * @return the user ID of this template file
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this template file.
	 *
	 * @param userId the user ID of this template file
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this template file.
	 *
	 * @return the user uuid of this template file
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this template file.
	 *
	 * @param userUuid the user uuid of this template file
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this template file.
	 *
	 * @return the create date of this template file
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this template file.
	 *
	 * @param createDate the create date of this template file
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this template file.
	 *
	 * @return the modified date of this template file
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this template file.
	 *
	 * @param modifiedDate the modified date of this template file
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the file name of this template file.
	 *
	 * @return the file name of this template file
	 */
	@AutoEscape
	public String getFileName();

	/**
	 * Sets the file name of this template file.
	 *
	 * @param fileName the file name of this template file
	 */
	public void setFileName(String fileName);

	/**
	 * Returns the file no of this template file.
	 *
	 * @return the file no of this template file
	 */
	@AutoEscape
	public String getFileNo();

	/**
	 * Sets the file no of this template file.
	 *
	 * @param fileNo the file no of this template file
	 */
	public void setFileNo(String fileNo);

	/**
	 * Returns the file entry ID of this template file.
	 *
	 * @return the file entry ID of this template file
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this template file.
	 *
	 * @param fileEntryId the file entry ID of this template file
	 */
	public void setFileEntryId(long fileEntryId);

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
	public int compareTo(org.opencps.servicemgt.model.TemplateFile templateFile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.servicemgt.model.TemplateFile> toCacheModel();

	@Override
	public org.opencps.servicemgt.model.TemplateFile toEscapedModel();

	@Override
	public org.opencps.servicemgt.model.TemplateFile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}