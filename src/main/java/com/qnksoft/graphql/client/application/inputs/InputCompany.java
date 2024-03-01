package com.qnksoft.graphql.client.application.inputs;
import com.qnksoft.graphql.client.domain.Enum.TypeOfTaxPayer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InputCompany {
    Integer clientId;

    String observation;

    Long latitude;

    Long length;

    private TypeOfTaxPayer typeOfTaxPayer;

    String email;

    String phone;

    String address;

    String RUC;

    String razonSocial;

}