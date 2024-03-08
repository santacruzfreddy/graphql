package com.qnksoft.graphql.cliente.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "companyId")
public class Company extends Client {

    @Column(name = "razon_social", nullable = false)
    String razonSocial;

    @Column(name = "RUC", nullable = false)
    String RUC;
}
