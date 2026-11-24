import { useState } from 'react';
import ConversationSidebar from './ConversationSidebar';
import MessageInput from './MessageInput';
import MessageList from './MessageList';
import { useChat } from '../hooks/useChat';

const DEMO_USER_ID = 1;

export default function ChatWindow() {
  const [refreshKey, setRefreshKey] = useState(0);
  const {
    messages,
    conversationId,
    loading,
    error,
    send,
    loadConversation,
    startNewChat,
  } = useChat(DEMO_USER_ID);

  const handleSend = async (text) => {
    const resultId = await send(text);
    if (resultId) {
      setRefreshKey((value) => value + 1);
    }
  };

  const handleSelectConversation = async (id) => {
    await loadConversation(id);
  };

  const handleNewChat = () => {
    startNewChat();
  };

  return (
    <div className="app-shell">
      <ConversationSidebar
        userId={DEMO_USER_ID}
        activeConversationId={conversationId}
        onSelect={handleSelectConversation}
        onNewChat={handleNewChat}
        refreshKey={refreshKey}
      />
      <main className="chat-window">
        <header className="chat-window__header">
          <div>
            <h1>AI Chatbot</h1>
            <p>Powered by OpenAI</p>
          </div>
        </header>
        {error && <div className="chat-window__error">{error}</div>}
        <MessageList messages={messages} loading={loading} />
        <MessageInput onSend={handleSend} disabled={loading} />
      </main>
    </div>
  );
}
