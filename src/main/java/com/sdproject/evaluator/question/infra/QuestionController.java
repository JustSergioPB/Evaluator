package com.sdproject.evaluator.question.infra;

import com.sdproject.evaluator.question.app.QuestionFacade;
import com.sdproject.evaluator.question.domain.Question;
import com.sdproject.evaluator.question.domain.QuestionIn;
import com.sdproject.evaluator.subject.domain.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
public class QuestionController {
    private static final String path = "question";

    @Autowired
    private QuestionFacade questionFacade;

    @RequestMapping(method = RequestMethod.POST, path = path)
    public ResponseEntity<Question> create(@RequestBody QuestionIn reqQuestion){
        Question question = questionFacade.create(reqQuestion);

        if(question == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = path + "{id}")
    public ResponseEntity<Question> update(@PathVariable String id, @RequestBody QuestionIn reqQuestion){

        Question question = questionFacade.update(id, reqQuestion);

        if(question == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path + "{id}")
    public ResponseEntity<Question> get(@PathVariable String id){

        Question question = questionFacade.get(id);

        if(question == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path)
    public ResponseEntity<Question[]> getAll(){

        Question[] questions = questionFacade.getAll();

        if(questions.length == 0) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = path + "{id}")
    public void delete(@PathVariable String id){
        questionFacade.delete(id);
    }
}
