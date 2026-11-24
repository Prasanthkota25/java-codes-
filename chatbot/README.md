# AI Chatbot

Full-stack AI chatbot with **Java Spring Boot**, **MySQL**, **React**, and **OpenAI**.

## Project Structure

```
chatbot/
├── backend/          # Spring Boot REST API
├── frontend/         # React (Vite) chat UI
├── docker-compose.yml
└── .env.example
```

## Prerequisites

- Java 17+
- Maven 3.9+
- Node.js 18+
- MySQL 8 (or use Docker)
- OpenAI API key

## Quick Start (Local)

### 1. Database

Start MySQL and create the database, or use Docker:

```bash
docker run -d --name chatbot-mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=chatbot -e MYSQL_USER=chatbot -e MYSQL_PASSWORD=chatbot -p 3306:3306 mysql:8.0
```

### 2. Backend

```powershell
cd backend
$env:OPENAI_API_KEY="sk-your-key"
$env:DB_HOST="localhost"
mvn spring-boot:run
```

API runs at `http://localhost:8080`

### 3. Frontend

```powershell
cd frontend
npm install
npm run dev
```

UI runs at `http://localhost:5173`

## Docker (All Services)

1. Copy `.env.example` to `.env` and set your `OPENAI_API_KEY`
2. Run:

```bash
docker compose --env-file .env up --build
```

- Frontend: http://localhost
- Backend: http://localhost:8080
- MySQL: localhost:3306

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/health` | Health check |
| POST | `/api/chat` | Send a message |
| GET | `/api/conversations?userId=1` | List conversations |
| GET | `/api/conversations/{id}/messages?userId=1` | Get message history |

### Example chat request

```json
POST /api/chat
{
  "message": "Hello!",
  "conversationId": null,
  "userId": 1
}
```

## Demo User

A demo user is seeded automatically:

- **User ID:** `1`
- **Email:** `demo@chatbot.local`

## Environment Variables

| Variable | Description |
|----------|-------------|
| `OPENAI_API_KEY` | Your OpenAI API key (required) |
| `OPENAI_MODEL` | Model name (default: `gpt-4o-mini`) |
| `DB_HOST` | MySQL host |
| `DB_USER` | MySQL username |
| `DB_PASSWORD` | MySQL password |
| `DB_NAME` | Database name |
| `CORS_ORIGINS` | Allowed frontend origins |

## Security Notes

- Never commit your `.env` file or API keys
- Use environment variables in production
- Add authentication (JWT/OAuth) before deploying publicly
