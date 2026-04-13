🏨 Hotel Management System (Spring Boot + JPA)

A simple backend application built using Spring Boot and Spring Data JPA that manages hotel operations like customers, rooms, and bookings using a layered CSR architecture.

🚀 Features
Add and manage customers
Add and view available rooms
Book rooms for customers
Automatic room availability update
RESTful APIs
MySQL database integration
🏗️ Tech Stack
Java 17
Spring Boot
Spring Data JPA
MySQL
Lombok
Maven
📁 Project Structure
com.hotel.management
│
├── controller   → Handles HTTP requests
├── service      → Business logic
├── repository   → Database interaction (JPA)
├── entity       → Database models

🧠 Key Concepts Used
CSR Architecture (Controller → Service → Repository)
JPA Entity Relationships (@ManyToOne)
Dependency Injection
REST API design
Exception handling basics

🔥 Future Improvements
DTO layer (avoid exposing entities directly)
Global exception handling (@ControllerAdvice)
Validation (@Valid)
Booking conflict handling (date overlap logic)
Authentication & authorization (Spring Security)
Frontend integration (React)

👨‍💻 Author
Akash Ganiger
