package com.chatbot.dto;

import java.util.List;

public record ChatResponse(
        Long conversationId,
        String reply,
        List<MessageDto> history
) {
}
