package com.giovannottix.petclinic.repositories;

import com.giovannottix.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/13/20, Wed
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
    Vet findByLastName(String lastName);
}
