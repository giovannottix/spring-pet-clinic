package com.giovannottix.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Giovanni Esposito.
 * @Date : 05/04/20, Mon
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}