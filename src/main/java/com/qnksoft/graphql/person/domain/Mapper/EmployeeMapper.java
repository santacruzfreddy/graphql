package com.qnksoft.graphql.person.domain.Mapper;

import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.domain.model.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);


    InputEmployee employeeToInputEmployee(Employee employee);

    //@InheritInverseConfiguration
    Employee inputEmployeeToEmployee(InputEmployee inputEmployee);

}
