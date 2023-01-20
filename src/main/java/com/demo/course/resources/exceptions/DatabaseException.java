package com.demo.course.resources.exceptions;

public class DatabaseException extends RuntimeException {

	/**
	 * 1.0
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseException(String message) {
		super(message);
	}
}
