package com.example.Licencjat;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "outgoing")
@Data
public class outgoingModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;

    private Double amount;


}
