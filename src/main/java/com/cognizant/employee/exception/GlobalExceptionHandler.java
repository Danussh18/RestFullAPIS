package com.cognizant.employee.exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	 @ExceptionHandler(EmployeeNotFoundException.class)
		public ResponseEntity<Object> carEmptyExceptionHandler(EmployeeNotFoundException cnfe){
			
			Map<String,Object> body = new HashMap<>();
			
			body.put("status", HttpStatus.BAD_REQUEST);
			body.put("Time", new Date());
			body.put("message",cnfe.getMessage());
			return new ResponseEntity<Object>(body,HttpStatus.BAD_REQUEST);
			
		}
}
