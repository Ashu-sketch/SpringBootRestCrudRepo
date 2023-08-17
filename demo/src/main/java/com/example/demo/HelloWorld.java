package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Value("${welcome.message}")
private String message;

    @GetMapping("/hello")
    public String welcomeMessage(){
return message;
    }
}
