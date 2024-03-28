package com.shyftlabs.studentresultmanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shyftlabs.studentresultmanagement.dto.CourseRequestDto;
import com.shyftlabs.studentresultmanagement.entity.Course;
import com.shyftlabs.studentresultmanagement.service.CourseService;

@CrossOrigin(origins = "*")
@RestController
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService=courseService;
    }

    @GetMapping("courses")
    public List<Course> getCourses() {
       return courseService.getCourses();
    }

    @PostMapping("courses")
    public Boolean saveCourse(@RequestBody CourseRequestDto courseRequestDto) {
       return courseService.saveCourse(courseRequestDto);
    }

    @PutMapping("courseDelete")
    public boolean deleteCourse(@RequestBody Course course) {
        return courseService.deleteCourse(course);
    }

}
