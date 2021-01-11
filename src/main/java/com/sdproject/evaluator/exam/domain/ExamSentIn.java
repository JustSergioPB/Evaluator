package com.sdproject.evaluator.exam.domain;

import com.sdproject.evaluator.answer.domain.Answer;
import com.sdproject.evaluator.answer.domain.AnswerIn;
import com.sdproject.evaluator.student.domain.Student;

import java.util.Date;

public class ExamSentIn {
    public String idExam;
    public String idStudent;
    public AnswerIn[] answers;
    public int score;
    public Date startDate;
    public Date endDate;
}
