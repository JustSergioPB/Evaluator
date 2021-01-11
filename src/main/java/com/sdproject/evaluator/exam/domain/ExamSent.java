package com.sdproject.evaluator.exam.domain;

import com.sdproject.evaluator.answer.domain.Answer;
import com.sdproject.evaluator.student.domain.Student;

import java.util.Date;

public class ExamSent {
    public String id;
    public Exam exam;
    public Student student;
    public Answer[] answers;
    public int score;
    public Date startDate;
    public Date endDate;
}
