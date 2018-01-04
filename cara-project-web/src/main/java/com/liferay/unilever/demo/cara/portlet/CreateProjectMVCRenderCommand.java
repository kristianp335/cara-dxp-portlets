package com.liferay.unilever.demo.cara.portlet;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=com_liferay_cara_project",
			"mvc.command.name=/create/createrender"
	},
		
		service = MVCRenderCommand.class)

public class CreateProjectMVCRenderCommand implements MVCRenderCommand  {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		String projectBrand = ParamUtil.getString(renderRequest, "projectBrand", "unknown");
		String brandPosition = ParamUtil.getString(renderRequest, "brandPosition", "unknown");
		String projectName = ParamUtil.getString(renderRequest, "projectName", "unknown");
		String projectCategory = ParamUtil.getString(renderRequest, "projectCategory", "unknown");
		String projectType = ParamUtil.getString(renderRequest, "projectType", "unknown");
		String charterDate = ParamUtil.getString(renderRequest, "charterDate", "unknown");
		String redirect = ParamUtil.getString(renderRequest, "redirect", "unknown");		
		
		
		DateFormat format = new SimpleDateFormat("EEE MMM dd hh:mm:SS z yyyy", Locale.ENGLISH );
		Date charterDateConverted = new Date();
		try {
			charterDateConverted = format.parse(charterDate);
			System.out.println(charterDateConverted);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int charterDay = charterDateConverted.getDate();
		int charterMonth = charterDateConverted.getMonth();	
		int charterYear = charterDateConverted.getYear() + 1900;
		
		
		Date today = new Date();
		
		int todayDay = today.getDate();
		int todayMonth = today.getMonth();
		int todayYear = today.getYear() + 1900;		
		
		renderRequest.setAttribute("projectBrand", projectBrand);
		renderRequest.setAttribute("brandPosition", brandPosition);
		renderRequest.setAttribute("projectName", projectName);
		renderRequest.setAttribute("projectCategory", projectCategory);
		renderRequest.setAttribute("projectType", projectType);
		renderRequest.setAttribute("charterDate", charterDate);
		renderRequest.setAttribute("redirect", redirect);
		
		renderRequest.setAttribute("charterDay", charterDay);
		renderRequest.setAttribute("charterMonth", charterMonth);
		renderRequest.setAttribute("charterYear", charterYear);
		renderRequest.setAttribute("todayDay", todayDay);
		renderRequest.setAttribute("todayMonth", todayMonth);
		renderRequest.setAttribute("todayYear", todayYear);		
						
		
		return "/work/create.jsp";
		
	}

}
