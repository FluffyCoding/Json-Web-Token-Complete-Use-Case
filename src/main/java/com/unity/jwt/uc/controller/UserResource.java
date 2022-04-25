package com.unity.jwt.uc.controller;

import com.unity.jwt.uc.exception.ExceptionHandling;
import com.unity.jwt.uc.exception.domain.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/","/user"})
public class UserResource extends ExceptionHandling {


    @GetMapping("/home")
    public String showUser(){
        return "Application Is Working";
    }

    @GetMapping("/login")
    public String login() throws UserNotFoundException {
        throw new UserNotFoundException("User Is not Registered");

    }

}
