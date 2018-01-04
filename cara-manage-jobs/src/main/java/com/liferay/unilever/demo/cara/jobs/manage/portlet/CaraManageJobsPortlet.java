package com.liferay.unilever.demo.cara.jobs.manage.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
//needed to get authtoken for jsonws calls
import com.liferay.portal.kernel.security.auth.AuthTokenUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.unilever.demo.cara.join.model.Join;
import com.liferay.unilever.demo.cara.join.service.JoinLocalService;

/**
 * @author kpatefield
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Jobs",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.name=com_liferay_cara_join",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CaraManageJobsPortlet extends MVCPortlet {
	
	@Reference(unbind = "-")
	 protected void setJoinLocalService(JoinLocalService joinLocalService) {
		_joinLocalService = joinLocalService;
	 }
	private JoinLocalService _joinLocalService;
	
	
	public void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {	
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
		long groupId = themeDisplay.getSiteGroupId();
		boolean seeAll = false;
		if (userId == 20156)
		{
			seeAll = true;
		}
		
		String pagingString = renderRequest.getParameter("cur1");
		String query = renderRequest.getParameter("keywords");
		
		int pagingVal = 0;
		if (pagingString != null)
		{
			pagingVal = Integer.valueOf(pagingString);
		
		}
			
		
		int start = 0;
		int end = 10;
		
		if (pagingVal > 1)
		{
			end = pagingVal * 10;
			start = (pagingVal * 10) - 10;
		}
		
		//check user permissions
		List<UserGroupRole> userGroupRoleList =
			    UserGroupRoleLocalServiceUtil.getUserGroupRoles(userId, groupId);
			    if (userGroupRoleList != null) {
			    for (UserGroupRole userGroupRole : userGroupRoleList) {
			        Role role;
					try {
						role = RoleLocalServiceUtil.getRole(userGroupRole.getRoleId());
				        System.out.println(role.getName());
				        if (role.getName().contains("Leader"))
				        {
				        	seeAll = true;
				        }
					} catch (PortalException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        
			    }
		}
	    
		DynamicQuery dynamicQuery = _joinLocalService.dynamicQuery();
		if (seeAll == false)
			
	    //see only their own tasks if they are not either the admin or an MPL
		{
			dynamicQuery.add(PropertyFactoryUtil.forName("designAgency").eq(userId));	    	
	    }		
			
		if (query != null)
			
	    //see only their own tasks if they are not either the admin or an MPL
		{
			dynamicQuery.add(PropertyFactoryUtil.forName("projectName").like(query));	    	
	    }
		
		List<Join> join = _joinLocalService.dynamicQuery(dynamicQuery, start, end);
		int joinCount = (int) _joinLocalService.dynamicQueryCount(dynamicQuery);
		
		renderRequest.setAttribute("join", join);
		renderRequest.setAttribute("joinCount", joinCount);
					
		//gets the authtoken required for jsonws services, important security detail
		PortletRequest portletRequest = (PortletRequest) renderRequest.getAttribute("javax.portlet.request");
		HttpServletRequest httpReq = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(portletRequest));
		String auth = AuthTokenUtil.getToken(httpReq);
		renderRequest.setAttribute("authtoken", auth);
		
		System.out.println(auth);
		
		super.doView(renderRequest, renderResponse);
	
	}
	
}