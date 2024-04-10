package com.qnksoft.graphql.infrastructure.adapters.out.persistences.mapper;

import com.qnksoft.graphql.infrastructure.adapters.in.resolvers.inputs.InputCompany;
import com.qnksoft.graphql.domain.model.Company;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);


    InputCompany comInputCompanyToInputCompany(Company company);

    //@InheritInverseConfiguration
    Company inputCompanyToCompany(InputCompany inputCompany);

}
