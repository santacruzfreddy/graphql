package com.qnksoft.graphql.product.interfaces.resolvers;

import com.qnksoft.graphql.cliente.application.CompanyServiceInterface;
import com.qnksoft.graphql.cliente.application.inputs.InputCompany;
import com.qnksoft.graphql.cliente.domain.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CompanyResolver {

    @Autowired
    CompanyServiceInterface companyServiceInterface;

    @MutationMapping(name = "createCompany")
    public Company createCompany(@Argument(name = "inputCompany") InputCompany inputCompany)
    {
        return companyServiceInterface.createCompany(inputCompany);
    }
    @QueryMapping(name = "findCompanyByRUC")
    public Company findCompanyByRUC(@Argument(name = "RUC") String RUC)
    {
        return companyServiceInterface.findCompanyByRUC(RUC);
    }
}
