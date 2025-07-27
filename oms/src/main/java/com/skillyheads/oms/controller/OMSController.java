package com.skillyheads.oms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class OMSController {
    @Autowired
    private Environment environment;
    static boolean running = true;
    @GetMapping("/info")
    public ResponseEntity getOrderInfo(){
        if(running) {
            return ResponseEntity.<String> ok(" Order Management System From " + environment.getProperty("local.server.port") + " responded " + System.currentTimeMillis());
        }else{
            return ResponseEntity.internalServerError().build();
        }
    }

    @PatchMapping("/stop")
    public ResponseEntity stopService(){
        running = false;
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/start")
    public ResponseEntity restartService(){
        running = true;
        return ResponseEntity.ok().build();
    }
}
