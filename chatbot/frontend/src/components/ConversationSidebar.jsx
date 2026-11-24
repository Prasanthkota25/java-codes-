import { useEffect, useState } from 'react';
import { getConversations } from '../api/chatApi';

export default function ConversationSidebar({
  userId,
  activeConversationId,
  onSelect,
  onNewChat,
  refreshKey,
}) {
  const [conversations, setConversations] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    let cancelled = false;

    async function load() {
      setLoading(true);
      try {
        const data = await getConversations(userId);
        if (!cancelled) {
          setConversations(data);
        }
      } catch {
        if (!cancelled) {
          setConversations([]);
        }
      } finally {
        if (!cancelled) {
          setLoading(false);
        }
      }
    }

    load();
    return () => {
      cancelled = true;
    };
  }, [userId, refreshKey]);

  return (
    <aside className="sidebar">
      <div className="sidebar__header">
        <h2>Chats</h2>
        <button type="button" onClick={onNewChat}>
          + New
        </button>
      </div>
      <div className="sidebar__list">
        {loading && <p className="sidebar__hint">Loading...</p>}
        {!loading && conversations.length === 0 && (
          <p className="sidebar__hint">No conversations yet</p>
        )}
        {conversations.map((conversation) => (
          <button
            key={conversation.id}
            type="button"
            className={`sidebar__item ${
              activeConversationId === conversation.id ? 'sidebar__item--active' : ''
            }`}
            onClick={() => onSelect(conversation.id)}
          >
            <span className="sidebar__title">{conversation.title}</span>
            <span className="sidebar__date">
              {new Date(conversation.updatedAt).toLocaleDateString()}
            </span>
          </button>
        ))}
      </div>
    </aside>
  );
}
