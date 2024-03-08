package com.qnksoft.graphql.cliente.interfaces.resolvers;

import com.qnksoft.graphql.cliente.application.PersonServiceInterface;
import com.qnksoft.graphql.cliente.application.inputs.InputPerson;
import com.qnksoft.graphql.cliente.domain.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PersonResolver {

    @Autowired
    PersonServiceInterface personServiceInterface;

    @MutationMapping(name = "createPerson")
    public Person createPerson(@Argument(name = "inputPerson") InputPerson inputPerson) throws Exception {
        return personServiceInterface.createPerson(inputPerson);
    }

    @MutationMapping(name = "updatePerson")
    public Person updatePerson(@Argument(name = "inputPerson") InputPerson inputPerson) throws Exception {
        return personServiceInterface.createPerson(inputPerson);
    }



    @QueryMapping(name = "findPersonByIdentification")
    public Person findPersonByIdentification(@Argument(name = "identification") String identification)
    {
        return personServiceInterface.findPersonByIdentification(identification);
    }
}
