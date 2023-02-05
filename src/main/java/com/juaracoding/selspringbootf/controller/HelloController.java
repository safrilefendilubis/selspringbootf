package com.juaracoding.selspringbootf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 2/3/2023 3:39 PM
@Last Modified 2/3/2023 3:39 PM
Version 1.1
*/
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/")
    public String firstPage() {
        return "welcome";
    }
}