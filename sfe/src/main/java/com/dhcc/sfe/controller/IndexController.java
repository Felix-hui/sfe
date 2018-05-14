package com.dhcc.sfe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index(HttpSession session, HttpServletRequest req) {
		session.setAttribute("ctx", req.getServletContext().getContextPath());
		return "thl/index";
	}
	
	@RequestMapping("/welcome")
	public String defaultPage() {
		return "thl/welcome";
	} 
	
	@RequestMapping("/demo")
	public String demo() {
		return "ftl/demo/demo";
	}
	
	@RequestMapping("/demobak")
	public String demobak() {
		return "ftl/demo/demobak";
	}	
}
