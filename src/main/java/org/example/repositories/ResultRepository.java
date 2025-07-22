package org.example.repositories;

import org.example.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result>findByUserId(Long userId);
    List<Result>findByExamId(Long examId);

}
