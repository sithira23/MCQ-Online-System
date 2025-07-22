<div align="left" style="position: relative;"> <img src="https://img.icons8.com/?size=512&id=55494&format=png" align="right" width="30%" style="margin: -20px 0 0 20px;"> <h1>MCQ Online System</h1> <p align="left"> <em><code>❯ A Spring Boot based Online MCQ Examination System for internship assignment</code></em> </p> <p align="left">Built with the tools and technologies:</p> <p align="left"> <a href="https://skillicons.dev"> <img src="https://skillicons.dev/icons?i=java,spring,mysql,maven,postman"> </a></p> </div> <br clear="right"> <details><summary>Table of Contents</summary>
📍 Overview
👾 Features
📁 Project Structure
🚀 Getting Started
☑️ Prerequisites
⚙️ Installation
🤖 Usage
🧪 Testing
📋 API Endpoints
📌 Sample Data
🔰 Contributing
🎗 License
</details> <hr>
📍 Overview
The MCQ Online System is a backend application built with Spring Boot that allows students to take multiple choice question (MCQ) exams online. This project was developed as part of an internship assignment to demonstrate ability to build functional REST APIs with proper database integration.

Key Features:

User authentication system (mock login)
Display available exam papers
MCQ question management
Answer submission and result tracking
MySQL database integration
RESTful API architecture
👾 Features
🔐 User Management: Mock login system with predefined users
📚 Exam Management: Display 3 sample MCQ exam papers (Java, Spring Boot, Database)
❓ Question System: 5 MCQs per exam with multiple choice options
📊 Result Tracking: Save and retrieve exam results with scoring
🗄️ Database Integration: MySQL database with proper entity relationships
🔧 REST APIs: Complete CRUD operations via RESTful endpoints
📄 Sample Data: Pre-loaded with sample users, exams, and questions
📮 Postman Collection: Ready-to-use API collection for testing
📁 Project Structure
└── MCQ-Online-System/
    ├── pom.xml                                 # Maven dependencies
    ├── src/main/
    │   ├── java/com/mcqsystem/mcqbackend/
    │   │   ├── McqBackendApplication.java      # Main Spring Boot application
    │   │   ├── DataInitializer.java            # Sample data loader
    │   │   ├── controllers/                    # REST API controllers
    │   │   │   ├── UserController.java         # User authentication APIs
    │   │   │   ├── ExamController.java         # Exam management APIs
    │   │   │   ├── QuestionController.java     # Question retrieval APIs
    │   │   │   └── ResultController.java       # Result management APIs
    │   │   ├── entities/                       # JPA entity classes
    │   │   │   ├── User.java                   # User entity
    │   │   │   ├── Exam.java                   # Exam entity
    │   │   │   ├── Question.java               # Question entity
    │   │   │   ├── Result.java                 # Result entity
    │   │   │   └── Answer.java                 # Answer entity
    │   │   ├── repositories/                   # Data access layer
    │   │   │   ├── UserRepository.java
    │   │   │   ├── ExamRepository.java
    │   │   │   ├── QuestionRepository.java
    │   │   │   ├── ResultRepository.java
    │   │   │   └── AnswerRepository.java
    │   │   └── services/                       # Business logic layer
    │   │       ├── UserService.java
    │   │       ├── ExamService.java
    │   │       ├── QuestionService.java
    │   │       └── ResultService.java
    │   └── resources/
    │       └── application.properties          # Database configuration
    └── README.md
🚀 Getting Started
☑️ Prerequisites
Before getting started with MCQ Online System, ensure your runtime environment meets the following requirements:

Java: Version 17 or higher
Maven: Version 3.6 or higher
MySQL: Version 5.7 or higher (XAMPP recommended)
IDE: IntelliJ IDEA (recommended) or any Java IDE
⚙️ Installation
Clone the repository:
git clone https://github.com/sithira23/MCQ-Online-System
cd MCQ-Online-System
Set up the database:

Start XAMPP and run Apache + MySQL
Open phpMyAdmin (http://localhost/phpmyadmin)
Create a new database called mcq_system
Configure database connection: Update src/main/resources/application.properties if needed:

spring.datasource.url=jdbc:mysql://localhost:3306/mcq_system
spring.datasource.username=root
spring.datasource.password=
Install dependencies:

mvn clean install
🤖 Usage
Run the application:
mvn spring-boot:run
The application will start on: http://localhost:8005

Database tables and sample data will be created automatically on first run

🧪 Testing
Option 1: Using Browser

Test GET endpoints directly: http://localhost:8005/api/exams
Option 2: Using Postman

Import the provided Postman collection
Test all API endpoints with sample data
Option 3: Using cURL

# Get all exams
curl -X GET http://localhost:8005/api/exams

# Login test
curl -X POST http://localhost:8005/api/users/login \
  -H "Content-Type: application/json" \
  -d '{"email":"john@example.com","password":"password123"}'
📋 API Endpoints
👤 User Management
POST /api/users/login - User login
POST /api/users/register - User registration
📚 Exam Management
GET /api/exams - Get all available exams
GET /api/exams/{id} - Get specific exam details
POST /api/exams - Create new exam
❓ Question Management
GET /api/questions/exam/{examId} - Get questions for specific exam
POST /api/questions - Add new question
📊 Result Management
POST /api/results - Submit exam results
GET /api/results/user/{userId} - Get user's results
GET /api/results/{resultId} - Get specific result details
GET /api/results/{resultId}/answers - Get detailed answers
📌 Sample Data
The application comes pre-loaded with:

👥 Sample Users:

john@example.com / password123
jane@example.com / password123
📚 Sample Exams:

Java Basics - Basic Java programming concepts
Spring Boot Fundamentals - Introduction to Spring Boot framework
Database Concepts - Basic database and SQL concepts
❓ Sample Questions:

5 MCQs per exam (15 total)
Each question has 4 options (A, B, C, D)
Covers topics: Java fundamentals, Spring Boot basics, Database concepts
🔰 Contributing
💬 Join the Discussions: Share your insights, provide feedback, or ask questions.
🐛 Report Issues: Submit bugs found or log feature requests for the MCQ-Online-System project.
💡 Submit Pull Requests: Review open PRs, and submit your own PRs.
🎗 License
This project is protected under the MIT License. For more details, refer to the LICENSE file.

Assignment Completion Status: ✅ COMPLETE

✅ Spring Boot backend implementation
✅ MySQL database integration
✅ REST API endpoints
✅ Entity relationships (Users, Exams, Questions, Results, Answers)
✅ Sample data initialization
✅ Login functionality (mock)
✅ Exam paper listing
✅ MCQ management (5 questions per exam)
✅ Result tracking system
✅ Postman collection for API testing
