package com.ms.mail.controllers;

import com.ms.mail.services.EmailService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    final private EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }
}
