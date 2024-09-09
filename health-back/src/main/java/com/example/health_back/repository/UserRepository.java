package com.example.health_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.health_back.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    
    UserEntity findByEmail(String email);

    boolean existsByEmail(String email);
    boolean existsByNickname(String nickname);

}
