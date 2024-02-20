package com.qnksoft.graphql.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity
@PrimaryKeyJoinColumn(name = "employeeId")
@Data
public class Employee extends Person{

    @Column(name = "type_employee")
    char typeEmployee;

}
