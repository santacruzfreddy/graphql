package com.qnksoft.graphql.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person extends Client{

    String identification;

    String firstName;

    String secondName;

    String firstLastName;

    String secondLastName;


}
