package com.qnksoft.graphql.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private Integer age;
    
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Course.class)
    private Course course;
}
