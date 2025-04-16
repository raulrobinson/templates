package com.telemetry.ws.infrastructure.shared.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoContentException extends RuntimeException {

    private String message;
    private String errorReason;
}