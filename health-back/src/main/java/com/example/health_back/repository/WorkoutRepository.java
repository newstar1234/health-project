package com.example.health_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.health_back.entity.WorkoutEntity;

@Repository
public interface WorkoutRepository extends JpaRepository<WorkoutEntity, Integer> {
    
}
