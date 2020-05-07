package com.giovannottix.petclinic.bootstrap;

import com.giovannottix.petclinic.model.Owner;
import com.giovannottix.petclinic.model.Vet;
import com.giovannottix.petclinic.services.OwnerService;
import com.giovannottix.petclinic.services.VetService;
import com.giovannottix.petclinic.services.map.OwnerServiceMap;
import com.giovannottix.petclinic.services.map.VetServiceMap;
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

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Giovanni");
        owner1.setLastName("Esposito");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Pedro");
        owner2.setLastName("Picapiedra");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Pablo");
        vet1.setLastName("Marmol");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Homero");
        vet2.setLastName("Simpson");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
