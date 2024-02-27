package com.qnksoft.graphql.person.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.domain.Sort;

@Entity
@Data
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Sort rolId;

    @Column(name = "rol_description",columnDefinition = "")
    String rolDescription;




}
