export default function MessageBubble({ role, content }) {
  const isUser = role === 'user';

  return (
    <div className={`message ${isUser ? 'message--user' : 'message--assistant'}`}>
      <div className="message__avatar">{isUser ? 'You' : 'AI'}</div>
      <div className="message__bubble">
        <p>{content}</p>
      </div>
    </div>
  );
}
