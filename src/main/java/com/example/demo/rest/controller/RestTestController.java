package com.example.demo.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class RestTestController {
    @GetMapping
    public String getController(){
        return "GET - /test";
    }
    @PostMapping
    public String postController(){
        return "POST - /test";
    }

    @GetMapping("/world")
    public String getWorld(){
        return "Hello World!";
    }

    @GetMapping("/sea")
    public String getSea(){
        return "Hello Sea!";
    }


    @GetMapping("/sky")
    public String getSky(){
        return "Hello Sky!";
    }

}
