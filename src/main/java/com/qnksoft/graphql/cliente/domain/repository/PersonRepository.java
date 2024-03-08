package com.qnksoft.graphql.cliente.domain.repository;

import com.qnksoft.graphql.cliente.domain.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {

    Optional<Person> findByIdentification(String identification);
}
