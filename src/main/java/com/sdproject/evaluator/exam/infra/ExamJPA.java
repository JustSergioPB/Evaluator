package com.sdproject.evaluator.exam.infra;

import com.sdproject.evaluator.question.infra.QuestionJPA;
import com.sdproject.evaluator.subject.infra.SubjectJPA;
import com.sdproject.evaluator.teacher.infra.TeacherJPA;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "exams")
public class ExamJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id")
    private SubjectJPA subject;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private TeacherJPA teacher;

    @Column(nullable = false)
    private int maxPunctuation;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(nullable = false)
    private String title;

    private String description;

    private String time;

    @JoinTable(
            name = "rel_exams_questions",
            joinColumns = @JoinColumn(name = "exam_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name="question_id", nullable = false)
    )
    @ManyToMany()
    private List<QuestionJPA> questions;

    @Column(nullable = false)
    private boolean available;

    public ExamJPA() { }

    public ExamJPA(SubjectJPA subject, TeacherJPA teacher, int maxPunctuation, Date date, String title, String description, String time, List<QuestionJPA> questions, boolean available) {
        this.subject = subject;
        this.teacher = teacher;
        this.maxPunctuation = maxPunctuation;
        this.date = date;
        this.title = title;
        this.description = description;
        this.time = time;
        this.questions = questions;
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubjectJPA getSubject() {
        return subject;
    }

    public void setSubject(SubjectJPA subject) {
        this.subject = subject;
    }

    public int getMaxPunctuation() {
        return maxPunctuation;
    }

    public void setMaxPunctuation(int maxPunctuation) {
        this.maxPunctuation = maxPunctuation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<QuestionJPA> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionJPA> questions) {
        this.questions = questions;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public TeacherJPA getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherJPA teacher) {
        this.teacher = teacher;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
