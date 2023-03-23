package com.javaapirepository.rest.jaxrsrest.model;

public class Pet {
    private int id;
    private String name;
    private String type;
    private int ageInMonths;
    private String colour;

    public Pet(int id, String name, String type, int ageInMonths, String colour) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.ageInMonths = ageInMonths;
        this.colour = colour;
    }

    public Pet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
