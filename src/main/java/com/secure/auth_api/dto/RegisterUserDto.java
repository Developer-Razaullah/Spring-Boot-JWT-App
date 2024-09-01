package com.secure.auth_api.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterUserDto {

    @NotBlank(message = "email may not be null or blank")
    private String email;
    @NotBlank(message = "password may not be null or blank")
    private String password;
    @NotBlank(message = "fullName may not be null or blank")
    private String fullName;

}
