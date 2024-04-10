package com.qnksoft.graphql.infrastructure.adapters.out.persistences.models;

import com.qnksoft.graphql.domain.Enum.TypeOfTaxPayer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ClientEntity {

    @Id
    @GeneratedValue
    @Column(name = "client_id")
    Integer clientId;

    @Column(columnDefinition = "")
    String observation;

    @Column(name = "email",columnDefinition = "")
    String email;

    @Column(name = "phone",columnDefinition = "")
    String phone;

    @Column(name = "address",columnDefinition = "")
    String address;

    @Column(name = "latitude")
    Long latitude;

    @Column(name = "length")
    Long length;

    @Column(name = "type_of_taxpayer", length = 32, columnDefinition = "varchar(32) default 'UNKNOWN'")
    @Enumerated(value = EnumType.STRING)
    private TypeOfTaxPayer typeOfTaxPayer;

}
