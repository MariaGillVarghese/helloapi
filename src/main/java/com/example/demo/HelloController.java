package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this class as a REST API controller
@RequestMapping("/api") // Base URL for all endpoints in this class
public class HelloController {

    @GetMapping("/hello") // Handles GET requests to "/api/hello"
    public String sayHello() {
        return "Hello, Welcome to your first API!";
    }
}
