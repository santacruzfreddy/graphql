package com.qnksoft.graphql.persitencia;

import org.springframework.data.repository.CrudRepository;
import com.qnksoft.graphql.modelo.Student;

public interface IStudentDAO extends CrudRepository<Student,Long> {
}
