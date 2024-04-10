package com.qnksoft.graphql.infrastructure.adapters.out.persistences.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class ProductEntity {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    Integer productId;

    @Column(name = "product_name",columnDefinition = "")
    String productName;



}
