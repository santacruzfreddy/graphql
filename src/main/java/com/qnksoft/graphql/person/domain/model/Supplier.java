package com.qnksoft.graphql.person.domain.model;

import com.qnksoft.graphql.person.domain.model.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "supplierId")
public class Supplier extends Person {

}
