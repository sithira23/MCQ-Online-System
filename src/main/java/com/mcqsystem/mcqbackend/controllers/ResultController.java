package com.mcqsystem.mcqbackend.controllers;

import lombok.RequiredArgsConstructor;
import com.mcqsystem.mcqbackend.entities.Answer;
import com.mcqsystem.mcqbackend.entities.Result;
import com.mcqsystem.mcqbackend.services.ResultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ResultController {

    private final ResultService resultService;

    @PostMapping
    public ResponseEntity<Result> saveResult(@RequestBody Result result){
        Result savedResult = resultService.saveResult(
                result.getUserId(),
                result.getExamId(),
                result.getScore()
        );
        return ResponseEntity.ok(savedResult);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Result>> getResultsByUserId(@PathVariable Long userId){
        List<Result> results = resultService.getResultsByUserId(userId);
        return ResponseEntity.ok(results);
    }

    @GetMapping("/{resultId}/answers")
    public ResponseEntity<List<Answer>> getAnswersByResultId(@PathVariable Long resultId){
        List<Answer> answers = resultService.getAnswersByResultId(resultId);
        return ResponseEntity.ok(answers);
    }
}
