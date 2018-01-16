package com.kobylynskyi.pharmacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {

    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;

}
