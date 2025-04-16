package com.rasysbox.ws.infrastructure.shared.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GlobalException extends RuntimeException {

    private String message;
    private String errorReason;
}