package com.dhcc.sfe.service.nav;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.dhcc.sfe.entity.FillSeaProjectEntity;

@Service("ProjectViewNavService")
public interface ProjectViewNavService {
	Page<FillSeaProjectEntity> queryFillSeaProjects(PageRequest pageRequest, String search);
}
