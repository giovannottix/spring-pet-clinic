package com.giovannottix.petclinic.services.map;

import com.giovannottix.petclinic.model.Vet;
import com.giovannottix.petclinic.services.SpecialtyService;
import com.giovannottix.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/05/20, Tue
 */
@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }

    @Override
    public Vet save(Vet vet) {
        if(vet != null) {
            if(!vet.getSpecialities().isEmpty()) {
                vet.getSpecialities().forEach(speciality -> {
                    if(speciality.getId() == null){
                        specialtyService.save(speciality);
                    }
                });
            }
        } else {
            throw new RuntimeException("Vet can not be null");
        }

        return super.save(vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
