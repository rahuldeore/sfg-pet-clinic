package rahul.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Rahul on 2019-08-28
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T t);

    void delete(T t);

    void deleteById(ID id);
}
