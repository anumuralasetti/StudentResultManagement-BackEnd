package com.shyftlabs.studentresultmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyftlabs.studentresultmanagement.entity.Course;

public interface CourseRepository extends JpaRepository<Course ,Long> {

    List<Course> findByisActive(int i);

}
