package com.qnksoft.graphql.person.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "clientId")
public class Client extends Person {

    @Column(name = "latitude")
    Long latitude;

    @Column(name = "length")
    Long length;
}
