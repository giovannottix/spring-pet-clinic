package com.giovannottix.petclinic.model;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/09/20, Sat
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
