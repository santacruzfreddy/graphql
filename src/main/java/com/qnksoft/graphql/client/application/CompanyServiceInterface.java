package com.qnksoft.graphql.client.application;

import com.qnksoft.graphql.client.application.inputs.InputCompany;
import com.qnksoft.graphql.client.domain.model.Company;
import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.domain.model.Employee;

public interface CompanyServiceInterface {
    public Company createCompany(InputCompany inputCompany);

    public Company findCompanyByRUC(String RUC);
}
