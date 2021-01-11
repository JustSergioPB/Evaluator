package com.sdproject.evaluator.exam.infra;

import com.sdproject.evaluator.exam.app.ExamFacade;
import com.sdproject.evaluator.exam.domain.Exam;
import com.sdproject.evaluator.exam.domain.ExamIn;
import com.sdproject.evaluator.exam.domain.ExamSent;
import com.sdproject.evaluator.exam.domain.ExamSentIn;
import com.sdproject.evaluator.subject.domain.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExamController {

    private static final String path = "exam";

    @Autowired
    private ExamFacade examFacade;

    @RequestMapping(method = RequestMethod.POST, path = path)
    public ResponseEntity<Exam> create(@RequestBody ExamIn reqExam){
        Exam exam = examFacade.create(reqExam);

        if(exam == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(exam, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = path + "{id}")
    public ResponseEntity<Exam> update(@PathVariable String id, @RequestBody ExamIn reqExam){
        Exam exam = examFacade.update(id, reqExam);

        if(exam == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(exam, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path + "{id}")
    public ResponseEntity<Exam> get(@PathVariable String id){
        Exam exam = examFacade.get(id);

        if(exam == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(exam, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path)
    public ResponseEntity<Exam[]> getAll(){

        Exam[] exams = examFacade.getAll();

        if(exams.length == 0) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(exams, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = path + "{id}")
    public void delete(@PathVariable String id){
        examFacade.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, path = path + "/end/{id}")
    public ResponseEntity<ExamSent> end(@RequestBody ExamSentIn reqExamSent, @PathVariable String id){
        ExamSent exam = examFacade.end(reqExamSent, id);

        if(exam == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(exam, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = path + "/start/{id}")
    public ResponseEntity<ExamSent> start(@PathVariable String id){
        ExamSent exam = examFacade.start(id);

        if(exam == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(exam, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = path + "/correct/{id}")
    public ResponseEntity<ExamSent> correct(@PathVariable String id, @RequestBody int score){

        ExamSent exam = examFacade.correct(id, score);

        if(exam == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(exam, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = path + "/addQuestions/{id}")
    public ResponseEntity<Exam> addQuestions(@RequestBody String[] idQuestions, @PathVariable String id){
        Exam exam = examFacade.addQuestions(idQuestions, id);

        if(exam == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(exam, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = path + "/removeQuestions/{id}")
    public ResponseEntity<Exam> removeQuestions(@RequestBody String[] idQuestions, @PathVariable String id){
        Exam exam = examFacade.removeQuestions(idQuestions, id);

        if(exam == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(exam, HttpStatus.OK);
    }
}
