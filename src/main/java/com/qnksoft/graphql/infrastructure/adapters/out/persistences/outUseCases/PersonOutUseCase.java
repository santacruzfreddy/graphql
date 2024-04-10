package com.qnksoft.graphql.infrastructure.adapters.out.persistences.outUseCases;

import com.qnksoft.graphql.domain.model.Person;
import com.qnksoft.graphql.domain.ports.out.PersonOutPort;
import com.qnksoft.graphql.infrastructure.adapters.out.persistences.mapper.PersonMapper;
import com.qnksoft.graphql.infrastructure.adapters.out.persistences.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonOutUseCase implements PersonOutPort {
    @Autowired
    PersonRepository personRepository;
    
    @Autowired
    PersonMapper personMapper;
    
    @Override
    public Person save(Person person) {
        return personMapper.toPerson(personRepository.save(personMapper.toEntity(person)));
    }

    @Override
    public Person findByIdentification(String identification) {
        return null;
    }
}
