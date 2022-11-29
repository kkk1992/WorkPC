package com.crud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.crud.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ApiResponse> productNotFoundExceptionHandler(ProductNotFoundException ex){
		
		String message=ex.getMessage();
		   
		ApiResponse apiResponse = new ApiResponse(message,false);
		
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
															//404= not found
	}
}
