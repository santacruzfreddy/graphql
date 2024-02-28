package com.qnksoft.graphql.person.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "employeeId")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee extends Person {

    String job;

    //@OneToMany()
    //List<Rol> roles;


}
