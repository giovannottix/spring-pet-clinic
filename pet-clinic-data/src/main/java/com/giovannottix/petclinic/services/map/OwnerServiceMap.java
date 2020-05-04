package com.giovannottix.petclinic.services.map;

import com.giovannottix.petclinic.model.Owner;
import com.giovannottix.petclinic.services.CrudService;

import java.util.Set;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/04/20, Mon
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }
}
