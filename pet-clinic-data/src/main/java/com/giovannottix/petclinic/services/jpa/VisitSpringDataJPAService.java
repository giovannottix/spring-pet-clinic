package com.giovannottix.petclinic.services.jpa;

import com.giovannottix.petclinic.model.Visit;
import com.giovannottix.petclinic.repositories.VisitRepository;
import com.giovannottix.petclinic.services.VisitService;
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
public class VisitSpringDataJPAService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSpringDataJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(Long id) {
        Optional<Visit> optionalVisit = visitRepository.findById(id);
        return optionalVisit.orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visit = new HashSet<>();
        visitRepository.findAll().forEach(visit::add);
        return visit;
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
