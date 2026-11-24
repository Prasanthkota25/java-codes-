package com.chatbot.dto;

import java.time.Instant;

public record ConversationSummaryDto(
        Long id,
        String title,
        Instant updatedAt
) {
}
