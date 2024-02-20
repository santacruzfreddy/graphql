package com.qnksoft.graphql.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "supplierId")
public class Supplier extends Person{
}
