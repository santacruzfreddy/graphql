package com.qnksoft.graphql.person.application.inputs;

import lombok.Data;

@Data
public class InputPerson {
    private  Long personId;
    private String name;
    private    String lastName;
    private Integer age;
    private String courseId;
}
