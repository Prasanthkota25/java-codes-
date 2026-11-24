package com.chatbot.service;

import com.chatbot.config.OpenAiProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class OpenAiService {

    private final RestClient openAiRestClient;
    private final OpenAiProperties properties;

    public String chat(List<OpenAiMessage> messages) {
        if (properties.getApiKey() == null || properties.getApiKey().isBlank()) {
            throw new IllegalStateException("OPENAI_API_KEY is not configured");
        }

        Map<String, Object> body = Map.of(
                "model", properties.getModel(),
                "messages", messages,
                "max_tokens", properties.getMaxTokens(),
                "temperature", properties.getTemperature()
        );

        ChatCompletionResponse response = openAiRestClient.post()
                .uri("/chat/completions")
                .body(body)
                .retrieve()
                .body(ChatCompletionResponse.class);

        if (response == null || response.choices == null || response.choices.isEmpty()) {
            throw new IllegalStateException("Empty response from OpenAI");
        }

        return response.choices.get(0).message.content;
    }

    public record OpenAiMessage(String role, String content) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class ChatCompletionResponse {
        public List<Choice> choices;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Choice {
        public ResponseMessage message;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class ResponseMessage {
        public String content;

        @JsonProperty("role")
        public String role;
    }
}
