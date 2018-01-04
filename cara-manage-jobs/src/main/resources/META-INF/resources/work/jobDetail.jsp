<%@ include file="/init.jsp" %>

<% 
PortletURL myPortletUrl = renderResponse.createRenderURL();
String logoUrl = (String) renderRequest.getAttribute("logoUrl");
String logoUrl2 = (String) renderRequest.getAttribute("logoUrl2");
String logoUrl3 = (String) renderRequest.getAttribute("logoUrl3");
String projectName = (String) renderRequest.getAttribute("projectName");
String brand = (String) renderRequest.getAttribute("brand");
String projectType = (String) renderRequest.getAttribute("projectType");
String projectCategory = (String) renderRequest.getAttribute("projectCategory");
String taskName = (String) renderRequest.getAttribute("taskName");
String productDetails = (String) renderRequest.getAttribute("productDetails");
String whyUse = (String) renderRequest.getAttribute("whyUse");
String howToUse = (String) renderRequest.getAttribute("howToUse");
String howItWorks = (String) renderRequest.getAttribute("howItWorks");
String expertTips = (String) renderRequest.getAttribute("expertTips");
String varriant = (String) renderRequest.getAttribute("variant");
String format = (String) renderRequest.getAttribute("format");
long taskId = (long) renderRequest.getAttribute("taskId");
long jobId = (long) renderRequest.getAttribute("jobId");
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
Date completeDate = (Date) renderRequest.getAttribute("completeDate");
%>

<portlet:actionURL var="saveTask"
	name="/create/saveTask">	
</portlet:actionURL>

<h2>Task Details</h2>
<!-- task area -->
<div style="max-width: 600px; min-width: 600px; margin: auto; float: left;">
		<div style="max-width: 300px; min-width: 230px; margin: auto; float: left;">
			<img alt="..." class="img-thumbnail img-responsive" style="max-width: 200px;" src="${logoUrl}">
		</div>
		<div style="max-width: 400px; min-width: 300px; margin: auto; float: left;">
			<div class="panel panel-primary">
						<div class="panel-heading">Task details</div>
						<div class="panel-body">
							<b>Project name: </b>${projectName}<br/>
							<b>Brand: </b>${brand}<br/>
							<b>Category: </b>${projectCategory}<br/>
							<b>Project Type: </b>${projectType}<br/>
							<b>Task name: </b>${taskName}<br/>
							<b>Date: </b><%= dateFormat.format(completeDate).toString() %><br/>
							<b>Variant: </b>${variant}<br/>
							<b>Format: </b>${format}<br/>
						</div>
						<div class="panel-footer"><i></i>(for reference purposes)</i></div>
			</div>
		</div>
		<div style="clear:both"></div>
		<div style="max-width: 400px"></div>
		<aui:form action="${saveTask}" name="fm" method="post" enctype="multipart/form-data">
			<input type = "hidden" name="projectName" value = "${projectName}"/>
			<input type = "hidden" name="taskId" value = "${taskId}"/>
			<input type = "hidden" name="jobId" value = "${jobId}"/>
		<aui:fieldset-group markupView="lexicon">
			<br/>
			<div id = "styleDiv" style="margin-left: 10px; margin-right:10px;" >
				
				<aui:field-wrapper required="true">
					
					<aui:input  type="file" name="redesign" required="true" label="Redesign image"></aui:input>
					
				</aui:field-wrapper>
				
				<aui:field-wrapper required="true">
					
					<aui:input type="textarea" required="true" helpMessage="You can use the text on the right to prepopulate" id="productDetails" label="Product Details" name="productDetails"></aui:input>
					
				</aui:field-wrapper>
				<aui:field-wrapper required="true">
					
					<aui:input type="textarea" required="true" helpMessage="You can use the text on the right to prepopulate" id="whyUse" label="Why use the product?" name="whyUse"></aui:input>
					
				</aui:field-wrapper>
				
				<aui:field-wrapper required="true">
					
					<aui:input type="textarea" required="true" helpMessage="You can use the text on the right to prepopulate" id="howItWorks" label="How does it work" name="howItWorks"></aui:input>
					
				</aui:field-wrapper>
				<aui:field-wrapper required="true">
					
					<aui:input type="textarea" required="true" helpMessage="You can use the text on the right to prepopulate" id="expertTips" label="Expert tips" name="expertTips"></aui:input>
					
				</aui:field-wrapper>
				<aui:field-wrapper required="true">
					
					<aui:input type="textarea" required="true" helpMessage="You can use the text on the right to prepopulate" id="howToUse" label="How to use the product?" name="howToUse"></aui:input>
					
				</aui:field-wrapper>
				
				<br/>
				<div id="formSubmit" class="btn btn-primary" style="margin-bottom: 10px;">Upload design</div>
			</div>
		</aui:fieldset-group>
		</aui:form>
		<div style="clear:both;"></div>
</div>
<div style="max-width: 600px; min-width: 600px; margin: auto; float: left;">
<liferay-ui:tabs names="Logo,Design,Marketing,Usage" refresh="false">
	<liferay-ui:section>
		<img alt="Bottle" class="img-thumbnail img-responsive" style="max-width: 300px;" src="${logoUrl3}">
	</liferay-ui:section>
	<liferay-ui:section>
		<img alt="Bottle" class="img-thumbnail img-responsive" style="max-width: 250px; margin-bottom: 10px; margin-right:10px;" src="${logoUrl}">
		<img alt="Bottle" class="img-thumbnail img-responsive" style="max-width: 250px;" src="${logoUrl2}">
	</liferay-ui:section>
	
	<liferay-ui:section>
	<div aria-multiselectable="true" class="panel-group" id="accordion" role="tablist">
			<div class="panel panel-default">
				<div class="panel-heading" id="headingOne" role="tab">
					<div class="panel-title">
						<a aria-controls="collapseOne" aria-expanded="true" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" role="button" class="collapsed">
							Product Details
						</a>
					</div>
				</div>
				<div aria-labelledby="headingOne" class="panel-collapse collapse" id="collapseOne" role="tabpanel" aria-expanded="" style="height: 0px;">
					<div class="panel-body">
						<span id="textProductDetails">${productDetails}<span>&nbsp;<span class="icon-copy" id="copyProductDetails"></span>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading" id="headingTwo" role="tab">
					<div class="panel-title">
						<a aria-controls="collapseTwo" aria-expanded="false" class="collapsed" data-parent="#accordion" data-toggle="collapse" href="#collapseTwo" role="button">
							Why use the product?
						</a>
					</div>
				</div>
				<div aria-labelledby="headingTwo" class="panel-collapse collapse" id="collapseTwo" role="tabpanel" aria-expanded="false" style="height: 0px;">
					<div class="panel-body">
						<span id="textWhyUse">${whyUse}</span>&nbsp;<span class="icon-copy" id="copyWhyUse"></span>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading" id="headingThree" role="tab">
					<div class="panel-title">
						<a aria-controls="collapseThree" aria-expanded="true" class="" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" role="button">
							How does the product work?
						</a>
					</div>
				</div>
				<div aria-labelledby="headingThree" class="panel-collapse collapse in" id="collapseThree" role="tabpanel" aria-expanded="true" style="">
					<div class="panel-body">
						<span id="textHowItWorks">${howItWorks}</span>&nbsp;<span class="icon-copy" id="copyHowItWorks"></span>
					</div>
				</div>
			</div>
		</div>
	
	</liferay-ui:section>
		
	<liferay-ui:section>
	<div class="panel panel-default">
			<div class="panel-heading">How to use the product?</div>
			<div class="panel-body"><span id="textHowToUse">${howToUse }</span>&nbsp;<span class="icon-copy" id="copyHowToUse"></span></div>
	</div>
	<div class="panel panel-default">
			<div class="panel-heading">Expert tips</div>
			<div class="panel-body"><span id="textExpertTips">${expertTips}</span>&nbsp;<span class="icon-copy" id="copyExpertTips"></div>
	</div>
	</liferay-ui:section>
</liferay-ui:tabs>
</div>
<script>
	$("#formSubmit").on("click", function() {		
		$("#<portlet:namespace />fm").submit();
	});
	
	$("#copyProductDetails").on("click", function() {	
		var textValue = $("#textProductDetails").text();
		$("#<portlet:namespace />productDetails").val(textValue);
	});
	
	$("#copyWhyUse").on("click", function() {	
		var textValue = $("#textWhyUse").text();
		$("#<portlet:namespace />whyUse").val(textValue);
	});
	
	$("#copyHowItWorks").on("click", function() {	
		var textValue = $("#textHowItWorks").text();
		$("#<portlet:namespace />howItWorks").val(textValue);
	});
	
	$("#copyHowToUse").on("click", function() {	
		var textValue = $("#textHowToUse").text();
		$("#<portlet:namespace />howToUse").val(textValue);
	});
	
	$("#copyExpertTips").on("click", function() {	
		var textValue = $("#textExpertTips").text();
		$("#<portlet:namespace />expertTips").val(textValue);
	});
</script>