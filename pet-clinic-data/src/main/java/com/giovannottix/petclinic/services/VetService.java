package com.giovannottix.petclinic.services;

import com.giovannottix.petclinic.model.Vet;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/03/20, Sun
 */
public interface VetService extends PersonService<Vet, Long> {

    Vet findByLastName(String lastName);

}
