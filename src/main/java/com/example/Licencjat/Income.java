package com.example.Licencjat;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name= "income")
public class Income {

    @Id
    private Integer Id;

    @Min(value=0, message = "This value can not be less than 0")
    private BigDecimal Amount;

    @NotBlank(message = "This value can not be empty")
    private String user;

    public Income() {
    }
}
