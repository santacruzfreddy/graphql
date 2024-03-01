package com.qnksoft.graphql.client.domain.Enum;

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
