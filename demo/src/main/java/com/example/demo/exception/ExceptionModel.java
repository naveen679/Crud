package com.example.demo.exception;

import org.springframework.stereotype.Component;


public class ExceptionModel extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int error;
	private String message;
	private String Details;
	
	@Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
	
	
	public ExceptionModel(int error,String message,String Details) {
		super();
		this.error = error;
		this.message = message;
		this.Details=Details;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ExceptionModel()
	{
		
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	

}
