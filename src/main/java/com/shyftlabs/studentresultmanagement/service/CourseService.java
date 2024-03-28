package com.shyftlabs.studentresultmanagement.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.shyftlabs.studentresultmanagement.dao.CourseRepository;
import com.shyftlabs.studentresultmanagement.dao.ResultRepository;
import com.shyftlabs.studentresultmanagement.dto.CourseRequestDto;
import com.shyftlabs.studentresultmanagement.entity.Course;
import com.shyftlabs.studentresultmanagement.entity.Result;
import com.shyftlabs.studentresultmanagement.mapper.CourseMapper;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;
    private final ResultRepository resultRepository;

    public CourseService(CourseRepository courseRepository, CourseMapper courseMapper, ResultRepository resultRepository) {
        this.courseRepository = courseRepository;
        this.courseMapper = courseMapper;
        this.resultRepository = resultRepository;
    }

    public List<Course> getCourses() {
        return courseRepository.findByisActive(1);
    }

    public boolean saveCourse(CourseRequestDto courseRequestDto) {
        Course course = courseMapper.toEntity(courseRequestDto);
        if (course != null) {
            Course savedCourse = courseRepository.save(course);
            return savedCourse != null;
        }
        return false;
    }

    public boolean deleteCourse(Course course) {
        course.setIsActive(0);
        List<Result> results=resultRepository.findAllBycourseId(course.getCourse_Id());
        results.forEach(result -> result.setIsActive(0));
        resultRepository.saveAll(results);
        return courseRepository.save(course)!= null;
    }

}
