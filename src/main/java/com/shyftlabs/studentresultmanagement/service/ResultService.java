package com.shyftlabs.studentresultmanagement.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.shyftlabs.studentresultmanagement.dao.CourseRepository;
import com.shyftlabs.studentresultmanagement.dao.ResultRepository;
import com.shyftlabs.studentresultmanagement.dao.StudentRepository;
import com.shyftlabs.studentresultmanagement.dto.ResultRequestDto;
import com.shyftlabs.studentresultmanagement.entity.Course;
import com.shyftlabs.studentresultmanagement.entity.Result;
import com.shyftlabs.studentresultmanagement.entity.Student;
import com.shyftlabs.studentresultmanagement.mapper.Mapper;

@Service
public class ResultService {

    private final ResultRepository resultRepository;
    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;
    private final Mapper mapper;

    public ResultService(CourseRepository courseRepository,
    ResultRepository resultRepository,
            StudentRepository studentRepository,
            Mapper mapper) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
        this.mapper = mapper;
        this.resultRepository=resultRepository;
    }

    public List<Result> getResults() {
        return resultRepository.findAllByisActive(1);
    }


     public boolean saveResult(ResultRequestDto resultRequestDto) {
        Result result = mapper.toResultEntity(resultRequestDto);
        if(resultRequestDto.getCourse() == null){
            return false;
        }
        Course course = courseRepository.findById(resultRequestDto.getCourse()).orElse(null);
        Student student = studentRepository.findById(resultRequestDto.getStudent()).orElse(null);
        if (course == null || student == null) {
            return false;
        }
        result.setCourse(course);
        result.setStudent(student);
        return resultRepository.save(result) != null;
    }

}
