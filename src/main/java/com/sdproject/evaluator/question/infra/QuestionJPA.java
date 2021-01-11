package com.sdproject.evaluator.question.infra;

import com.sdproject.evaluator.exam.infra.ExamJPA;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
public class QuestionJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(nullable = false)
    private String statement;

    private String description;

    @ManyToMany(mappedBy = "questions")
    private List<ExamJPA> exams;

    public QuestionJPA() {}

    public QuestionJPA(String statement, String description, List<ExamJPA> exams) {
        this.statement = statement;
        this.description = description;
        this.exams = exams;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatement() {
        return statement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ExamJPA> getExams() {
        return exams;
    }

    public void setExams(List<ExamJPA> exams) {
        this.exams = exams;
    }
}
