package rahul.springframework.sfgpetclinic.services.map;

import rahul.springframework.sfgpetclinic.model.Vet;
import rahul.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by Rahul on 2019-09-02
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void delete(Vet vet) {
        super.deleteByValue(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
