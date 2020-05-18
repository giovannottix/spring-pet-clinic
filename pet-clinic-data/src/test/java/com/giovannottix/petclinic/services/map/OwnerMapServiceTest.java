package com.giovannottix.petclinic.services.map;

import com.giovannottix.petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/17/20, Sun
 */
class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    final Long ownerId = 1L;
    final String lastName = "Last";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(),
                new PetMapService());

        ownerMapService.save(Owner.builder()
                .id(ownerId)
                .lastName(lastName)
                .build());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);

        assertEquals(ownerId, owner.getId());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Owner newOwner = ownerMapService.save(Owner.builder().id(id).build());

        assertEquals(id, newOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner newOwner = ownerMapService.save(Owner.builder().build());

        assertNotNull(newOwner);
        assertNotNull(newOwner.getId());
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerMapService.findAll();

        assertEquals(1, owners.size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findByLastNameNotNull() {
        Owner owner = ownerMapService.findByLastName(lastName);

        assertEquals(ownerId, owner.getId());
        assertEquals(lastName, owner.getLastName());
    }

    @Test
    void findByLastNameNull() {
        assertThrows(IllegalArgumentException.class,
                () -> ownerMapService.findByLastName(null));
    }

    @Test
    void findByLastNameNotFound() {
        Owner owner = ownerMapService.findByLastName("lastName");
        assertNull(owner);
    }
}