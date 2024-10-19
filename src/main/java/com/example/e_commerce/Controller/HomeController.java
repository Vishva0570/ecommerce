package com.example.e_commerce.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping
public class HomeController {
    @GetMapping("/Home")
    public String home () {
        return "hello";
    }
    @GetMapping("/about")
    public String about () {
        return "about ";
    }
    
    
}
