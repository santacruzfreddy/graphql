package com.qnksoft.graphql.person.application;

import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.domain.model.Employee;

public interface EmployeeServiceInterface {
    public Employee createEmployee(InputEmployee inputEmployee);

    public Employee findEmployeeByIdentification(String identification);
}
