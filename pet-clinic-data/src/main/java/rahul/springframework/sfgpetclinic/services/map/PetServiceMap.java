package rahul.springframework.sfgpetclinic.services.map;

import rahul.springframework.sfgpetclinic.model.Pet;
import rahul.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by Rahul on 2019-09-02
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet pet) {
        super.deleteByValue(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}