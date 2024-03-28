package com.shyftlabs.studentresultmanagement.dto;

import org.springframework.stereotype.Component;

@Component
public class CourseRequestDto {
    private String course_Name;

    public String getCourse_Name() {
        return course_Name;
    }

    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }

}
