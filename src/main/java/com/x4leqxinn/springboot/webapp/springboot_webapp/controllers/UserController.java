package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model){
        model.put("title", "Hello world =)");
        model.put("name", "Jorge");
        model.put("lastname", "Quintui");
        return "details";
    }
}
