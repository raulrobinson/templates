package com.telemetry.ws.infrastructure.shared.exception;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GlobalError {

    private String message;
    private String errorReason;
    private String timestamp;
    private String path;
}