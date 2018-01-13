package com.kobylynskyi.pharmacy.entities;

import lombok.Data;
import org.joda.time.DateTime;

@Data
public class Prescription {

    private String id;
    private String drugId;
    private String patientId;
    private DateTime dateTime;
    private String usage;
    private int refills;
}
