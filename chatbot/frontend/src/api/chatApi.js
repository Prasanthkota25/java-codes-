import axios from 'axios';

const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL || '',
  headers: { 'Content-Type': 'application/json' },
});

export async function sendMessage({ message, conversationId, userId }) {
  const { data } = await api.post('/api/chat', {
    message,
    conversationId,
    userId,
  });
  return data;
}

export async function getConversations(userId) {
  const { data } = await api.get('/api/conversations', { params: { userId } });
  return data;
}

export async function getMessages(conversationId, userId) {
  const { data } = await api.get(`/api/conversations/${conversationId}/messages`, {
    params: { userId },
  });
  return data;
}
