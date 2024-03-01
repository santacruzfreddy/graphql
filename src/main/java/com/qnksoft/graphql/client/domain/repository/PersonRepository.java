package com.qnksoft.graphql.client.domain.repository;

import com.qnksoft.graphql.client.domain.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

    Person findByIdentification(String identification);
}
