package com.sdproject.evaluator.teacher.infra;

import com.sdproject.evaluator.student.domain.Student;
import com.sdproject.evaluator.teacher.app.TeacherFacade;
import com.sdproject.evaluator.teacher.domain.Teacher;
import com.sdproject.evaluator.teacher.domain.TeacherIn;
import com.sdproject.evaluator.user.domain.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class TeacherController {
    private static final String path = "student";

    @Autowired
    private TeacherFacade teacherFacade;

    @RequestMapping(method = RequestMethod.POST, path = path + "login")
    public ResponseEntity<Teacher> login(@RequestBody LoginUser reqTeacher){
        Teacher teacher = teacherFacade.login(reqTeacher);

        if(teacher == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = path + "{id}")
    public ResponseEntity<Teacher> update(@PathVariable String id, @RequestBody TeacherIn reqTeacher){
        Teacher teacher = teacherFacade.update(id,reqTeacher);

        if(teacher == null) return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path + "{id}")
    public ResponseEntity<Teacher> get(@PathVariable String id){
        Teacher teacher = teacherFacade.get(id);

        if(teacher == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = path)
    public ResponseEntity<Teacher[]> getAll(){
        Teacher[] teachers = teacherFacade.getAll();

        if(teachers.length == 0) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = path + "{id}")
    public void delete(@PathVariable String id){

        teacherFacade.delete(id);
    }
}
