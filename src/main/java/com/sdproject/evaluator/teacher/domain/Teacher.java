package com.sdproject.evaluator.teacher.domain;

import com.sdproject.evaluator.subject.domain.Subject;
import com.sdproject.evaluator.user.domain.User;
import com.sdproject.evaluator.user.domain.UserIn;

public class Teacher extends User {
    public Subject subject;
    public String expertise;
}
