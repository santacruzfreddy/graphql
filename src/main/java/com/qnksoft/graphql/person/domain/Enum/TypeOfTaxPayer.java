package com.qnksoft.graphql.person.domain.Enum;

import lombok.Data;


public enum TypeOfTaxPayer
{
    NATURALPERSON("Persona natural"),
    LEGALPERSON("Persona juridica"),
    SOCIETIES("Sociedades");

    private String description;

    TypeOfTaxPayer(String description)
    {
        this.description = description;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return this.description;
    }

}
