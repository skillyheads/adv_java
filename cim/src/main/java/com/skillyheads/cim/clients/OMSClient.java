package com.skillyheads.cim.clients;

import com.skillyheads.cim.config.FeignClientConfig;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "oms")
public interface OMSClient {
    @GetMapping("/info")
    String getOmsInfo();
}