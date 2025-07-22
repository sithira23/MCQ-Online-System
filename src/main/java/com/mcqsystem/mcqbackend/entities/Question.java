package com.mcqsystem.mcqbackend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "questions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exam_id", nullable = false)
    private Long examId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String QuestionText;

    @Column(nullable = false)
    private String optionA;

    @Column(nullable = false)
    private  String optionB;

    @Column(nullable = false)
    private     String optionC;

    @Column(nullable = false)
    private     String optionD;

    @Column(nullable = false)
    private String correctOption;
}
