package com.giovannottix.petclinic.services;

import com.giovannottix.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/03/20, Sun
 */
public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
