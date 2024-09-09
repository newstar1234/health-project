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
@Entity(name = "health")
@Table(name = "health")
public class HealthEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int healthNumber;
    private String healthDatetime;
    private String protein;
    private String BCAA;
    private String booster;
    private String water;
    private String ETC;
    private int boardNumber;

}
