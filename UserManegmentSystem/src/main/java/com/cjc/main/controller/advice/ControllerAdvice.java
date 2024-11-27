package com.cjc.main.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cjc.main.exception.InvalidAgeException;
import com.cjc.main.exception.UserNotFoundException;
import com.cjc.main.model.User;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFound(UserNotFoundException unte)
    {
    return new ResponseEntity<String>(unte.getMessage(),HttpStatus.NOT_FOUND);	

    }
    @ExceptionHandler
    public ResponseEntity<String> InvalidAgeException( InvalidAgeException ageExce)
    {
    	return new ResponseEntity<String>(ageExce.getMessage(),HttpStatus.BAD_REQUEST);

    }



}
