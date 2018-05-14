package com.dhcc.sfe.controller.nav;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.sfe.service.nav.ProjectViewNavService;

@Controller
@RequestMapping("/nav")
public class ProjectViewNavController {
	@Resource
	private ProjectViewNavService projectViewNavService;
	
	/*围填海项目评估导航页*/
	@RequestMapping("/projectView")
	public String projectView() {
		return "thl/nav/projectView";
	}
	
	/*查询围填海项目列表*/
	@ResponseBody
	@RequestMapping("/projectView/all")
	public Map<String, Object> projectViewAll(int pageIndex, int pageSize, String proUseName) {
		Map<String, Object> map = new HashMap<>();
		Page<?> page = projectViewNavService.queryFillSeaProjects(PageRequest.of(pageIndex, pageSize, new Sort(Direction.ASC, "fProUsename")), proUseName);
		map.put("rows", page.getContent());	
		map.put("total", page.getTotalElements());	
		return map ;
	}
	
}
