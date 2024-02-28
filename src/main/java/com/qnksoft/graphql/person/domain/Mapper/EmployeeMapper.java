package com.qnksoft.graphql.person.domain.Mapper;

import com.qnksoft.graphql.person.application.inputs.InputEmployee;
import com.qnksoft.graphql.person.domain.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {

    @Mappings({
            @Mapping(source = "personId", target = "personId"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "secondName", target = "secondName"),
            @Mapping(source = "firstLastName", target = "firstLastName"),
            @Mapping(source = "secondLastName", target = "secondLastName"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "identification", target = "identification"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "job", target = "job"),

    })
    InputEmployee employeeToInputEmployee(Employee employee);

}
