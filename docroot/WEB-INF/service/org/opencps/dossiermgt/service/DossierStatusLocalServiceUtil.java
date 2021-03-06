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

package org.opencps.dossiermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DossierStatus. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.DossierStatusLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungnt
 * @see DossierStatusLocalService
 * @see org.opencps.dossiermgt.service.base.DossierStatusLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierStatusLocalServiceImpl
 * @generated
 */
public class DossierStatusLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierStatusLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier status to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStatus the dossier status
	* @return the dossier status that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierStatus addDossierStatus(
		org.opencps.dossiermgt.model.DossierStatus dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossierStatus(dossierStatus);
	}

	/**
	* Creates a new dossier status with the primary key. Does not add the dossier status to the database.
	*
	* @param dossierStatusId the primary key for the new dossier status
	* @return the new dossier status
	*/
	public static org.opencps.dossiermgt.model.DossierStatus createDossierStatus(
		long dossierStatusId) {
		return getService().createDossierStatus(dossierStatusId);
	}

	/**
	* Deletes the dossier status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStatusId the primary key of the dossier status
	* @return the dossier status that was removed
	* @throws PortalException if a dossier status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierStatus deleteDossierStatus(
		long dossierStatusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierStatus(dossierStatusId);
	}

	/**
	* Deletes the dossier status from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStatus the dossier status
	* @return the dossier status that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierStatus deleteDossierStatus(
		org.opencps.dossiermgt.model.DossierStatus dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierStatus(dossierStatus);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.opencps.dossiermgt.model.DossierStatus fetchDossierStatus(
		long dossierStatusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierStatus(dossierStatusId);
	}

	/**
	* Returns the dossier status with the primary key.
	*
	* @param dossierStatusId the primary key of the dossier status
	* @return the dossier status
	* @throws PortalException if a dossier status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws org.opencps.dossiermgt.NoSuchDossierStatusException
	*/
	public static org.opencps.dossiermgt.model.DossierStatus getDossierStatus(
		long dossierStatusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException {
		return getService().getDossierStatus(dossierStatusId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier statuses
	* @param end the upper bound of the range of dossier statuses (not inclusive)
	* @return the range of dossier statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierStatus> getDossierStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierStatuses(start, end);
	}

	/**
	* Returns the number of dossier statuses.
	*
	* @return the number of dossier statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossierStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierStatusesCount();
	}

	/**
	* Updates the dossier status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierStatus the dossier status
	* @return the dossier status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierStatus updateDossierStatus(
		org.opencps.dossiermgt.model.DossierStatus dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossierStatus(dossierStatus);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* @param dossierId
	* @param fileGroupId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.DossierStatus getStatus(
		long dossierId, long fileGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStatus(dossierId, fileGroupId);
	}

	/**
	* @param userId
	* @param dossierId
	* @param fileGroupId
	* @param status
	* @param actionInfo
	* @param messageInfo
	* @param updateDatetime
	* @param syncStatus
	* @param serviceContext
	* @return
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.DossierStatus addDossierStatus(
		long userId, long dossierId, long fileGroupId, java.lang.String status,
		java.lang.String actionInfo, java.lang.String messageInfo,
		java.util.Date updateDatetime, int syncStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierStatus(userId, dossierId, fileGroupId, status,
			actionInfo, messageInfo, updateDatetime, syncStatus, serviceContext);
	}

	/**
	* @param dossierStatusId
	* @param userId
	* @param dossierId
	* @param fileGroupId
	* @param status
	* @param actionInfo
	* @param messageInfo
	* @param updateDatetime
	* @param syncStatus
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws NoSuchDossierStatusException
	*/
	public static org.opencps.dossiermgt.model.DossierStatus updateDossierStatus(
		long dossierStatusId, long userId, long dossierId, long fileGroupId,
		java.lang.String status, java.lang.String actionInfo,
		java.lang.String messageInfo, java.util.Date updateDatetime,
		int syncStatus, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException {
		return getService()
				   .updateDossierStatus(dossierStatusId, userId, dossierId,
			fileGroupId, status, actionInfo, messageInfo, updateDatetime,
			syncStatus, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierStatusLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierStatusLocalService.class.getName());

			if (invokableLocalService instanceof DossierStatusLocalService) {
				_service = (DossierStatusLocalService)invokableLocalService;
			}
			else {
				_service = new DossierStatusLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierStatusLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierStatusLocalService service) {
	}

	private static DossierStatusLocalService _service;
}