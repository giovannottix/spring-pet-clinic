package com.giovannottix.petclinic.services;

import com.giovannottix.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/03/20, Sun
 */
public interface VetService {

    Vet findById(Long id);

    Vet findByLastName(String lastName);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
