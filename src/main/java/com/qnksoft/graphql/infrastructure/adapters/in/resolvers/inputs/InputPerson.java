package com.qnksoft.graphql.infrastructure.adapters.in.resolvers.inputs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InputPerson {
    Integer personId;

    String identification;

    String firstName;

    String secondName;

    String firstLastName;

    String secondLastName;

    String email;

    String phone;

    String address;
}
