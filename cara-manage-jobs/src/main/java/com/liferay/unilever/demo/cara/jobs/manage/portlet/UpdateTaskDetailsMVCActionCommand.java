package com.liferay.unilever.demo.cara.jobs.manage.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails;
import com.liferay.unilever.demo.cara.taskdetails.service.TaskDetailsLocalService;
import com.liferay.unilever.demo.cara.tasks.model.Tasks;
import com.liferay.unilever.demo.cara.tasks.service.TasksLocalService;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=com_liferay_cara_join",
				"mvc.command.name=/create/updateTaskDetails"
	},
		service = MVCActionCommand.class)
public class UpdateTaskDetailsMVCActionCommand implements MVCActionCommand {
	
	@Reference(unbind = "-")
	 protected void setTaskDetailsLocalService(TaskDetailsLocalService taskDetailsLocalService) {
		_taskDetailsLocalService = taskDetailsLocalService;
	 }
	private TaskDetailsLocalService _taskDetailsLocalService;
	
	@Reference(unbind = "-")
	 protected void setTasksLocalService(TasksLocalService tasksLocalService) {
		_tasksLocalService = tasksLocalService;
	 }
	private TasksLocalService _tasksLocalService;

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
		String stringTaskDetailsId = actionRequest.getParameter("taskDetailsId");
		System.out.println("Task Details ID in controller is" + stringTaskDetailsId);
		long taskDetailsId = Long.valueOf(stringTaskDetailsId);
		
		TaskDetails taskDetails = _taskDetailsLocalService.fetchTaskDetails(taskDetailsId);
		String comments = actionRequest.getParameter("comments");
		taskDetails.setComments(comments);
		taskDetails.setApprovedBy(userId);
		String stringApproved = actionRequest.getParameter("approved");
		Boolean approved = true;
		if (stringApproved == "No")
		{
			approved = false;
		}
		taskDetails.setApproved(approved);
		long tasksId = taskDetails.getTaskId();
		
		Tasks tasks = _tasksLocalService.fetchTasks(tasksId);
		if (approved == true)
		{
			tasks.setTaskStatus(100);
			
		}
		else
		{
			tasks.setTaskStatus(0);
		}
		
		_tasksLocalService.updateTasks(tasks);
		_taskDetailsLocalService.updateTaskDetails(taskDetails);
		
		return false;	
		
				
	}

}

