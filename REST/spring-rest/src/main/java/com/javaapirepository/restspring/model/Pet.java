package com.javaapirepository.restspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private int id;
    private String name;
    private String type;
    private int ageInMonths;
    private String colour;
}
