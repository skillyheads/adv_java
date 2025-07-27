package com.skillyheads.cim.config;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class FeignClientConfig {
    @Bean
    public ErrorDecoder errorDecoder() {
        return new FeignErrorDecoder();
    }

    static class FeignErrorDecoder implements ErrorDecoder {
        @Override
        public Exception decode(String methodKey, Response response) {
            switch (response.status()) {
                case 500:
                    return new Exception("Internal Server Error");
                case 404:
                    return new Exception("Not Found");
                case 503:
                    return new Exception("Service Unavailable");
                default:
                    if (response.status() >= 400) {
                        return new Exception("HTTP Error: " + response.status());
                    }
                    return new ErrorDecoder.Default().decode(methodKey, response);
            }
        }
    }
}