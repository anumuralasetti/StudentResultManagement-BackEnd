package com.shyftlabs.studentresultmanagement.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class StudentResponsedto {
    private String first_Name;
    private String family_Name;
    private Date dob;
    private String email;

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

}
