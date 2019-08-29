package rahul.springframework.sfgpetclinic.services;

import rahul.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Rahul on 2019-08-25
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
