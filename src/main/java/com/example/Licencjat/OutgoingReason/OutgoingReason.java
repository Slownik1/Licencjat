package com.example.Licencjat.OutgoingReason;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="OutgoingReason")
@Data
public class OutgoingReason {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    public OutgoingReason() {
    }
}
