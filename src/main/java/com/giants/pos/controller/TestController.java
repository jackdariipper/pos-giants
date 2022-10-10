package com.giants.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/sign-in")
    public String login() {
        return "/sign-in";
    }

    @GetMapping("/register")
    public String register() {
        return "/register";
    }


}
