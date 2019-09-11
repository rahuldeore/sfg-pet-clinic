package rahul.springframework.sfgpetclinic.services.map;

import rahul.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created by Rahul on 2019-08-28
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<T>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T t){

        if (t != null){
            if (t.getId() == null){
                t.setId(getNextId());
            }
            map.put(t.getId(),t);
        }
        return t;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void deleteByValue(T t){
        map.entrySet().removeIf(idtEntrySet -> idtEntrySet.getValue().equals(t));
    }

    Long getNextId(){
        Long nextId = null;

        try{
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }

}
