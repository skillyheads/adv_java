package com.skillyheads.jetmail.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class MailChimpSender implements MailSender{
    private static final Logger logger = LogManager.getLogger(MailChimpSender.class);
    public boolean sendMail(String toAddress, String subject, String mailBody){
        logger.info("Mail triggered to {} with subject {} using Mail Chimp", toAddress, subject);
        return true;
    }
}
