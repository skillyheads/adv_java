package com.skillyheads.jetmail.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JetmailController {
    @GetMapping("/mails")
    public String getMail(){
        return "All Mails";
    }
}
