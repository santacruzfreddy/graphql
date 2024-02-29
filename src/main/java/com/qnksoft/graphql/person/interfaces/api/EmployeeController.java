package com.qnksoft.graphql.person.interfaces.api;

import com.qnksoft.graphql.person.application.EmployeeServiceInterface;
import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.domain.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeServiceInterface employeeServiceInterface;

    @MutationMapping(name = "createEmployee")
    public Employee createEmployee(@Argument(name = "inputEmployee") InputEmployee inputEmployee)
    {
        return employeeServiceInterface.createEmployee(inputEmployee);
    }
    @QueryMapping(name = "findEmployeeByIdentification")
    public Employee findEmployeeByIdentification(@Argument(name = "identification") String identification)
    {
        return employeeServiceInterface.findEmployeeByIdentification(identification);
    }
}
