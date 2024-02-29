package com.qnksoft.graphql.client.application.services;

import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.application.EmployeeServiceInterface;
import com.qnksoft.graphql.person.domain.Mapper.EmployeeMapper;
import com.qnksoft.graphql.person.domain.model.Employee;
import com.qnksoft.graphql.person.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(InputEmployee inputEmployee) {
        return employeeRepository.save(EmployeeMapper.INSTANCE.inputEmployeeToEmployee(inputEmployee));
    }

    @Override
    public Employee findEmployeeByIdentification(String identification) {
        return employeeRepository.findByIdentification(identification);
    }
}
