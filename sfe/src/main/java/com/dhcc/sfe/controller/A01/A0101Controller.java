package com.dhcc.sfe.controller.A01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.sfe.service.A01.A0101Service;

/*
 * A01：生态用海情况 
 * - A0101：生态化平面设计指标计算
 * */
@Controller
@RequestMapping("/a01/a0101")
public class A0101Controller {
	
	@Resource
	private A0101Service a0101Service;	
	
	@RequestMapping("/list")
	public String List(Model model) {
		//model.addAttribute("list", a0101Service.queryFillSeaProjects());

		return "thl/a01/a0101List";
	}
	
	@ResponseBody
	@RequestMapping("/queryAll")	
	public Map<String, Object> queryAll() {
		Map<String, Object> map = new HashMap<>();
		map.put("data", a0101Service.queryFillSeaProjects());
		return map ;
	}
	
}
