package com.qnksoft.graphql.product.domain.Mapper;

import com.qnksoft.graphql.cliente.application.inputs.InputCompany;
import com.qnksoft.graphql.cliente.domain.model.Company;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);


    InputCompany InputCompanyToInputCompany(Company company);

    //@InheritInverseConfiguration
    Company inputCompanyToCompany(InputCompany inputCompany);

}
