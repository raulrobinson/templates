package com.rasysbox.ws.infrastructure.queue;

import com.rasysbox.ws.application.dto.EmailRequestDTO;
import com.rasysbox.ws.infrastructure.config.RabbitMQConfig;
import com.rasysbox.ws.infrastructure.shared.exception.GlobalException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

@Service
public class EmailProducer {
    private final static Logger log = org.slf4j.LoggerFactory.getLogger(EmailProducer.class);

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public EmailProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendEmailToQueue(EmailRequestDTO emailRequestDTO) {
        try {
            rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE,
                    RabbitMQConfig.ROUTING_KEY,
                    emailRequestDTO);
            log.info("Email queued: {}", emailRequestDTO);
        } catch (Exception e) {
            log.error("Error sending email to queue: {}", e.getMessage());
            throw new GlobalException("Error sending email to queue: " + emailRequestDTO, e.toString());
        }
    }
}
