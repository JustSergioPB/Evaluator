package com.sdproject.evaluator.student.app;

import com.sdproject.evaluator.student.domain.Student;
import com.sdproject.evaluator.student.domain.StudentIn;
import com.sdproject.evaluator.student.infra.StudentRepository;
import com.sdproject.evaluator.user.domain.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class StudentFacade {

    @Autowired
    private StudentRepository studentRepository;

    public Student register(StudentIn student){
        return null;
    }


    public Student login( LoginUser student){
        return null;
    }

    public Student update(String id, StudentIn student){
        return null;
    }

    public Student[] getAll(){
        return null;
    }

    public Student get(String id){
        return null;
    }

    public void delete(String id){

    }
}
