package rahul.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rahul on 2019-09-03
 */
@Controller
@RequestMapping({"/owners","/owner"})
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}
