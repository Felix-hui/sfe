package com.dhcc.sfe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhcc.sfe.entity.ProjectEstimateEntity;

@Repository
public interface ProjectEstimateRepository extends JpaRepository<ProjectEstimateEntity, String> {

	List<ProjectEstimateEntity> findByfProId(String proId);

	List<ProjectEstimateEntity> findByfProIdAndFAssessmentTag(String id, String tag);

}
