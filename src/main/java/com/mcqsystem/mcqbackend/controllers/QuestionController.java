package com.mcqsystem.mcqbackend.controllers;

import lombok.RequiredArgsConstructor;
import com.mcqsystem.mcqbackend.entities.Question;
import com.mcqsystem.mcqbackend.services.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/exam/{examId}")
    public ResponseEntity<List <Question> >getQuestionsByExamId(@PathVariable Long examId){
        List<Question> questions = questionService.getQuestionsByExamId(examId);
        return ResponseEntity.ok(questions);
    }
    @PostMapping
    public ResponseEntity<Question> createQuestion(@RequestBody Question question){
        Question savedQuestion = questionService.createQuestion(question);
        return ResponseEntity.ok(savedQuestion);
    }
}
