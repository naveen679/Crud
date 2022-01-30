package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> nullpointer()
	{
		return new ResponseEntity<String>("Null pointer Exception Occured",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<String>method()
	{
		return new ResponseEntity<String>("Please check method is not supported",HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@ExceptionHandler(ExceptionModel.class)
	public ResponseEntity<Object>exceptionmethod(WebRequest rq)
	{
		ExceptionModel em=new ExceptionModel(404,"Data Not Present",rq.getDescription(false));
		
		return new ResponseEntity<>(em,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
