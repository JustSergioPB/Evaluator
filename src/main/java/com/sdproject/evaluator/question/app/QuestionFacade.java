package com.sdproject.evaluator.question.app;

import com.sdproject.evaluator.question.domain.Question;
import com.sdproject.evaluator.question.domain.QuestionIn;
import com.sdproject.evaluator.question.infra.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionFacade {

    @Autowired
    private QuestionRepository questionRepository;

    public Question create(QuestionIn question){
        return null;
    }

    public Question update(String id, QuestionIn question){
        return null;
    }

    public Question get(String id){
        return null;
    }

    public Question[] getAll(){
        return null;
    }
    public void delete(String id){
        questionRepository.deleteById(id);
    }

}
