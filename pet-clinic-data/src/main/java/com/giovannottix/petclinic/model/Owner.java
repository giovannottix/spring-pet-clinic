package com.giovannottix.petclinic.model;

import java.util.Set;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/03/20, Sun
 */
public class Owner extends Person {

    private Set<Pet> set;

    public Set<Pet> getSet() {
        return set;
    }

    public void setSet(Set<Pet> set) {
        this.set = set;
    }
}
