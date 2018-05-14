package com.dhcc.sfe.service.nav;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dhcc.sfe.repository.VProjectEstimate01Repository;
import com.dhcc.sfe.repository.VProjectEstimate02Repository;

@Service("IndexL2ViewNavService")
public class IndexL2ViewNavServiceImp implements IndexL2ViewNavService {

	@Resource
	private VProjectEstimate01Repository vProjectEstimate01Repository;
	@Resource
	private VProjectEstimate02Repository vProjectEstimate02Repository;
	
	@Override
	public List<?> queryEsRecordL2(String fProId, String fAssessmentId, String code) {
		
		List<?> list = new ArrayList<>();
		
		switch (code) {
		case "010000":
			list = vProjectEstimate01Repository.findByfAssessmentId(fAssessmentId);
			break;
		case "020000":
			list = vProjectEstimate02Repository.findByfAssessmentId(fAssessmentId);
		default:
			break;
		}
				
		return list;
	}

}
