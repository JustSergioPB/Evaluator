package com.sdproject.evaluator.answer.infra;

import com.sdproject.evaluator.exam.infra.ExamSentJPA;
import com.sdproject.evaluator.question.infra.QuestionJPA;

import javax.persistence.*;

@Entity
@Table(name = "Answers")
public class AnswerJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    private QuestionJPA question;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_sent_id")
    private ExamSentJPA examSent;

    private String response;

    public AnswerJPA() { }

    public AnswerJPA(QuestionJPA question, ExamSentJPA examSent, String response) {
        this.question = question;
        this.examSent = examSent;
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public QuestionJPA getQuestion() {
        return question;
    }

    public void setQuestion(QuestionJPA question) {
        this.question = question;
    }

    public ExamSentJPA getExamSent() {
        return examSent;
    }

    public void setExamSent(ExamSentJPA examSent) {
        this.examSent = examSent;
    }
}
