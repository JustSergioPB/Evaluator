package com.sdproject.evaluator.question.infra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionJPA, String> {
}
