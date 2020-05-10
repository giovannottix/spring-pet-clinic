package com.giovannottix.petclinic.bootstrap;

import com.giovannottix.petclinic.model.Owner;
import com.giovannottix.petclinic.model.PetType;
import com.giovannottix.petclinic.model.Vet;
import com.giovannottix.petclinic.services.OwnerService;
import com.giovannottix.petclinic.services.PetTypeService;
import com.giovannottix.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/05/20, Tue
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Giovanni");
        owner1.setLastName("Esposito");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Pedro");
        owner2.setLastName("Picapiedra");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Pablo");
        vet1.setLastName("Marmol");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Homero");
        vet2.setLastName("Simpson");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
