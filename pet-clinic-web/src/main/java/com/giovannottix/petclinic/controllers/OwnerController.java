package com.giovannottix.petclinic.controllers;

import com.giovannottix.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/04/20, Mon
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", this.ownerService.findAll());

        return "owners/index";
    }
}
