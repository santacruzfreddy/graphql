package com.qnksoft.graphql.modelo;

import jakarta.persistence.Column;
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

    @Column(name = "first_name")
    String firstName;
    @Column(name = "second_name")
    String secondName;
    @Column(name = "first_last_name")
    String firstLastName;
    @Column(name = "second_last_name")
    String secondLastName;
}
