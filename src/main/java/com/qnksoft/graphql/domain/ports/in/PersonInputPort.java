package com.qnksoft.graphql.domain.ports.in;

import com.qnksoft.graphql.infrastructure.adapters.in.resolvers.inputs.InputPerson;

import com.qnksoft.graphql.domain.model.Person;

public interface PersonInputPort {
    public Person createPerson(Person person);
    public Person findPersonByIdentification(String identification);
}
