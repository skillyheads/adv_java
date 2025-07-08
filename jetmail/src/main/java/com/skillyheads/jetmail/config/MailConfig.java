package com.skillyheads.jetmail.config;

import com.skillyheads.jetmail.services.MailChimpSender;
import com.skillyheads.jetmail.services.ZohoMailAdaptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {
    @ConditionalOnProperty(name = "jetmail.provider", havingValue = "zohomail")
    @Bean
    public ZohoMailAdaptor zohoMail(){
        return new ZohoMailAdaptor();
    }
    @ConditionalOnProperty(name = "jetmail.provider", havingValue = "mailchimp")
    @Bean
    public MailChimpSender mailChimpMail(){
        return new MailChimpSender();
    }
}
