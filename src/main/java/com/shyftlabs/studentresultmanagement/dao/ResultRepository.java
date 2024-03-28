package com.shyftlabs.studentresultmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyftlabs.studentresultmanagement.entity.Result;

public interface ResultRepository extends JpaRepository<Result ,Long>  {

    List<Result> findAllBystudentId(Long studentId);

    List<Result> findAllByisActive(int i);

    List<Result> findAllBycourseId(Long course_Id);

}
