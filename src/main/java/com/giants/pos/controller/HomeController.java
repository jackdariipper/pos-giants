package com.giants.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; 

@Controller
public class HomeController {

    @GetMapping("/")
    public String signIn() {
        return "sign-in";
    }

    @GetMapping("/dashboard")
    public String goToDashboard(){
        return "dashboard";
    }
    @GetMapping("/logout")
    public String logOut() {
        return "sign-in";
    }

    @GetMapping("/register")
    public String setupRegister() {
        return "/register";
    }

}
