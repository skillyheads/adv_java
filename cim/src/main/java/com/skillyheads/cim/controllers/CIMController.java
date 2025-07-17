package com.skillyheads.cim.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cim")
public class CIMController {
    @GetMapping
    public String getInfo(){
        return "Customer Information Management System";
    }
}
