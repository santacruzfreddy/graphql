package com.qnksoft.graphql.domain.ports.in;

import com.qnksoft.graphql.infrastructure.adapters.in.resolvers.inputs.InputCompany;
import com.qnksoft.graphql.domain.model.Company;

public interface CompanyInputPort {
    public Company createCompany(InputCompany inputCompany);

    public Company findCompanyByRUC(String RUC);
}
