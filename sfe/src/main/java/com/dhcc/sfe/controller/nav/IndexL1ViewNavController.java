package com.dhcc.sfe.controller.nav;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.sfe.service.nav.IndexL1ViewNavService;

@Transactional(readOnly=true)
@Controller
@RequestMapping("/nav")
public class IndexL1ViewNavController {
	
	@Resource
	private IndexL1ViewNavService indexL1ViewNavService;
	
	
	/*围填海项目评估导航页*/
	@RequestMapping("/indexL1View/{id}")
	public String indexL1View(@PathVariable String id, Model model) {
		model.addAttribute("fProId", id);
		model.addAttribute("fProUsename", indexL1ViewNavService.getUseNameByProId(id));
   		return "thl/nav/indexL1View";
	}
	
	@ResponseBody
	@RequestMapping("/indexL1View/all")
	public Map<String, Object> indexL1ViewAll(String id){
		Map<String, Object> map = new HashMap<>();
		map.put("data", indexL1ViewNavService.queryEsRecordByProId(id));
		return map ;
	}

	@Transactional(readOnly=false)
	@ResponseBody
	@RequestMapping("/indexL1View/add/{id}")
	public Map<String, Object> indexL1ViewAdd(@PathVariable String id){
		Map<String, Object> map = new HashMap<>();
		if (indexL1ViewNavService.checkHasUndoneEs(id)) {
			map.put("msg", "hasUndoneEs");
		} else {
			indexL1ViewNavService.addEsRecord(id);
			map.put("msg", "success");
		}
		
		return map ;
	}
	
	@Transactional(readOnly=false)
	@ResponseBody
	@RequestMapping("/indexL1View/del/{id}")
	public Map<String, Object> indexL1ViewDel(@PathVariable String id){
		Map<String, Object> map = new HashMap<>();
		indexL1ViewNavService.delEsRecord(id);
		map.put("msg", "success");
		return map ;
	}
}
