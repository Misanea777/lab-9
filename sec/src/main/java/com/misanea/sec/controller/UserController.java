package com.misanea.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @PostMapping("/logout")
    public String logout() {
        return "login";
    }

//    @PostMapping("/login")
//    public String login(User user) {
//        System.out.println("dasdas");
//        return "home";
//    }
}
