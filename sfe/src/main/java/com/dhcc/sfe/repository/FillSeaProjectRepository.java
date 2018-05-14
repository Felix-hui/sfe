package com.dhcc.sfe.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhcc.sfe.entity.FillSeaProjectEntity;

@Repository
public interface FillSeaProjectRepository extends JpaRepository<FillSeaProjectEntity, String> {

	Page<FillSeaProjectEntity> findByFProUsenameContaining(String search, Pageable pageable);

}
