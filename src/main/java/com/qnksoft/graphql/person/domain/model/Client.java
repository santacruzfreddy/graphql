package com.qnksoft.graphql.person.domain.model;

import com.qnksoft.graphql.person.domain.Enum.TypeOfTaxPayer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "clientId")
public class Client extends Person {
    
    @Column(name = "latitude")
    Long latitude;

    @Column(name = "length")
    Long length;

    @Column(length = 32, columnDefinition = "varchar(32) default 'UNKNOWN'")
    @Enumerated(value = EnumType.STRING)
    private TypeOfTaxPayer typeOfTaxPayer;

}
