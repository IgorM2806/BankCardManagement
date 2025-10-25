package org.example.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.example.entity.RoleEnum;

@Data
public class CreateUserDTO {

    @NotNull(message = "Имя обязательно для заполнения.")
    private String firstName;
    @NotNull(message = "Имя обязательно для заполнения.")
    private String surname;
    @NotNull(message = "Имя обязательно для заполнения.")
    private String patronymic;
    @NotNull(message = "Имя обязательно для заполнения.")
    private RoleEnum role;

    private String passwordHash;


    public CreateUserDTO(String firstName, String surname, String patronymic, RoleEnum role, String passwordHash) {
        this.firstName = firstName;
        this.surname = surname;
        this.patronymic = patronymic;
        this.role = role;
        this.passwordHash = passwordHash;

    }
}
