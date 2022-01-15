package com.example.mailservice.rest;

import org.springframework.mail.SimpleMailMessage;

/**
 * Hilfsklasse für alle Belange, die REST-Anfragen für Mails
 * benötigt werden.
 */
public class MailRestUtil
{
    private MailRestUtil()
    {
        //Es werden keine Objekte erzeugt.
    }

    /** Wandelt ein {@link MailDTO}-Objekt in ein {@link SimpleMailMessage}
     * -Objekt um. Letzteres wird benötigt, um Mails versenden zu können.
     * @param mailDTO
     * @return
     */
    public static SimpleMailMessage convertDTOToMessage(MailDTO mailDTO)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mailDTO.getToList().toArray(new String[0]));
        message.setSubject(mailDTO.getSubject());
        message.setText(mailDTO.getText());
        return message;
    }
}
