package com.liferay.unilever.demo.cara.jobs.manage.portlet;

import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.unilever.demo.cara.join.model.Join;
import com.liferay.unilever.demo.cara.join.service.JoinLocalService;
import com.liferay.unilever.demo.cara.tasks.model.Tasks;
import com.liferay.unilever.demo.cara.tasks.service.TasksLocalService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

import cara.jobs.service.JobsLocalService;

@Component(
		immediate = true,
		property = {
			"mvc.command.name=/manage/jobDetail",
			"javax.portlet.name=com_liferay_cara_join"
	},
		service = MVCRenderCommand.class)


public class JobDetailMVCRenderCommand implements MVCRenderCommand {
	
	@Reference(unbind = "-")
	 protected void setJoinLocalService(JoinLocalService joinLocalService) {
		_joinLocalService = joinLocalService;
	 }
	private JoinLocalService _joinLocalService;
	
	@Reference(unbind = "-")
	 protected void setJobsLocalService(JobsLocalService jobsLocalService) {
		_jobsLocalService = jobsLocalService;
	 }
	private JobsLocalService _jobsLocalService;
	
	@Reference(unbind = "-")
	 protected void setTasksLocalService(TasksLocalService tasksLocalService) {
		_tasksLocalService = tasksLocalService;
	 }
	private TasksLocalService _tasksLocalService;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		String thisTaskId = renderRequest.getParameter("taskId");
		long taskId = Long.valueOf(thisTaskId);
		try {
			//get Join data and Tasks data
			Tasks tasks = _tasksLocalService.getTasks(taskId);
			long jobId = tasks.getJobId();
			renderRequest.setAttribute("jobId", jobId );
			renderRequest.setAttribute("taskId", taskId);
			Date completeDate = tasks.getCompleteDate();
			renderRequest.setAttribute("completeDate", completeDate );
			
			
			Join join = _joinLocalService.getJoin(jobId);
			String brand = join.getBrand();
			renderRequest.setAttribute("brand", brand );
			String projectName = join.getProjectName();
			renderRequest.setAttribute("projectName", projectName );
			String projectType = join.getProjectType();
			renderRequest.setAttribute("projectType", projectType );
			String projectCategory = join.getProjectCategory();
			renderRequest.setAttribute("projectCategory", projectCategory );
			String taskName = tasks.getTaskname();
			renderRequest.setAttribute("taskName", taskName );
			String variant = join.getVariant();
			renderRequest.setAttribute("variant", variant );
			String format = join.getFormat();
			renderRequest.setAttribute("format", format );
			
			
			//get Task data
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// call REST service		
		Client client = Client.create();
		    WebResource webResource = client.resource("https://mocksvc.mulesoft.com/mocks/bbdaeb91-1fe7-4286-8b01-03d324f7976e/products");
		    ClientResponse response = webResource.header("Content-Type", "application/json").get(ClientResponse.class);   
			//parse JSON Array of objects to Java collections List of objects
		    JSONParser parser = new JSONParser();
		    try {
		    	//in reality you need some for or while loops here
				JSONArray jsonArray = (JSONArray) parser.parse(response.getEntity(String.class));
				JSONObject product = (JSONObject) jsonArray.get(0);
				renderRequest.setAttribute("product", product.toString());
				
				//get the images and send them to the view
				JSONArray imageArray = (JSONArray) product.get("images");
				JSONObject imageObject = (JSONObject) imageArray.get(0);
				String logoUrl = imageObject.get("_imageUrl").toString();
				renderRequest.setAttribute("logoUrl", logoUrl);
				
				JSONObject imageObject2 = (JSONObject) imageArray.get(1);
				String logoUrl2 = imageObject2.get("_imageUrl").toString();
				renderRequest.setAttribute("logoUrl2", logoUrl2);
				
				JSONObject imageObject3 = (JSONObject) imageArray.get(2);
				String logoUrl3 = imageObject3.get("_imageUrl").toString();
				renderRequest.setAttribute("logoUrl3", logoUrl3);
				
				//get marketing text and send to view
				JSONArray marketingArray = (JSONArray) product.get("marketingText");
				JSONObject marketingObject = (JSONObject) marketingArray.get(0);
				String productDetails = marketingObject.get("productDetails").toString();
				renderRequest.setAttribute("productDetails", productDetails);
				String whyUse = marketingObject.get("whyUse").toString();
				renderRequest.setAttribute("whyUse", whyUse);
				String howToUse = marketingObject.get("howToUse").toString();
				renderRequest.setAttribute("howToUse", howToUse);
				String howItWorks = marketingObject.get("howItWorks").toString();
				renderRequest.setAttribute("howItWorks", howItWorks);
				String expertTips = marketingObject.get("expertTips").toString();
				renderRequest.setAttribute("expertTips", expertTips);
				
				
				
			} catch (ClientHandlerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UniformInterfaceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		return "/work/jobDetail.jsp";
	}

}
