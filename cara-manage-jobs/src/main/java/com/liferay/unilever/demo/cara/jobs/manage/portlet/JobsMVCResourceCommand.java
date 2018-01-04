package com.liferay.unilever.demo.cara.jobs.manage.portlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONSerializer;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.unilever.demo.cara.tasks.model.Tasks;
import com.liferay.unilever.demo.cara.tasks.service.TasksLocalService;



@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=com_liferay_cara_join",
	        "mvc.command.name=/jobs/breakdown"
	    },
	    service = MVCResourceCommand.class
)
public class JobsMVCResourceCommand implements MVCResourceCommand {
	
	@Reference(unbind = "-")
	 protected void setTasksLocalService(TasksLocalService tasksLocalService) {
		_tasksLocalService = tasksLocalService;
	 }
	private TasksLocalService _tasksLocalService;
	
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		try {
			ThemeDisplay themedisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			PrintWriter writer = resourceResponse.getWriter();
			String thisJobId = resourceRequest.getParameter("jobId");
			long jobId = Long.valueOf(thisJobId);
			DynamicQuery dynamicQuery = _tasksLocalService.dynamicQuery();
			dynamicQuery.add(PropertyFactoryUtil.forName("jobId").eq(jobId));
			List<Tasks> tasks = _tasksLocalService.dynamicQuery(dynamicQuery, 0, 1000);
			System.out.println(tasks);
			JSONSerializer jsonSerializer = JSONFactoryUtil.createJSONSerializer();
			String json = jsonSerializer.serialize(tasks);
			writer.write(json);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}




