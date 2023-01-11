package petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import petclinic.services.OwnerSevice;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerSevice ownerSevice;

    public OwnerController(OwnerSevice ownerSevice) {
        this.ownerSevice = ownerSevice;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(Model model){

        model.addAttribute("owners",ownerSevice.findAll());



        return "owners/index";
    }
}
