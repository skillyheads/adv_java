package com.skillyheads.jetmail.services;

public interface MailSender {
    public boolean sendMail(String toMail, String subject, String mailBody);
}
