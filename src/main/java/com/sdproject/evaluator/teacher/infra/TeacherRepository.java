package com.sdproject.evaluator.teacher.infra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherJPA, String> {
}
