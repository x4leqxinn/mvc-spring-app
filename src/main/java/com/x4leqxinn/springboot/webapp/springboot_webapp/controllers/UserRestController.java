package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/details2") 
    public Map<String, Object> details(){
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Hello world =)");
        response.put("name", "Jorge");
        response.put("lastname", "Quintui");
        return response;
    }
}
