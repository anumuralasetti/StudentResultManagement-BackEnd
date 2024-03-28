package com.shyftlabs.studentresultmanagement.dto;

import org.springframework.stereotype.Component;

@Component
public class ResultRequestDto {

private Long course;
private Long student;
private char score;
public Long getCourse() {
    return course;
}
public void setCourse(Long course) {
    this.course = course;
}
public Long getStudent() {
    return student;
}
public void setStudent(Long student) {
    this.student = student;
}
public char getScore() {
    return score;
}
public void setScore(char score) {
    this.score = score;
}

}
