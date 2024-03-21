package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarMainController {

    @GetMapping ("/main")
    public String mainPageG(){
        return "index";
    }

    @PostMapping("/")
    public String mainPageP(String login, String password){
        System.out.println(login+" "+password);
        return "index";
    }

}
