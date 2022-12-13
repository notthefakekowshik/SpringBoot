 package com.springBootTutor.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.springBootTutor.entity.ErrorMessage;

@ControllerAdvice 
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(DepartmentNotFoundException.class)
	
	public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFoundException deptException , WebRequest req)
	{
		
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND , deptException.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
//		ErrorMessage message = new ErrorMessage(deptException.getMessage());
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}

}
