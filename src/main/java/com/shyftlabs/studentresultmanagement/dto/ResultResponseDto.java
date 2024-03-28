package com.shyftlabs.studentresultmanagement.dto;

import org.springframework.stereotype.Component;

import com.shyftlabs.studentresultmanagement.entity.Course;
import com.shyftlabs.studentresultmanagement.entity.Student;

@Component
public class ResultResponseDto {

private Course course;
private Student student;
private char score;

public Course getCourse() {
    return course;
}
public void setCourse(Course course) {
    this.course = course;
}
public Student getStudent() {
    return student;
}
public void setStudent(Student student) {
    this.student = student;
}
public char getScore() {
    return score;
}
public void setScore(char score) {
    this.score = score;
}

}

