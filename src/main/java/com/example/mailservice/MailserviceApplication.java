package com.example.mailservice;

import com.example.mailservice.anwedungslogik.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;

@SpringBootApplication
public class MailserviceApplication
{
	@Autowired
	private MailService mailService;

	public static void main(String[] args)
	{
		SpringApplication.run(MailserviceApplication.class, args);
	}
}
