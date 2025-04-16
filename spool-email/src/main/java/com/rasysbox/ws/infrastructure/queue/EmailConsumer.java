package com.rasysbox.ws.infrastructure.queue;

import com.rasysbox.ws.application.usecase.EmailSenderUseCase;
import com.rasysbox.ws.application.dto.EmailRequestDTO;
import com.rasysbox.ws.infrastructure.config.RabbitMQConfig;
import com.rasysbox.ws.infrastructure.shared.exception.GlobalException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

@Service
public class EmailConsumer {
    private final static Logger log = org.slf4j.LoggerFactory.getLogger(EmailConsumer.class);

    private final EmailSenderUseCase emailSender;

    public EmailConsumer(EmailSenderUseCase emailSender) {
        this.emailSender = emailSender;
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeEmail(EmailRequestDTO emailRequestDTO) {
        try {
            emailSender.sendEmail(emailRequestDTO);
            log.info("Email sent successfully: {}", emailRequestDTO);
        } catch (Exception e) {
            log.error("Error consuming email: {}", emailRequestDTO, e);
            throw new GlobalException("Error consuming email: " + emailRequestDTO, e.toString());
        }
    }
}
