package com.mcqsystem.mcqbackend.repositories;

import com.mcqsystem.mcqbackend.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findByResultId(Long resultId);
}
