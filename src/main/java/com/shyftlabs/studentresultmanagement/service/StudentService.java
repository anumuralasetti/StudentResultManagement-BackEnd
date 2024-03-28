package com.shyftlabs.studentresultmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shyftlabs.studentresultmanagement.dao.ResultRepository;
import com.shyftlabs.studentresultmanagement.dao.StudentRepository;
import com.shyftlabs.studentresultmanagement.dto.StudentRequestDto;
import com.shyftlabs.studentresultmanagement.entity.Result;
import com.shyftlabs.studentresultmanagement.entity.Student;
import com.shyftlabs.studentresultmanagement.mapper.StudentMapper;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final ResultRepository resultRepository;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper, ResultRepository resultRepository) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
        this.resultRepository = resultRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findByisActive(1);
    }

    public boolean saveStudent(StudentRequestDto studentRequestDto) {
        Student studentEntity = studentMapper.toEntity(studentRequestDto);
        if(studentEntity == null){
            return false;
        }
        return studentRepository.save(studentEntity) != null;
    }

    public boolean deleteStudent(Student student) {
        student.setIs_Active(0);
        List<Result> results=resultRepository.findAllBystudentId(student.getStudent_Id());
        for(Result result:results){
            result.setIsActive(0);
        }
        if(results== null){
            return false;
        }
        resultRepository.saveAll(results);
        return studentRepository.save(student) != null;
    }

    

}
