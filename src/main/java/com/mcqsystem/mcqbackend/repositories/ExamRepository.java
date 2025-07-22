package com.mcqsystem.mcqbackend.repositories;

import com.mcqsystem.mcqbackend.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

}
