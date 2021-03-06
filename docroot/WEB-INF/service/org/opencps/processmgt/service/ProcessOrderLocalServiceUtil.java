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

package org.opencps.processmgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ProcessOrder. This utility wraps
 * {@link org.opencps.processmgt.service.impl.ProcessOrderLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoavd
 * @see ProcessOrderLocalService
 * @see org.opencps.processmgt.service.base.ProcessOrderLocalServiceBaseImpl
 * @see org.opencps.processmgt.service.impl.ProcessOrderLocalServiceImpl
 * @generated
 */
public class ProcessOrderLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.processmgt.service.impl.ProcessOrderLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the process order to the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.ProcessOrder addProcessOrder(
		org.opencps.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addProcessOrder(processOrder);
	}

	/**
	* Creates a new process order with the primary key. Does not add the process order to the database.
	*
	* @param processOrderId the primary key for the new process order
	* @return the new process order
	*/
	public static org.opencps.processmgt.model.ProcessOrder createProcessOrder(
		long processOrderId) {
		return getService().createProcessOrder(processOrderId);
	}

	/**
	* Deletes the process order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order that was removed
	* @throws PortalException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.ProcessOrder deleteProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProcessOrder(processOrderId);
	}

	/**
	* Deletes the process order from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.ProcessOrder deleteProcessOrder(
		org.opencps.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProcessOrder(processOrder);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.opencps.processmgt.model.ProcessOrder fetchProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchProcessOrder(processOrderId);
	}

	/**
	* Returns the process order with the primary key.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order
	* @throws PortalException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.ProcessOrder getProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getProcessOrder(processOrderId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @return the range of process orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.processmgt.model.ProcessOrder> getProcessOrders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProcessOrders(start, end);
	}

	/**
	* Returns the number of process orders.
	*
	* @return the number of process orders
	* @throws SystemException if a system exception occurred
	*/
	public static int getProcessOrdersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProcessOrdersCount();
	}

	/**
	* Updates the process order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.ProcessOrder updateProcessOrder(
		org.opencps.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateProcessOrder(processOrder);
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
	* @param serviceProcessId
	* @param processStepId
	* @param processWorkflowId
	* @param actionUserId
	* @param actionDatetime
	* @param stepName
	* @param actionName
	* @param actionNote
	* @param assignToUserId
	* @param dossierStatus
	* @param daysDoing
	* @param daysDelay
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public static org.opencps.processmgt.model.ProcessOrder addProcessOrder(
		long dossierId, long fileGroupId, long serviceProcessId,
		long processStepId, long processWorkflowId, long actionUserId,
		java.util.Date actionDatetime, java.lang.String stepName,
		java.lang.String actionName, java.lang.String actionNote,
		long assignToUserId, java.lang.String dossierStatus, int daysDoing,
		int daysDelay, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addProcessOrder(dossierId, fileGroupId, serviceProcessId,
			processStepId, processWorkflowId, actionUserId, actionDatetime,
			stepName, actionName, actionNote, assignToUserId, dossierStatus,
			daysDoing, daysDelay, serviceContext);
	}

	/**
	* @param userId
	* @param dossierId
	* @param fileGroupId
	* @param serviceProcessId
	* @param processStepId
	* @param processWorkflowId
	* @param actionUserId
	* @param actionDatetime
	* @param stepName
	* @param actionName
	* @param actionNote
	* @param assignToUserId
	* @param dossierStatus
	* @param daysDoing
	* @param daysDelay
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public static org.opencps.processmgt.model.ProcessOrder addProcessOrder(
		long userId, long dossierId, long fileGroupId, long serviceProcessId,
		long processStepId, long processWorkflowId, long actionUserId,
		java.util.Date actionDatetime, java.lang.String stepName,
		java.lang.String actionName, java.lang.String actionNote,
		long assignToUserId, java.lang.String dossierStatus, int daysDoing,
		int daysDelay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addProcessOrder(userId, dossierId, fileGroupId,
			serviceProcessId, processStepId, processWorkflowId, actionUserId,
			actionDatetime, stepName, actionName, actionNote, assignToUserId,
			dossierStatus, daysDoing, daysDelay);
	}

	/**
	* @param serviceInfoId
	* @param processStepId
	* @param loginUserId
	* @param actionUserId
	* @return
	*/
	public static int countProcessOrder(long serviceInfoId, long processStepId,
		long loginUserId, long actionUserId) {
		return getService()
				   .countProcessOrder(serviceInfoId, processStepId,
			loginUserId, actionUserId);
	}

	/**
	* @param serviceInfoId
	* @param processStepId
	* @param actionUserId
	* @return
	*/
	public static int countProcessOrderJustFinished(long serviceInfoId,
		long processStepId, long actionUserId) {
		return getService()
				   .countProcessOrderJustFinished(serviceInfoId, processStepId,
			actionUserId);
	}

	/**
	* @param dossierId
	* @param fileGroupId
	* @return
	* @throws NoSuchProcessOrderException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.ProcessOrder getProcessOrder(
		long dossierId, long fileGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchProcessOrderException {
		return getService().getProcessOrder(dossierId, fileGroupId);
	}

	/**
	* @param loginUserId
	* @return
	*/
	public static java.util.List getProcessOrderServiceByUser(long loginUserId) {
		return getService().getProcessOrderServiceByUser(loginUserId);
	}

	/**
	* @param loginUserId
	* @return
	*/
	public static java.util.List getProcessOrderServiceJustFinishedByUser(
		long loginUserId) {
		return getService().getProcessOrderServiceJustFinishedByUser(loginUserId);
	}

	/**
	* @param loginUserId
	* @param serviceInfoId
	* @return
	*/
	public static java.util.List getUserProcessStep(long loginUserId,
		long serviceInfoId) {
		return getService().getUserProcessStep(loginUserId, serviceInfoId);
	}

	/**
	* @param loginUserId
	* @param serviceInfoId
	* @return
	*/
	public static java.util.List getUserProcessStepJustFinished(
		long loginUserId, long serviceInfoId) {
		return getService()
				   .getUserProcessStepJustFinished(loginUserId, serviceInfoId);
	}

	/**
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.ProcessOrder initProcessOrder()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().initProcessOrder();
	}

	/**
	* @param userId
	* @param companyId
	* @param groupId
	* @param serviceInfoId
	* @param dossierTempateId
	* @param govAgencyCode
	* @param govAgencyName
	* @param govAgencyOrganizationId
	* @param serviceProcessId
	* @param dossierId
	* @param fileGroupId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.ProcessOrder initProcessOrder(
		long userId, long companyId, long groupId, long serviceInfoId,
		long dossierTemplateId, java.lang.String govAgencyCode,
		java.lang.String govAgencyName, long govAgencyOrganizationId,
		long serviceProcessId, long dossierId, long fileGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .initProcessOrder(userId, companyId, groupId, serviceInfoId,
			dossierTemplateId, govAgencyCode, govAgencyName,
			govAgencyOrganizationId, serviceProcessId, dossierId, fileGroupId);
	}

	/**
	* @param userId
	* @param companyId
	* @param groupId
	* @param serviceInfoId
	* @param dossierTemplateId
	* @param govAgencyCode
	* @param govAgencyName
	* @param govAgencyOrganizationId
	* @param serviceProcessId
	* @param dossierId
	* @param fileGroupId
	* @param processWorkflowId
	* @param actionDatetime
	* @param stepName
	* @param actionName
	* @param actionNote
	* @param actionUserId
	* @param daysDoing
	* @param daysDelay
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.ProcessOrder initProcessOrder(
		long userId, long companyId, long groupId, long serviceInfoId,
		long dossierTemplateId, java.lang.String govAgencyCode,
		java.lang.String govAgencyName, long govAgencyOrganizationId,
		long serviceProcessId, long dossierId, long fileGroupId,
		long processWorkflowId, java.util.Date actionDatetime,
		java.lang.String stepName, java.lang.String actionName,
		java.lang.String actionNote, long actionUserId, int daysDoing,
		int daysDelay, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .initProcessOrder(userId, companyId, groupId, serviceInfoId,
			dossierTemplateId, govAgencyCode, govAgencyName,
			govAgencyOrganizationId, serviceProcessId, dossierId, fileGroupId,
			processWorkflowId, actionDatetime, stepName, actionName,
			actionNote, actionUserId, daysDoing, daysDelay, dossierStatus);
	}

	/**
	* @param serviceInfoId
	* @param processStepId
	* @param loginUserId
	* @param actionUserId
	* @param start
	* @param end
	* @param orderByComparator
	* @return
	*/
	public static java.util.List searchProcessOrder(long serviceInfoId,
		long processStepId, long loginUserId, long actionUserId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getService()
				   .searchProcessOrder(serviceInfoId, processStepId,
			loginUserId, actionUserId, start, end, orderByComparator);
	}

	/**
	* @param serviceInfoId
	* @param processStepId
	* @param actionUserId
	* @param start
	* @param end
	* @param orderByComparator
	* @return
	*/
	public static java.util.List searchProcessOrderJustFinished(
		long serviceInfoId, long processStepId, long actionUserId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getService()
				   .searchProcessOrderJustFinished(serviceInfoId,
			processStepId, actionUserId, start, end, orderByComparator);
	}

	/**
	* Update Step
	*
	* @param processOrderId
	* @param processStepId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.ProcessOrder updateInitStep(
		long processOrderId, long processStepId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateInitStep(processOrderId, processStepId);
	}

	/**
	* @param processOrderId
	* @param processStepId
	* @param actionUserId
	* @param actionDatetime
	* @param actionNote
	* @param assignToUserId
	* @return
	* @throws NoSuchProcessOrderException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.ProcessOrder updateProcessOrder(
		long processOrderId, long processStepId, long actionUserId,
		java.util.Date actionDatetime, java.lang.String actionNote,
		long assignToUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchProcessOrderException {
		return getService()
				   .updateProcessOrder(processOrderId, processStepId,
			actionUserId, actionDatetime, actionNote, assignToUserId);
	}

	/**
	* @param processOrderId
	* @param processStepId
	* @param processWorkflowId
	* @param actionUserId
	* @param actionDatetime
	* @param actionNote
	* @param assignToUserId
	* @param stepName
	* @param actionName
	* @param daysDoing
	* @param daysDelay
	* @param dossierStatus
	* @return
	* @throws NoSuchProcessOrderException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.ProcessOrder updateProcessOrder(
		long processOrderId, long processStepId, long processWorkflowId,
		long actionUserId, java.util.Date actionDatetime,
		java.lang.String actionNote, long assignToUserId,
		java.lang.String stepName, java.lang.String actionName, int daysDoing,
		int daysDelay, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchProcessOrderException {
		return getService()
				   .updateProcessOrder(processOrderId, processStepId,
			processWorkflowId, actionUserId, actionDatetime, actionNote,
			assignToUserId, stepName, actionName, daysDoing, daysDelay,
			dossierStatus);
	}

	/**
	* @param processOrderId
	* @param dossierStatus
	* @return
	* @throws NoSuchProcessOrderException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.ProcessOrder updateProcessOrderStatus(
		long processOrderId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchProcessOrderException {
		return getService()
				   .updateProcessOrderStatus(processOrderId, dossierStatus);
	}

	public static void clearService() {
		_service = null;
	}

	public static ProcessOrderLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ProcessOrderLocalService.class.getName());

			if (invokableLocalService instanceof ProcessOrderLocalService) {
				_service = (ProcessOrderLocalService)invokableLocalService;
			}
			else {
				_service = new ProcessOrderLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ProcessOrderLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ProcessOrderLocalService service) {
	}

	private static ProcessOrderLocalService _service;
}