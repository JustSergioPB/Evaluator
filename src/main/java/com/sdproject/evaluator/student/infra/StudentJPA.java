package com.sdproject.evaluator.student.infra;

import com.sdproject.evaluator.subject.infra.SubjectJPA;
import com.sdproject.evaluator.user.infra.UserJPA;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class StudentJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @JoinTable(
            name = "rel_students_subjects",
            joinColumns = @JoinColumn(name = "student_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name="subject_id", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<SubjectJPA> subjects;

    @OneToOne
    @JoinColumn(name = "user_id", updatable = false, nullable = false)
    public UserJPA user;

    private int year;

    public StudentJPA(){ }

    public StudentJPA(List<SubjectJPA> subjects, int year) {
        this.subjects = subjects;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<SubjectJPA> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectJPA> subjects) {
        this.subjects = subjects;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
