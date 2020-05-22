package com.giovannottix.petclinic.repositories;

import com.giovannottix.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/13/20, Wed
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
