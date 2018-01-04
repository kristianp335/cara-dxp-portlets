<%@ include file="/init.jsp" %>

<%  
List projectList = (List) renderRequest.getAttribute("projectList"); 
List ipmProjectList = (List) renderRequest.getAttribute("ipmProjectList"); 
List projectCategory = (List) renderRequest.getAttribute("projectCategory"); 
int projectCount = (int) renderRequest.getAttribute("projectCount"); 
PortletURL myPortletUrl = renderResponse.createRenderURL();


%>

<portlet:renderURL var="editProjectURLBlank">
				<portlet:param name="mvcRenderCommandName" value="/edit/editProject" />
				<portlet:param name="projectRefIdBlank" value="true" />
</portlet:renderURL>


<div style = "margin-left: 93%"><a href="${editProjectURLBlank}"><span style="padding: 10px;" aria-hidden="true" class="icon-plus"></a></span><span style="padding: 10px;" aria-hidden="true" class="icon-refresh"></span></div>
<liferay-ui:tabs names="Non-IPM,IPM" refresh="false">
	<liferay-ui:section>
		<liferay-ui:search-container delta="10"
		 curParam="cur1"
		 deltaConfigurable="false"
		 iteratorURL="<%= myPortletUrl %>"
		 total="<%= projectCount %>"
		 id="projects" 
		 emptyResultsMessage="Sorry there are no projects are available">
		
			<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
					<aui:nav-bar-search>
						<aui:form action="<%= myPortletUrl.toString() %>" name="searchFm">
							<aui:input id="clickedField" name="clickedField" type="hidden" value="blank">
							</aui:input>					
							<liferay-ui:input-search markupView="lexicon" />
						</aui:form>
					</aui:nav-bar-search>
			</aui:nav-bar>
		
				<!--  <liferay-frontend:management-bar
					includeCheckBox="<%= false %>"
					searchContainerId="projects"
				>

					
					<liferay-frontend:management-bar-filters>
						<liferay-frontend:management-bar-navigation
							navigationKeys='<%= new String[] {"all"} %>'
							portletURL="<%= myPortletUrl %>"			
						/>	
						<liferay-frontend:management-bar-sort
							orderByCol="hello"
							orderByType="hello"					
							orderColumns='<%= new String[] {"Project name", "Brand", "Category"} %>'
							portletURL="<%= myPortletUrl %>"
						/>
					</liferay-frontend:management-bar-filters>			
							
				</liferay-frontend:management-bar>-->
				
				<aui:form action="<%= myPortletUrl.toString() %>" id="filters" name="filters">
					<!-- JSTL iterator combined with a liferay aui taglib select will perform the filtering requirement -->  
					<!-- <aui:select id="projectCategory" name="projectCategory" label="Project Category">
									<c:forEach var="projectCategory" items="${projectCategory}">
										<aui:option value="${projectCategory}">${projectCategory}</aui:option>		
									</c:forEach>					
					</aui:select> -->
				</aui:form>
			<liferay-ui:search-container-results
				results="<%= projectList %>"
				
			/>
		
			<liferay-ui:search-container-row	
				className="com.liferay.unilever.demo.cara.model.project"
				keyProperty="projectId"
				modelVar="project"
			>
				<portlet:renderURL var="createJobsURL">
									<portlet:param name="mvcRenderCommandName" value="/create/createjobs" />
										<portlet:param name="projectBrand" value="${project.getBrand()}" />
										<portlet:param name="brandPosition" value="${project.getBrandPosition()}" />
										<portlet:param name="projectName" value="${project.getProjectName()}" />
										<portlet:param name="projectCategory" value="${project.getProjectCategory()}" />
										<portlet:param name="projectType" value="${project.getProjectType()}" />
										<portlet:param name="projectId" value="${project.projectId}" />
				</portlet:renderURL>
				
				<portlet:renderURL var="editProjectURL">
									<portlet:param name="mvcRenderCommandName" value="/edit/editProject" />
										<portlet:param name="projectRefId" value="${project.getProjectRefId()}" />
				</portlet:renderURL>
			
				<liferay-ui:search-container-column-text
					title="${project.getProjectName()}"
				    cssClass="col-md-4 flex-item-break-xs card-row-padded"
					href="${createJobsURL}"
					name="Project"
					value="<%= project.getProjectName() %>"
				/>
				<liferay-ui:search-container-column-text
					name="Brand"
					value="<%= project.getBrand() %>"
				/>
				
				<liferay-ui:search-container-column-text
					name="Type"
					value="<%= project.getProjectType() %>"
				/>
				
				<liferay-ui:search-container-column-text
					name="Progress">
				    
					    <div aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" class="progress-bar progress-bar-striped progress-bar-success" role="progressbar" style="width: 100px;">60%
					    
					</div>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					name="Category"
					value="<%= project.getProjectCategory() %>"
				/>
				<liferay-ui:search-container-column-text
					name="Manage">
					<c:choose>
			  			<c:when test="${project.getSupplyChainUserId() == 0 ||
			  				project.getContractGateApproval() == null ||
							project.getCustomerDevelopmentUserId() == 0 ||
							project.getMarketDeployment() == null ||
							project.getMarketReadyApproval() == null ||
							project.getProductDesignLock() == null ||
							project.getRndProductUserId() == 0 ||
							project.getMarketingUserId() == 0 ||
							project.getRndUserId() == 0 ||
							project.getTechLeaderUserId() == 0 			
			  			}">	
			  				<a href="${editProjectURL}">
			  					<span style="padding: 10px; aria-hidden="true" class="icon-edit"></span>
			  				</a>
			  					<span style="padding: 10px; aria-hidden="true" class="icon-eye-open"></span>
			  					<span style="padding: 10px; aria-hidden="true" class="icon-download"></span>
						</c:when>
						<c:otherwise>
							
							<a href="${editProjectURL}" alt="Edit Project">
			  					<span style="padding: 10px; aria-hidden="true" class="icon-edit"></span>
			  				</a>
			  				<a href="${createJobsURL}" alt="Create Job">
			  					<span style="padding: 10px; aria-hidden="true" class="icon-file"></span>
			  				</a>
			  				
			  					<span style="padding: 10px; aria-hidden="true" class="icon-eye-open"></span>
			  					<span style="padding: 10px; aria-hidden="true" class="icon-download"></span>
						</c:otherwise>
					</c:choose>
				</liferay-ui:search-container-column-text>				
				</liferay-ui:search-container-row>		
				<liferay-ui:search-iterator markupView="lexicon"  />
			</liferay-ui:search-container>
	</liferay-ui:section>
	<liferay-ui:section>
		<liferay-ui:search-container delta="10"
		 curParam="cur1"
		 deltaConfigurable="false"
		 iteratorURL="<%= myPortletUrl %>"
		 total="<%= projectCount %>"
		 id="projects" 
		 emptyResultsMessage="Sorry there are no projects are available">
		
			<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
					<aui:nav cssClass="navbar-nav">
						<aui:nav-item label="Projects" selected="<%= true %>" />
					</aui:nav>
		
					<aui:nav-bar-search>
						<aui:form action="<%= myPortletUrl.toString() %>" name="searchFm">
							<aui:input id="clickedField" name="clickedField" type="hidden" value="blank">
							</aui:input>					
							<liferay-ui:input-search markupView="lexicon" />
						</aui:form>
					</aui:nav-bar-search>
			</aui:nav-bar>
		
				<liferay-frontend:management-bar
					includeCheckBox="<%= false %>"
					searchContainerId="projects"
				>
				<liferay-frontend:management-bar-filters>
						<liferay-frontend:management-bar-navigation
							navigationKeys='<%= new String[] {"all"} %>'
							portletURL="<%= myPortletUrl %>"			
						/>	
						<liferay-frontend:management-bar-sort
							orderByCol="hello"
							orderByType="hello"					
							orderColumns='<%= new String[] {"Project name", "Brand", "Category"} %>'
							portletURL="<%= myPortletUrl %>"
						/>
					</liferay-frontend:management-bar-filters>			
							
				</liferay-frontend:management-bar>
				
				<aui:form action="<%= myPortletUrl.toString() %>" id="filters" name="filters">
					<!-- JSTL iterator combined with a liferay aui taglib select will perform the filtering requirement -->  
					<!-- <aui:select id="projectCategory" name="projectCategory" label="Project Category">
									<c:forEach var="projectCategory" items="${projectCategory}">
										<aui:option value="${projectCategory}">${projectCategory}</aui:option>		
									</c:forEach>					
					</aui:select> -->
				</aui:form>
			<liferay-ui:search-container-results
				results="<%= ipmProjectList %>"
				
			/>
		
			<liferay-ui:search-container-row	
				className="com.liferay.unilever.demo.cara.model.project"
				keyProperty="projectId"
				modelVar="project"
			>
				<portlet:renderURL var="createJobsURL">
									<portlet:param name="mvcRenderCommandName" value="/create/createjobs" />
										<portlet:param name="projectBrand" value="${project.getBrand()}" />
										<portlet:param name="brandPosition" value="${project.getBrandPosition()}" />
										<portlet:param name="projectName" value="${project.getProjectName()}" />
										<portlet:param name="projectCategory" value="${project.getProjectCategory()}" />
										<portlet:param name="projectType" value="${project.getProjectType()}" />
										<portlet:param name="projectId" value="${project.projectId}" />
				</portlet:renderURL>
				
				<portlet:renderURL var="editProjectURL">
									<portlet:param name="mvcRenderCommandName" value="/edit/editProject" />
										<portlet:param name="projectRefId" value="${project.getProjectRefId()}" />
				</portlet:renderURL>
			
				<liferay-ui:search-container-column-text
					title="${project.getProjectName()}"
				    cssClass="col-md-4 flex-item-break-xs card-row-padded"
					href="${createJobsURL}"
					name="Project"
					value="<%= project.getProjectName() %>"
				/>
				<liferay-ui:search-container-column-text
					name="Brand"
					value="<%= project.getBrand() %>"
				/>
				
				<liferay-ui:search-container-column-text
					name="Type"
					value="<%= project.getProjectType() %>"
				/>
				
				<liferay-ui:search-container-column-text
					name="Progress">

					    <div aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" class="progress-bar progress-bar-striped progress-bar-success" role="progressbar" style="width: 100px;">60%
					    
					</div>
				</liferay-ui:search-container-column-text>
				
				<liferay-ui:search-container-column-text
					name="Category"
					value="<%= project.getProjectCategory() %>"
				/>
				<liferay-ui:search-container-column-text
					name="Manage">
					<c:choose>
			  			<c:when test="${project.getSupplyChainUserId() == 0 ||
			  				project.getContractGateApproval() == null ||
							project.getCustomerDevelopmentUserId() == 0 ||
							project.getMarketDeployment() == null ||
							project.getMarketReadyApproval() == null ||
							project.getProductDesignLock() == null ||
							project.getRndProductUserId() == 0 ||
							project.getMarketingUserId() == 0 ||
							project.getRndUserId() == 0 ||
							project.getTechLeaderUserId() == 0 			
			  			}">	
			  				<a href="${editProjectURL}">
			  					<span style="padding: 10px; aria-hidden="true" class="icon-edit"></span>
			  				</a>
			  					<span style="padding: 10px; aria-hidden="true" class="icon-eye-open"></span>
			  					<span style="padding: 10px; aria-hidden="true" class="icon-download"></span>
						</c:when>
						<c:otherwise>
							
							<a href="${editProjectURL}" alt="Edit Project">
			  					<span style="padding: 10px; aria-hidden="true" class="icon-edit"></span>
			  				</a>
			  				<a href="${createJobsURL}" alt="Create Job">
			  					<span style="padding: 10px; aria-hidden="true" class="icon-file"></span>
			  				</a>
			  				
			  					<span style="padding: 10px; aria-hidden="true" class="icon-eye-open"></span>
			  					<span style="padding: 10px; aria-hidden="true" class="icon-download"></span>
						</c:otherwise>
					</c:choose>
				</liferay-ui:search-container-column-text>				
				</liferay-ui:search-container-row>		
				<liferay-ui:search-iterator markupView="lexicon"  />
			</liferay-ui:search-container>
	</liferay-ui:section>
</liferay-ui:tabs>


<!-- <script>
$("#<portlet:namespace />projectCategory" ).on( "change", function() {
	  $("#<portlet:namespace />filters").submit();
});
</script>
-->