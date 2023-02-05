package com.juaracoding.selspringbootf.controller;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 2/5/2023 4:33 PM
@Last Modified 2/5/2023 4:33 PM
Version 1.1
*/

import com.juaracoding.selspringbootf.model.Welcome;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @PostMapping("/v1/welcomez/{news}")
    String welcomeMessage(
            @RequestParam String testX,
            @PathVariable("news") String newz,
            @RequestBody Welcome welcome
            ){
        System.out.println("Request Param Test : "+testX);
        System.out.println("Request Variable News : "+newz);
        System.out.println("Request Welcome var Nama: "+welcome.getNama());
        System.out.println("Request Welcome var Alamat: "+welcome.getAlamat());
        System.out.println("Request Welcome var Jenis Kelamin: "+welcome.getJenisKelamin());
        System.out.println("Request Welcome Object Iner Welcome var Iner WelcomeX" + " : "+welcome.getInerWelcome().getInerWelcomeX());
        System.out.println("Request Welcome Object Iner Welcome var Iner WelcomeY" + " : "+welcome.getInerWelcome().getInerWelcomeY());
        System.out.println("Request Welcome Object Iner Welcome var Iner WelcomeZ" + " : "+welcome.getInerWelcome().getInerWelcomeZ());


        return "OK";
    }
}
