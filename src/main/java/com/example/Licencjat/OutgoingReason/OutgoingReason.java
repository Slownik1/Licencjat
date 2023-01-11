package com.example.Licencjat.OutgoingReason;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="OutgoingReason")
@Data
public class OutgoingReason {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    String name;

    public OutgoingReason() {
    }
}
