package com.springcourse.curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcourse.curso.models.dto.ParamDto;
import com.springcourse.curso.models.dto.ParamMixDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
    
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola, que tál?") String message) {
        ParamDto paramDto = new ParamDto();
        
        paramDto.setMessage(message);
        
        return paramDto;
    }
    
    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam(required = false, defaultValue = "Empty string") String text, @RequestParam(required = false, defaultValue = "0") Integer code) {
        ParamMixDto paramDto = new ParamMixDto();

        paramDto.setMessage(text);
        paramDto.setCode(code);
        
        return paramDto;
    }
    
}
