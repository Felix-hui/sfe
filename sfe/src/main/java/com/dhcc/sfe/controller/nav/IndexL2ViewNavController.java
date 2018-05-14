package com.dhcc.sfe.controller.nav;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.sfe.service.nav.IndexL1ViewNavService;
import com.dhcc.sfe.service.nav.IndexL2ViewNavService;

@Controller
@RequestMapping("/nav")
public class IndexL2ViewNavController {
	
	@Resource
	private IndexL2ViewNavService indexL2ViewNavService;
	@Resource
	private IndexL1ViewNavService indexL1ViewNavService;
	
	/*围填海项目评估导航页*/
	@RequestMapping("/indexL2View")
	public String indexL2View(String fProId, String fAssessmentId, String code, Model model) {
		model.addAttribute("fProId", fProId);
		model.addAttribute("fAssessmentId", fAssessmentId);
		model.addAttribute("code", code);
		model.addAttribute("fProUsename", indexL1ViewNavService.getUseNameByProId(fProId));
		return "thl/nav/indexL2View";
	}
	
	@ResponseBody
	@RequestMapping("/indexL2View/all")
	public Map<String, ?> indexL2ViewAll(String fProId, String fAssessmentId, String code){
		Map<String, Object> map = new HashMap<>();			
		List<?> list = indexL2ViewNavService.queryEsRecordL2(fProId, fAssessmentId, code);
		map.put("data", list);
		return map ;
	} 
}
