package com.techbizz.westminster.classpractise.demo.productapi;

import java.time.LocalDateTime;

public record SuccessResponse(
        String message,
        int status,
        LocalDateTime timestamp
) {
    public SuccessResponse(String message, int status) {
        this(message, status, LocalDateTime.now());
    }
}
