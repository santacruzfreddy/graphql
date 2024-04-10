package com.qnksoft.graphql.infrastructure.adapters.out.persistences.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "personId")
public class PersonEntity extends ClientEntity {

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


}
