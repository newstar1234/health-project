package com.example.health_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "workout")
@Table(name = "workout")
public class WorkoutEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workoutNumber;
    private String workoutName;
    private String set1;
    private String set2;
    private String set3;
    private String set4;
    private String set5;
    private String restTime;
    private int healthNumber;

}
