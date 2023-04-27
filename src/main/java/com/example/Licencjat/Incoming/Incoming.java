package com.example.Licencjat.Incoming;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name= "incoming")
public class Incoming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Min(value=0, message = "This value can not be less than 0")
    private BigDecimal Amount;

    @NotBlank(message = "This value can not be empty")
    private String users;

    private String groupReason ="";

    private String description;

    public Incoming() {
    }
}
