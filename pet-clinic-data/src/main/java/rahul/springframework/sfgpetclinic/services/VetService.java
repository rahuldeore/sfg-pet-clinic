package rahul.springframework.sfgpetclinic.services;

import rahul.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Rahul on 2019-08-25
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
