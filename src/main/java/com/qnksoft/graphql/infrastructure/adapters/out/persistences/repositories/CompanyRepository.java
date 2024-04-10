package com.qnksoft.graphql.infrastructure.adapters.out.persistences.repositories;

import com.qnksoft.graphql.domain.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long> {

    Company findByRUC(String RUC);
}
