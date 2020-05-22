package com.giovannottix.petclinic.services;

import com.giovannottix.petclinic.model.Owner;

import java.util.List;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/03/20, Sun
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
