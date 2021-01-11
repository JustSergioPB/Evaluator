package com.sdproject.evaluator.student.infra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentJPA, String> {
}
