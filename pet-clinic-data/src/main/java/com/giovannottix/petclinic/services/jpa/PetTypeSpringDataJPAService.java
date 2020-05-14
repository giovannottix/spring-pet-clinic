package com.giovannottix.petclinic.services.jpa;

import com.giovannottix.petclinic.model.PetType;
import com.giovannottix.petclinic.repositories.PetTypeRepository;
import com.giovannottix.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/13/20, Wed
 */
@Service
@Profile("springDataJpa")
public class PetTypeSpringDataJPAService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSpringDataJPAService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType findById(Long id) {
        Optional<PetType> optionalPetType = petTypeRepository.findById(id);
        return optionalPetType.orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
