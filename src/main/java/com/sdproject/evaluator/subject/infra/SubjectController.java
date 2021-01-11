package com.sdproject.evaluator.subject.infra;

import com.sdproject.evaluator.student.domain.Student;
import com.sdproject.evaluator.subject.app.SubjectFacade;
import com.sdproject.evaluator.subject.domain.Subject;
import com.sdproject.evaluator.subject.domain.SubjectIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SubjectController {
    private static final String path = "subject";

    @Autowired
    private SubjectFacade subjectFacade;

    @RequestMapping(method = RequestMethod.POST, path = path)
    public ResponseEntity<Subject> create(@RequestBody SubjectIn reqSubject){
        Subject subject = subjectFacade.create(reqSubject);

        if(subject == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(subject, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = path + "{id}")
    public ResponseEntity<Subject> update(@PathVariable String id, @RequestBody SubjectIn reqSubject){
        Subject subject = subjectFacade.update(id, reqSubject);

        if(subject == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(subject, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path + "{id}")
    public ResponseEntity<Subject> get(@PathVariable String id){
        Subject subject = subjectFacade.get(id);

        if(subject == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(subject, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path)
    public ResponseEntity<Subject[]> getAll(){

        Subject[] subjects = subjectFacade.getAll();

        if(subjects.length == 0) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(subjects, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = path + "{id}")
    public void delete(@PathVariable String id){
        subjectFacade.delete(id);
    }
}
