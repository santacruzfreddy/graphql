package com.qnksoft.graphql.cliente.application.services;

import com.qnksoft.graphql.cliente.application.PersonServiceInterface;
import com.qnksoft.graphql.cliente.application.inputs.InputPerson;
import com.qnksoft.graphql.cliente.domain.Mapper.PersonMapper;
import com.qnksoft.graphql.cliente.domain.model.Person;
import com.qnksoft.graphql.cliente.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonServiceInterface {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person createPerson(InputPerson inputPerson) throws Exception {
        validatePersonCreate(inputPerson);
        return personRepository.save(PersonMapper.INSTANCE.inputPersonToPerson(inputPerson));
    }

    @Override
    public Person updatePerson(InputPerson inputPerson) throws Exception {
        return personRepository.save(getPersonForUpdate(inputPerson));
    }

    @Override
    public Person findPersonByIdentification(String identification) {
        return personRepository.findByIdentification(identification).orElseThrow();
    }

    public Person getPersonForUpdate(InputPerson inputPerson) throws Exception {
        if(!existPerson(inputPerson))
        {
         throw new Exception("Los Datos de la persona que se va actualizar no existen.");
        }
        if(!personIdExist(inputPerson))
        {
            throw new Exception("La persona enviada, no tiene definido su id no se puede actualizar.");
        }
        return personRepository.findById(inputPerson.getPersonId()).orElseThrow();
    }

    public boolean validatePersonCreate(InputPerson inputPerson) throws Exception {
        if(!existPerson(inputPerson))
        {
            throw new Exception("Los Datos enviados estan vacios.");
        }
        if(!identificationExist(inputPerson))
        {
            throw new Exception("La persona enviada, no tiene definido su identificación, no se puede crear.");
        }

        if(personRepository.findByIdentification(inputPerson.getIdentification()).isPresent())
        {
            throw new Exception("La persona enviada, ya existe con esa identificación, no se puede crear nuevamente.");
        }
        return true;
    }

    public boolean existPerson(InputPerson inputPerson)
    {
        return inputPerson!=null ? true : false;
    }
    public boolean personIdExist(InputPerson inputPerson)
    {
        return inputPerson.getPersonId()!=null ? true : false;
    }

    public boolean identificationExist(InputPerson inputPerson)
    {
        return inputPerson.getIdentification()!=null ? true : false;
    }

}
