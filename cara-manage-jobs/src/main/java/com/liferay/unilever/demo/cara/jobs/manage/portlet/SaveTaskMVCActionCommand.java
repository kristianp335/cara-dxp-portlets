package com.liferay.unilever.demo.cara.jobs.manage.portlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.util.DLUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.unilever.demo.cara.taskdetails.model.TaskDetails;
import com.liferay.unilever.demo.cara.taskdetails.service.TaskDetailsLocalService;
import com.liferay.unilever.demo.cara.tasks.model.Tasks;
import com.liferay.unilever.demo.cara.tasks.service.TasksLocalService;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=com_liferay_cara_join",
				"mvc.command.name=/create/saveTask"
	},
		service = MVCActionCommand.class)
public class SaveTaskMVCActionCommand implements MVCActionCommand {
	
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
		ThemeDisplay themeDisplay= (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId= themeDisplay.getSiteGroupId();
		long companyId = themeDisplay.getCompanyId();
		//important shows a way of getting parameters when the form in te jsp is multipart
		ServiceContext serviceContext = null;
		try {
			serviceContext = ServiceContextFactory.getInstance(
			        Group.class.getName(), actionRequest);
		} catch (PortalException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String taskId = uploadPortletRequest.getParameter("taskId");
		String jobId = uploadPortletRequest.getParameter("jobId");
		File file = uploadPortletRequest.getFile("redesign");
		String mimeType = MimeTypesUtil.getContentType(file);
		String description = "This file was uploaded by the Cara Manage Jobs Portlet";
		Date today = new Date();
		long fileEntryId = 0;
		String title = "DesignFile_" + uploadPortletRequest.getParameter("taskId") + "_" + uploadPortletRequest.getParameter("projectName") + "_" + today.getDay() + (today.getMonth() + 1) + today.getYear() + today.getHours() + today.getSeconds() + today.getSeconds();
		long fileSize = file.length();
		String downloadURL = "";
		String changeLog = "Programatical change";
		InputStream is = null;
		try {
			is = new FileInputStream( file );
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		String fileName = file.getName();
		Long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
		try {
			Folder folderId = DLAppServiceUtil.getFolder(groupId, parentFolderId , "Work");
			long folderIdId = folderId.getFolderId();
			DLAppServiceUtil.addFileEntry(groupId, folderIdId, fileName, mimeType, title, description, changeLog, is, fileSize, serviceContext);			
			
			
			FileEntry thisFileEntry = DLAppServiceUtil.getFileEntry(groupId, folderIdId, title);
			fileEntryId = thisFileEntry.getFileEntryId();			
		
			// Get last version of the file entry
			FileVersion fileVersion = thisFileEntry.getFileVersion();
			 
			// If you want to add additional GET parameters you can modify this var
			String queryString = "";
			 
			// Append the requested file version as GET parameter
			boolean appendFileEntryVersion = true;
			 
			// Choose to prefix or not the URL by the portal URL
			boolean useAbsoluteURL = true;
			 
			// Compute the download URL of the file entry 
			String dlURL = DLUtil.getPreviewURL(thisFileEntry, fileVersion, themeDisplay, queryString, appendFileEntryVersion, useAbsoluteURL);
			System.out.println(dlURL);
			downloadURL = dlURL;
			
			TaskDetails taskDetails = _taskDetailsLocalService.createTaskDetails(CounterLocalServiceUtil.increment("taskDetails"));
			long userId = themeDisplay.getUserId();
			User user = UserLocalServiceUtil.getUserById(userId);
			String fullname = user.getFullName();			
			taskDetails.setUserId(userId);
			taskDetails.setUserName(fullname);
			taskDetails.setCompanyId(companyId);
			taskDetails.setGroupId(groupId);
			taskDetails.setCreateDate(today);
			taskDetails.setModifiedDate(today);
			
			//set file and file path
			
			taskDetails.setFileUrl(downloadURL);
			taskDetails.setFileId(fileEntryId);
			
			//set text strings
			
			taskDetails.setProductDetails(uploadPortletRequest.getParameter("productDetails"));
			taskDetails.setWhyUse(uploadPortletRequest.getParameter("whyUse"));
			taskDetails.setHowToUse(uploadPortletRequest.getParameter("howToUse"));
			taskDetails.setHowItWorks(uploadPortletRequest.getParameter("howItWorks"));
			taskDetails.setExpertTips(uploadPortletRequest.getParameter("expertTips"));
			taskDetails.setApprovedBy(0);
			taskDetails.setApproved(false);
			
			//set reference entities
			
			taskDetails.setJobId(Long.valueOf(jobId));
			taskDetails.setTaskId(Long.valueOf(taskId));
			_taskDetailsLocalService.addTaskDetails(taskDetails);
			
			//get the taskRecord and set the status percentage
			Tasks tasks = _tasksLocalService.fetchTasks(Long.valueOf(taskId));
			tasks.setTaskStatus(75);
			_tasksLocalService.updateTasks(tasks);
						
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return false;
	}

}
