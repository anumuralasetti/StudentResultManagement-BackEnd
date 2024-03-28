package com.shyftlabs.studentresultmanagement.controller;

import org.springframework.web.bind.annotation.RestController;

import com.shyftlabs.studentresultmanagement.dto.StudentRequestDto;
import com.shyftlabs.studentresultmanagement.entity.Student;
import com.shyftlabs.studentresultmanagement.service.StudentService;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin(origins = "*")
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("students")
    public List<Student> getStudents() {
       return studentService.getStudents();
    }

    @PostMapping("students")
    public Boolean saveStudent(@RequestBody StudentRequestDto studentRequestDto ) {
       return studentService.saveStudent(studentRequestDto);
    }

    @PutMapping("delete")
    public boolean deleteStudent(@RequestBody Student student) {    
        return   studentService.deleteStudent(student);
    }
    

}
