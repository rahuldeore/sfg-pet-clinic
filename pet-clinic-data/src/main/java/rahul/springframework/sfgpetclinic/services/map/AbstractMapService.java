package rahul.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Rahul on 2019-08-28
 */
public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<T>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(ID id, T t){
        map.put(id,t);
        return t;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void deleteByValue(T t){
        map.entrySet().removeIf(idtEntrySet -> idtEntrySet.getValue().equals(t));
    }

}
