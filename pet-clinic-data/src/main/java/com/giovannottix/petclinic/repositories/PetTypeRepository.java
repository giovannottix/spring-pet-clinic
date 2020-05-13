package com.giovannottix.petclinic.repositories;

import com.giovannottix.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/13/20, Wed
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
