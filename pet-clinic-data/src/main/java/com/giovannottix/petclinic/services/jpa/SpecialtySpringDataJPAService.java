package com.giovannottix.petclinic.services.jpa;

import com.giovannottix.petclinic.model.Specialty;
import com.giovannottix.petclinic.repositories.SpecialtyRepository;
import com.giovannottix.petclinic.services.SpecialtyService;
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
public class SpecialtySpringDataJPAService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySpringDataJPAService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Specialty findById(Long id) {
        Optional<Specialty> optionalSpecialty = specialtyRepository.findById(id);
        return optionalSpecialty.orElse(null);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return specialtyRepository.save(specialty);
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public void delete(Specialty specialty) {
        specialtyRepository.delete(specialty);
    }

    @Override
    public void deleteById(Long id) {
        specialtyRepository.deleteById(id);
    }
}
