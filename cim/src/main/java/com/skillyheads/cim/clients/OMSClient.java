package com.skillyheads.cim.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="oms")
public interface OMSClient {
    @GetMapping("/info")
    public String getOmsInfo();
}
