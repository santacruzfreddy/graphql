package com.qnksoft.graphql.services;

import com.qnksoft.graphql.modelo.Student;

import java.util.List;

public interface IStudentServices {
    Student findById(Long id);
    
    List<Student> findAll();
    Student createStudent(Student student);
    void deleteById(Long id);
        
} 
