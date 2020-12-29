package com.techrevolution.swagger.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String getHelloMessage(){
        return "Hello from swagger";
    }

    @PostMapping("/{customeMessage}")
    public String getCustomeHelloMessage(@PathVariable("customeMessage") String customeMessage){
        return customeMessage;
    }
}
