package com.qnksoft.graphql.client.application;

import com.qnksoft.graphql.client.domain.model.Person;
import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.domain.model.Employee;

public interface PersonServiceInterface {
    public Person createPerson(InputEmployee inputEmployee);

    public Employee findEmployeeByIdentification(String identification);
}
