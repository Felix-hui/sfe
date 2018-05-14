package com.dhcc.sfe.service.nav;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.dhcc.sfe.entity.FillSeaProjectEntity;
import com.dhcc.sfe.repository.FillSeaProjectRepository;

@Service("ProjectViewNavService")
public class ProjectViewNavServiceImp implements ProjectViewNavService {
	@Resource
	private  FillSeaProjectRepository fillSeaProjectsBaseInfoRepository;

	@Override
	public Page<FillSeaProjectEntity> queryFillSeaProjects(PageRequest pageRequest, String search) {
		if (StringUtils.isEmpty(search)) {
			return fillSeaProjectsBaseInfoRepository.findAll(pageRequest);
		} else {
			return fillSeaProjectsBaseInfoRepository.findByFProUsenameContaining(search, pageRequest);
		}
		
	}

}
