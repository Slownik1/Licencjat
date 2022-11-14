package com.example.Licencjat;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
@Table(name = "outgoing")
@Data
public class outgoingModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;

    @Min(value = 0, message = "This value can not be less than 0")
    private BigDecimal amount;

    @NotBlank(message = "This value can not be blanc !")
    private String user;

    public outgoingModel() {
    }
}
