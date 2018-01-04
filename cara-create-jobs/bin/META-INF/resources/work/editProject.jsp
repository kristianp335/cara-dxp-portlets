<%@ include file="../init.jsp" %>

<% PortletURL redirectUrl =  renderResponse.createRenderURL(); 
%>

<portlet:actionURL var="saveProjectActionURL"
	name="/create/saveProjectFromJobCreation">
	<portlet:param name="redirect" value="<%= redirectUrl.toString() %>" />
</portlet:actionURL>

<%

String projectRefIdBlank = (String) renderRequest.getAttribute("projectRefIdBlank");

long projectId = (long) renderRequest.getAttribute("projectId");
String projectBrand = (String) renderRequest.getAttribute("projectBrand");
String brandPosition = (String) renderRequest.getAttribute("brandPosition");
String projectName = (String) renderRequest.getAttribute("projectName");
String projectCategory = (String) renderRequest.getAttribute("projectCategory");
String projectType =  (String) renderRequest.getAttribute("projectType");
Integer charterDay = (Integer) renderRequest.getAttribute("charterDay");
Integer charterMonth = (Integer) renderRequest.getAttribute("charterMonth");
Integer charterYear = (Integer) renderRequest.getAttribute("charterYear");
Integer todayDay = (Integer) renderRequest.getAttribute("todayDay");
Integer todayMonth = (Integer) renderRequest.getAttribute("todayMonth");
Integer todayYear = (Integer) renderRequest.getAttribute("todayYear");


String rndProductUserIdString =  (String) renderRequest.getAttribute("rndProductUserIdString");
String rndUserIdString =  (String) renderRequest.getAttribute("rndUserIdString");
String technicalProjectLeaderUserIdString =  (String) renderRequest.getAttribute("technicalProjectLeaderUserIdString");
String customerDevelopmentUserIdString =  (String) renderRequest.getAttribute("customerDevelopmentUserIdString");
String supplyChainUserIdString =  (String) renderRequest.getAttribute("supplyChainUserIdString");
String marketingUserIdString =  (String) renderRequest.getAttribute("marketingUserIdString");


if (projectType == "")
{
	projectType = "Non-IPM";
}



PortletURL myPortletUrl = renderResponse.createRenderURL();
myPortletUrl.setParameter("mvcPath", "/work/editProject.jsp");

String clickedField = renderRequest.getParameter("clickedField");


%>


<H4>Configure Project <i>(you must complete the project configuration before creating a job)</i></H4>
<br/>
<aui:form name="fm" id="fm" method = "post" action="">
<c:choose>
	<c:when test = "${projectId != 0}">
		<aui:field-wrapper required="true">
						<aui:input name="projectId" value="<%=projectId %>" label="Project ID" readonly = "true"></aui:input>
		</aui:field-wrapper>
	</c:when>
</c:choose>

<aui:input name="assignmentId" field="assignmentId" type="hidden" />
		<aui:fieldset-group markupView="lexicon">
		<div style="float: left; padding-left: 20px; min-width: 250px;">
		
			<aui:field-wrapper required="true">
						<aui:input name="projectName" value="<%=projectName %>" label="Project Name"></aui:input>
			</aui:field-wrapper>				
			<aui:field-wrapper required="true">
						<aui:input name="projectBrand" value="<%=projectBrand %>"  label="Project Brand"></aui:input>
			</aui:field-wrapper>			
			<aui:field-wrapper required="true">
						<aui:input name="projectCategory" value="<%=projectCategory %>" label="Project Category" ></aui:input>
			</aui:field-wrapper>			
		
		</div>
		
		<div style="float: left; padding-left: 20px; min-width: 250px;">
			<aui:field-wrapper required="true">
						<aui:input name="projectType" value="<%=projectType %>" label="Project Type" readonly="true"></aui:input>
			</aui:field-wrapper>	
			<aui:field-wrapper required="true">
						<aui:input name="brandPosition" value="<%=brandPosition %>"  label="Brand Position"></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper>					
				<label for="CharterGateApproval"><liferay-ui:message key="Charter Gate Approval" /></label>	
				<liferay-ui:input-date  dayParam="charterGateApprovalDay" monthParam="charterGateApprovalMonth" yearParam="charterGateApprovalYear" dayValue = "<%= charterDay %>"  monthValue = "<%= charterMonth %>" yearValue = "<%= charterYear %>" name="contractGateApproval">
				</liferay-ui:input-date>				
			</aui:field-wrapper>
		</div>
		
		<div style= "clear:both" ></div>	
		
		<div style="float: left; padding-left: 20px; min-width: 250px;">			
			<aui:field-wrapper>					
				<label for="contractGateApproval"><liferay-ui:message key="Contract Gate Approval" /></label>	
				<liferay-ui:input-date  dayParam="contractGateApprovalDay" monthParam="contractGateApprovalMonth" yearParam="contractGateApprovalYear" dayValue = "<%= todayDay %>"  monthValue = "<%= todayMonth %>" yearValue = "<%= todayYear %>" name="contractGateApproval">
				</liferay-ui:input-date>				
			</aui:field-wrapper>			
			
			<aui:field-wrapper>	
				<label for="productDesignLock"><liferay-ui:message key="Product Design Lock" /></label>	
				<liferay-ui:input-date dayParam="productDesignLockDay" monthParam="productDesignLockMonth" yearParam="productDesignLockYear"  name="productDesignLock" dayValue = "<%= todayDay %>"  monthValue = "<%= todayMonth %>" yearValue = "<%= todayYear %>"></liferay-ui:input-date>
			</aui:field-wrapper>
			
			<aui:field-wrapper>	
				<label for="marketReadyApproval"><liferay-ui:message key="Market Ready Approval" /></label>	
				<liferay-ui:input-date dayParam="marketReadyApprovalDay" monthParam="marketReadyApprovalMonth" yearParam="marketReadyApprovalYear"   name="marketReadyApproval" dayValue = "<%= todayDay %>"  monthValue = "<%= todayMonth %>" yearValue = "<%= todayYear %>"></liferay-ui:input-date>
			</aui:field-wrapper>			
		</div>
		
		<div style="float: left; padding-left: 20px; min-width: 250px;">
			<aui:field-wrapper>	
				<label for="marketDeployment"><liferay-ui:message key="Market Deployment" /></label>	
				<liferay-ui:input-date dayParam="marketDeploymentDay" monthParam="marketDeploymentMonth" yearParam="marketDeploymentYear"   name="marketDeployment" dayValue = "<%= todayDay %>"  monthValue = "<%= todayMonth %>" yearValue = "<%= todayYear %>"></liferay-ui:input-date>
			</aui:field-wrapper>	
			
			<aui:field-wrapper>	
				<label for="shipToTrade"><liferay-ui:message key="Ship to trade" /></label>	
				<liferay-ui:input-date dayParam="shipToTradeDay" monthParam="shipToTradeMonth" yearParam="shipToTradeYear"   name="shipToTrade" dayValue = "<%= todayDay %>"  monthValue = "<%= todayMonth %>" yearValue = "<%= todayYear %>"></liferay-ui:input-date>
			</aui:field-wrapper>
		</div>
				
		<div style= "clear:both"></div>	
		
		<div style = "padding-left: 20px" id = "searchTitle"></div>
			
		<div class="userSearchFields" style="float: left; padding-left: 20px; min-width: 300px;">
			<aui:field-wrapper required="true">			
						<aui:input name="marketingUser" value="${marketingUserIdString}"  id="marketingUser" label="Marketing User" readonly="readonly">
						</aui:input>
						<aui:input name="marketingUserId"  id="marketingUserId" type = "hidden"/>
			</aui:field-wrapper>
			<aui:field-wrapper required="true">
						<aui:input name="rndProductDevelopmentUser" value="${rndProductUserIdString}"  id="rndProductDevelopmentUser" label="R&D Product Development User" readonly="readonly">
						
						</aui:input>
						<aui:input name="rndProductDevelopmentUserId" id="rndProductDevelopmentUserId" type = "hidden"/>
			</aui:field-wrapper>
						<aui:field-wrapper required="true">
						<aui:input name="technicalProjectLeaderUser" value="${technicalProjectLeaderUserIdString}" id="technicalProjectLeaderUser" label="R&D Product Development User" readonly="readonly">
						
						</aui:input>
						<aui:input name="technicalProjectLeaderUserId" id="technicalProjectLeaderUserId" type = "hidden"/>
			</aui:field-wrapper>
		</div>
		
		<div class="userSearchFields" style="float: left; padding-left: 20px; min-width: 300px;">
			<aui:field-wrapper required="true">
						<aui:input name="rndUser" value="${rndUserIdString}" id="rndUser" label="R&D Deploy User" readonly="readonly">
						
						</aui:input>
						<aui:input name="rndUserId" id="rndUserId" type = "hidden"/>
			</aui:field-wrapper>
			<aui:field-wrapper required="true">
						<aui:input name="supplyChainUser" value="${supplyChainUserIdString}" id="supplyChainUser" label="Supply Chain User" readonly="readonly">
						
						</aui:input>
						<aui:input name="supplyChainUserId" id="supplyChainUserId" type = "hidden"/>
			</aui:field-wrapper>
						<aui:field-wrapper required="true">
						
						<aui:input name="customerDevelopmentUser" value="${customerDevelopmentUserIdString}" id="customerDevelopmentUser" label="Customer Development User" readonly="readonly">
						
						
						</aui:input>
						<aui:input name="customerDevelopmentUserId" id="customerDevelopmentUserId" type = "hidden"/>
			</aui:field-wrapper>
			
		</div>
		
		<div style= "clear:both"></div>			

<% SearchContainer userSearchContainer = new UserSearch(renderRequest, renderResponse.createRenderURL()); %>

	<div style="float: left; padding-left: 10px;" id="userSearch">
		<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
			<aui:nav cssClass="navbar-nav">
				<aui:nav-item label="users" selected="<%= true %>" />
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
			searchContainerId="users"
		>
			<liferay-frontend:management-bar-buttons>
				<liferay-frontend:management-bar-display-buttons
				displayViews='<%= new String[] {"icon", "descriptive", "list"} %>'
				portletURL="<%= myPortletUrl %>"
				selectedDisplayStyle="list"
				/>
			</liferay-frontend:management-bar-buttons>
	
			<liferay-frontend:management-bar-filters>
				<liferay-frontend:management-bar-navigation
					navigationKeys='<%= new String[] {"all"} %>'
					portletURL="<%= PortletURLUtil.clone(myPortletUrl, renderResponse) %>"
				/>
	
	
				<liferay-frontend:management-bar-sort
					orderByCol="<%= userSearchContainer.getOrderByCol() %>"
					orderByType="<%= userSearchContainer.getOrderByType() %>"
					orderColumns='<%= new String[] {"first-name", "last-name", "screen-name"} %>'
					portletURL="<%= myPortletUrl %>"
				/>
			</liferay-frontend:management-bar-filters>
		</liferay-frontend:management-bar>

<liferay-ui:search-container id="users" searchContainer="<%= userSearchContainer %>">

		  	<%  LinkedHashMap<String, Object> userParams = new LinkedHashMap<String, Object>(); %>
		  
  
  <liferay-ui:user-search-container-results userParams="<%= userParams %>" />

  		<liferay-ui:search-container-row
   				className="com.liferay.portal.kernel.model.User"
   				escapedModel="<%= true %>"
   				keyProperty="userId"
   				modelVar="user2"
   				rowIdProperty="screenName" >
   
     		<liferay-ui:search-container-column-text>
      			<liferay-ui:user-portrait
       				cssClass="user-icon-lg"       
       				user="<%= user2 %>"
       			/>
     		</liferay-ui:search-container-column-text>

     		<liferay-ui:search-container-column-text
      			colspan="<%= 2 %>"
     		>
      		<h5><a data-id = "<%=user2.getUserId() %>" data-name = "<%=user2.getFullName() %> - <%=user2.getScreenName() %>" class = "userlinkmarketinguser" 
      		onclick="setField(this)"><%= user2.getFullName() %></a></h5>
      		

      		
     		</liferay-ui:search-container-column-text>
    
    
  		</liferay-ui:search-container-row>

  	<liferay-ui:search-iterator markupView="lexicon" />
 </liferay-ui:search-container>
 
 </div>
 
    
 	<div class = "btn btn-primary" id="<portlet:namespace />submitForm" >Save Project</div>
 	</aui:fieldset-group>
 	

</aui:form>
	<script>	
	
	
	$(document).ready(function() {
		
		//hides the search container on DOM ready
		
			$("#userSearch").hide();	
		
		//click event handlers on each of the user search fields
			
			$("#<portlet:namespace />marketingUser").on("click", function() {	
				$( document ).ready(function() {
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />marketingUser" );
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />marketingUser");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">Marketing User<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;	
				});
			});
			
			$("#<portlet:namespace />rndUser").on("click", function() {	
				$( document ).ready(function() {
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />rndUser" );	
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />rndUser");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">R&D Deploy User<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;	
				});
			});
			
			$("#<portlet:namespace />rndProductDevelopmentUser").on("click", function() {				
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />rndProductDevelopmentUser" );	
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />rndProductDevelopmentUser");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">R&D Product Development User<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;								
			});
			
			$("#<portlet:namespace />technicalProjectLeaderUser").on("click", function() {				
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />technicalProjectLeaderUser" );	
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />technicalProjectLeaderUser");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">Technical Project Leader User<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;								
			});
			
			$("#<portlet:namespace />supplyChainUser").on("click", function() {				
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />supplyChainUser" );	
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />supplyChainUser");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">Supply Chain User<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;								
			});
			
			$("#<portlet:namespace />customerDevelopmentUser").on("click", function() {				
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />customerDevelopmentUser" );	
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />customerDevelopmentUser");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">Customer Development User<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;								
			});
			
			// click handler to submit the main form
			
		    	$("#<portlet:namespace />submitForm").on("click", function() {	
				$("#<portlet:namespace />fm").attr('action', "<%= saveProjectActionURL %>");
				$("#<portlet:namespace />fm").submit();
			});
			
	});
	
	//function sets field values and hides the search container or not as the case may be
	
	function setField(link) {
		$( document ).ready(function() {
		var concatValue = "Id";
		var fieldToExecute = $(link).data("fieldexecute");
		var userName = $(link).data("name");
		var userId = $(link).data("id");
		//alert($(link).data("id"));
		//alert(fieldToExecute);
		//alert(fieldToExecute + concatValue);
		$('#' +  fieldToExecute).show();
		$('#' + fieldToExecute).val(userName);	
		$('#' + fieldToExecute + concatValue).val(userId);
		//$("#<portlet:namespace />clickedField").val("blank");
		$("#searchTitleString").remove();
		$("#userSearch").fadeOut("slow");
		$(".userSearchFields").fadeIn("slow");	
		});
	}

</script>
	

 	<script>
 	
 	// trick to go back to the last clicked field due to the render phase being unavoidable
 	
 	var clickedField = "<%= clickedField %>";
	if (clickedField != "undefined" || clickedField != "blank")
	{	
		
		$('#' +  clickedField).click();
		
	} 	
 	
 	</script>
		
