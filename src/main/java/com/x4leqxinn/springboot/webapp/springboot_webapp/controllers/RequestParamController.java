package com.x4leqxinn.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.x4leqxinn.springboot.webapp.springboot_webapp.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api/params")
public class RequestParamController {
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "-", name = "mensaje") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam() String text, @RequestParam() Integer code){
        ParamDto params = new ParamDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }
    
    @GetMapping("/request")
    public ParamDto request(HttpServletRequest request){
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        ParamDto params = new ParamDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;
    }
    
}
