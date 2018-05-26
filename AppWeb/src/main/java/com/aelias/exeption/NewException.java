package com.aelias.exeption;

public class NewException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NewException() {

	}

	public NewException(String message) {
		super(message);
	}

	public NewException(String message, Throwable cause) {
		super(message, cause);
	}

	public NewException(Throwable cause) {
		super(cause);
	}

}
