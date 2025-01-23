package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


// Podemos usar @Controller - @ResponseBody

// Más recomendado usar @RestController

@RestController
@RequestMapping("/api") // Asignamos una ruta base de primer nivel
public class UserRestController {

    // Distintas formas de representar el mapping
    @RequestMapping(path = "/details2",method = RequestMethod.GET) // Ruta secundaria del metodo
    public Map<String, Object> details(){
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Hello world =)");
        response.put("name", "Jorge");
        response.put("lastname", "Quintui");
        return response;
    }
}
