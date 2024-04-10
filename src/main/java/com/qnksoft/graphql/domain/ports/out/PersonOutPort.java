package com.qnksoft.graphql.domain.ports.out;

import com.qnksoft.graphql.domain.model.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonOutPort {
    public Person save(Person person);
    public Person findByIdentification(String identification);
}
