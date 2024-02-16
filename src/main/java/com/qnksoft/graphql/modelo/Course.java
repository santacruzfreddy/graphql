package com.qnksoft.graphql.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "courses")
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    
    private String name;
    private String category;
    private String teacher;
    
    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY, cascade = CascadeType.ALL,targetEntity = Student.class)
    private  List<Student> studentList;

}
