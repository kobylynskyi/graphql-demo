package com.kobylynskyi.graphql.demo.patient;

import lombok.Data;

import java.util.Date;

@Data
public class Patient {

    private String id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

}
