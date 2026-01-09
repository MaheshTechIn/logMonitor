package com.project.logMonitor.repository;

import com.project.logMonitor.entity.LogEntity;
//import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;

public interface LogRepository extends JpaRepository<LogEntity, Long> {

    Page<LogEntity> findByLevel(String level, Pageable pageable);
    Page<LogEntity> findByService(String service, Pageable pageable);
    Page<LogEntity> findByLevelAndService(String level, String service, Pageable pageable);
}
