package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.entities.Exam;
import org.example.repositories.ExamRepository;
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
