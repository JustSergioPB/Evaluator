package com.sdproject.evaluator.subject.infra;

import com.sdproject.evaluator.student.infra.StudentJPA;
import com.sdproject.evaluator.teacher.infra.TeacherJPA;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subjects")
public class SubjectJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(nullable = false)
    private String name;

    private String description;

    private String contents;

    @Column(nullable = false)
    private int semester;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private int places;

    @ManyToMany(mappedBy = "subjects")
    private List<StudentJPA> students;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private TeacherJPA teacher;

    public SubjectJPA(String name, String description, String contents, int semester, int year, int places, List<StudentJPA> students, TeacherJPA teacher) {
        this.name = name;
        this.description = description;
        this.contents = contents;
        this.semester = semester;
        this.year = year;
        this.places = places;
        this.students = students;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public List<StudentJPA> getStudents() {
        return students;
    }

    public void setStudents(List<StudentJPA> students) {
        this.students = students;
    }

    public TeacherJPA getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherJPA teacher) {
        this.teacher = teacher;
    }
}
