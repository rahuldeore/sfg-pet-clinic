package rahul.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Rahul on 2019-08-25
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
