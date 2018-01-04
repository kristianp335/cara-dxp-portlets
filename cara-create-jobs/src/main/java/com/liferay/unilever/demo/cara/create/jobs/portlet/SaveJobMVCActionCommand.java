package com.liferay.unilever.demo.cara.create.jobs.portlet;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.unilever.demo.cara.tasks.model.Tasks;
import com.liferay.unilever.demo.cara.tasks.service.TasksLocalService;

import cara.jobs.model.Jobs;
import cara.jobs.service.JobsLocalService;

//example of an action command that saves or edits depending whether the project object exists or not
//less comments in this class, check out SaveProjectActionCommand because the concept is similar, this class
// is a good example of two service references in the same class
@Component(
	immediate = true,
	property = {
			"javax.portlet.name=com_liferay_cara_create_jobs",
			"mvc.command.name=/create/savejobs"
},
	service = MVCActionCommand.class)
public class SaveJobMVCActionCommand extends BaseMVCActionCommand {
	
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
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
			
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long companyId = themeDisplay.getCompanyId(); 
			long groupId = themeDisplay.getLayout().getGroupId();
			long userId = themeDisplay.getUserId();
			User user = UserLocalServiceUtil.getUserById(userId);
			String fullname = user.getFullName();
			
			String designAgency = actionRequest.getParameter("designAgency");
			String[] designAgencyParts = designAgency.split(" - ");
			String designAgencyScreenName = designAgencyParts[1];
			User designAgencyUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, designAgencyScreenName);
			long designAgencyId = designAgencyUser.getUserId();
			
			String pmaUser = actionRequest.getParameter("pmaUser");
			String[] pmaUserParts = pmaUser.split(" - ");
			String pmaUserScreenName = pmaUserParts[1];
			User pmaUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, pmaUserScreenName);
			long pmaUserId = pmaUserUser.getUserId();
			
			String localMarketing = actionRequest.getParameter("localMarketing");
			String[] localMarketingParts = localMarketing.split(" - ");
			String localMarketingScreenName = localMarketingParts[1];
			User localMarketingUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, localMarketingScreenName);
			long localMarketingId = localMarketingUser.getUserId();
			
			String rndLocalDeployUser = actionRequest.getParameter("rndLocalDeployUser");
			String[] rndLocalDeployUserParts = rndLocalDeployUser.split(" - ");
			String rndLocalDeployUserScreenName = rndLocalDeployUserParts[1];
			User rndLocalDeployUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, rndLocalDeployUserScreenName);
			long rndLocalDeployUserId = rndLocalDeployUserUser.getUserId();
			
			int visualDesignCompleteDay = ParamUtil.getInteger(actionRequest, "visualDesignCompleteDay");
			int visualDesignCompleteMonth = ParamUtil.getInteger(actionRequest, "visualDesignCompleteMonth");
			int visualDesignCompleteYear = ParamUtil.getInteger(actionRequest, "visualDesignCompleteYear");
			Date visualDesignComplete = new Date();
			visualDesignComplete.setDate(visualDesignCompleteDay);
			visualDesignComplete.setMonth(visualDesignCompleteMonth);
			visualDesignComplete.setYear(visualDesignCompleteYear - 1900);
			
			int artworkApprovedDay = ParamUtil.getInteger(actionRequest, "artworkApprovedDay");
			int artworkApprovedMonth = ParamUtil.getInteger(actionRequest, "artworkApprovedMonth");
			int artworkApprovedYear = ParamUtil.getInteger(actionRequest, "artworkApprovedYear");
			Date artworkApproved = new Date();
			artworkApproved.setDate(artworkApprovedDay);
			artworkApproved.setMonth(artworkApprovedMonth);
			artworkApproved.setYear(artworkApprovedYear - 1900);
			
			int separationFilesToPrinterDay = ParamUtil.getInteger(actionRequest, "separationFilesToPrinterDay");
			int separationFilesToPrinterMonth = ParamUtil.getInteger(actionRequest, "artworkApprovedMonth");
			int separationFilesToPrinterYear = ParamUtil.getInteger(actionRequest, "artworkApprovedYear");
			Date separationFilesToPrinter = new Date();
			separationFilesToPrinter.setDate(separationFilesToPrinterDay);
			separationFilesToPrinter.setMonth(separationFilesToPrinterMonth);
			separationFilesToPrinter.setYear(separationFilesToPrinterYear - 1900);
			
			int marketDeploymentDay = ParamUtil.getInteger(actionRequest, "marketDeploymentDay");
			int marketDeploymentMonth = ParamUtil.getInteger(actionRequest, "marketDeploymentMonth");
			int marketDeploymentYear = ParamUtil.getInteger(actionRequest, "marketDeploymentYear");
			Date marketDeployment = new Date();
			marketDeployment.setDate(marketDeploymentDay);
			marketDeployment.setMonth(marketDeploymentMonth);
			marketDeployment.setYear(marketDeploymentYear - 1900);
			
			int shipToTradeDay = ParamUtil.getInteger(actionRequest, "shipToTradeDay");
			int shipToTradeMonth = ParamUtil.getInteger(actionRequest, "shipToTradeMonth");
			int shipToTradeYear = ParamUtil.getInteger(actionRequest, "shipToTradeYear");
			Date shipToTrade = new Date();
			shipToTrade.setDate(shipToTradeDay);
			shipToTrade.setMonth(shipToTradeMonth);
			shipToTrade.setYear(shipToTradeYear - 1900);	
			
			Date today = new Date();
			
			Jobs job = _jobsLocalService.createJobs(CounterLocalServiceUtil.increment("job"));
			
			job.setUserId(userId);
			job.setUserName(fullname);
			job.setCompanyId(companyId);
			job.setGroupId(groupId);
			job.setCreateDate(today);
			job.setModifiedDate(today);
			
			String projectId = ParamUtil.getString(actionRequest, "projectId", "unknown");
			long thisProjectId = Long.parseLong(projectId);
			job.setProjectId(thisProjectId);		
			
			job.setJobType(actionRequest.getParameter("jobType"));
			job.setVariant(actionRequest.getParameter("variant") + "," + actionRequest.getParameter("size") );
			job.setFormat(actionRequest.getParameter("format"));
			
			job.setVisualDesignComplete(visualDesignComplete);
			job.setMarketDeployment(marketDeployment);
			job.setArtworkApproved(artworkApproved);
			job.setShipToTrade(shipToTrade);
			job.setSeparationFilesToPrinter(separationFilesToPrinter);
			
			job.setDesignAgency(designAgencyId);
			job.setLocalMarketing(localMarketingId);
			job.setPmaUser(pmaUserId);
			job.setRndLocalDeployUser(rndLocalDeployUserId);
			
			String visualDesignCu = ParamUtil.getString(actionRequest, "visualDesignCu", "unknown");
			if (visualDesignCu == "unknown" || visualDesignCu == "No")
			{
				job.setVisualDesignCu(false);
			}
			else
			{
				job.setVisualDesignCu(true);
			}
			
			String visualDesign = ParamUtil.getString(actionRequest, "visualDesign", "unknown");
			if (visualDesign == "unknown" || visualDesign == "No")
			{
				job.setVisualDesign(false);
			}
			else
			{
				job.setVisualDesign(true);
			}
			
			String noticableConsumers = ParamUtil.getString(actionRequest, "noticableConsumers", "unknown");
			if (noticableConsumers == "unknown" || noticableConsumers == "No")
			{
				job.setNoticableConsumers(false);
			}
			else
			{
				job.setNoticableConsumers(true);
			}
			
			String changePackaging = ParamUtil.getString(actionRequest, "changePackaging", "unknown");
			if (changePackaging == "unknown" || changePackaging == "No")
			{
				job.setChangePackaging(false);
			}
			else
			{
				job.setChangePackaging(true);
			}
			
			String changeFormulation = ParamUtil.getString(actionRequest, "changeFormulation", "unknown");
			if (changeFormulation == "unknown" || changeFormulation == "No")
			{
				job.setChangeFormulation(false);
			}
			else
			{
				job.setChangeFormulation(true);
			}
			
			_jobsLocalService.addJobs(job);
			
			// Adds a task just duplicate
			
			Tasks task = _tasksLocalService.createTasks(CounterLocalServiceUtil.increment("task"));
			
			task.setUserId(userId);
			task.setUserName(fullname);
			task.setCompanyId(companyId);
			task.setGroupId(groupId);
			task.setCreateDate(today);
			task.setModifiedDate(today);
			
			//set the job id from the previously created job
			
			task.setJobId(job.getJobId());
			task.setCompleteDate(visualDesignComplete);
			task.setTaskStatus(0);
			task.setTaskname("Package redesign");
			task.setUserAssigned(designAgencyId);
			task.setSuperAssigned(pmaUserId);			
			
			_tasksLocalService.addTasks(task);
			
					
	}
		
}
