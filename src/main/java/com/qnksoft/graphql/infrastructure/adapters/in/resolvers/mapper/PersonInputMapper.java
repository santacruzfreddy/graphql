package com.qnksoft.graphql.infrastructure.adapters.in.resolvers.mapper;

import com.qnksoft.graphql.domain.model.Person;
import com.qnksoft.graphql.infrastructure.adapters.in.resolvers.inputs.InputPerson;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonInputMapper {

    PersonInputMapper INSTANCE = Mappers.getMapper(PersonInputMapper.class);

    Person toObjet(InputPerson inputPerson);

    InputPerson objectTo(Person person);

}
