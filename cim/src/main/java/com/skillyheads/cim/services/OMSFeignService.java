package com.skillyheads.cim.services;

import com.skillyheads.cim.clients.OMSClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;

public class OMSFeignService implements OMSService{
    @Autowired
    private OMSClient omsClient;

    @CircuitBreaker(name = "OMSClientgetOmsInfo", fallbackMethod = "getOmsAlternativeInfo")
    public String getOMSInfo(){
        return omsClient.getOmsInfo();
    }

    String getOmsAlternativeInfo(Exception ex) {
        if (ex instanceof io.github.resilience4j.circuitbreaker.CallNotPermittedException) {
            return "Circuit Breaker OPEN - OMS service temporarily unavailable";
        } else {
            return "Circuit Breaker - OMS service failed: " + ex.getMessage();
        }
    }
}
