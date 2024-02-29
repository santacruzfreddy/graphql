package com.qnksoft.graphql.person.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
@Entity
@PrimaryKeyJoinColumn(name = "employeeId")
public class Employee extends Person {

    String job;

    //@OneToMany()
    //List<Rol> roles;


}
