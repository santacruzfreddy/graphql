package com.qnksoft.graphql.person.application.inputs;

import jakarta.persistence.Column;
import lombok.Data;

@Data
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
