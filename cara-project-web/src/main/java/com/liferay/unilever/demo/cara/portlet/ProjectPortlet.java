package com.liferay.unilever.demo.cara.portlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.unilever.demo.cara.model.project;
import com.liferay.unilever.demo.cara.service.projectLocalService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

/**
 * @author kpatefield
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=cara-project-web Portlet",
		"javax.portlet.name=com_liferay_cara_project",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view_blank.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProjectPortlet extends MVCPortlet {
	
	@Reference(unbind = "-")
	 protected void setprojectLocalService(projectLocalService myprojectLocalService) {
		_myprojectLocalService = myprojectLocalService;
	 }
	private projectLocalService _myprojectLocalService;
	
	
	public void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
		
		
		
		//setup REST service
	    Client client = Client.create();
	    WebResource webResource = client.resource("https://mocksvc.mulesoft.com/mocks/bbdaeb91-1fe7-4286-8b01-03d324f7976e/projects");
	    ClientResponse response = webResource.header("Content-Type", "application/json").get(ClientResponse.class);   
		//parse JSON Array of objects to Java collections List of objects
	    JSONParser parser = new JSONParser();
		try {
			JSONArray jsonArray = (JSONArray) parser.parse(response.getEntity(String.class));
			List<ProjectAPI> projectList = new ArrayList<ProjectAPI>();
			for(int i = 0; i < jsonArray.size(); i++ )
			{
				JSONObject objectInArray = (JSONObject) jsonArray.get(i);
				int objectSize = objectInArray.size();
				ProjectAPI projectRecord = new ProjectAPI();
				String projectName = (String) objectInArray.get("projectName");
				projectRecord.setProjectName(projectName);
				String projectType = "";
				// checks for an incomplete IPM record
				if (objectSize < 18)
				{
					projectType = "IPM Partial";
					projectRecord.setProjectType(projectType);
				}
				else
				{
					projectType = (String) objectInArray.get("type");
					projectRecord.setProjectType(projectType);
				}
				
				String brand = (String) objectInArray.get("brand");
				projectRecord.setBrand(brand);
				String category = (String) objectInArray.get("category");
				projectRecord.setCategory(category);
				String brandPosition = (String) objectInArray.get("brandPosition");
				projectRecord.setBrandPosition(brandPosition);
				String projectRefIdAsString = objectInArray.get("projectRefId").toString();
				System.out.println(projectRefIdAsString);
				int projectRefId = Integer.valueOf(projectRefIdAsString);
				
				DateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
				
				String dateToConvert = (String) objectInArray.get("charterGateApprovalDate");
				Date charterGateApprovalDate = new Date();				
				charterGateApprovalDate = df.parse(dateToConvert);
				projectRecord.setCharterGateApprovalDate(charterGateApprovalDate);
				
				String dateToConvert1 = (String) objectInArray.get("productDesignLockDate");
				if (dateToConvert1 != null)
				{
				Date productDesignLockDate = new Date();
				productDesignLockDate = df.parse(dateToConvert1);
				projectRecord.setProductDesignLockDate(productDesignLockDate);
				}
				
				String dateToConvert2 = (String) objectInArray.get("contractGateApprovalDate");
				if (dateToConvert2 != null)
				{
				Date contractGateApprovalDate = new Date();
				contractGateApprovalDate = df.parse(dateToConvert2);
				projectRecord.setContractGateApprovalDate(contractGateApprovalDate);
				}
				
				String dateToConvert3 = (String) objectInArray.get("marketReadyApprovalDate");
				if (dateToConvert3 != null)
				{
				Date marketReadyApprovalDate = new Date();
				marketReadyApprovalDate = df.parse(dateToConvert3);
				projectRecord.setMarketReadyApprovalDate(marketReadyApprovalDate);
				}
				
				String dateToConvert4 = (String) objectInArray.get("marketDeploymentDate");
				if (dateToConvert4 != null)
				{
				Date marketDeploymentDate = new Date();
				marketDeploymentDate = df.parse(dateToConvert4);
				projectRecord.setMarketDeploymentDate(marketDeploymentDate);
				}
				
				String dateToConvert5 = (String) objectInArray.get("shipToTradeDate");
				if (dateToConvert5 != null)
				{
				Date shipToTradeDate = new Date();
				shipToTradeDate = df.parse(dateToConvert5);
				projectRecord.setShipToTradeDate(shipToTradeDate);
				}			
				
				String marketingUserScreenName = (String) objectInArray.get("marketingUserId");
				System.out.println(marketingUserScreenName);
				if (marketingUserScreenName != null)
				{
					projectRecord.setMarketingUserScreenName(marketingUserScreenName);
					
				}
				else 
				{
					
				}
					
				String rndUserScreenName = (String) objectInArray.get("rndUserId");
				if (rndUserScreenName != null)
				{
					projectRecord.setRndUserScreenName(rndUserScreenName);
				}	
				
				String rndProductUserScreenName = (String) objectInArray.get("rndProductUserId");
				if (rndProductUserScreenName != null)
				{
					projectRecord.setRndProductUserScreenName(rndProductUserScreenName);
				}
				
				String supplyChainUserScreenName = (String) objectInArray.get("supplyChainUserId");
				if (supplyChainUserScreenName != null)
				{
					projectRecord.setSupplyChainUserScreenName(supplyChainUserScreenName);
				}
				
				String customerDevelopmentUserScreenName = (String) objectInArray.get("customerDevelopmentUserId");
				if (customerDevelopmentUserScreenName != null)
				{
					projectRecord.setCustomerDevelopmentUserScreenName(customerDevelopmentUserScreenName);
				}
				
				String techLeaderUserScreenName = (String) objectInArray.get("techLeaderUserId");
				if (techLeaderUserScreenName != null)
				{
					projectRecord.setTechLeaderUserScreenName(techLeaderUserScreenName);
				}
				
				//get company id, username and group id from themedisplay a standard liferay concept
				ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
				long companyId = themeDisplay.getCompanyId(); 
				long groupId = themeDisplay.getLayout().getGroupId();
				long userId = themeDisplay.getUserId();
				String fullname = null;
				User user = null;
				try {
					user = UserLocalServiceUtil.getUserById(userId);
					fullname = user.getFullName();
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//Persist the data
				project projectPersist = _myprojectLocalService.createproject(CounterLocalServiceUtil.increment("project"));
				projectPersist.setUserId(userId);
				projectPersist.setUserName(fullname);
				projectPersist.setCompanyId(companyId);
				projectPersist.setGroupId(groupId);
				Date today = new Date();
				projectPersist.setCreateDate(today);
				projectPersist.setModifiedDate(today);			
				
				projectPersist.setBrand(brand);
				projectPersist.setProjectName(projectName);
				projectPersist.setProjectRefId(projectRefIdAsString);
				projectPersist.setBrandPosition(brandPosition);
				projectPersist.setProjectType(projectType);
				projectPersist.setProjectCategory(category);		
				projectPersist.setCharterGateApproval(charterGateApprovalDate);	
				
				projectPersist.setContractGateApproval(projectRecord.getContractGateApprovalDate());
				projectPersist.setMarketReadyApproval(projectRecord.getMarketReadyApprovalDate());
				projectPersist.setShipToTrade(projectRecord.getShipToTradeDate());
				projectPersist.setMarketDeployment(projectRecord.getMarketDeploymentDate());
				projectPersist.setProductDesignLock(projectRecord.getProductDesignLockDate());
				
				//belt and braces cheking for bad data coming from web service
				
				if(techLeaderUserScreenName != null && techLeaderUserScreenName != "" && techLeaderUserScreenName != "null" )
				{
					User technicalProjectLeaderUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, techLeaderUserScreenName);
					long technicalProjectLeaderUserId = technicalProjectLeaderUserUser.getUserId();
					projectPersist.setTechLeaderUserId(technicalProjectLeaderUserId);
				}
				
				if(marketingUserScreenName != null && marketingUserScreenName != "" && marketingUserScreenName != "null" )
				{
					User marketingUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, marketingUserScreenName);
					long marketingUserId = marketingUserUser.getUserId();
					projectPersist.setMarketingUserId(marketingUserId);
				}
				
				if(rndUserScreenName != null && rndUserScreenName != "" && rndUserScreenName != "null"  )
				{
					User rndUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, rndUserScreenName);
					long rndUserId = rndUserUser.getUserId();
					projectPersist.setRndUserId(rndUserId);
				}
				
				if(rndProductUserScreenName != null && rndProductUserScreenName != "" && rndProductUserScreenName != "null"  )
				{
					User rndProductDevelopmentUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, rndProductUserScreenName);
					long rndProductDevelopmentUserId = rndProductDevelopmentUserUser.getUserId();
					projectPersist.setRndProductUserId(rndProductDevelopmentUserId);
				}
				
				if(supplyChainUserScreenName != null && supplyChainUserScreenName != "" && supplyChainUserScreenName != "null")
				{
					User supplyChainUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, supplyChainUserScreenName);
					long supplyChainUserId = supplyChainUserUser.getUserId();
					projectPersist.setSupplyChainUserId(supplyChainUserId);
				}
				
				if(customerDevelopmentUserScreenName != null && customerDevelopmentUserScreenName != "" && customerDevelopmentUserScreenName != "null" )
				{				
					User customerDevelopmentUserUser = UserLocalServiceUtil.fetchUserByScreenName(companyId, customerDevelopmentUserScreenName);
					long customerDevelopmentUserId = customerDevelopmentUserUser.getUserId();
					projectPersist.setCustomerDevelopmentUserId(customerDevelopmentUserId);
				}
				
				
				//add project record to database
				
				//useful method below for deleting projects from the DB in the proper way
				//_myprojectLocalService.deleteProjects();
				
				
				project projectExists = _myprojectLocalService.getProjectByProjectRefId(projectRefIdAsString);
				if (projectExists == null)
				{
					_myprojectLocalService.addproject(projectPersist);
				}
					
				
				projectList.add(i, projectRecord);
				
				
				
		}
		// pass project record to view if that is what you want to do, this in case where you might want to manually create project records
		renderRequest.setAttribute("projectList", projectList);
		
		System.out.println(renderResponse.createRenderURL().toString());
		
			
			
			
		} catch (ClientHandlerException | UniformInterfaceException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.doView(renderRequest, renderResponse);
	}        
}
    

    
