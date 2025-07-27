package com.skillyheads.cim.controllers;

import com.skillyheads.cim.services.OMSFeignService;
import com.skillyheads.cim.services.OMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping
public class CIMController {

    @Autowired
    private Environment environment;

    @Autowired
    private OMSService omsService;


    @GetMapping("/info")
    public String getInfo() {
        String omsResult = omsService.getOMSInfo();

        return "Customer Information Management System From " +
                environment.getProperty("local.server.port") + " - " + omsResult;
    }


    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setAccept(List.of(MediaType.ALL));
        return headers;
    }
}
