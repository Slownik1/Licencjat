package com.example.Licencjat.Outgoing;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@Entity
@Table(name = "outgoing")
@Data
public class Outgoing {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;

    @Min(value = 0, message = "This value can not be less than 0")
    private Double amount;

    @NotBlank(message = "This value can not be blanc !")
    private String users;

    private String groupReason ="";

    private String description;

    private LocalDate insertDate = LocalDate.now();

    public Outgoing() {
    }
}
