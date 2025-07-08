package com.skillyheads.jetmail.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class ZohoMailAdaptor implements MailSender{
    private ZohoMailSender mailSender = new ZohoMailSender();


    @Override
    public boolean sendMail(String toMail, String subject, String mailBody) {
        mailSender.sendZohoMail(toMail, subject, mailBody);
        return true;
    }
}
