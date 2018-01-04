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
import com.liferay.unilever.demo.cara.model.project;
import com.liferay.unilever.demo.cara.service.projectLocalService;

//example of an action command that saves or edits depending whether the project object exists or not

@Component(
	immediate = true,
	property = {
			"javax.portlet.name=com_liferay_cara_create_jobs",
			"mvc.command.name=/create/saveProjectFromJobCreation"
},
	service = MVCActionCommand.class)
public class SaveProjectMVCActionCommand extends BaseMVCActionCommand {

	//binding class to reference exported libraries in the OSGI container
	
	@Reference(unbind = "-")
	 protected void setprojectLocalService(projectLocalService myprojectLocalService) {
		_myprojectLocalService = myprojectLocalService;
	 }
	private projectLocalService _myprojectLocalService;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
	//getting variables to persist
		
		//get company id, username and group id from themedisplay a standard liferay concept
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId(); 
		long groupId = themeDisplay.getLayout().getGroupId();
		long userId = themeDisplay.getUserId();
		User user = UserLocalServiceUtil.getUserById(userId);
		String fullname = user.getFullName();
		
		
		//get the Marketing User and use the User API
		String marketingUser = actionRequest.getParameter("marketingUser");
		String[] marketingUserParts = marketingUser.split(" - ");
		String marketingUserScreenName = marketingUserParts[1];
		User marketingUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, marketingUserScreenName);
		long marketingUserId = marketingUserUser.getUserId();
		
		//get the rndUser and use the User API
		String rndUser = actionRequest.getParameter("rndUser");
		String[] rndUserParts = rndUser.split(" - ");
		String rndUserScreenName = rndUserParts[1];
		User rndUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, rndUserScreenName);
		long rndUserId = rndUserUser.getUserId();
		
		//get the rndProductDevelopmentUser and use the User API
		String rndProductDevelopmentUser = actionRequest.getParameter("rndProductDevelopmentUser");
		String[] rndProductDevelopmentUserParts = rndProductDevelopmentUser.split(" - ");
		String rndProductDevelopmentUserScreenName = rndProductDevelopmentUserParts[1];
		User rndProductDevelopmentUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, rndProductDevelopmentUserScreenName);
		long rndProductDevelopmentUserId = rndProductDevelopmentUserUser.getUserId();
		
		//get the supplyChainUser and use the User API
		String supplyChainUser = actionRequest.getParameter("supplyChainUser");
		String[] supplyChainUserParts = supplyChainUser.split(" - ");
		String supplyChainUserScreenName = supplyChainUserParts[1];
		User supplyChainUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, supplyChainUserScreenName);
		long supplyChainUserId = supplyChainUserUser.getUserId();
		
		//get the technicalProjectLeaderUser and use the User API
		String technicalProjectLeaderUser = actionRequest.getParameter("technicalProjectLeaderUser");
		String[] technicalProjectLeaderUserParts = technicalProjectLeaderUser.split(" - ");
		String technicalProjectLeaderUserScreenName = technicalProjectLeaderUserParts[1];
		User technicalProjectLeaderUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, technicalProjectLeaderUserScreenName);
		long technicalProjectLeaderUserId = technicalProjectLeaderUserUser.getUserId();
		
		//get the customDevelopmentUser and use the User API
		String customerDevelopmentUser = actionRequest.getParameter("customerDevelopmentUser");
		String[] customerDevelopmentUserParts = customerDevelopmentUser.split(" - ");
		String customerDevelopmentUserScreenName = customerDevelopmentUserParts[1];
		User customerDevelopmentUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, customerDevelopmentUserScreenName);
		long customerDevelopmentUserId = customerDevelopmentUserUser.getUserId();
		
		
		int charterGateApprovalDay = ParamUtil.getInteger(actionRequest, "charterGateApprovalDay");
		int charterGateApprovalMonth = ParamUtil.getInteger(actionRequest, "charterGateApprovalMonth");
		int charterGateApprovalYear = ParamUtil.getInteger(actionRequest, "charterGateApprovalYear");
		Date charterGateApproval = new Date();
		charterGateApproval.setDate(charterGateApprovalDay);
		charterGateApproval.setMonth(charterGateApprovalMonth);
		charterGateApproval.setYear(charterGateApprovalYear - 1900);
		
		
		// create a date objects for persisting the date fields
		
		int contractGateApprovalDay = ParamUtil.getInteger(actionRequest, "contractGateApprovalDay");
		int contractGateApprovalMonth = ParamUtil.getInteger(actionRequest, "contractGateApprovalMonth");
		int contractGateApprovalYear = ParamUtil.getInteger(actionRequest, "contractGateApprovalYear");
		Date contractGateApproval = new Date();
		contractGateApproval.setDate(contractGateApprovalDay);
		contractGateApproval.setMonth(contractGateApprovalMonth);
		contractGateApproval.setYear(contractGateApprovalYear - 1900);
		
		int productDesignLockDay = ParamUtil.getInteger(actionRequest, "productDesignLockDay");
		int productDesignLockMonth = ParamUtil.getInteger(actionRequest, "productDesignLockMonth");
		int productDesignLockYear = ParamUtil.getInteger(actionRequest, "productDesignLockYear");
		Date productDesignLock = new Date();
		productDesignLock.setDate(productDesignLockDay);
		productDesignLock.setMonth(productDesignLockMonth);
		productDesignLock.setYear(productDesignLockYear - 1900);
		
		int marketReadyApprovalDay = ParamUtil.getInteger(actionRequest, "marketReadyApprovalDay");
		int marketReadyApprovalMonth = ParamUtil.getInteger(actionRequest, "marketReadyApprovalMonth");
		int marketReadyApprovalYear = ParamUtil.getInteger(actionRequest, "marketReadyApprovalYear");
		Date marketReadyApproval = new Date();
		marketReadyApproval.setDate(marketReadyApprovalDay);
		marketReadyApproval.setMonth(marketReadyApprovalMonth);
		marketReadyApproval.setYear(marketReadyApprovalYear - 1900);
		
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
		marketDeployment.setDate(shipToTradeDay);
		marketDeployment.setMonth(shipToTradeMonth);
		marketDeployment.setYear(shipToTradeYear - 1900);
		
		
		// persist the data via OSGI service		
		Date today = new Date();	
		
		//checks if this is an edit of an existing project
		
		project myproject = null;
		
		String projectId = ParamUtil.getString(actionRequest, "projectId", "unknown");
		if (projectId != "unknown")
			
		{
			long thisProjectId = Long.parseLong(projectId);
			myproject =_myprojectLocalService.fetchproject(thisProjectId);
		}
		else
		{		
		//creates a new object but does not persist it
		    myproject = _myprojectLocalService.createproject(CounterLocalServiceUtil.increment("project"));
		
		}
		
		myproject.setUserId(userId);
		myproject.setUserName(fullname);
		myproject.setCompanyId(companyId);
		myproject.setGroupId(groupId);
		myproject.setCreateDate(today);
		myproject.setModifiedDate(today);
		
		//set project info
		
		myproject.setBrand(actionRequest.getParameter("projectBrand"));
		myproject.setProjectName(actionRequest.getParameter("projectName"));
		myproject.setProjectRefId(actionRequest.getParameter("projectName"));
		myproject.setBrandPosition(actionRequest.getParameter("brandPosition"));
		System.out.println(actionRequest.getParameter("projectType"));
		
		if (actionRequest.getParameter("projectType") == "IPM Partial")
		{
			myproject.setProjectType("IPM Full");
		}		
		else
		{
			myproject.setProjectType(actionRequest.getParameter("projectType"));
		}
		myproject.setProjectCategory(actionRequest.getParameter("projectCategory"));		
		myproject.setCharterGateApproval(charterGateApproval);	
		
		//set user ids
		
		myproject.setSupplyChainUserId(supplyChainUserId);
		myproject.setMarketingUserId(marketingUserId);
		myproject.setRndUserId(rndUserId);
		myproject.setCustomerDevelopmentUserId(customerDevelopmentUserId);
		myproject.setRndProductUserId(rndProductDevelopmentUserId);
		myproject.setTechLeaderUserId(technicalProjectLeaderUserId);	
		
		//set the dates
		myproject.setContractGateApproval(contractGateApproval);
		myproject.setMarketReadyApproval(marketReadyApproval);
		myproject.setShipToTrade(shipToTrade);
		myproject.setMarketDeployment(marketDeployment);
		myproject.setProductDesignLock(productDesignLock);
		
		// updates or adds new depending on whether this is a new object or not
		_myprojectLocalService.updateproject(myproject);
		
		//redirect to default view URL, important example of URL generation by the portal
		actionResponse.sendRedirect(actionRequest.getParameter("redirect"));
		
		
	    
	    
	}
	
	
}



