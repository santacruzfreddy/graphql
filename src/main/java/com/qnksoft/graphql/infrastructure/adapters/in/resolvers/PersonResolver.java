package com.qnksoft.graphql.infrastructure.adapters.in.resolvers;

import com.qnksoft.graphql.domain.ports.in.PersonInputPort;
import com.qnksoft.graphql.infrastructure.adapters.in.resolvers.inputs.InputPerson;
import com.qnksoft.graphql.domain.model.Person;
import com.qnksoft.graphql.infrastructure.adapters.in.resolvers.mapper.PersonInputMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PersonResolver {

    @Autowired
    PersonInputPort personInputPort;
        
    PersonInputMapper personInputMapper;

    @MutationMapping(name = "createPerson")
    public Person createPerson(@Argument(name = "inputPerson") InputPerson inputPerson)
    {
        return personInputPort.createPerson(personInputMapper.toObjet(inputPerson));
    }
    @QueryMapping(name = "findPersonByIdentification")
    public Person findPersonByIdentification(@Argument(name = "identification") String identification)
    {
        return personInputPort.findPersonByIdentification(identification);
    }
}
