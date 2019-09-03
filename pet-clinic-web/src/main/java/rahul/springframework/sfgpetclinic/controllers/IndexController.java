package rahul.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rahul on 2019-09-02
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){

        return "index"; //no need for index.html, just index is fine
    }
}
