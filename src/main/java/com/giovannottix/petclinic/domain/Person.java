package com.giovannottix.petclinic.domain;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/03/20, Sun
 */
public class Person {

    private String firstName;

    private String lastName;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
