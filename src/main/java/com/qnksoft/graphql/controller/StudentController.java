package com.qnksoft.graphql.controller;

import com.qnksoft.graphql.inputsGraphql.InputStudent;
import com.qnksoft.graphql.modelo.Course;
import com.qnksoft.graphql.modelo.Student;
import com.qnksoft.graphql.services.ICoursesServices;
import com.qnksoft.graphql.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private IStudentServices iStudentServices;

    @Autowired
    private ICoursesServices iCoursesServices;
    
    @QueryMapping(name = "findStudentById")
    public Student findById(@Argument(name = "studentId") String id)
    {
        Long studentId = Long.parseLong(id);
        return iStudentServices.findById(studentId);
    }

    @QueryMapping(name = "findAllStudents")
    public List<Student> findAll()
    {
        return iStudentServices.findAll();
    }
    
    @MutationMapping(name = "createStudent")
    public Student createStudent(@Argument(name = "inputStudent") InputStudent inputStudent)
    {
        Course curso = iCoursesServices.findById(Long.parseLong(inputStudent.getCourseId()));
        Student student=new Student();
        student.setName(inputStudent.getName());
        student.setLastName(inputStudent.getLastName());
        student.setAge(inputStudent.getAge());
        student.setCourse(curso);
        return iStudentServices.createStudent(student);
    }

    @MutationMapping(name = "deleteStudent")
    public String deleteStudent(@Argument(name = "studentId") String studentId)
    {
         iStudentServices.deleteById(Long.parseLong(studentId));
         return "Student delete";
    }
}
