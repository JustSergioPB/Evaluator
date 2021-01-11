package com.sdproject.evaluator.exam.domain;

import com.sdproject.evaluator.question.domain.Question;
import com.sdproject.evaluator.subject.domain.Subject;

import java.util.Date;

public class Exam {
    public String id;
    public Subject subject;
    public int maxPunctuation;
    public Date date;
    public String title;
    public String description;
    public Question[] questions;
    public boolean available;
}
