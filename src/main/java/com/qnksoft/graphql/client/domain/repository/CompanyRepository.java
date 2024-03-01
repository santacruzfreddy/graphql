package com.qnksoft.graphql.client.domain.repository;

import com.qnksoft.graphql.client.domain.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long> {

    Company findByRUC(String RUC);
}
