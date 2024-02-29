package com.qnksoft.graphql.client.domain.repository;

import com.qnksoft.graphql.person.domain.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    Employee findByIdentification(String identification);
}
