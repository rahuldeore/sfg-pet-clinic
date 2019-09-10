package rahul.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rahul.springframework.sfgpetclinic.services.OwnerService;

/**
 * Created by Rahul on 2019-09-03
 */
@Controller
@RequestMapping({"/owners","/owner"})
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(Model model){

        model.addAttribute("owners",ownerService.findAll());

        return "owners/index";
    }
}
