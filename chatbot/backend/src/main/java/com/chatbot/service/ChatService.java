package com.chatbot.service;

import com.chatbot.dto.ChatRequest;
import com.chatbot.dto.ChatResponse;
import com.chatbot.dto.MessageDto;
import com.chatbot.entity.Conversation;
import com.chatbot.entity.Message;
import com.chatbot.entity.MessageRole;
import com.chatbot.entity.User;
import com.chatbot.exception.NotFoundException;
import com.chatbot.repository.ConversationRepository;
import com.chatbot.repository.MessageRepository;
import com.chatbot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {

    private static final String SYSTEM_PROMPT =
            "You are a helpful AI assistant. Be concise, friendly, and accurate.";

    private final UserRepository userRepository;
    private final ConversationRepository conversationRepository;
    private final MessageRepository messageRepository;
    private final OpenAiService openAiService;

    @Transactional
    public ChatResponse sendMessage(ChatRequest request) {
        User user = userRepository.findById(request.userId())
                .orElseThrow(() -> new NotFoundException("User not found"));

        Conversation conversation = resolveConversation(request.conversationId(), user);
        saveMessage(conversation, MessageRole.USER, request.message());

        List<Message> history = messageRepository
                .findTop20ByConversationIdOrderByCreatedAtDesc(conversation.getId());
        Collections.reverse(history);

        List<OpenAiService.OpenAiMessage> openAiMessages = new ArrayList<>();
        openAiMessages.add(new OpenAiService.OpenAiMessage("system", SYSTEM_PROMPT));
        for (Message message : history) {
            openAiMessages.add(new OpenAiService.OpenAiMessage(
                    message.getRole().name().toLowerCase(),
                    message.getContent()
            ));
        }

        String reply = openAiService.chat(openAiMessages);
        saveMessage(conversation, MessageRole.ASSISTANT, reply);

        if (history.size() <= 1) {
            conversation.setTitle(truncate(request.message(), 50));
        }
        conversation.setUpdatedAt(Instant.now());

        List<MessageDto> fullHistory = messageRepository
                .findByConversationIdOrderByCreatedAtAsc(conversation.getId())
                .stream()
                .map(this::toDto)
                .toList();

        return new ChatResponse(conversation.getId(), reply, fullHistory);
    }

    private Conversation resolveConversation(Long conversationId, User user) {
        if (conversationId == null) {
            Conversation conversation = new Conversation();
            conversation.setUser(user);
            return conversationRepository.save(conversation);
        }

        return conversationRepository.findByIdAndUserId(conversationId, user.getId())
                .orElseThrow(() -> new NotFoundException("Conversation not found"));
    }

    private void saveMessage(Conversation conversation, MessageRole role, String content) {
        Message message = new Message();
        message.setConversation(conversation);
        message.setRole(role);
        message.setContent(content);
        messageRepository.save(message);
    }

    private MessageDto toDto(Message message) {
        return new MessageDto(
                message.getRole().name().toLowerCase(),
                message.getContent(),
                message.getCreatedAt()
        );
    }

    private String truncate(String value, int maxLength) {
        if (value.length() <= maxLength) {
            return value;
        }
        return value.substring(0, maxLength - 3) + "...";
    }
}
