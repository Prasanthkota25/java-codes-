package com.chatbot.dto;

import java.time.Instant;

public record MessageDto(
        String role,
        String content,
        Instant createdAt
) {
}
