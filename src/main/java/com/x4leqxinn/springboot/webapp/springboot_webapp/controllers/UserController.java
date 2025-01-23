package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.x4leqxinn.springboot.webapp.springboot_webapp.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model){
        User user = new User("Jorge", "Quintui");
        model.put("title", "Hello world =)");
        model.put("user", user);
        return "details";
    }
}
