package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hello world =)");
        model.addAttribute("name", "Jorge");
        model.addAttribute("lastname", "Quintui");
        return "details";
    }
}
