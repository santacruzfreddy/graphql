package com.qnksoft.graphql.infrastructure.adapters.in.resolvers;

import com.qnksoft.graphql.domain.ports.in.CompanyInputPort;
import com.qnksoft.graphql.infrastructure.adapters.in.resolvers.inputs.InputCompany;
import com.qnksoft.graphql.domain.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CompanyResolver {

    @Autowired
    CompanyInputPort CompanyInputPort;

    @MutationMapping(name = "createCompany")
    public Company createCompany(@Argument(name = "inputCompany") InputCompany inputCompany)
    {
        return CompanyInputPort.createCompany(inputCompany);
    }
    @QueryMapping(name = "findCompanyByRUC")
    public Company findCompanyByRUC(@Argument(name = "RUC") String RUC)
    {
        return CompanyInputPort.findCompanyByRUC(RUC);
    }
}
