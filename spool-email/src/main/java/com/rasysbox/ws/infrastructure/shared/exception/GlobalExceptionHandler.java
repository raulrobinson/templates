package com.rasysbox.ws.infrastructure.shared.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<GlobalError> handleGlobalException(GlobalException ex, HttpServletRequest request) {
        return new ResponseEntity<>(GlobalError.builder()
                .timestamp(LocalDateTime.now().toString())
                .message(ex.getMessage())
                .errorReason(ex.getErrorReason())
                .path(request.getRequestURI())
                .build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
