package com.liferay.unilever.demo.cara.create.jobs.portlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

@Component(
		immediate = true,
		property = {
			"mvc.command.name=/create/createjobs",
			"javax.portlet.name=com_liferay_cara_create_jobs"
	},
		service = MVCRenderCommand.class)


public class CreateJobsMVCRenderCommand implements MVCRenderCommand  {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		
		Date today = new Date();
		
		int todayDay = today.getDate();
		int todayMonth = today.getMonth();
		int todayYear = today.getYear() + 1900;
		
		renderRequest.setAttribute("todayDay", todayDay);
		renderRequest.setAttribute("todayMonth", todayMonth);
		renderRequest.setAttribute("todayYear", todayYear);	
		
		List jobTypes = new ArrayList();
		jobTypes.add("Adapt Existing");
		jobTypes.add("Create New");
		
		renderRequest.setAttribute("jobTypes", jobTypes);
		
		
		return "/work/createjobs.jsp";
	}

}
