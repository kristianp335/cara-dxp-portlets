package com.liferay.unilever.demo.cara.create.jobs.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.unilever.demo.cara.model.project;
import com.liferay.unilever.demo.cara.service.projectLocalService;

/**
 * @author kpatefield
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=cara-create-jobs Portlet",
		"javax.portlet.name=com_liferay_cara_create_jobs",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CreateJobsPortlet extends MVCPortlet {
	
	//get the projects service
	@Reference(unbind = "-")
	 protected void setprojectLocalService(projectLocalService myprojectLocalService) {
		_myprojectLocalService = myprojectLocalService;
	 }
	private projectLocalService _myprojectLocalService;
	
	
	public void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
		
	String query = renderRequest.getParameter("keywords");
	//String orderByCol = renderRequest.getParameter("orderByCol");
	String pagingString = renderRequest.getParameter("cur1");
	//String projectCategoryFilter = renderRequest.getParameter("projectCategory");
	
	// using Liferay's Dynamic Query engine to group data and create a list for filters
	// Alternate way of running a dynamic query, throws exception but works?
	//DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(project.class, "project", PortletClassLoaderUtil.getClassLoader("project"));
	//dynamicQuery.setProjection(ProjectionFactoryUtil.groupProperty("project.projectCategory"));
	DynamicQuery dynamicQuery = _myprojectLocalService.dynamicQuery();
	dynamicQuery.setProjection(ProjectionFactoryUtil.groupProperty("projectCategory"));	
	List<String> projectCategory = _myprojectLocalService.dynamicQuery(dynamicQuery);
		
	//pushing paging information
	
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
	
	//performing the query
	
	List<project> projectList = null;
	
	DynamicQuery projectDynamicQuery = _myprojectLocalService.dynamicQuery();
	projectDynamicQuery.add(PropertyFactoryUtil.forName("projectType").eq("Non-IPM"));
	if (query != null) 
	{
		projectDynamicQuery.add(PropertyFactoryUtil.forName("projectName").eq(query));
	}
	projectList = _myprojectLocalService.dynamicQuery(projectDynamicQuery, start, end);
	//projectList = _myprojectLocalService.getprojects(start, end);
	
		
	//ipm projects for the IPM tab
	List<project> ipmProjectList = null;
	DynamicQuery ipmProjectDynamicQuery = _myprojectLocalService.dynamicQuery();
	ipmProjectDynamicQuery.add(RestrictionsFactoryUtil.not(PropertyFactoryUtil.forName("projectType").like("Non")));
	if (query != null) 
	{
		ipmProjectDynamicQuery.add(PropertyFactoryUtil.forName("projectName").eq(query));
	}
	ipmProjectList = _myprojectLocalService.dynamicQuery(ipmProjectDynamicQuery, start, end);
	
	
	
				
	
	int projectCount = projectList.size();
	renderRequest.setAttribute("projectCount", projectCount);
	renderRequest.setAttribute("ipmProjectList", ipmProjectList);
	renderRequest.setAttribute("projectList", projectList);
	renderRequest.setAttribute("projectCategory", projectCategory);
	
	super.doView(renderRequest, renderResponse);
		
		
	}
	
}