package com.qnksoft.graphql.person.domain.model;

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

    @Column(length = 15, nullable = false)
    String identification;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "second_name")
    String secondName;

    @Column(name = "first_last_name")
    String firstLastName;

    @Column(name = "second_last_name")
    String secondLastName;

    @Column(name = "email",columnDefinition = "")
    String email;

    @Column(name = "phone",columnDefinition = "")
    String phone;

    @Column(name = "address",columnDefinition = "")
    String address;

}
