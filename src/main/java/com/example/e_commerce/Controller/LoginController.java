package com.example.e_commerce.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class LoginController {
    @GetMapping("/Login")
    public String home () {
        return "Login Succesfull";
    }
}
