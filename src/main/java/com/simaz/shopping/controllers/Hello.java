package com.simaz.shopping.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class Hello {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {

        return "Ciao!";
    }
}
