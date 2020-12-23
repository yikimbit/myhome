package com.didimdol.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeConrtoller {

    @GetMapping
    public String index() {
        return "index";
    }
}
