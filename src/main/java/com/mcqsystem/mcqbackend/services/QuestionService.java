package com.mcqsystem.mcqbackend.services;

import lombok.RequiredArgsConstructor;
import com.mcqsystem.mcqbackend.entities.Question;
import com.mcqsystem.mcqbackend.repositories.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private  final QuestionRepository questionRepository;

    public List<Question> getQuestionsByExamId(Long examId) {
        return questionRepository.findByExamId(examId);
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }
}
