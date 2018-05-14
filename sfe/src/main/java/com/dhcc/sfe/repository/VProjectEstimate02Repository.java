package com.dhcc.sfe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhcc.sfe.entity.VProjectEstimate02Entity;

public interface VProjectEstimate02Repository extends JpaRepository<VProjectEstimate02Entity, String> {
	List<?> findByfAssessmentId(String fAssessmentId);
}
