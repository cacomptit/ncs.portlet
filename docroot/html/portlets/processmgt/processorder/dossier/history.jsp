
<%
/**
 * OpenCPS is the open source Core Public Services software
 * Copyright (C) 2016-present OpenCPS community
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 */
%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="org.opencps.util.DateTimeUtil"%>
<%@page import="org.opencps.processmgt.service.ActionHistoryLocalServiceUtil"%>
<%@page import="org.opencps.processmgt.model.ActionHistory"%>
<%@page import="org.opencps.processmgt.model.ProcessOrder"%>
<%@ include file="../../init.jsp"%>

<%
	ProcessOrder processOrder = (ProcessOrder)request.getAttribute(WebKeys.PROCESS_ORDER_ENTRY);
	
		long processOrderId = Validator.isNotNull(processOrder) ? processOrder.getProcessOrderId() : 0L;
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", templatePath + "dossier/history.jsp");
	
	List<ActionHistory> actionHistories = new ArrayList<ActionHistory>();
	
	SimpleDateFormat sdf = new SimpleDateFormat();
	
%>

	<liferay-ui:search-container 
		emptyResultsMessage="no-action-history-were-found"
		iteratorURL="<%=iteratorURL %>"
		delta="<%=20 %>"
		deltaConfigurable="true"
		>
		<liferay-ui:search-container-results>
			<%
				actionHistories =  ActionHistoryLocalServiceUtil.getActionHistoryByProcessOrderId(processOrderId, searchContainer.getStart(), searchContainer.getEnd());
				
				results = actionHistories;
				total = ActionHistoryLocalServiceUtil
					.countActionHistoryByProcessId(processOrderId);
				pageContext.setAttribute("results", results);
				pageContext.setAttribute("total", total);
			%>
		</liferay-ui:search-container-results>
		<liferay-ui:search-container-row 
			className="org.opencps.processmgt.model.ActionHistory" 
			modelVar="actionHistory" 
			keyProperty="actionHistoryId"
		>
		
			<%
				String date = StringPool.BLANK;
				
				if (Validator.isNotNull(actionHistory.getCreateDate())) {
					date = DateTimeUtil.
									convertDateToString(actionHistory.getCreateDate(),
										DateTimeUtil._VN_DATE_FORMAT);
				}
				
				String userActionName = StringPool.BLANK;
				
				try {
					if (Validator.isNotNull(actionHistory.getActionUserId()) || actionHistory.getActionUserId() != 0) {
						userActionName = UserLocalServiceUtil
										.getUser(actionHistory.getActionUserId()).getFullName();
					}
				} catch (Exception e ) {
					
				}
				
			%>
			<liferay-ui:search-container-column-text 
				name="row-no"
			 	value="<%= String.valueOf(row.getPos()+1) %>"
			/>
			
			<liferay-ui:search-container-column-text 
				name="step-name"
			 	value="<%= actionHistory.getStepName() %>"
			/>
			
			<liferay-ui:search-container-column-text 
				name="action-name"
			 	value="<%= actionHistory.getActionName() %>"
			/>
			
			<liferay-ui:search-container-column-text 
				name="action-date"
			 	value="<%= date %>"
			/>
			
			<liferay-ui:search-container-column-text 
				name="action-user"
			 	value="<%= userActionName %>"
			/>
			
			<liferay-ui:search-container-column-text 
				name="action-note"
			 	value="<%= actionHistory.getActionNote() %>"
			/>
			
			<liferay-ui:search-container-column-text 
				name="days-delay"
			 	value="<%= String.valueOf(actionHistory.getDaysDelay()) %>"
			/>
		</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
	</liferay-ui:search-container>