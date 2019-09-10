package rahul.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rahul.springframework.sfgpetclinic.model.Owner;
import rahul.springframework.sfgpetclinic.model.Vet;
import rahul.springframework.sfgpetclinic.services.OwnerService;
import rahul.springframework.sfgpetclinic.services.VetService;
import rahul.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import rahul.springframework.sfgpetclinic.services.map.VetServiceMap;

/**
 * Created by Rahul on 2019-09-09
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Michael");
        owner.setLastName("Weston");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Glenanne");

        ownerService.save(owner1);

        System.out.println("Owners Loaded....");

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("Sam");
        vet.setLastName("Axe");

        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Jessie");
        vet1.setLastName("Porter");

        vetService.save(vet1);

        System.out.println("Vets Loaded....");
    }
}
