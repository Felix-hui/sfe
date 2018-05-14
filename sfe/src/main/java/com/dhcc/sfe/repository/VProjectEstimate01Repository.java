package com.dhcc.sfe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhcc.sfe.entity.VProjectEstimate01Entity;

@Repository
public interface VProjectEstimate01Repository extends JpaRepository<VProjectEstimate01Entity, String> {

	List<?> findByfAssessmentId(String fAssessmentId);

}
