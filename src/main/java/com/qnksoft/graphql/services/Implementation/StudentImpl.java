package com.qnksoft.graphql.services.Implementation;

import com.qnksoft.graphql.modelo.Student;
import com.qnksoft.graphql.persitencia.IStudentDAO;
import com.qnksoft.graphql.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentImpl implements IStudentServices {
    @Autowired
    IStudentDAO iStudentDAO;
    
    @Override
    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return iStudentDAO.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return (List<Student>) iStudentDAO.findAll();
    }

    @Override
    @Transactional
    public Student createStudent(Student student) {
        iStudentDAO.save(student);
        return student;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        iStudentDAO.deleteById(id);
    }
}
