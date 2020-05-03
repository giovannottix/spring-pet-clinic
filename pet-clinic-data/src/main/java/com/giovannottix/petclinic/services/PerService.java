package com.giovannottix.petclinic.services;

import com.giovannottix.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/03/20, Sun
 */
public interface PerService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
