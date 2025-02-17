package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
            new User("pepa","gonzalez"),
            new User("lalo","perez", "lalo@gmail.com"),
            new User("francisca","donoso","fran@gmail.com")
        );

        model.addAttribute("users",users);
        model.addAttribute("title","Listado usuarios");
        return "list";
    }
    
}
