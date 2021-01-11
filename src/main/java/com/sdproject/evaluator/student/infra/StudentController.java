package com.sdproject.evaluator.student.infra;

import com.sdproject.evaluator.exam.domain.Exam;
import com.sdproject.evaluator.student.app.StudentFacade;
import com.sdproject.evaluator.student.domain.Student;
import com.sdproject.evaluator.student.domain.StudentIn;
import com.sdproject.evaluator.teacher.domain.Teacher;
import com.sdproject.evaluator.user.domain.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private static final String path = "student";

    @Autowired
    private StudentFacade studentFacade;

    @RequestMapping(method = RequestMethod.POST, path = path + "register")
    public ResponseEntity<Student> register(@RequestBody StudentIn reqStudent){
        Student student = studentFacade.register(reqStudent);

        if(student == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = path + "login")
    public ResponseEntity<Student> login(@RequestBody LoginUser reqStudent){
        Student student = studentFacade.login(reqStudent);

        if(student == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = path + "{id}")
    public ResponseEntity<Student> update(@PathVariable String id, @RequestBody StudentIn reqStudent){
        Student student = studentFacade.update(id, reqStudent);

        if(student == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path + "{id}")
    public ResponseEntity<Student> get(@PathVariable String id){
        Student student = studentFacade.get(id);

        if(student == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path)
    public ResponseEntity<Student[]> getAll(){
        Student[] students = studentFacade.getAll();

        if(students.length == 0) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = path + "{id}")
    public void delete(@PathVariable String id){
        studentFacade.delete(id);
    }
}
