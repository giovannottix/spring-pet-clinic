package com.giovannottix.petclinic.services.jpa;

import com.giovannottix.petclinic.model.Pet;
import com.giovannottix.petclinic.repositories.PetRepository;
import com.giovannottix.petclinic.services.PetService;
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
public class PetSpringDataJPAService implements PetService {

    private final PetRepository petRepository;

    public PetSpringDataJPAService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Long id) {
        Optional<Pet> optionalPet = petRepository.findById(id);
        return optionalPet.orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
