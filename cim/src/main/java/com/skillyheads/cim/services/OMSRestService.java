package com.skillyheads.cim.services;

import com.skillyheads.cim.clients.OMSClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OMSRestService implements OMSService{
    @Autowired
    private RestTemplate restTemplate; // Inject as bean instead of creating new instance

    @CircuitBreaker(name = "oms", fallbackMethod = "getOmsAlternativeInfo")
    public String getOMSInfo(){
        ResponseEntity<String> omsResponse = restTemplate.exchange("http://localhost:9292/oms/info", HttpMethod.GET, null, String.class );
        return omsResponse.getBody();
    }

    public String getOmsAlternativeInfo(Exception ex) {
        if (ex instanceof io.github.resilience4j.circuitbreaker.CallNotPermittedException) {
            return "Circuit Breaker OPEN - OMS service temporarily unavailable";
        } else {
            return "Circuit Breaker - OMS service failed: " + ex.getMessage();
        }
    }
}
