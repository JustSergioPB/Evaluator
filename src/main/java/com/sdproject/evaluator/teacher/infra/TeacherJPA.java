package com.sdproject.evaluator.teacher.infra;

import com.sdproject.evaluator.user.infra.UserJPA;

import javax.persistence.*;

@Entity
@Table(name="teachers")
public class TeacherJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @OneToOne
    @JoinColumn(name = "user_id", updatable = false, nullable = false)
    private UserJPA user;

    private String expertise;

    public TeacherJPA() { }

    public TeacherJPA(UserJPA user, String expertise) {
        this.user = user;
        this.expertise = expertise;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserJPA getUser() {
        return user;
    }

    public void setUser(UserJPA user) {
        this.user = user;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
