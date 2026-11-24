import { useState, useCallback } from 'react';
import { sendMessage, getMessages } from '../api/chatApi';

export function useChat(userId) {
  const [messages, setMessages] = useState([]);
  const [conversationId, setConversationId] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  const loadConversation = useCallback(async (id) => {
    setLoading(true);
    setError(null);
    try {
      const history = await getMessages(id, userId);
      setConversationId(id);
      setMessages(history);
    } catch (err) {
      setError(err.response?.data?.error || 'Failed to load conversation');
    } finally {
      setLoading(false);
    }
  }, [userId]);

  const startNewChat = useCallback(() => {
    setConversationId(null);
    setMessages([]);
    setError(null);
  }, []);

  const send = useCallback(async (text) => {
    if (!text.trim() || loading) return;

    const userMsg = {
      role: 'user',
      content: text,
      createdAt: new Date().toISOString(),
    };
    setMessages((prev) => [...prev, userMsg]);
    setLoading(true);
    setError(null);

    try {
      const data = await sendMessage({
        message: text,
        conversationId,
        userId,
      });
      setConversationId(data.conversationId);
      setMessages(data.history);
      return data.conversationId;
    } catch (err) {
      setError(err.response?.data?.error || 'Failed to send message');
      setMessages((prev) => prev.slice(0, -1));
      return null;
    } finally {
      setLoading(false);
    }
  }, [conversationId, userId, loading]);

  return {
    messages,
    conversationId,
    loading,
    error,
    send,
    loadConversation,
    startNewChat,
  };
}
