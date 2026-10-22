# BookStore REST API

A simple and scalable Bookstore backend built with Java Spring Boot. This project manages books, inventory, and orders — designed as a practice for building real-world e-commerce APIs.

### Features
- Add, update, delete and list books
- Search books by title, author, category
- Manage stock and pricing
- RESTful API design
- Error handling and validation

### Tech Stack
- Java 21
- Spring Boot
- Spring Data JPA
- MySQL / H2 Database
- Maven
- Git

### API Endpoints (example)
- `GET /api/books` - Get all books
- `GET /api/books/{id}` - Get book by ID
- `POST /api/books` - Add new book
- `PUT /api/books/{id}` - Update book
- `DELETE /api/books/{id}` - Delete book

### How to Run
```bash
git clone https://github.com/Oviepromise/book_store.git
cd book_store
mvn spring-boot:run
