package com.qnksoft.graphql.person.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "employeeId")
@Data
public class Employee extends Person {

    @Column(name = "type_employee")
    char typeEmployee;

    String job;

    @OneToMany()
    List<Rol> roles;
}
