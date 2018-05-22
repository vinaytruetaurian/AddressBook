package com.vv.addressbookapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ContactsController {

    @GetMapping("/contact")
    public String addContact(){
        return "Hi";
    }

}
