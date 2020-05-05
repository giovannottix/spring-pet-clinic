package com.giovannottix.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/04/20, Mon
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
