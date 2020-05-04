package com.giovannottix.petclinic.services;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/03/20, Sun
 */
public interface PersonService<T, ID> extends CrudService<T, ID> {

    T findByLastName(String lastName);

}
