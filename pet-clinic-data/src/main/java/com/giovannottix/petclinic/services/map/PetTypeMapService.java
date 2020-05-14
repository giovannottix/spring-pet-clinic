package com.giovannottix.petclinic.services.map;

import com.giovannottix.petclinic.model.PetType;
import com.giovannottix.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/05/20, Tue
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }
}
