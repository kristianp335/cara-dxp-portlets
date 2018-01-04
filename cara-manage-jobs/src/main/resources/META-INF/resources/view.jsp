<%@ include file="/init.jsp" %>
<% 
List joinList = (List) renderRequest.getAttribute("join"); 
PortletURL myPortletUrl = renderResponse.createRenderURL();
int joinCount = (int) renderRequest.getAttribute("joinCount"); 
String authtoken = (String) renderRequest.getAttribute("authtoken");
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
%>

<portlet:renderURL var="jobDetail">
				<portlet:param name="mvcRenderCommandName" value="/manage/jobDetail" />
</portlet:renderURL>

<portlet:renderURL var="taskComplete">
				<portlet:param name="mvcRenderCommandName" value="/manage/taskComplete" />
</portlet:renderURL>


<liferay-ui:search-container delta="10"
		 curParam="cur1"
		 deltaConfigurable="false"
		 iteratorURL="<%= myPortletUrl %>"
		 total="<%= joinCount %>"
		 id="joins" 
		 emptyResultsMessage="Sorry there are no projects are available">
		
			<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
					
					<aui:nav cssClass="navbar-nav">
						<aui:nav-item label="Jobs and Tasks" selected="<%= true %>" />
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
					searchContainerId="joins"
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
				results="<%= joinList %>"
				
			/>
		
			<liferay-ui:search-container-row	
				className="com.liferay.unilever.demo.cara.join.model.Join"
				keyProperty="jobId"
				modelVar="join"
			>
				<portlet:renderURL var="doTask">
									<portlet:param name="mvcRenderCommandName" value="/create/createjobs" />
										<portlet:param name="projectBrand" value="${join.getBrand()}" />
				</portlet:renderURL>
				
				<portlet:resourceURL id="/jobs/breakdown" var="jobsBreakdown">
					<portlet:param name="jobId" value="${join.getJobId()}"/>
				</portlet:resourceURL>
				
				<liferay-ui:search-container-column-text>
					<a><span id = "${join.getJobId()}"  data-jobid = "${jobsBreakdown}" class="icon-collapse"></span></a>
				</liferay-ui:search-container-column-text>
			
				<liferay-ui:search-container-column-text
					name="Project"
					value="<%= join.getProjectName() %>"
				/>
				
				<liferay-ui:search-container-column-text
					name="Job Id"
					value="<%= String.valueOf(join.getJobId()) %>"
				/>

				<liferay-ui:search-container-column-text
					name="Brand"
					value="<%= join.getBrand() %>"
				/>
				
				<liferay-ui:search-container-column-text
					name="Type"
					value="<%= join.getProjectType() %>"
				/>								
				<liferay-ui:search-container-column-text
					name="Category"
					value="<%= join.getProjectCategory() %>"
				/>
				<liferay-ui:search-container-column-text
					name="Completion Date"
					value="<%= dateFormat.format(join.getShipToTrade()).toString() %>"
				/>
				<liferay-ui:search-container-column-text
					name="Project Owner"
					value="<%= UserLocalServiceUtil.getUser(join.getUserId()).getFullName() %>"
				/>
				<liferay-ui:search-container-column-text
					name="Job Lead"
					value="<%= UserLocalServiceUtil.getUser(join.getPmaUser()).getFullName() %>"
				/>
							
				</liferay-ui:search-container-row>		
				<liferay-ui:search-iterator markupView="lexicon"  />
</liferay-ui:search-container>

<script>
$(".icon-collapse").on("click", function() {				
	var jobId = $(this).data("jobid");
	var jobIdSelector = $(this).attr("id");
	
	
	$.ajax(
			 {url: jobId, 		 
		 	success: function(result){
		 		var obj = JSON.parse(result);
		 		console.log(obj);
		 		console.log(obj[0].companyId);
		 		var state = "";
		 		var percentComplete = obj[0].taskStatus;
		 		if(obj[0].taskStatus != "100") {
		 			state = "Draft";
		 			
		 		}
		 		else
		 		{
		 			state = "Final";
		 		}
		 		
		 		var userNameRest = "";
		 		var taskIdParam = "&<portlet:namespace />taskId=" + obj[0].taskId;
		 		var completeTask = "";
		 		if (percentComplete == 75)
		 		{
		 			completeTask = "<a href='${taskComplete}" + taskIdParam + "'><span class='icon-thumbs-up'></span></a>";
		 		}
		 		else if (percentComplete == 100)
		 			
		 		{
		 			
		 			completeTask = "<span class='icon-ok'></span>";
		 		}
		 		
		 		else
		 		{
		 			completeTask = "";
		 		}
		 		var completeDate = new Date(obj[0].completeDate);
		 		
		 		var today = new Date();		 		
		 		var timeDiff = completeDate.getTime() - today.getTime();
		 		var diffDays = Math.round(timeDiff / (1000 * 3600 * 24)); 
		 		var completeDateFormated = completeDate.getDate() + "/" + (completeDate.getMonth() + 1) + "/" + completeDate.getFullYear();
		 		console.log(completeDate);
		 		warningDiv = "";
		 		if (percentComplete == 100)		 		
		 		{		 			
		 			warningDiv = "<div style='text-align: center; padding: 4px; margin: auto; width: 80px' class='alert alert-success'>Complete</div>"		 			
		 		}
		 		else if (diffDays > 0 && diffDays <= 5)
		 		{
		 			warningDiv = "<div style='text-align: center; padding: 4px; margin: auto; width: 80px' class='alert alert-warning'>Amber</div>"
		 		}
		 		else if (diffDays > 5 )
		 		{
		 			warningDiv = "<div style='text-align: center; padding: 4px; margin: auto; width: 80px' class='alert alert-success'>Safe</div>"
		 		}
		 		else 		 		
		 		{		 			
		 			warningDiv = "<div style='text-align: center; padding: 4px; margin: auto; width: 80px' class='alert alert-danger'>Warning</div>"		 			
		 		}
		 		
		 		table = "<tr><td colspan = '10'><table class = 'table table-autofit table-heading-nowrap table-list'><tr class='active'><td><span class='icon-collapse-top'></span></td><td>" + obj[0].taskname + 
		 		"</td><td>Design</td><td id='User" + jobIdSelector + "'></td><td><div id='SkypeButton_Call" + jobId + "'></div></td><td>" + state + "</td><td>" + completeDateFormated + "<td>" + percentComplete + "%</td></td><td>" + diffDays + " (day/s)</td><td>" + warningDiv + "</td><td><a href = '${jobDetail}" + taskIdParam + "'><span class='icon-edit-sign'></span></td></a><td>" + completeTask + "</td></tr></table></td></tr>";
		 		$("#"+ jobIdSelector).closest("tr").after(table);
		 		
		 		$.ajax(
		 				 {url: "http://localhost:8080/api/jsonws/user/get-user-by-id/user-id/" + obj[0].userAssigned + "?p_auth=${authtoken}" , 		 
		 			 	success: function(data){
		 			 		
		 			 		userName = data.firstName + " " + data.lastName;
		 			  		$("#User" + jobIdSelector).html(userName);
		 			 		
		 			 		
		 			 	}
		 			 		
		 		});	
		 				 				 		
		 		$(".icon-collapse-top").on("click", function() {
		 			$(this).closest("table").closest("tr").remove();
		 		});
		 		Skype.ui({
		 			 "name": "dropdown",
		 			 "element": "SkypeButton_Call" + jobId,
		 			 "participants": ["kris_gpsoft"],
		 			 "imageSize": 24
		 		});
	 			}	
			 
	 });
	
});

</script>

<script type="text/javascript" src="https://secure.skypeassets.com/i/scom/js/skype-uri.js">
</script>

<script type="text/javascript">
	
</script>



