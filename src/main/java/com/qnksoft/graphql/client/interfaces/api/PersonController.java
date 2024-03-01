package com.qnksoft.graphql.client.interfaces.api;

import com.qnksoft.graphql.client.application.PersonServiceInterface;
import com.qnksoft.graphql.client.application.inputs.InputPerson;
import com.qnksoft.graphql.client.domain.model.Person;
import com.qnksoft.graphql.person.application.EmployeeServiceInterface;
import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.domain.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {

    @Autowired
    PersonServiceInterface personServiceInterface;

    @MutationMapping(name = "createPerson")
    public Person createPerson(@Argument(name = "inputPerson") InputPerson inputPerson)
    {
        return personServiceInterface.createPerson(inputPerson);
    }
    @QueryMapping(name = "findPersonByIdentification")
    public Person findPersonByIdentification(@Argument(name = "identification") String identification)
    {
        return personServiceInterface.findPersonByIdentification(identification);
    }
}
