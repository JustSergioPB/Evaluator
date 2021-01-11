package com.sdproject.evaluator.exam.app;

import com.sdproject.evaluator.exam.domain.Exam;
import com.sdproject.evaluator.exam.domain.ExamIn;
import com.sdproject.evaluator.exam.domain.ExamSent;
import com.sdproject.evaluator.exam.domain.ExamSentIn;
import com.sdproject.evaluator.exam.infra.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamFacade {

    @Autowired
    private ExamRepository examRepository;

    public Exam create(ExamIn exam){
        return null;
    }

    public Exam update(String id, ExamIn exam){
        return null;
    }

    public Exam get(String id){
        return null;
    }

    public Exam[] getAll(){
        return null;
    }

    public void delete(String id){
        examRepository.deleteById(id);
    }

    public ExamSent start(String id){
        return null;
    }

    public ExamSent end(ExamSentIn exam, String id){
        return null;
    }

    public ExamSent correct(String id, int score){
        return null;
    }

    public Exam addQuestions(String[] idQuestions, String id){
        return null;
    }

    public Exam removeQuestions(String[] idQuestions, String id){
        return null;
    }
}
