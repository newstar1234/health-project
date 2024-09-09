package com.example.health_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.health_back.entity.HealthEntity;

@Repository
public interface HealthRepository extends JpaRepository<HealthEntity, Integer> {
    
}
