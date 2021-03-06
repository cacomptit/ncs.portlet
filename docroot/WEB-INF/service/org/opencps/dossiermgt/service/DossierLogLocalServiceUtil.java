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
 * Provides the local service utility for DossierLog. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.DossierLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungnt
 * @see DossierLogLocalService
 * @see org.opencps.dossiermgt.service.base.DossierLogLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierLogLocalServiceImpl
 * @generated
 */
public class DossierLogLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier log to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLog the dossier log
	* @return the dossier log that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog addDossierLog(
		org.opencps.dossiermgt.model.DossierLog dossierLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossierLog(dossierLog);
	}

	/**
	* Creates a new dossier log with the primary key. Does not add the dossier log to the database.
	*
	* @param dossierLogId the primary key for the new dossier log
	* @return the new dossier log
	*/
	public static org.opencps.dossiermgt.model.DossierLog createDossierLog(
		long dossierLogId) {
		return getService().createDossierLog(dossierLogId);
	}

	/**
	* Deletes the dossier log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log that was removed
	* @throws PortalException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog deleteDossierLog(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierLog(dossierLogId);
	}

	/**
	* Deletes the dossier log from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLog the dossier log
	* @return the dossier log that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog deleteDossierLog(
		org.opencps.dossiermgt.model.DossierLog dossierLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierLog(dossierLog);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.opencps.dossiermgt.model.DossierLog fetchDossierLog(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierLog(dossierLogId);
	}

	/**
	* Returns the dossier log with the primary key.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log
	* @throws PortalException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog getDossierLog(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierLog(dossierLogId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @return the range of dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierLogs(start, end);
	}

	/**
	* Returns the number of dossier logs.
	*
	* @return the number of dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossierLogsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierLogsCount();
	}

	/**
	* Updates the dossier log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierLog the dossier log
	* @return the dossier log that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog updateDossierLog(
		org.opencps.dossiermgt.model.DossierLog dossierLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossierLog(dossierLog);
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
	* @param userId
	* @param groupId
	* @param companyId
	* @param dossierId
	* @param fileGroupId
	* @param status
	* @param actionInfo
	* @param messageInfo
	* @param updateDatetime
	* @param level
	* @return
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.DossierLog addDossierLog(
		long userId, long groupId, long companyId, long dossierId,
		long fileGroupId, java.lang.String status, java.lang.String actionInfo,
		java.lang.String messageInfo, java.util.Date updateDatetime, int level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierLog(userId, groupId, companyId, dossierId,
			fileGroupId, status, actionInfo, messageInfo, updateDatetime, level);
	}

	/**
	* @param userId
	* @param dossierId
	* @param fileGroupId
	* @param status
	* @param actionInfo
	* @param messageInfo
	* @param updateDatetime
	* @param level
	* @param serviceContext
	* @return
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.DossierLog addDossierLog(
		long userId, long dossierId, long fileGroupId, java.lang.String status,
		java.lang.String actionInfo, java.lang.String messageInfo,
		java.util.Date updateDatetime, int level,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierLog(userId, dossierId, fileGroupId, status,
			actionInfo, messageInfo, updateDatetime, level, serviceContext);
	}

	/**
	* @param userId
	* @param groupId
	* @param companyId
	* @param dossierId
	* @param fileGroupId
	* @param dossierStatus
	* @param actor
	* @param requestCommand
	* @param actionInfo
	* @param messageInfo
	* @param level
	* @return
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.DossierLog addDossierLog(
		long userId, long groupId, long companyId, long dossierId,
		long fileGroupId, java.lang.String dossierStatus,
		java.lang.String actor, java.lang.String requestCommand,
		java.lang.String actionInfo, java.lang.String messageInfo, int level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierLog(userId, groupId, companyId, dossierId,
			fileGroupId, dossierStatus, actor, requestCommand, actionInfo,
			messageInfo, level);
	}

	/**
	* @param dossierId
	* @return
	* @throws SystemException
	*/
	public static int countDossierLogByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countDossierLogByDossierId(dossierId);
	}

	/**
	* @param dossierId
	* @param actors
	* @param requestCommands
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findRequiredProcessDossier(
		long dossierId, java.lang.String[] actors,
		java.lang.String[] requestCommands)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findRequiredProcessDossier(dossierId, actors,
			requestCommands);
	}

	/**
	* @param doosierId
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogByDossierId(
		long doosierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierLogByDossierId(doosierId);
	}

	/**
	* @param dossierId
	* @param start
	* @param end
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogByDossierId(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierLogByDossierId(dossierId, start, end);
	}

	/**
	* @param dossierId
	* @param start
	* @param end
	* @param obc
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierLogByDossierId(dossierId, start, end, obc);
	}

	/**
	* @param dossierId
	* @param requestCommand
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static int countDossierByRequestCommand(long dossierId,
		java.lang.String requestCommand)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDossierByRequestCommand(dossierId, requestCommand);
	}

	/**
	* @param start
	* @param end
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> getAllDossierLog(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllDossierLog(start, end);
	}

	/**
	* @return
	* @throws SystemException
	*/
	public static int CountAllDossierLog()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().CountAllDossierLog();
	}

	/**
	* @param fromUpdateDatetime
	* @param toUpdateDatetime
	* @param level
	* @param dossierStatus
	* @param start
	* @param end
	* @return
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> searchAdminLog(
		java.util.Date fromUpdateDatetime, java.util.Date toUpdateDatetime,
		int level, java.lang.String dossierStatus, int start, int end) {
		return getService()
				   .searchAdminLog(fromUpdateDatetime, toUpdateDatetime, level,
			dossierStatus, start, end);
	}

	/**
	* @param fromUpdateDatetime
	* @param toUpdateDatetime
	* @param level
	* @param dossierStatus
	* @return
	*/
	public static int countAnminLog(java.util.Date fromUpdateDatetime,
		java.util.Date toUpdateDatetime, int level,
		java.lang.String dossierStatus) {
		return getService()
				   .countAnminLog(fromUpdateDatetime, toUpdateDatetime, level,
			dossierStatus);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierLogLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierLogLocalService.class.getName());

			if (invokableLocalService instanceof DossierLogLocalService) {
				_service = (DossierLogLocalService)invokableLocalService;
			}
			else {
				_service = new DossierLogLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierLogLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierLogLocalService service) {
	}

	private static DossierLogLocalService _service;
}