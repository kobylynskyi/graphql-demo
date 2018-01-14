package com.kobylynskyi.pharmacy.entity;

import lombok.Data;
import org.joda.time.DateTime;

@Data
public class Patient {

    private String id;
    private String firstName;
    private String lastName;
    private DateTime dateOfBirth;

}
