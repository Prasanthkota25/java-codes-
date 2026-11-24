package com.chatbot.controller;

import com.chatbot.dto.ConversationSummaryDto;
import com.chatbot.dto.MessageDto;
import com.chatbot.service.ConversationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/conversations")
@RequiredArgsConstructor
public class ConversationController {

    private final ConversationService conversationService;

    @GetMapping
    public List<ConversationSummaryDto> listConversations(@RequestParam Long userId) {
        return conversationService.listByUser(userId);
    }

    @GetMapping("/{id}/messages")
    public List<MessageDto> getMessages(@PathVariable Long id, @RequestParam Long userId) {
        return conversationService.getMessages(id, userId);
    }
}
