package com.giovannottix.petclinic.services.map;

import com.giovannottix.petclinic.model.Specialty;
import com.giovannottix.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/05/20, Tue
 */
@Service
public class SpecialtyMapService extends AbstractMapService<Specialty,
        Long> implements SpecialtyService {

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return super.save(specialty);
    }

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);
    }
}
