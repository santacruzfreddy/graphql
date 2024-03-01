package com.qnksoft.graphql.client.application.services;

import com.qnksoft.graphql.client.application.CompanyServiceInterface;
import com.qnksoft.graphql.client.application.inputs.InputCompany;
import com.qnksoft.graphql.client.domain.Mapper.CompanyMapper;
import com.qnksoft.graphql.client.domain.model.Company;
import com.qnksoft.graphql.client.domain.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyServiceInterface {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Company createCompany(InputCompany inputCompany) {
        return companyRepository.save(CompanyMapper.INSTANCE.inputCompanyToCompany(inputCompany));
    }

    @Override
    public Company findCompanyByRUC(String RUC) {
        return companyRepository.findByRUC(RUC);
    }
}
