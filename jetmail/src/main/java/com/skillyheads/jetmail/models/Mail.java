package com.skillyheads.jetmail.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;
@JacksonXmlRootElement
public class Mail implements Serializable {
    private String id;
    private String subject;
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }


    @Override
    public String toString() {
        return "Mail{" +
                "body='" + body + '\'' +
                ", id='" + id + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
