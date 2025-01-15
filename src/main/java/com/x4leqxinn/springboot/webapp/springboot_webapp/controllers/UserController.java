package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(){
        return "details";
    }
}
