package rahul.springframework.sfgpetclinic.services;

import rahul.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Rahul on 2019-08-25
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
