package com.springboot.hotelservice.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String string) {
		// TODO Auto-generated constructor stub
		super("Resource not found!!");
	}

}
