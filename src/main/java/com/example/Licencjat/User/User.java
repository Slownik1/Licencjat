package com.example.Licencjat.User;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    @NotBlank(message="This value can not be blanc !")
    private String Name;

    @NotBlank(message="This value can not be blanc !")
    private String Role;

}
