package com.qnksoft.graphql.product.application;

import com.qnksoft.graphql.cliente.application.inputs.InputPerson;
import com.qnksoft.graphql.cliente.domain.model.Person;

public interface PersonServiceInterface {
    public Person createPerson(InputPerson inputPerson) throws Exception;

    public Person updatePerson(InputPerson inputPerson) throws Exception;

    public Person findPersonByIdentification(String identification);
}
