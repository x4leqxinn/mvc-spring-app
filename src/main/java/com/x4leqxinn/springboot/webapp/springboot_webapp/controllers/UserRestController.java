package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.x4leqxinn.springboot.webapp.springboot_webapp.models.User;
import com.x4leqxinn.springboot.webapp.springboot_webapp.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;



// Podemos usar @Controller - @ResponseBody

// Más recomendado usar @RestController

@RestController
@RequestMapping("/api") // Asignamos una ruta base de primer nivel
public class UserRestController {

    
    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Jorge", "Quintui");
        User user2 = new User("Matias", "Quintui");
        User user3 = new User("Carlos", "Quintui");


        List<User> users = Arrays.asList(user, user2, user3); // helper para array list
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        
        return users;
    }


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
