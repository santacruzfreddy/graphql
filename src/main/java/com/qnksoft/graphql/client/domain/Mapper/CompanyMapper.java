package com.qnksoft.graphql.client.domain.Mapper;

import com.qnksoft.graphql.client.application.inputs.InputCompany;
import com.qnksoft.graphql.client.application.inputs.InputPerson;
import com.qnksoft.graphql.client.domain.model.Company;
import com.qnksoft.graphql.client.domain.model.Person;
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
