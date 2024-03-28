package com.shyftlabs.studentresultmanagement.entity;

import java.sql.Date;
import jakarta.persistence.*;



@Entity
@Table(name = "Students")

public class Student {
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY )
@Column(name="student_Id")
private Long student_Id;

public Long getStudent_Id() {
    return student_Id;
}

public void setStudent_Id(Long student_Id) {
    this.student_Id = student_Id;
}

public String getFirst_Name() {
    return first_Name;
}

public void setFirst_Name(String first_Name) {
    this.first_Name = first_Name;
}

public String getFamily_Name() {
    return family_Name;
}

public void setFamily_Name(String family_Name) {
    this.family_Name = family_Name;
}

public Date getDob() {
    return dob;
}

public void setDob(Date dob) {
    this.dob = dob;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public int getIsActive() {
    return isActive;
}

public void setIs_Active(int isActive) {
    this.isActive = isActive;
}

@Column(name="first_Name")
private String first_Name;

@Column(name="family_Name")
private String family_Name;

@Column(name="dob")
private Date dob;

@Column(name="email")
private String email;

@Column(name="is_Active")
private int isActive;

}
