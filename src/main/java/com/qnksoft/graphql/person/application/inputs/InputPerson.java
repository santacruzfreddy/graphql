package com.qnksoft.graphql.person.application.inputs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
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
