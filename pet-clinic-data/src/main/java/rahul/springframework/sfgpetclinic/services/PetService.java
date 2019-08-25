package rahul.springframework.sfgpetclinic.services;

import rahul.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Rahul on 2019-08-25
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
