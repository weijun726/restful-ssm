package com.bwf.exception;

/**
 * 自定义异常
 * 
 * @author Administrator
 *
 */
public class BWFException extends RuntimeException{

	public BWFException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BWFException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BWFException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BWFException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BWFException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
