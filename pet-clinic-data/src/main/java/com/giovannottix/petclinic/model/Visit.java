package com.giovannottix.petclinic.model;

import java.time.LocalDate;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/09/20, Sat
 */
public class Visit {

    private LocalDate date;
    private String description;
    private Pet petId;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPetId() {
        return petId;
    }

    public void setPetId(Pet petId) {
        this.petId = petId;
    }
}
