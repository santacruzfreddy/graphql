package com.qnksoft.graphql.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company extends Client {

    String razonSocial;

    String RUC;
}
