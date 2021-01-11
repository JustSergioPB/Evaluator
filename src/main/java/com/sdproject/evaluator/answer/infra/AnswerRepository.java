package com.sdproject.evaluator.answer.infra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<AnswerJPA, String> {
}
