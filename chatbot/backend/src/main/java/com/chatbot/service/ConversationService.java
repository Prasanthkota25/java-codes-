package com.chatbot.service;

import com.chatbot.dto.ConversationSummaryDto;
import com.chatbot.dto.MessageDto;
import com.chatbot.exception.NotFoundException;
import com.chatbot.repository.ConversationRepository;
import com.chatbot.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConversationService {

    private final ConversationRepository conversationRepository;
    private final MessageRepository messageRepository;

    @Transactional(readOnly = true)
    public List<ConversationSummaryDto> listByUser(Long userId) {
        return conversationRepository.findByUserIdOrderByUpdatedAtDesc(userId)
                .stream()
                .map(conversation -> new ConversationSummaryDto(
                        conversation.getId(),
                        conversation.getTitle(),
                        conversation.getUpdatedAt()
                ))
                .toList();
    }

    @Transactional(readOnly = true)
    public List<MessageDto> getMessages(Long conversationId, Long userId) {
        conversationRepository.findByIdAndUserId(conversationId, userId)
                .orElseThrow(() -> new NotFoundException("Conversation not found"));

        return messageRepository.findByConversationIdOrderByCreatedAtAsc(conversationId)
                .stream()
                .map(message -> new MessageDto(
                        message.getRole().name().toLowerCase(),
                        message.getContent(),
                        message.getCreatedAt()
                ))
                .toList();
    }
}
