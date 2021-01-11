package com.sdproject.evaluator.student.domain;

import com.sdproject.evaluator.exam.domain.ExamSent;
import com.sdproject.evaluator.subject.domain.Subject;
import com.sdproject.evaluator.user.domain.User;

public class Student extends User {
    public Subject[] subjects;
    public ExamSent[] examsSent;
    public int year;
}
