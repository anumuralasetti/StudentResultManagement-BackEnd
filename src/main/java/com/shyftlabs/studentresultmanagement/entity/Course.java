package com.shyftlabs.studentresultmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Courses")
public class Course {
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column(name="course_Id")
private Long course_Id;

@Column(name="course_Name")
private String course_Name;

@Column(name="is_Active")
private int isActive;

public Long getCourse_Id() {
    return course_Id;
}

public void setCourse_Id(Long course_Id) {
    this.course_Id = course_Id;
}

public String getCourse_Name() {
    return course_Name;
}

public void setCourse_Name(String course_Name) {
    this.course_Name = course_Name;
}

public int getIsActive() {
    return isActive;
}

public void setIsActive(int isActive) {
    this.isActive = isActive;
}


}
