package com.dhcc.sfe.service.nav;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dhcc.sfe.entity.ProjectEstimateEntity;
import com.dhcc.sfe.entity.VProjectEstimateEntity;
import com.dhcc.sfe.repository.FillSeaProjectRepository;
import com.dhcc.sfe.repository.ProjectEstimateRepository;
import com.dhcc.sfe.repository.VProjecyEstimateRepository;

@Service("IndexL1ViewNavService")
public class IndexL1ViewNavServiceImp implements IndexL1ViewNavService {
	
	@Resource
	private ProjectEstimateRepository projectEstimateRepository;
	@Resource
	private VProjecyEstimateRepository vProjecyEstimateRepository;
	@Resource
	FillSeaProjectRepository fillSeaProjectRepository;

	@Override
	public List<VProjectEstimateEntity> queryEsRecordByProId(String proId) {
		return vProjecyEstimateRepository.findByfProId(proId);
	}

	@Override
	public String getUseNameByProId(String proId) {
		// TODO Auto-generated method stub
		return fillSeaProjectRepository.getOne(proId).getfProUsename();
	}

	@Override
	public void addEsRecord(String id) {
		ProjectEstimateEntity projectEstimateEntity = new ProjectEstimateEntity();
		projectEstimateEntity.setfProId(id);
		projectEstimateEntity.setfAssessmentTag("0");
		
		projectEstimateRepository.save(projectEstimateEntity);
		
	}

	@Override
	public void delEsRecord(String id) {		
		projectEstimateRepository.deleteById(id);		
	}

	@Override
	public boolean checkHasUndoneEs(String id) {
		List<ProjectEstimateEntity> list = projectEstimateRepository.findByfProIdAndFAssessmentTag(id, "0");
		return list.size() > 0;
	}
}
