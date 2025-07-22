package com.mcqsystem.mcqbackend.controllers;

import lombok.RequiredArgsConstructor;
import com.mcqsystem.mcqbackend.entities.Exam;
import com.mcqsystem.mcqbackend.services.ExamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exams")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ExamController {

    private final ExamService examService;

    @GetMapping
    public ResponseEntity<List<Exam>> getAllExams(){
        List<Exam> exams = examService.getAllExams();
        return ResponseEntity.ok(exams);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Exam> getExamById(@PathVariable Long id){
        return examService.getExamById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Exam> createExam(@RequestBody Exam exam){
        Exam savedExam = examService.createExam(exam);
        return ResponseEntity.ok(savedExam);
    }
}
