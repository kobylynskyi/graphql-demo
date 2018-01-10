package com.kobylynskyi.graphql.demo.prescription;

import lombok.Data;

import java.util.Date;

@Data
public class Prescription {

    private String id;
    private String drugId;
    private String patientId;
    private Date date;
    private String usage;
    private int refills;
}
