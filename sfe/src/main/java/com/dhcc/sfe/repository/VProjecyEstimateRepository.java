package com.dhcc.sfe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhcc.sfe.entity.VProjectEstimateEntity;

@Repository
public interface VProjecyEstimateRepository extends JpaRepository<VProjectEstimateEntity, String> {

	List<VProjectEstimateEntity> findByfProId(String proId);

}
