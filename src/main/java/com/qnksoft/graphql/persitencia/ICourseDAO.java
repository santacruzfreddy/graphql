package com.qnksoft.graphql.persitencia;

import com.qnksoft.graphql.modelo.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseDAO extends CrudRepository<Course,Long> {
}
