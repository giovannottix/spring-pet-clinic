package com.giovannottix.petclinic.services.map;

import com.giovannottix.petclinic.model.Owner;
import com.giovannottix.petclinic.services.OwnerService;
import com.giovannottix.petclinic.services.PetService;
import com.giovannottix.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/04/20, Mon
 */
@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        Owner savedOwner = null;

        if(owner != null) {
            if(owner.getPets() != null){
                owner.getPets().forEach(pet -> {
                    if(pet.getType() != null) {
                        if(pet.getType().getId() == null){
                            pet.setType(petTypeService.save(pet.getType()));
                        }
                    } else {
                        throw new RuntimeException("Pet type is required");
                    }

                    if(pet.getId() == null){
                        petService.save(pet);
                    }
                });
            }
            return super.save(owner);
        }else {
            return null;
        }

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

    @Override
    public Owner findByLastName(String lastName) {
        if(!Optional.ofNullable(lastName).isPresent()){
            throw new IllegalArgumentException("LastName cannot be null");
        }

        return findAll()
                .stream()
                .filter(
                        owner -> lastName.equalsIgnoreCase(owner.getLastName()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return findAll()
                .stream()
                .filter(owner ->
                        owner.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());
    }
}
