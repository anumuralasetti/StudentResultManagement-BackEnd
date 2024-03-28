package com.shyftlabs.studentresultmanagement.mapper;

import org.springframework.stereotype.Component;

import com.shyftlabs.studentresultmanagement.dto.CourseRequestDto;
import com.shyftlabs.studentresultmanagement.dto.CourseResponseDto;
import com.shyftlabs.studentresultmanagement.entity.Course;

@Component
public class CourseMapper {
    public Course toEntity(CourseRequestDto courseRequestDto){
        Course Course=new Course();
        Course.setCourse_Name(courseRequestDto.getCourse_Name());
        Course.setIsActive(1);
        return Course;
    }

    public CourseResponseDto toDto(Course course){
        CourseResponseDto courseResponsedto=new CourseResponseDto();
        courseResponsedto.setCourse_Name(course.getCourse_Name());
        return courseResponsedto;
    }
}
