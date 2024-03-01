package com.qnksoft.graphql.client.interfaces.api;

import com.qnksoft.graphql.client.application.CompanyServiceInterface;
import com.qnksoft.graphql.client.application.inputs.InputCompany;
import com.qnksoft.graphql.client.domain.model.Company;
import com.qnksoft.graphql.person.domain.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CompanyController {

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
