package com.rasysbox.ws.application.usecase;

import com.rasysbox.ws.application.dto.EmailRequestDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

@Service
public class EmailSenderUseCase {
    private final static Logger log = org.slf4j.LoggerFactory.getLogger(EmailSenderUseCase.class);

    @Value("${spring.mail.username}")
    private String from;

    private final JavaMailSender mailSender;

    @Autowired
    public EmailSenderUseCase(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(EmailRequestDTO emailRequestDTO) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo(emailRequestDTO.getTo());
            message.setSubject(emailRequestDTO.getSubject());
            message.setText(emailRequestDTO.getBody());
            mailSender.send(message);
            log.info("Email sent to {}", emailRequestDTO.getTo());
        } catch (Exception e) {
            log.error("Error sending email to {} {}", emailRequestDTO.getTo(), e.getMessage());
        }
    }
}
