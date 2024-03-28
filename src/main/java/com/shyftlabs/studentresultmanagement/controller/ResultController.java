package com.shyftlabs.studentresultmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shyftlabs.studentresultmanagement.dto.ResultRequestDto;
import com.shyftlabs.studentresultmanagement.entity.Result;
import com.shyftlabs.studentresultmanagement.service.ResultService;

@CrossOrigin(origins = "*")
@RestController
public class ResultController {
    @Autowired ResultService resultService;

    @GetMapping("results")
    public List<Result> getResults() {
       return resultService.getResults();
    }

    @PostMapping("results")
    public Boolean saveResult(@RequestBody ResultRequestDto resultRequestDto) {
       return resultService.saveResult(resultRequestDto);
    }

}
