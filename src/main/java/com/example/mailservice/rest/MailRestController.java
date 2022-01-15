package com.example.mailservice.rest;

import com.example.mailservice.anwedungslogik.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Nimmt REST-Anfragen für Mails entgegen
 */
@RestController
public class MailRestController
{
    @Autowired
    MailService mailService;

    /** Versendet eine Mail
     * @param mailDTO Mail
     */
    @RequestMapping(
            method = RequestMethod.POST,
            path = "/sendmail",
            consumes = MediaType.APPLICATION_JSON_VALUE)
   public void sendMail(@RequestBody MailDTO mailDTO)
   {
       SimpleMailMessage message = MailRestUtil.convertDTOToMessage(mailDTO);
       mailService.sendEmail(message);
   }
}
