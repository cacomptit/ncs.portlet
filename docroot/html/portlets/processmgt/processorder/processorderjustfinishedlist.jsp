
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
<%@page import="org.opencps.processmgt.search.ProcessOrderSearchTerms"%>
<%@page import="org.opencps.processmgt.search.ProcessOrderSearch"%>
<%@page import="org.opencps.processmgt.model.ProcessOrder"%>
<%@page import="org.opencps.processmgt.util.ProcessUtils"%>
<%@page import="org.opencps.dossiermgt.bean.ProcessOrderBean"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="org.opencps.processmgt.service.ProcessOrderLocalServiceUtil"%>
<%@page import="org.opencps.processmgt.search.ProcessOrderDisplayTerms"%>
<%@ include file="../init.jsp"%>


<liferay-util:include page='<%=templatePath + "toptabs.jsp" %>' servletContext="<%=application %>" />
<liferay-util:include page='<%=templatePath + "toolbar.jsp" %>' servletContext="<%=application %>" />

<%
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", templatePath + "processordertodolist.jsp");
	iteratorURL.setParameter("tabs1", ProcessUtils.TOP_TABS_PROCESS_ORDER_WAITING_PROCESS);
	
	List<ProcessOrderBean> processOrders =  new ArrayList<ProcessOrderBean>();
	
	int totalCount = 0;
	
	//RowChecker rowChecker = new RowChecker(liferayPortletResponse);
%>
<aui:form name="fm">
	<liferay-ui:search-container 
		searchContainer="<%= new ProcessOrderSearch(renderRequest, SearchContainer.DEFAULT_DELTA, iteratorURL) %>"
	>
	
		<liferay-ui:search-container-results>
			<%
				ProcessOrderSearchTerms searchTerms = (ProcessOrderSearchTerms)searchContainer.getSearchTerms();
				
				long serviceInfoId = searchTerms.getServiceInfoId();
			
				long processStepId = searchTerms.getProcessStepId();
				
				try{
					
					%>
						<%@include file="/html/portlets/processmgt/processorder/processorder_justfinished_searchresults.jspf" %>
					<%
				}catch(Exception e){
					_log.error(e);
				}
			
				total = totalCount;
				results = processOrders;
				
				pageContext.setAttribute("results", results);
				pageContext.setAttribute("total", total);
			%>
		</liferay-ui:search-container-results>	
			<liferay-ui:search-container-row 
				className="org.opencps.dossiermgt.bean.ProcessOrderBean" 
				modelVar="processOrder" 
				keyProperty="processOrderId"
				rowVar="row"
				stringKey="<%=true%>"
			>
				<%
					PortletURL processURL = renderResponse.createRenderURL();
					processURL.setParameter("mvcPath", templatePath + "process_order_detail.jsp");
					processURL.setParameter(ProcessOrderDisplayTerms.PROCESS_ORDER_ID, String.valueOf(processOrder.getProcessOrderId()));
					processURL.setParameter("backURL", currentURL);
					processURL.setParameter("isEditDossier", String.valueOf(false));
				
					row.addText(processOrder.getReceptionNo(), processURL);
					row.addText(processOrder.getSubjectName(), processURL);
					row.addText(processOrder.getServiceName(), processURL);	
					row.addText(processOrder.getStepName(), processURL);	
					row.addText(processOrder.getAssignToUserName(), processURL);
					row.addText(Validator.isNotNull(processOrder.getDealine()) ? processOrder.getDealine() : StringPool.DASH, processURL);
				
					//row.setClassHoverName("");
				%>	
			</liferay-ui:search-container-row> 
		
		<liferay-ui:search-iterator/>
	</liferay-ui:search-container>
</aui:form>
<%!
	private Log _log = LogFactoryUtil.getLog("html.portlets.processmgt.processorder.processorderjustfinishedlist.jsp");
%>