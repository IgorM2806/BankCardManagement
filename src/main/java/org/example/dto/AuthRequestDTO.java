package org.example.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class AuthRequestDTO {
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Please provide a valid email address")
    private String email;

    @NotBlank(message = "Password is mandatory")
    private String password;

    public AuthRequestDTO() {}

    public AuthRequestDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthRequestDTO{" +
                "email='" + email + '\'' +
                ", password='******'" + // Скрываем реальный пароль
                '}';
    }
}
