package com.ms.mail.services;

import com.ms.mail.models.EmailModel;
import com.ms.mail.repositories.EmailRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    final private EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public void sendMail(EmailModel emailModel) {

    }
}
