package com.example.health_back.dto.request.authentication;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequestDto {
    
    @NotBlank @Email
    private String email;

    @NotBlank
    private String nickname;

    @NotBlank @Length(min = 8, max = 20)
    private String password;

    @NotNull
    private Boolean gender;

    @NotBlank
    private String address;

    private String addressDetail;

}
