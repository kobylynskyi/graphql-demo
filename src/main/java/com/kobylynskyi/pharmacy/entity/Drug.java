package com.kobylynskyi.pharmacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drug {

    private String id;
    private String name;
    private String manufacturer;
    private String image;

}
