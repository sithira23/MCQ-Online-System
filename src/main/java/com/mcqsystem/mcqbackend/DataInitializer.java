package com.mcqsystem.mcqbackend;

import lombok.RequiredArgsConstructor;
import com.mcqsystem.mcqbackend.entities.Exam;
import com.mcqsystem.mcqbackend.entities.Question;
import com.mcqsystem.mcqbackend.entities.User;
import com.mcqsystem.mcqbackend.repositories.ExamRepository;
import com.mcqsystem.mcqbackend.repositories.QuestionRepository;
import com.mcqsystem.mcqbackend.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final ExamRepository examRepository;
    private  final QuestionRepository questionRepository;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0 || examRepository.count() == 0 || questionRepository.count() == 0) {
            System.out.println("Missing data detected. Initializing sample data...");
            initializeData();
            System.out.println("Sample data initialization complete.");
        } else {
            System.out.println("All sample data already exsits. Skipping data initialization...");
        }
    }

    private void initializeData() {
        System.out.println("Starting data initialization...");

        // Only create users if they don't exist
        if (userRepository.count() == 0) {
            User user1 = new User(null, "John Doe", "john@example.com", "password123");
            User user2 = new User(null, "Jane Smith", "jane@example.com", "password123");
            userRepository.save(user1);
            userRepository.save(user2);
            System.out.println("Users created successfully");
        }

        // Only create exams if they don't exist
        if (examRepository.count() == 0) {
            Exam exam1 = new Exam(null, "Java Basics", "Basic Java programming concepts");
            Exam exam2 = new Exam(null, "Spring Boot Fundamentals", "Introduction to Spring Boot framework");
            Exam exam3 = new Exam(null, "Database Concepts", "Basic database and SQL concepts");

            examRepository.save(exam1);
            examRepository.save(exam2);
            examRepository.save(exam3);
            System.out.println("Exams created successfully");
        }

        // Only create questions if they don't exist
        if (questionRepository.count() == 0) {
            // Get existing exams
            List<Exam> exams = examRepository.findAll();
            if (exams.size() >= 3) {
                createJavaQuestions(exams.get(0).getId());
                createSpringBootQuestions(exams.get(1).getId());
                createDatabaseQuestions(exams.get(2).getId());
                System.out.println("Questions created successfully");
            }
        }

        System.out.println("Sample data initialization complete!");
    }

    private void createJavaQuestions(Long examId) {
        Question q1 = new Question(null, examId,
                "What is the correct way to declare a variable in Java?",
                "int x;", "integer x;", "var x;", "num x;", "A");

        Question q2 = new Question(null, examId,
                "Which keyword is used to create a class in Java?",
                "create", "class", "new", "object", "B");

        Question q3 = new Question(null, examId,
                "What is the main method signature in Java?",
                "public static void main(String args)",
                "public void main(String[] args)",
                "public static void main(String[] args)",
                "static void main(String[] args)", "C");

        Question q4 = new Question(null, examId,
                "Which of these is NOT a primitive data type in Java?",
                "int", "String", "boolean", "char", "B");

        Question q5 = new Question(null, examId,
                "What does JVM stand for?",
                "Java Virtual Machine", "Java Variable Method",
                "Java Verified Module", "Java Version Manager", "A");

        questionRepository.save(q1);
        questionRepository.save(q2);
        questionRepository.save(q3);
        questionRepository.save(q4);
        questionRepository.save(q5);
    }

    private void createSpringBootQuestions(Long examId) {
        Question q1 = new Question(null, examId,
                "What annotation is used to mark a class as a Spring Boot application?",
                "@SpringApplication", "@SpringBootApplication",
                "@Application", "@BootApplication", "B");

        Question q2 = new Question(null, examId,
                "Which annotation is used to create REST endpoints?",
                "@Controller", "@RestController", "@Service", "@Repository", "B");

        Question q3 = new Question(null, examId,
                "What is the default port for Spring Boot applications?",
                "8080", "3000", "9090", "8081", "A");

        Question q4 = new Question(null, examId,
                "Which file is used for Spring Boot configuration?",
                "config.properties", "application.properties",
                "spring.properties", "boot.properties", "B");

        Question q5 = new Question(null, examId,
                "What annotation is used for dependency injection?",
                "@Inject", "@Autowired", "@Dependency", "@Wire", "B");

        questionRepository.save(q1);
        questionRepository.save(q2);
        questionRepository.save(q3);
        questionRepository.save(q4);
        questionRepository.save(q5);
    }

    private void createDatabaseQuestions(Long examId) {
        Question q1 = new Question(null, examId,
                "What does SQL stand for?",
                "Structured Query Language", "Simple Query Language",
                "Standard Query Language", "System Query Language", "A");

        Question q2 = new Question(null, examId,
                "Which command is used to retrieve data from a database?",
                "GET", "SELECT", "FETCH", "RETRIEVE", "B");

        Question q3 = new Question(null, examId,
                "What is a primary key?",
                "A key that opens the database", "A unique identifier for records",
                "The first key in a table", "A password for the database", "B");

        Question q4 = new Question(null, examId,
                "Which of these is a NoSQL database?",
                "MySQL", "PostgreSQL", "MongoDB", "Oracle", "C");

        Question q5 = new Question(null, examId,
                "What does CRUD stand for?",
                "Create, Read, Update, Delete", "Copy, Read, Update, Delete",
                "Create, Remove, Update, Delete", "Create, Read, Upload, Delete", "A");

        questionRepository.save(q1);
        questionRepository.save(q2);
        questionRepository.save(q3);
        questionRepository.save(q4);
        questionRepository.save(q5);
    }
}



