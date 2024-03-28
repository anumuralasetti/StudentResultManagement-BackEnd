package com.shyftlabs.studentresultmanagement.mapper;

import org.springframework.stereotype.Component;

import com.shyftlabs.studentresultmanagement.dto.ResultRequestDto;
import com.shyftlabs.studentresultmanagement.entity.Result;

@Component
public class Mapper {

    public Result toResultEntity(ResultRequestDto resultRequestDto){
        Result result=new Result();
        result.setScore(resultRequestDto.getScore());
        result.setIsActive(1);
        return result;
    }

}
