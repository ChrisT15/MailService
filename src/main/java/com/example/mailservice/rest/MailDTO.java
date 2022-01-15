package com.example.mailservice.rest;

import java.util.List;

/**
 * Data Transfer Object für eine Mail
 */
public class MailDTO
{
    /**
     * Liste der Empfänger
     */
    private List<String> toList;
    /**
     * Betreff
     */
    private String subject;
    /**
     * Text der Mail
     */
    private String text;

    public List<String> getToList() {
        return toList;
    }

    public void setToList(List<String> toList) {
        this.toList = toList;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
