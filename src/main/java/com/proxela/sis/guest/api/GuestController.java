package com.proxela.sis.guest.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class GuestController {

    @GetMapping
    public String welcomeGuest(){
        return "Hello and Welcome :)";
    }



}
