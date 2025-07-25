package com.skillyheads.cim.controllers;

import com.netflix.discovery.converters.Auto;
import com.skillyheads.cim.clients.OMSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/info")
public class CIMController {
    @Autowired
    private Environment environment;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OMSClient omsClient;
    @GetMapping
    public String getInfo(){

        String url = "http://localhost:9292/oms/info";

        String result = "";
        HttpHeaders headers = createHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);

        try {
            ResponseEntity<String> response = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    entity,
                    String.class
            );

            result = omsClient.getOmsInfo();//response.getBody();

        } catch (Exception e) {
          result = "";
        }
        return "Customer Information Management System From "+ environment.getProperty("local.server.port") + result;
    }

    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setAccept(List.of(MediaType.ALL));
        return headers;
    }
}
