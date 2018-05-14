package com.dhcc.sfe.service.nav;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("IndexL2ViewNavService")
public interface IndexL2ViewNavService {

	List<?> queryEsRecordL2(String fProId, String fAssessmentId, String code);
	
}
