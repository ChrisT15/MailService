package com.example.mailservice.anwedungslogik;

import com.example.mailservice.rest.MailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Enthält alle Anwendungslogik für Mails
 */
@Service
public class MailService
{
    @Autowired
    JavaMailSender javaMailSender;

    public void sendEmail(SimpleMailMessage simpleMailMessage)
    {
        javaMailSender.send(simpleMailMessage);
    }
}
