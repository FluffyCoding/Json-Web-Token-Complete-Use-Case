package com.unity.jwt.uc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserResource {


    @GetMapping("/home")
    public String showUser(){
        return "Application Is Working";
    }


}
