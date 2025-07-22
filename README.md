<div align="center"> <img src="https://img.icons8.com/?size=512&id=55494&format=png" width="100"> <h3>Spring Boot MCQ Examination System</h3> <p><em>Internship Assignment - Online MCQ System Backend</em></p> </div> <div align="center"> <img src="https://skillicons.dev/icons?i=java,spring,mysql,maven" /> </div>
<br clear="right">

<details><summary>Table of Contents</summary>

- [📍 Overview](#-overview)
- [👾 Features](#-features)
- [🛠 Tech Stack](#-Tech-Stack)
- [📁 Project Structure](#-project-structure)
  - [📂 Project Index](#-project-index)
- [🚀 Getting Started](#-getting-started)
  - [☑️ Prerequisites](#-prerequisites)
  - [⚙️ Installation](#-installation)
  - [🤖 Usage](#🤖-usage)
  - [🧪 Testing](#🧪-testing)
- [📌 Project Roadmap](#-project-roadmap)
- [🔰 Contributing](#-contributing)
- [🎗 License](#-license)
- [🙌 Acknowledgments](#-acknowledgments)

</details>
<hr>

## 📍 Overview

<code>❯ A Spring Boot based Online MCQ Examination System that allows students to take multiple choice question exams. This backend application provides REST APIs for user authentication, exam management, question handling, and result tracking.</code>

---

## 👾 Features

<code>❯ 🔐 User Authentication	Mock login system with predefined users
📚 Exam Management	Display 3 sample MCQ exam papers
❓ Question System	5 MCQs per exam with multiple choice options
📊 Result Tracking	Save and retrieve exam results with scoring
🗄️ Database Integration	MySQL database with proper entity relationships
🔧 REST APIs	Complete CRUD operations via RESTful endpoints
📄 Sample Data	Pre-loaded with sample users, exams, and questions
</code>

## 🛠 Tech Stack
- Backend Framework: Spring Boot 3.2.0
- Database: MySQL 8.0+
- ORM: Spring Data JPA (Hibernate)
- Build Tool: Maven
- Java Version: 21
- Additional Libraries: Lombok, Validation
---

## 📁 Project Structure

```sh
└── MCQ-Online-System/
    ├── pom.xml
    └── src
        └── main
```


### 📂 Project Index
<details open>
	<summary><b><code>MCQ-ONLINE-SYSTEM/</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			</table>
		</blockquote>
	</details>
	<details> <!-- src Submodule -->
		<summary><b>src</b></summary>
		<blockquote>
			<details>
				<summary><b>main</b></summary>
				<blockquote>
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<details>
										<summary><b>mcqsystem</b></summary>
										<blockquote>
											<details>
												<summary><b>mcqbackend</b></summary>
												<blockquote>
													<table>
													<tr>
														<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/DataInitializer.java'>DataInitializer.java</a></b></td>
														<td><code>❯ REPLACE-ME</code></td>
													</tr>
													<tr>
														<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/McqBackendApplication.java'>McqBackendApplication.java</a></b></td>
														<td><code>❯ REPLACE-ME</code></td>
													</tr>
													</table>
													<details>
														<summary><b>controllers</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/controllers/ResultController.java'>ResultController.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/controllers/QuestionController.java'>QuestionController.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/controllers/ExamController.java'>ExamController.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/controllers/UserController.java'>UserController.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>entities</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/entities/Question.java'>Question.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/entities/Exam.java'>Exam.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/entities/Answer.java'>Answer.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/entities/User.java'>User.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/entities/Result.java'>Result.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>services</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/services/ExamService.java'>ExamService.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/services/ResultService.java'>ResultService.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/services/QuestionService.java'>QuestionService.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/services/UserService.java'>UserService.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>repositories</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/repositories/ResultRepository.java'>ResultRepository.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/repositories/ExamRepository.java'>ExamRepository.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/repositories/AnswerRepository.java'>AnswerRepository.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/repositories/UserRepository.java'>UserRepository.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/sithira23/MCQ-Online-System/blob/master/src/main/java/com/mcqsystem/mcqbackend/repositories/QuestionRepository.java'>QuestionRepository.java</a></b></td>
																<td><code>❯ REPLACE-ME</code></td>
															</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with MCQ-Online-System, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java


### ⚙️ Installation

Install MCQ-Online-System using one of the following methods:

**Build from source:**

1. Clone the MCQ-Online-System repository:
```sh
❯ git clone https://github.com/sithira23/MCQ-Online-System
```

2. Navigate to the project directory:
```sh
❯ cd MCQ-Online-System
```

3. Install the project dependencies:

```sh
❯ Start XAMPP (Apache + MySQL)
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
```

### 🤖 Usage
Run MCQ-Online-System using the following command:
```sh
❯ mvn clean install
mvn spring-boot:run
Verify Installation
```
```sh
Application runs on: http://localhost:8005
Sample data is loaded automatically
Database tables are created
```

### 📡 API Endpoints
👤 Authentication
```sh
POST /api/users/login - User login
POST /api/users/register - User registration
```

📚 Exam Management
```sh
GET /api/exams - Get all available exams
GET /api/exams/{id} - Get specific exam details
POST /api/exams - Create new exam
```
❓ Question Management
```sh
GET /api/questions/exam/{examId} - Get questions for specific exam
POST /api/questions - Add new question
```
📊 Result Management
```sh
POST /api/results - Submit exam results
GET /api/results/user/{userId} - Get user's results
GET /api/results/{resultId} - Get specific result details
GET /api/results/{resultId}/answers - Get detailed answers
```

---





### 🧪 Testing
Using Browser
```sh
> GET http://localhost:8005/api/exams
```
Using cURL
# Get all exams
```sh
> curl -X GET http://localhost:8005/api/exams
```
# Login test
```sh
curl -X POST http://localhost:8005/api/users/login \
  -H "Content-Type: application/json" \
  -d '{"email":"john@example.com","password":"password123"}'
```
# Get questions for exam 1
```sh
> curl -X GET http://localhost:8005/api/questions/exam/1
```
# Using Postman
- Import the provided Postman collection
- Test all endpoints with sample data
- Verify CRUD operations


---
## 📌 Project Roadmap

- [x] Technology Stack: Spring Boot + MySQL ✅
- [x] Login System: Mock login with sample users ✅
- [x] Exam Papers: 3 sample MCQ papers displayed ✅
- [x] MCQ System: 5 questions per exam ✅
- [x] Result View: Score tracking and answer review ✅
- [x] Database: All required entities implemented ✅
- [x] REST APIs: Complete CRUD operations ✅
- [x] Sample Data: Pre-loaded test data ✅

---

## 📝 Notes
- Application runs on port 8005 (configurable)
- Database tables are created automatically
- Sample data is loaded on first startup
- All APIs support JSON format
- CORS enabled for frontend integration

## 🔰 Contributing

- **💬 [Join the Discussions](https://github.com/sithira23/MCQ-Online-System/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/sithira23/MCQ-Online-System/issues)**: Submit bugs found or log feature requests for the `MCQ-Online-System` project.
- **💡 [Submit Pull Requests](https://github.com/sithira23/MCQ-Online-System/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/sithira23/MCQ-Online-System
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/sithira23/MCQ-Online-System/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=sithira23/MCQ-Online-System">
   </a>
</p>
</details>

---

## 🎗 License

This project is licensed under the MIT License - see the LICENSE file for details.

---

## 🙌 Acknowledgments

- Developed as part of internship assignment - SerendiLabs

---
