package com.qnksoft.graphql.client.application;

import com.qnksoft.graphql.client.application.inputs.InputPerson;
import com.qnksoft.graphql.client.domain.model.Person;

public interface PersonServiceInterface {
    public Person createPerson(InputPerson inputPerson) throws Exception;

    public Person updatePerson(InputPerson inputPerson) throws Exception;

    public Person findPersonByIdentification(String identification);
}
