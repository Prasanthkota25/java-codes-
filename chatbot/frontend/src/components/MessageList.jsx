import LoadingIndicator from './LoadingIndicator';
import MessageBubble from './MessageBubble';

export default function MessageList({ messages, loading }) {
  return (
    <div className="message-list">
      {messages.length === 0 && !loading && (
        <div className="message-list__empty">
          <h2>Welcome to AI Chatbot</h2>
          <p>Ask anything to get started.</p>
        </div>
      )}
      {messages.map((msg, index) => (
        <MessageBubble
          key={`${msg.createdAt}-${index}`}
          role={msg.role}
          content={msg.content}
        />
      ))}
      {loading && <LoadingIndicator />}
    </div>
  );
}
