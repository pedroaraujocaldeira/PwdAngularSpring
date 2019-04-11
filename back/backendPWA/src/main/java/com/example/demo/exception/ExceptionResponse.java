package com.example.demo.exception;

public class ExceptionResponse extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int errorCode;
	
	public ExceptionResponse(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
}
