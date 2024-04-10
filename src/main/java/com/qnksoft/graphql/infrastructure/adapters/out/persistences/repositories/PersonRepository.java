package com.qnksoft.graphql.infrastructure.adapters.out.persistences.repositories;

import com.qnksoft.graphql.domain.model.Person;
import com.qnksoft.graphql.infrastructure.adapters.out.persistences.models.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity,Long> {

    Person findByIdentification(String identification);
}
