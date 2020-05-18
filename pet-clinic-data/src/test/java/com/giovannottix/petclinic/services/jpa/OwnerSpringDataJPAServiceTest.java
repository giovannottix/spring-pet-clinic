package com.giovannottix.petclinic.services.jpa;

import com.giovannottix.petclinic.model.Owner;
import com.giovannottix.petclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/17/20, Sun
 */
@ExtendWith(MockitoExtension.class)
class OwnerSpringDataJPAServiceTest {

    static final Long ID = 1L;

    static final String LAST_NAME = "lastname";

    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerSpringDataJPAService ownerSpringDataJPAService;

    Owner ownerRetrieved;

    @BeforeEach
    void setUp() {
        ownerRetrieved = Owner.builder().id(ID).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(anyString())).thenReturn(ownerRetrieved);

        Owner owner = ownerSpringDataJPAService.findByLastName(LAST_NAME);

        assertNotNull(owner);
        assertEquals(ownerRetrieved.getLastName(), owner.getLastName());
        verify(ownerRepository).findByLastName(anyString());
    }

    @Test
    void findByLastNameNotFound() {
        when(ownerRepository.findByLastName(anyString())).thenReturn(null);

        Owner owner = ownerSpringDataJPAService.findByLastName("");

        assertNull(owner);
        verify(ownerRepository).findByLastName(anyString());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong()))
                .thenReturn(Optional.of(ownerRetrieved));

        Owner owner = ownerSpringDataJPAService.findById(1L);

        assertNotNull(owner);
        assertEquals(ownerRetrieved.getId(), owner.getId());
        assertEquals(ownerRetrieved.getLastName(), owner.getLastName());

        verify(ownerRepository, times(1)).findById(anyLong());
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong()))
                .thenReturn(Optional.empty());

        Owner owner = ownerSpringDataJPAService.findById(1L);

        assertNull(owner);
        verify(ownerRepository, times(1)).findById(anyLong());
    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();

        when(ownerRepository.save(any(Owner.class))).thenReturn(ownerRetrieved);

        Owner savedOwner = ownerSpringDataJPAService.save(ownerToSave);

        assertNotNull(savedOwner);
        verify(ownerRepository, times(1)).save(any(Owner.class));
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnersSet = new HashSet<>();
        returnOwnersSet.add(Owner.builder().id(1L).build());
        returnOwnersSet.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(returnOwnersSet);

        Set<Owner> owners = ownerSpringDataJPAService.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
        verify(ownerRepository, times(1)).findAll();
    }

    @Test
    void delete() {
        doNothing().when(ownerRepository).delete(any(Owner.class));

        ownerSpringDataJPAService.delete(ownerRetrieved);

        verify(ownerRepository, times(1))
                .delete(any(Owner.class));
    }

    @Test
    void deleteById() {
        doNothing().when(ownerRepository).deleteById(anyLong());

        ownerSpringDataJPAService.deleteById(1L);

        verify(ownerRepository, times(1))
                .deleteById(anyLong());
    }
}