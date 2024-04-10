package com.qnksoft.graphql.infrastructure.adapters.out.persistences.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "companyId")
public class FootwearEntity extends ProductEntity {

    String color;
    String material;

}
