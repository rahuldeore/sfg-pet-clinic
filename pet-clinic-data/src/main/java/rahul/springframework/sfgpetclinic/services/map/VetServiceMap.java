package rahul.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import rahul.springframework.sfgpetclinic.model.Vet;
import rahul.springframework.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * Created by Rahul on 2019-09-02
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
        return super.save(vet);
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
