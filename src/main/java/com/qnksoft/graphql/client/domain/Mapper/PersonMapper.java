package com.qnksoft.graphql.client.domain.Mapper;

import com.qnksoft.graphql.client.application.inputs.InputPerson;
import com.qnksoft.graphql.client.domain.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);


    InputPerson personToInputPerson(Person person);

    //@InheritInverseConfiguration
    Person inputPersonToPerson(InputPerson inputPerson);

}
