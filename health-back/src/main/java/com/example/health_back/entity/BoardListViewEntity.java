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
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "board_list_view")
@Table(name = "board_list_view")
public class BoardListViewEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardNumber;
    private String title;
    private String content; 
    private String boardDatetime;
    private String writerEmail;
    private String healthDatetime;
    private String protein;
    private String BCAA;
    private String booster;
    private String water;
    private String ETC;
    private String workoutName;
    private String set1;
    private String set2;
    private String set3;
    private String set4;
    private String set5;
    private String restTime;
}
