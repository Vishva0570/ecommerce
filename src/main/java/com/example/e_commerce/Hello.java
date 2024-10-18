package com.example.e_commerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping
public class Hello {
    @GetMapping("/")
    public String Greet() {
        return "Hello world, from spring boot";
    }
    
}
