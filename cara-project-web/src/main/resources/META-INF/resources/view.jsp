<%@ include file="/init.jsp" %>
<H3>Select Project <I>(Data from REST service)</I></H3>
<div class="container-fluid-1280">
	<div class="flex-container">
		<%  List projectList = (List) renderRequest.getAttribute("projectList"); %>
		<liferay-ui:search-container  emptyResultsMessage="There are no assignments for this class.">
			<liferay-ui:search-container-results results="<%= projectList %>"/>
				<liferay-ui:search-container-row className="com.liferay.unilever.demo.cara.portlet.ProjectAPI" modelVar="projectRecord">
						
						<portlet:renderURL var="createURL">
							<portlet:param name="mvcRenderCommandName" value="/create/createrender" />
								<portlet:param name="projectBrand" value="${projectRecord.getBrand()}" />
								<portlet:param name="brandPosition" value="${projectRecord.getBrandPosition()}" />
								<portlet:param name="projectName" value="${projectRecord.getProjectName()}" />
								<portlet:param name="projectCategory" value="${projectRecord.getCategory()}" />
								<portlet:param name="projectType" value="${projectRecord.getProjectType()}" />
								<portlet:param name="charterDate" value="${projectRecord.getCharterGateApprovalDate()}" />								
						</portlet:renderURL>						
						
				    	
					<liferay-ui:search-container-column-text
							title="${projectRecord.getProjectName()}"
						    cssClass="col-md-4 flex-item-break-xs card-row-padded"
							href="${createURL}"
							name="Project"
							value="<%= projectRecord.getProjectName() %>"
					/>
					<liferay-ui:search-container-column-text
							name="Brand"
							value="<%= projectRecord.getBrand() %>"
					/>
						<liferay-ui:search-container-column-text
							name="Type"
							value="<%= projectRecord.getProjectType() %>"
						/>
						<liferay-ui:search-container-column-text
							name="Category"
							value="<%= projectRecord.getCategory() %>"
						/>
						<liferay-ui:search-container-column-text
							name="Create job">
							<a style="color: #FFFFFF;" class = "btn btn-primary" href="${createURL}">Configure Project</a>
						</liferay-ui:search-container-column-text>
				    					   			
				</liferay-ui:search-container-row>
			<liferay-ui:search-iterator markupView="lexicon" />
		</liferay-ui:search-container>
	</div>
</div>



