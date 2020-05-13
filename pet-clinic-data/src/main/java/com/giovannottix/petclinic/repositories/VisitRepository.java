package com.giovannottix.petclinic.repositories;

import com.giovannottix.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/13/20, Wed
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {

}
