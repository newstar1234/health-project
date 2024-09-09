package com.example.health_back.dto.response.authentication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.health_back.common.ResponseCode;
import com.example.health_back.common.ResponseMessage;
import com.example.health_back.dto.response.ResponseDto;

import lombok.Getter;

@Getter
public class SignUpResponseDto extends ResponseDto {
    
    private SignUpResponseDto() {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    }

    public static ResponseEntity<SignUpResponseDto> success() {
        SignUpResponseDto result = new SignUpResponseDto();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> duplicationEmail() {
        ResponseDto result = new ResponseDto(ResponseCode.DUPLICATION_EMAIL, ResponseMessage.DUPLICATION_EMAIL);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

    public static ResponseEntity<ResponseDto> duplicationNickname() {
        ResponseDto result = new ResponseDto(ResponseCode.DUPLICATION_NICKNAME, ResponseMessage.DUPLICATION_NICKNAME);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

}
