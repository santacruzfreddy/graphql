package com.qnksoft.graphql.product.application.services;

import com.qnksoft.graphql.cliente.application.CompanyServiceInterface;
import com.qnksoft.graphql.cliente.application.inputs.InputCompany;
import com.qnksoft.graphql.cliente.domain.Mapper.CompanyMapper;
import com.qnksoft.graphql.cliente.domain.model.Company;
import com.qnksoft.graphql.cliente.domain.repository.CompanyRepository;
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
