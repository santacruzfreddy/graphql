package com.qnksoft.graphql.application.inputUseCase;

import com.qnksoft.graphql.domain.ports.in.CompanyInputPort;
import com.qnksoft.graphql.infrastructure.adapters.in.resolvers.inputs.InputCompany;
import com.qnksoft.graphql.infrastructure.adapters.out.persistences.mapper.CompanyMapper;
import com.qnksoft.graphql.domain.model.Company;
import com.qnksoft.graphql.infrastructure.adapters.out.persistences.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyUseCase implements CompanyInputPort {

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
