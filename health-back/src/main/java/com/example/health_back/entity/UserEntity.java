package com.example.health_back.entity;

import com.example.health_back.dto.request.authentication.SignUpRequestDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
@Table(name = "user")
public class UserEntity {
    
    @Id
    private String email;
    private String nickname;
    private String password;
    private boolean gender;
    private String address;
    private String addressDetail;

    public UserEntity(SignUpRequestDto dto) {
        this.email = dto.getEmail();
        this.nickname = dto.getNickname();
        this.password = dto.getPassword();
        this.gender = dto.getGender();
        this.address = dto.getAddress();
        this.addressDetail = dto.getAddressDetail();
    }

}
