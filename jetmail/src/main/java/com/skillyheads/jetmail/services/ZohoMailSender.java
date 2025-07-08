package com.skillyheads.jetmail.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ZohoMailSender{
    private static final Logger logger = LogManager.getLogger(ZohoMailSender.class);
    public boolean sendZohoMail(String toAddress, String subject, String mailBody){
        logger.info("Mail triggered to {} with subject {} using Zoho Mail", toAddress, subject);
        return true;
    }
}
