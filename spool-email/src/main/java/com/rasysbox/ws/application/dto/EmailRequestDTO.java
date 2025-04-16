package com.rasysbox.ws.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequestDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "To e-mail", example = "rasysbox@hotmail.com")
    private String to;

    @Schema(description = "Subject of the e-mail", example = "Test Subject")
    private String subject;

    @Schema(description = "Body of the e-mail", example = "Test Body")
    private String body;
}
