package com.skillyheads.oms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/info")
public class OMSController {
    @Autowired
    private Environment environment;
    @GetMapping
    public String getOrderInfo(){
        return "Order Management System From "+ environment.getProperty("local.server.port");
    }
}
