package com.skillyheads.cim.clients;

import org.springframework.stereotype.Service;

@Service
public class OMSClientFallback implements OMSClient{

    @Override
    public String getOmsInfo() {
        return "OMS Fallback";
    }
}
