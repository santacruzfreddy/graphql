package com.qnksoft.graphql.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@Data
public class Person {

    @Id
    @GeneratedValue
    Integer personId;

    String firstName;
    String secondName;
    String firstLastName;
    String secondLastName;
}
