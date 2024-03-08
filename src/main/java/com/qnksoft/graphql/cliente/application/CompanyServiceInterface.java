package com.qnksoft.graphql.cliente.application;

import com.qnksoft.graphql.cliente.application.inputs.InputCompany;
import com.qnksoft.graphql.cliente.domain.model.Company;

public interface CompanyServiceInterface {
    public Company createCompany(InputCompany inputCompany);

    public Company findCompanyByRUC(String RUC);
}
