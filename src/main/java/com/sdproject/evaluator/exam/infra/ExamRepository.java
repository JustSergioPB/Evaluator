package com.sdproject.evaluator.exam.infra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<ExamJPA, String> {
}
