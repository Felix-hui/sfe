package com.dhcc.sfe.service.A01;


import java.util.List;

import javax.annotation.Resource;
import javax.management.DefaultLoaderRepository;

import org.dom4j.tree.DefaultEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhcc.sfe.entity.FillSeaProjectEntity;
import com.dhcc.sfe.repository.FillSeaProjectRepository;

@Service("a0101Service")
@Transactional(readOnly=true)
public class A0101ServiceImp implements A0101Service {

	@Resource
	private  FillSeaProjectRepository fillSeaProjectsBaseInfoRepository;

	@Override
	public List<FillSeaProjectEntity> queryFillSeaProjects() {
		return fillSeaProjectsBaseInfoRepository.findAll();
	}
	


}
