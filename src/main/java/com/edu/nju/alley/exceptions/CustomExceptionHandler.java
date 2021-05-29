package com.edu.nju.alley.exceptions;

import com.edu.nju.alley.vo.ResponseVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = NoSuchDataException.class)
    public ResponseVO customExceptionHandler(NoSuchDataException e) {
        return ResponseVO.failure().msg(e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseVO exceptionHandler(Exception e) {
        return ResponseVO.failure().msg("未知错误，可能的原因是: " + e.getMessage());
    }

}