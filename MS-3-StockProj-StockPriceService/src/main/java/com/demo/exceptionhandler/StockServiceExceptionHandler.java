package com.demo.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exception.CompanyNotFoundException;

@ControllerAdvice
public class StockServiceExceptionHandler {
	@ExceptionHandler(value = CompanyNotFoundException.class)
	public ResponseEntity<String> handleException(){
		return new ResponseEntity<String>("Company Not Available", HttpStatus.BAD_REQUEST);
	}
}
