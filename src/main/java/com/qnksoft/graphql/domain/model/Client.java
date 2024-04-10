package com.qnksoft.graphql.domain.model;

import com.qnksoft.graphql.domain.Enum.TypeOfTaxPayer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client  {

    Integer clientId;

    String observation;

    String email;

    String phone;

    String address;

    Long latitude;

    Long length;

    private TypeOfTaxPayer typeOfTaxPayer;

}
