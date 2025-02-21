package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.x4leqxinn.springboot.webapp.springboot_webapp.models.dto.ParamDto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/var")
public class PathVariableController {
    
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
    
}
