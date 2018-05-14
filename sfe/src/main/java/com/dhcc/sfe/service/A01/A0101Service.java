package com.dhcc.sfe.service.A01;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhcc.sfe.entity.FillSeaProjectEntity;

@Service("a0101Service")
public interface A0101Service {

	List<FillSeaProjectEntity> queryFillSeaProjects();
}
