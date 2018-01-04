
package com.liferay.unilever.demo.cara.create.jobs.portlet;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.unilever.demo.cara.model.project;
import com.liferay.unilever.demo.cara.service.projectLocalService;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=com_liferay_cara_create_jobs",
			"mvc.command.name=/edit/editProject"
	},
		service = MVCRenderCommand.class)

public class EditProjectMVCRenderCommand implements MVCRenderCommand  {
	
	@Reference(unbind = "-")
	 protected void setprojectLocalService(projectLocalService myprojectLocalService) {
		_myprojectLocalService = myprojectLocalService;
	 }
	private projectLocalService _myprojectLocalService;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		String projectRefId = ParamUtil.getString(renderRequest, "projectRefId", "unknown");
		String projectRefIdBlank = ParamUtil.getString(renderRequest, "projectRefIdBlank", "unknown");
		//DateFormat format = new SimpleDateFormat("EEE MMM dd hh:mm:SS z yyyy", Locale.ENGLISH );
		Date today = new Date();		
		int todayDay = today.getDate();
		int todayMonth = today.getMonth();
		int todayYear = today.getYear() + 1900;	
		if (projectRefId != "unknown")	
		{
			
			
			
			project projectRecord = _myprojectLocalService.getProjectByProjectRefId(projectRefId);
			
			Date charterDate = projectRecord.getCharterGateApproval();
			
			int charterDay = charterDate.getDate();
			int charterMonth = charterDate.getMonth();	
			int charterYear = charterDate.getYear() + 1900;		
			
			renderRequest.setAttribute("projectBrand", projectRecord.getBrand());
			renderRequest.setAttribute("brandPosition", projectRecord.getBrandPosition());
			renderRequest.setAttribute("projectName", projectRecord.getProjectName());
			renderRequest.setAttribute("projectCategory", projectRecord.getProjectCategory());
			renderRequest.setAttribute("projectType", projectRecord.getProjectType());
			renderRequest.setAttribute("charterDate", charterDate);
			renderRequest.setAttribute("projectId", projectRecord.getProjectId());
			
	
			long marketingUserId = projectRecord.getMarketingUserId();
			if (marketingUserId != 0)
			{
				try {
					User marketingUser = UserLocalServiceUtil.getUserById(marketingUserId);
					String marketingUserIdString = marketingUser.getFullName() + " - " + marketingUser.getScreenName();
					renderRequest.setAttribute("marketingUserIdString", marketingUserIdString);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else
			{
				renderRequest.setAttribute("marketingUserIdString", "");
			}
			
			long supplyChainUserId = projectRecord.getSupplyChainUserId();
			if (supplyChainUserId != 0)
			{
				try {
					User supplyChainUser = UserLocalServiceUtil.getUserById(supplyChainUserId);
					String supplyChainUserIdString = supplyChainUser.getFullName() + " - " + supplyChainUser.getScreenName();
					renderRequest.setAttribute("supplyChainUserIdString", supplyChainUserIdString);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else
			{
				renderRequest.setAttribute("supplyChainUserIdString", "");
			}
			
			long customerDevelopmentUserId = projectRecord.getCustomerDevelopmentUserId();
			if (customerDevelopmentUserId != 0)
			{
				try {
					User customerDevelopmentUser = UserLocalServiceUtil.getUserById(customerDevelopmentUserId);
					String customerDevelopmentUserIdString = customerDevelopmentUser.getFullName() + " - " + customerDevelopmentUser.getScreenName();
					renderRequest.setAttribute("customerDevelopmentUserIdString", customerDevelopmentUserIdString);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else
			{
				renderRequest.setAttribute("customerDevelopmentUserIdString", "");
			}
			
			long technicalProjectLeaderUserId = projectRecord.getTechLeaderUserId();
			if (technicalProjectLeaderUserId != 0)
			{
				try {
					User technicalProjectLeaderUser = UserLocalServiceUtil.getUserById(technicalProjectLeaderUserId);
					String technicalProjectLeaderUserIdString = technicalProjectLeaderUser.getFullName() + " - " + technicalProjectLeaderUser.getScreenName();
					renderRequest.setAttribute("technicalProjectLeaderUserIdString", technicalProjectLeaderUserIdString);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			else
			{
				renderRequest.setAttribute("technicalProjectLeaderUserIdString", "");
			}
			
			long rndUserId = projectRecord.getRndUserId();
			if (rndUserId != 0)
			{
				try {
					User rndUser = UserLocalServiceUtil.getUserById(rndUserId);
					String rndUserIdString = rndUser.getFullName() + " - " + rndUser.getScreenName();
					renderRequest.setAttribute("rndUserIdString", rndUserIdString);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			else
			{
				renderRequest.setAttribute("rndUserIdString", "");
			}
			
			long rndProductUserId = projectRecord.getRndProductUserId();
			if (rndProductUserId != 0)
			{
				try {
					User rndProductUser = UserLocalServiceUtil.getUserById(rndProductUserId);
					String rndProductUserIdString = rndProductUser.getFullName() + " - " + rndProductUser.getScreenName();
					renderRequest.setAttribute("rndProductUserIdString", rndProductUserIdString);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			else
			{
				renderRequest.setAttribute("rndProductUserIdString", "");
			}
			
			renderRequest.setAttribute("charterDay", charterDay);
			renderRequest.setAttribute("charterMonth", charterMonth);
			renderRequest.setAttribute("charterYear", charterYear);
			renderRequest.setAttribute("todayDay", todayDay);
			renderRequest.setAttribute("todayMonth", todayMonth);
			renderRequest.setAttribute("todayYear", todayYear);
			renderRequest.setAttribute("projectRefIdBlank", projectRefIdBlank);
			
			// Need pass user records back to the interface annoying
			
			return "/work/editProject.jsp";
		
		}
		
		else
			
		{
			renderRequest.setAttribute("projectBrand", "");
			renderRequest.setAttribute("brandPosition", "");
			renderRequest.setAttribute("projectName", "");
			renderRequest.setAttribute("projectCategory", "");
			renderRequest.setAttribute("projectType", "");
			renderRequest.setAttribute("charterDate", "");
			
			renderRequest.setAttribute("charterDay", todayDay);
			renderRequest.setAttribute("charterMonth", todayMonth);
			renderRequest.setAttribute("charterYear", todayYear);
			renderRequest.setAttribute("todayDay", todayDay);
			renderRequest.setAttribute("todayMonth", todayMonth);
			renderRequest.setAttribute("todayYear", todayYear);
			renderRequest.setAttribute("projectRefIdBlank", "");
			renderRequest.setAttribute("marketingUserIdString", "");
			renderRequest.setAttribute("supplyChainUserIdString", "");
			renderRequest.setAttribute("customerDevelopmentUserIdString", "");
			renderRequest.setAttribute("technicalProjectLeaderUserIdString", "");
			renderRequest.setAttribute("rndUserIdString", "");
			renderRequest.setAttribute("rndProductUserIdString", "");
			long dummyProjectId = 0;
			renderRequest.setAttribute("projectId", dummyProjectId);
			return "/work/editProject.jsp";
			
		}
		
	
		
	}

}
