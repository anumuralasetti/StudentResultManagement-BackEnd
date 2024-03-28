package com.shyftlabs.studentresultmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Results")
public class Result {
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column(name="result_Id")
private Long result_Id;

@Column(name="score")
private char score;

@Column(name = "student_Id", insertable = false, updatable = false)
private long studentId;

@Column(name = "course_Id", insertable = false, updatable = false)
private long courseId;

@ManyToOne
@JoinColumn(name="course_Id")
private Course course;

@ManyToOne
@JoinColumn(name="student_Id")
private Student student;

@Column(name="is_Active")
private int isActive;

public Course getCourse() {
    return course;
}

public int getIsActive() {
    return isActive;
}

public void setIsActive(int isActive) {
    this.isActive = isActive;
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

public Long getResult_Id() {
    return result_Id;
}

public void setResult_Id(Long result_Id) {
    this.result_Id = result_Id;
}

public char getScore() {
    return score;
}

public void setScore(char score) {
    this.score = score;
}

public long getStudentId() {
    return studentId;
}

public void setStudentId(long studentId) {
    this.studentId = studentId;
}

public long getCourseId() {
    return courseId;
}

public void setCourseId(long courseId) {
    this.courseId = courseId;
}


}
