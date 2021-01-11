package com.sdproject.evaluator.exam.infra;

import com.sdproject.evaluator.answer.infra.AnswerJPA;
import com.sdproject.evaluator.student.infra.StudentJPA;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ExamsSent")
public class ExamSentJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_id")
    private ExamJPA exam;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private StudentJPA student;

    private int score;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    public ExamSentJPA() { }

    public ExamSentJPA(ExamJPA exam, StudentJPA student, int score, Date startDate, Date endDate) {
        this.exam = exam;
        this.student = student;
        this.score = score;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExamJPA getExam() {
        return exam;
    }

    public void setExam(ExamJPA exam) {
        this.exam = exam;
    }

    public StudentJPA getStudent() {
        return student;
    }

    public void setStudent(StudentJPA student) {
        this.student = student;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
