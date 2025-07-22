MCQ Online System
<div align="center"> <img src="https://img.icons8.com/?size=512&id=55494&format=png" width="100"> <h3>Spring Boot MCQ Examination System</h3> <p><em>Internship Assignment - Online MCQ System Backend</em></p> </div> <div align="center"> <img src="https://skillicons.dev/icons?i=java,spring,mysql,maven" /> </div>
📋 Table of Contents
Overview
Features
Tech Stack
Project Structure
Getting Started
API Endpoints
Sample Data
Testing
📍 Overview
A Spring Boot based Online MCQ Examination System that allows students to take multiple choice question exams. This backend application provides REST APIs for user authentication, exam management, question handling, and result tracking.

Assignment Requirements Met:

✅ Mock login system
✅ Display 2-3 sample MCQ papers
✅ 5 MCQs per exam paper
✅ Answer submission and result viewing
✅ Database integration with MySQL
🚀 Features
Feature	Description
🔐 User Authentication	Mock login system with predefined users
📚 Exam Management	Display 3 sample MCQ exam papers
❓ Question System	5 MCQs per exam with multiple choice options
📊 Result Tracking	Save and retrieve exam results with scoring
🗄️ Database Integration	MySQL database with proper entity relationships
🔧 REST APIs	Complete CRUD operations via RESTful endpoints
📄 Sample Data	Pre-loaded with sample users, exams, and questions
🛠 Tech Stack
Backend Framework: Spring Boot 3.2.0
Database: MySQL 8.0+
ORM: Spring Data JPA (Hibernate)
Build Tool: Maven
Java Version: 21
Additional Libraries: Lombok, Validation
📁 Project Structure
MCQ-Online-System/
├── src/main/java/com/mcqsystem/mcqbackend/
│   ├── McqBackendApplication.java          # Main application class
│   ├── DataInitializer.java                # Sample data loader
│   ├── controllers/                        # REST Controllers
│   │   ├── UserController.java
│   │   ├── ExamController.java
│   │   ├── QuestionController.java
│   │   └── ResultController.java
│   ├── entities/                           # JPA Entities
│   │   ├── User.java
│   │   ├── Exam.java
│   │   ├── Question.java
│   │   ├── Result.java
│   │   └── Answer.java
│   ├── repositories/                       # Data Access Layer
│   │   ├── UserRepository.java
│   │   ├── ExamRepository.java
│   │   ├── QuestionRepository.java
│   │   ├── ResultRepository.java
│   │   └── AnswerRepository.java
│   └── services/                          # Business Logic
│       ├── UserService.java
│       ├── ExamService.java
│       ├── QuestionService.java
│       └── ResultService.java
├── src/main/resources/
│   └── application.properties              # Configuration
├── pom.xml                                # Maven dependencies
└── README.md
🚀 Getting Started
Prerequisites
Java 17+
Maven 3.6+
MySQL 5.7+ (XAMPP recommended)
IntelliJ IDEA (recommended)
Installation
Clone the repository

git clone https://github.com/sithira23/MCQ-Online-System
cd MCQ-Online-System
Setup Database

Start XAMPP (Apache + MySQL)
Open phpMyAdmin: http://localhost/phpmyadmin
Create database: mcq_system
Configure Database Connection

Update src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/mcq_system
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
server.port=8005
Build and Run

mvn clean install
mvn spring-boot:run
Verify Installation

Application runs on: http://localhost:8005
Sample data is loaded automatically
Database tables are created
📡 API Endpoints
Authentication
Method	Endpoint	Description
POST	/api/users/login	User login
POST	/api/users/register	User registration
Exam Management
Method	Endpoint	Description
GET	/api/exams	Get all exams
GET	/api/exams/{id}	Get exam by ID
POST	/api/exams	Create new exam
Questions
Method	Endpoint	Description
GET	/api/questions/exam/{examId}	Get questions for exam
POST	/api/questions	Add new question
Results
Method	Endpoint	Description
POST	/api/results	Submit exam result
GET	/api/results/user/{userId}	Get user results
GET	/api/results/{resultId}	Get result details
GET	/api/results/{resultId}/answers	Get detailed answers
📊 Sample Data
Users
Email	Password	Name
john@example.com	password123	John Doe
jane@example.com	password123	Jane Smith
Exams
ID	Title	Description	Questions
1	Java Basics	Basic Java programming concepts	5 MCQs
2	Spring Boot Fundamentals	Introduction to Spring Boot	5 MCQs
3	Database Concepts	Basic database and SQL concepts	5 MCQs
🧪 Testing
Using Browser
GET http://localhost:8005/api/exams
Using cURL
# Get all exams
curl -X GET http://localhost:8005/api/exams

# Login test
curl -X POST http://localhost:8005/api/users/login \
  -H "Content-Type: application/json" \
  -d '{"email":"john@example.com","password":"password123"}'

# Get questions for exam 1
curl -X GET http://localhost:8005/api/questions/exam/1
Using Postman
Import the provided Postman collection
Test all endpoints with sample data
Verify CRUD operations
✅ Assignment Completion Status
[x] Technology Stack: Spring Boot + MySQL ✅
[x] Login System: Mock login with sample users ✅
[x] Exam Papers: 3 sample MCQ papers displayed ✅
[x] MCQ System: 5 questions per exam ✅
[x] Result View: Score tracking and answer review ✅
[x] Database: All required entities implemented ✅
[x] REST APIs: Complete CRUD operations ✅
[x] Sample Data: Pre-loaded test data ✅
📝 Notes
Application runs on port 8005 (configurable)
Database tables are created automatically
Sample data is loaded on first startup
All APIs support JSON format
CORS enabled for frontend integration
🤝 Contributing
Fork the repository
Create feature branch (git checkout -b feature/AmazingFeature)
Commit changes (git commit -m 'Add some AmazingFeature')
Push to branch (git push origin feature/AmazingFeature)
Open a Pull Request
📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

Developed as part of internship assignment - SerendiLabs
