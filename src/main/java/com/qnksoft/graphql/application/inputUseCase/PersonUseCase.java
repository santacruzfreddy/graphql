package com.qnksoft.graphql.application.inputUseCase;

import com.qnksoft.graphql.domain.ports.out.PersonOutPort;
import com.qnksoft.graphql.domain.ports.in.PersonInputPort;
import com.qnksoft.graphql.domain.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonUseCase implements PersonInputPort {

    @Autowired
    PersonOutPort personOutPort;

    @Override
    public Person createPerson(Person person) {
        return personOutPort.save(person);
    }

    @Override
    public Person findPersonByIdentification(String identification) {
        return personOutPort.findByIdentification(identification);
    }
}
