package com.example.Licencjat;

import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.NotFound;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class outgoingsGroupModel {

    Long id;

    String description;

}
