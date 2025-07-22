package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.entities.Answer;
import org.example.entities.Result;
import org.example.repositories.AnswerRepository;
import org.example.repositories.ResultRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ResultService {

    private final ResultRepository resultRepository;
    private final AnswerRepository answerRepository;

    public Result saveResult(Long userId, Long examId, Integer score) {
        Result result = new Result();
        result.setUserId(userId);
        result.setExamId(examId);
        result.setScore(score);
        result.setTimestamp(LocalDateTime.now());
        return resultRepository.save(result);
    }

    public List<Result>  getResultsByUserId(Long userId) {
        return  resultRepository.findByUserId(userId);
    }

    public Optional<Result> getResultById(Long resultId) {
        return  resultRepository.findById(resultId);
    }

    public List<Answer> getAnswersByResultId(Long resultId) {
        return answerRepository.findByResultId(resultId);
    }

}
