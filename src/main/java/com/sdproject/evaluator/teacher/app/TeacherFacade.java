package com.sdproject.evaluator.teacher.app;

import com.sdproject.evaluator.teacher.domain.Teacher;
import com.sdproject.evaluator.teacher.domain.TeacherIn;
import com.sdproject.evaluator.teacher.infra.TeacherRepository;
import com.sdproject.evaluator.user.domain.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class TeacherFacade {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher login(LoginUser teacher){
        return null;
    }

    public Teacher update(String id, TeacherIn teacher){
        return null;
    }

    public Teacher get(String id){
        return null;
    }

    public Teacher[] getAll(){
        return null;
    }

    public void delete(String id){

    }

}
