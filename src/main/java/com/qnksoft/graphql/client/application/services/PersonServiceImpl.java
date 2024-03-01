package com.qnksoft.graphql.client.application.services;

import com.qnksoft.graphql.client.application.PersonServiceInterface;
import com.qnksoft.graphql.client.application.inputs.InputPerson;
import com.qnksoft.graphql.client.domain.Mapper.PersonMapper;
import com.qnksoft.graphql.client.domain.model.Person;
import com.qnksoft.graphql.client.domain.repository.PersonRepository;
import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.domain.Mapper.EmployeeMapper;
import com.qnksoft.graphql.person.domain.model.Employee;
import com.qnksoft.graphql.person.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonServiceInterface {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person createPerson(InputPerson inputPerson) {
        return personRepository.save(PersonMapper.INSTANCE.inputPersonToPerson(inputPerson));
    }

    @Override
    public Person findPersonByIdentification(String identification) {
        return personRepository.findByIdentification(identification);
    }
}
