package com.giovannottix.petclinic.services;

import java.util.Set;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/03/20, Sun
 */
public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);

}
