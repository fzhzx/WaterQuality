package com.hman.water.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hman.water.model.RiverAreaPointInfo;
import com.hman.water.service.RiverAreaPointInfoServiceI;

@Controller
@RequestMapping("riverAreaPointInfoController")
public class RiverAreaPointInfoController {
	
	public RiverAreaPointInfoServiceI riverAreaPointInfoService;
	
	public RiverAreaPointInfoServiceI getRiverAreaPointInfoService() {
		return riverAreaPointInfoService;
	}

	@Autowired
	public void setRiverAreaPointInfoService(
			RiverAreaPointInfoServiceI riverAreaPointInfoService) {
		this.riverAreaPointInfoService = riverAreaPointInfoService;
	}



	@RequestMapping("/showUser")
	public String showUser(String id, HttpServletRequest request,HttpServletResponse response) {
		RiverAreaPointInfo rapi = riverAreaPointInfoService.getRiverAreaPointInfoById(Integer.valueOf(id));
		System.out.println("id:" + id + "; name:"+ rapi.getcName());
		request.setAttribute("user", rapi);
		return "showUser";
	}

}
