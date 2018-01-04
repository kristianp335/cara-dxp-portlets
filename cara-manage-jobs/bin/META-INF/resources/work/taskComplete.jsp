<%@ include file="/init.jsp" %>
<%
String downloadURL = (String) renderRequest.getAttribute("downloadURL");
String productDetails = (String) renderRequest.getAttribute("productDetails");
String whyUse = (String) renderRequest.getAttribute("whyUse");
String howToUse = (String) renderRequest.getAttribute("howToUse");
String howItWorks = (String) renderRequest.getAttribute("howItWorks");
String expertTips = (String) renderRequest.getAttribute("expertTips");
long taskDetailsId = (long) renderRequest.getAttribute("taskDetailsId");

System.out.println("task details ID in JSP is " + taskDetailsId);

%>
<portlet:actionURL var="updateTaskDetails"
	name="/create/updateTaskDetails">	
</portlet:actionURL>

<H2>Confirm and accept the content of the task</H2>
<a class="btn btn-success" style="margin-bottom:10px;"" target="blank" href="${downloadURL}">View design file</a>
<br/>
<div class="panel panel-default">
			<div class="panel-heading">Product Details</div>
			<div class="panel-body">${productDetails}</div>
</div>
<div class="panel panel-default">
			<div class="panel-heading">Why use the product?</div>
			<div class="panel-body">${whyUse}</div>
</div>
<div class="panel panel-default">
			<div class="panel-heading">How to use the product?</div>
			<div class="panel-body">${howToUse}</div>
</div>
<div class="panel panel-default">
			<div class="panel-heading">How does the product work?</div>
			<div class="panel-body">${howItWorks}</div>
</div>
<div class="panel panel-default">
			<div class="panel-heading">Expert Tips</div>
			<div class="panel-body">${expertTips}</div>
</div>

<aui:form action="${updateTaskDetails}" name="fm" method="post">
					
<aui:fieldset-group markupView="lexicon">					
	<aui:field-wrapper required="true">
		<div style="margin: 10px; padding-top: 10px; padding-bottom: 10px;">	
			<aui:input style="max-width: 400px;" type="textarea" required="true" helpMessage="Write any comments you wish to make." id="comments" label="Comments" name="comments"></aui:input>
			<br/>
			<aui:input readonly="true" name="taskDetailsId" value = "${taskDetailsId}"/>	
			<br/>
			<div><p>Accept changes</p>
				<aui:input type = "radio" name = "approved" label="Yes" value = "Yes"/>
				<aui:input type = "radio" name = "approved" label="No" value = "No"/>
			</div>
			<br/>
			<div id="formSubmit" class="btn btn-primary" style="margin-bottom: 10px;">Submit</div>
		</div>			
	</aui:field-wrapper>
</aui:fieldset-group>
</aui:form>

<script>
	$("#formSubmit").on("click", function() {	
		$("#<portlet:namespace />fm").submit();
	});
</script>