package com.liferay.unilever.demo.cara.jobs.manage.portlet;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails;
import com.liferay.unilever.demo.cara.taskdetails.service.TaskDetailsLocalService;

@Component(
		immediate = true,
		property = {
			"mvc.command.name=/manage/taskComplete",
			"javax.portlet.name=com_liferay_cara_join"
	},
		service = MVCRenderCommand.class)


public class TaskCompleteMVCRenderCommand implements MVCRenderCommand {
	
	@Reference(unbind = "-")
	 protected void setTaskDetailsLocalService(TaskDetailsLocalService taskDetailsLocalService) {
		_taskDetailsLocalService = taskDetailsLocalService;
	 }
	private TaskDetailsLocalService _taskDetailsLocalService;	

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		String thisTaskId = renderRequest.getParameter("taskId");
		long taskId = Long.valueOf(thisTaskId);
		DynamicQuery dynamicQuery = _taskDetailsLocalService.dynamicQuery();
		dynamicQuery.add(PropertyFactoryUtil.forName("taskId").eq(taskId));
		List<TaskDetails> taskDetail = _taskDetailsLocalService.dynamicQuery(dynamicQuery);
		TaskDetails thisTaskDetail = taskDetail.get(0);
		renderRequest.setAttribute("downloadURL", thisTaskDetail.getFileUrl());
		renderRequest.setAttribute("productDetails", thisTaskDetail.getProductDetails());
		renderRequest.setAttribute("whyUse", thisTaskDetail.getWhyUse());
		renderRequest.setAttribute("howToUse", thisTaskDetail.getHowToUse());
		renderRequest.setAttribute("howItWorks", thisTaskDetail.getHowItWorks());
		renderRequest.setAttribute("expertTips", thisTaskDetail.getExpertTips());	
		renderRequest.setAttribute("taskDetailsId", thisTaskDetail.getTaskDetailsId());	
		
		return "/work/taskComplete.jsp";
	}

}

