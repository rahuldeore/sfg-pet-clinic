package rahul.springframework.sfgpetclinic.services.map;

import rahul.springframework.sfgpetclinic.model.Owner;
import rahul.springframework.sfgpetclinic.services.OwnerService;

import java.util.Set;

/**
 * Created by Rahul on 2019-09-02
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner owner) {
        super.deleteByValue(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
