package com.springboot.userservice.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("Resource not found on server");
	}
	
	public ResourceNotFoundException(String massege) {
		super(massege);
	}
}
