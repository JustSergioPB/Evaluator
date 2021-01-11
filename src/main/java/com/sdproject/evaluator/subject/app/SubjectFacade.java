package com.sdproject.evaluator.subject.app;

import com.sdproject.evaluator.subject.domain.Subject;
import com.sdproject.evaluator.subject.domain.SubjectIn;
import com.sdproject.evaluator.subject.infra.SubjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class SubjectFacade {

    private SubjectRepository subjectRepository;

    public Subject create(SubjectIn subject){
        return null;
    }

    public Subject update(String id, SubjectIn subject){
        return null;
    }

    public Subject get(String id){
        return null;
    }

    public Subject[] getAll(){
        return null;
    }

    public void delete(String id){

    }
}
