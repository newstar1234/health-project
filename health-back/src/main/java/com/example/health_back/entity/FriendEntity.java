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
@Entity(name = "friend")
@Table(name = "friend")
public class FriendEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int friendNumber;
    private String friendEmail;
    private boolean friendShip;
    private String myEmail;

}
