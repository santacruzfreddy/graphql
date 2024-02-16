package com.qnksoft.graphql.services.Implementation;

import com.qnksoft.graphql.modelo.Course;
import com.qnksoft.graphql.persitencia.ICourseDAO;
import com.qnksoft.graphql.services.ICoursesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseImpl implements ICoursesServices {
    @Autowired
    ICourseDAO iCourseDAO;
    
    @Override
    @Transactional(readOnly = true)
    public Course findById(Long id) {
        return iCourseDAO.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return (List<Course>) iCourseDAO.findAll();
    }

    @Override
    @Transactional
    public void createCourse(Course course) {
        iCourseDAO.save(course);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
     iCourseDAO.deleteById(id);
    }
}
