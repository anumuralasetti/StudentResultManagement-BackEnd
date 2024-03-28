package com.shyftlabs.studentresultmanagement.mapper;

import org.springframework.stereotype.Component;

import com.shyftlabs.studentresultmanagement.dto.StudentRequestDto;
import com.shyftlabs.studentresultmanagement.dto.StudentResponsedto;
import com.shyftlabs.studentresultmanagement.entity.Student;

@Component
public class StudentMapper {

    public Student toEntity(StudentRequestDto studentRequestDto){
        Student student=new Student();
        student.setFamily_Name(studentRequestDto.getFamily_Name());
        student.setFirst_Name(studentRequestDto.getFirst_Name());
        student.setDob(studentRequestDto.getDob());
        student.setEmail(studentRequestDto.getEmail());
        student.setIs_Active(1);
        return student;
    }

    public StudentResponsedto toDto(Student student){
        StudentResponsedto studentResponsedto=new StudentResponsedto();
        studentResponsedto.setFamily_Name(student.getFamily_Name());
        studentResponsedto.setFirst_Name(student.getFirst_Name());
        studentResponsedto.setDob(student.getDob());
        studentResponsedto.setEmail(student.getEmail());
        return studentResponsedto;
    }

}
