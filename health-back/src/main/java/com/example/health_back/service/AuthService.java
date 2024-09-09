package com.example.health_back.service;

import org.springframework.http.ResponseEntity;

import com.example.health_back.dto.request.authentication.SignInRequestDto;
import com.example.health_back.dto.request.authentication.SignUpRequestDto;
import com.example.health_back.dto.response.authentication.SignInResponseDto;
import com.example.health_back.dto.response.authentication.SignUpResponseDto;

public interface AuthService {
    
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);

}
