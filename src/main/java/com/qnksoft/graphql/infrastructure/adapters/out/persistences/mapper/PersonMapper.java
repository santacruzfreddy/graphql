package com.qnksoft.graphql.infrastructure.adapters.out.persistences.mapper;

import com.qnksoft.graphql.domain.model.Person;
import com.qnksoft.graphql.infrastructure.adapters.out.persistences.models.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);


    PersonEntity toEntity(Person person);

    //@InheritInverseConfiguration
    Person entityTo(PersonEntity personEntity);

}
