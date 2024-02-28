package com.qnksoft.graphql.person.application.services;

import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.application.EmployeeServiceInterface;
import com.qnksoft.graphql.person.domain.model.Employee;
import com.qnksoft.graphql.person.domain.model.Person;
import com.qnksoft.graphql.person.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

    @Autowired
    EmployeeRepository personRepository;

    @Override
    public Employee createEmployee(InputEmployee inputEmployee) {
        Employee person = new Employee();
        person.setIdentification(inputEmployee.getIdentification());
        person.setEmail(inputEmployee.getEmail());
        person.setAddress(inputEmployee.getAddress());

        return (Employee) personRepository.save(person);
    }
}
