<%@ include file="../init.jsp" %>

<%@ include file="../init.jsp" %>

<% PortletURL redirectUrl =  renderResponse.createRenderURL(); 

%>

<portlet:actionURL var="saveJob"
	name="/create/savejobs">	
</portlet:actionURL>

<%

Integer todayDay = (Integer) renderRequest.getAttribute("todayDay");
Integer todayMonth = (Integer) renderRequest.getAttribute("todayMonth");
Integer todayYear = (Integer) renderRequest.getAttribute("todayYear");
List jobTypes = (List) renderRequest.getAttribute("jobTypes"); 

PortletURL myPortletUrl = renderResponse.createRenderURL();
myPortletUrl.setParameter("mvcPath", "/save/createjobs.jsp");

String clickedField = renderRequest.getParameter("clickedField");
String projectId = renderRequest.getParameter("projectId");


%>


<H4>Create job</H4>
<br/>
<aui:form name="fm" id="fm" action="">		
	<aui:fieldset-group markupView="lexicon">
		<div style="float: left; padding-left: 20px; min-width: 250px;">
			<aui:select id="jobType" name="jobType" label="Job Type">
					<c:forEach var="jobType" items="${jobTypes}">
						<aui:option value="${jobType}">${jobType}</aui:option>		
					</c:forEach>					
			</aui:select>
			<aui:field-wrapper required="true">
						<aui:input name="format" label="Format">
						<aui:validator name="required" />
						</aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper required="true">
						<aui:input name="variant" label="Variant">
						<aui:validator name="required" />
						</aui:input>
			</aui:field-wrapper>
			<p>Will you be creating a change</br>
			 to Visual Design for CU?</p>
				<aui:input type = "radio" name = "visualDesignCu" label="Yes" value = "Yes"/>
				<aui:input type = "radio" name = "visualDesignCu" label="No" value = "No"/>
			<p>Noticable to consumers?</p>
				<aui:input type = "radio" name = "noticableConsumers" label="Yes" value = "Yes"/>
				<aui:input type = "radio" name = "noticableConsumers" label="No" value = "No"/>
		</div>	
		<div style="float: left; padding-left: 20px; min-width: 250px;">
			<aui:field-wrapper required="true">
						<aui:input name="projectId" value="<%=projectId %>" label="Project ID" readonly = "true"></aui:input>
			</aui:field-wrapper>
			<aui:field-wrapper required="true">
						<aui:input name="size" label="Size"><aui:validator name="required" /></aui:input>
			</aui:field-wrapper>
			<p>Will you be creating a change</br>
			 to Visual Design?</p>
				<aui:input type = "radio" name = "visualDesign" label="Yes" value = "Yes"/>
				<aui:input type = "radio" name = "visualDesign" label="No" value = "No"/>
			<p>Change to packaging?</p>
				<aui:input type = "radio" name = "changePackaging" label="Yes" value = "Yes"/>
				<aui:input type = "radio" name = "changePackaging" label="No" value = "No"/>
			<p>Change to formulation?</p>
				<aui:input type = "radio" name = "changeFormulation" label="Yes" value = "Yes"/>
				<aui:input type = "radio" name = "changeFormulation" label="No" value = "No"/>				
		</div>
		
		
<div style= "clear:both" ></div>	
		
		<div style="float: left; padding-left: 20px; min-width: 250px;">			
			<aui:field-wrapper>					
				<label for="visualDesignComplete"><liferay-ui:message key="Visual Design Complete" /></label>	
				<liferay-ui:input-date  dayParam="visualDesignCompleteDay" monthParam="visualDesignCompleteMonth" yearParam="visualDesignCompleteYear" dayValue = "<%= todayDay %>"  monthValue = "<%= todayMonth %>" yearValue = "<%= todayYear %>" name="visualDesignComplete">
				</liferay-ui:input-date>				
			</aui:field-wrapper>			
			
			<aui:field-wrapper>	
				<label for="artworkApproved"><liferay-ui:message key="Artwork approved" /></label>	
				<liferay-ui:input-date dayParam="artworkApprovedDay" monthParam="artworkApprovedMonth" yearParam="artworkApprovedYear"  name="artworkApproved" dayValue = "<%= todayDay %>"  monthValue = "<%= todayMonth %>" yearValue = "<%= todayYear %>"></liferay-ui:input-date>
			</aui:field-wrapper>
			
			<aui:field-wrapper>	
				<label for="separationFilesToPrinter"><liferay-ui:message key="Separation files to printer" /></label>	
				<liferay-ui:input-date dayParam="separationFilesToPrinterDay" monthParam="separationFilesToPrinterMonth" yearParam="separationFilesToPrinterYear"   name="separationFilesToPrinter" dayValue = "<%= todayDay %>"  monthValue = "<%= todayMonth %>" yearValue = "<%= todayYear %>"></liferay-ui:input-date>
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
			
		<div class="userSearchFields" style="float: left; padding-left: 20px; min-width: 250px;">
			<aui:field-wrapper required="true">			
						<aui:input name="designAgency" id="designAgency" label="Design Agency" readonly="readonly">
						</aui:input>				
			</aui:field-wrapper>
			<aui:field-wrapper required="true">
						<aui:input name="pmaUser" id="pmaUser" label="PMA / Artwork Reviewer" readonly="readonly">
						</aui:input>
			</aui:field-wrapper>
		</div>
		<div class="userSearchFields" style="float: left; padding-left: 20px; min-width: 250px;">
			<aui:field-wrapper required="true">
						<aui:input name="localMarketing" id="localMarketing" label="Local Marketing" readonly="readonly">
						</aui:input>						
			</aui:field-wrapper>
			<aui:field-wrapper required="true">
						<aui:input name="rndLocalDeployUser" id="rndLocalDeployUser" label="R&D Local Deploy User" readonly="readonly">
						</aui:input>						
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
 
    
 	<div class = "btn btn-primary" id="<portlet:namespace />submitForm" >Create job</div>
 	</aui:fieldset-group>
 	
 	

</aui:form>
	<script>	
	
	
	$(document).ready(function() {
		
		//hides the search container on DOM ready
		
			$("#userSearch").hide();	
		
		//click event handlers on each of the user search fields
			
			$("#<portlet:namespace />designAgency").on("click", function() {	
				$( document ).ready(function() {
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />designAgency" );
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />designAgency");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">Design Agency<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;	
				});
			});
			
			$("#<portlet:namespace />pmaUser").on("click", function() {	
				$( document ).ready(function() {
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />pmaUser" );	
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />pmaUser");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">PMA / Artwork Reviewer<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;	
				});
			});
			
			$("#<portlet:namespace />localMarketing").on("click", function() {				
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />localMarketing" );	
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />localMarketing");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">Local Marketing User<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;								
			});
			
			$("#<portlet:namespace />rndLocalDeployUser").on("click", function() {				
				$("#userSearch").fadeIn("slow");				
				$(".userlinkmarketinguser").data("fieldexecute", "<portlet:namespace />rndLocalDeployUser" );	
				$("#<portlet:namespace />clickedField").val("<portlet:namespace />rndLocalDeployUser");
				$(".userSearchFields").hide();
				$("#searchTitle").append('<h4 id = "searchTitleString">R&D Local Deploy User<H4>');
				$("#userSearch").scrollBottom = $("#userSearch").scrollHeight;								
			});
						
			// click handler to submit the main form
			
		    	$("#<portlet:namespace />submitForm").on("click", function() {	
				$("#<portlet:namespace />fm").attr('action', "<%= saveJob %>");
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
		
