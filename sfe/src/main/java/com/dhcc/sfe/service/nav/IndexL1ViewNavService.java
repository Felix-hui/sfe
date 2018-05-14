package com.dhcc.sfe.service.nav;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhcc.sfe.entity.VProjectEstimateEntity;

@Service("IndexL1ViewNavService")
public interface IndexL1ViewNavService {
	
	List<VProjectEstimateEntity> queryEsRecordByProId(String proId);
	
	String getUseNameByProId(String proId);

	void addEsRecord(String id);

	void delEsRecord(String id);

	boolean checkHasUndoneEs(String id);
}
