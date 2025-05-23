package com.rasysbox.ws.infrastructure.controller;

import com.rasysbox.ws.application.dto.EmailRequestDTO;
import com.rasysbox.ws.domain.model.EmailResponse;
import com.rasysbox.ws.infrastructure.queue.EmailProducer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;

@RestController
@Tag(name = "Email", description = "Email API")
@RequestMapping(path = "${controller.properties.base-path}/emails", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmailController {
    private final static Logger log = org.slf4j.LoggerFactory.getLogger(EmailController.class);

    private final EmailProducer emailProducer;

    public EmailController(EmailProducer emailProducer) {
        this.emailProducer = emailProducer;
    }

    @PostMapping
    @Operation(summary = "Queue email", description = "Queue email")
    public ResponseEntity<EmailResponse> queueEmail(@RequestBody EmailRequestDTO emailRequestDTO) {
        emailProducer.sendEmailToQueue(emailRequestDTO);
        log.info("Email queued: {}", emailRequestDTO.getTo());
        return new ResponseEntity<>(new EmailResponse("queued", "Email queued"), HttpStatus.OK);
    }
}
