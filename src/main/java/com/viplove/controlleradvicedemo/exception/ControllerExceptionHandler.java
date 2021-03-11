package com.viplove.controlleradvicedemo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ControllerExceptionHandler {
	  
	  @ExceptionHandler(value = {ResourceNotFoundException.class, CertainException.class})
	  @ResponseStatus(value = HttpStatus.NOT_FOUND)
	  public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
	    int status = 404;
		Date date = new Date();
		String description = null;
		ErrorMessage message = new ErrorMessage(
	        status,
	        date,
	        ex.getMessage(),
	        description);
	    
	    return message;
	  }
	  
	  @ExceptionHandler(value = {RuntimeException.class})
	  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	  public ErrorMessage nullPointerException(RuntimeException ex, WebRequest request) {
	    int status = 500;
		Date date = new Date();
		String description = null;
		ErrorMessage message = new ErrorMessage(
	        status,
	        date,
	        "There has been internal error, we have saved your request and will act on it subsequently. Please log in after sometime to get the status of your request.",
	        description);
	    
	    return message;
	  }
}

