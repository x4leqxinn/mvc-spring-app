package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.x4leqxinn.springboot.webapp.springboot_webapp.models.User;
import com.x4leqxinn.springboot.webapp.springboot_webapp.models.dto.ParamDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.code}")
    private String code;

    @Value("${config.message}")
    private String message;

    @Value("${config.listOfValues}")
    private List<String> listOfValues;

    @Value("#{'${config.listOfValues}'.split(',')}")
    private List<String> valueList;

    @Value("#{'${config.listOfValues}'}")
    private String valueString;


    @Value("#{${config.valuesMap}}")
    
    private Map<String, Object> valuesMap;

    @Value("#{${config.valuesMap}.product}")
    private String product;


    @Autowired
    private Environment environment;

    @GetMapping("/baz/{mensajito}")
    public ParamDto baz(@PathVariable(name = "mensajito") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    
    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        // Realizar alguna accion en la base de datos **
        return user;
    }
    

    @GetMapping("/values")
    public Map<String,Object> values() {
        Map<String, Object> json = new HashMap<>();
        json.put("code", code);
        json.put("message", message);
        json.put("message2", environment.getProperty("config.message"));
        json.put("listOfValues", listOfValues);
        json.put("valueList", valueList);
        json.put("valueString", valueString);
        json.put("valuesMap", valuesMap);
        json.put("product", product);
        return json;
    }
    
    
}
