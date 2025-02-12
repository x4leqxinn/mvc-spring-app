package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.x4leqxinn.springboot.webapp.springboot_webapp.models.User;
import com.x4leqxinn.springboot.webapp.springboot_webapp.models.dto.UserDto;


// Podemos usar @Controller - @ResponseBody

// Más recomendado usar @RestController

@RestController
@RequestMapping("/api") // Asignamos una ruta base de primer nivel
public class UserRestController {

    // Distintas formas de representar el mapping
    @RequestMapping(path = "/details",method = RequestMethod.GET) // Ruta secundaria del metodo
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Jorge", "Quintui");
        userDto.setUser(user);
        userDto.setTitle("hELLO WORLDD!");
        return userDto;
    }

    // @RequestMapping(path = "/details",method = RequestMethod.GET) // Ruta secundaria del metodo
    // public Map<String, Object> details(){
    //     User user = new User("Jorge", "Quintui");
    //     Map<String, Object> response = new HashMap<>();
    //     response.put("title", "Hello world =)");
    //     response.put("user", user);
    //     return response;
    // }
}
