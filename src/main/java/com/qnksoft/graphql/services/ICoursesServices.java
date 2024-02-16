package com.qnksoft.graphql.services;

import com.qnksoft.graphql.modelo.Course;

import java.util.List;

public interface ICoursesServices {
    Course findById(Long id);

    List<Course> findAll();
    void createCourse(Course course);
    void deleteById(Long id);

}
