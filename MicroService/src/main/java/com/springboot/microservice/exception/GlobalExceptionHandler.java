package com.springboot.microservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.payload.ApiResponse;

@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFound(ResourceNotFoundException resourceNotFoundException){
		
		String massege=resourceNotFoundException.getMessage();
		ApiResponse response=ApiResponse.builder()
		.massege(massege)
		.success(true)
		.status(HttpStatus.NOT_FOUND)
		.build();
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		
	}
}
