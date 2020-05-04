package com.giovannottix.petclinic.model;

import java.time.LocalDate;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/03/20, Sun
 */
public class Pet extends BaseEntity {

    private LocalDate birthDate;

    private PetType type;

    private Owner owner;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
