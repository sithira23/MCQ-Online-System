package com.mcqsystem.mcqbackend.services;

import lombok.RequiredArgsConstructor;
import com.mcqsystem.mcqbackend.entities.Exam;
import com.mcqsystem.mcqbackend.repositories.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExamService {

    private final ExamRepository examRepository;

    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }

    public Optional<Exam> getExamById(Long examId) {
        return examRepository.findById(examId);
    }

    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }
}
