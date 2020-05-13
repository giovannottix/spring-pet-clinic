package com.giovannottix.petclinic.repositories;

import com.giovannottix.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/13/20, Wed
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
