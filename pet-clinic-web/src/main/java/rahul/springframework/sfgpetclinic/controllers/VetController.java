package rahul.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rahul on 2019-09-03
 */
@Controller
public class VetController {

    @RequestMapping(path = {"/vets","/vets/index","/vets/index.html"})
    public String listVets(){

        return "vets/index.html";
    }
}
