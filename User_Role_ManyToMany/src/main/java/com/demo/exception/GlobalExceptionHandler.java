//package com.demo.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import com.demo.payload.ApiResponse;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//	@ExceptionHandler(ResourceNotFoundException.class)
//	public ResponseEntity<ApiResponse> userNotFoundExceptionHandler(ResourceNotFoundException ex){
//		
//		String message= ex.getMessage();
//		
//		ApiResponse apiResponse= new ApiResponse(message, false);
//		
//		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
//	}
//	
//	@ExceptionHandler(ResourceNotFoundException.class)
//	public ResponseEntity<ApiResponse> roleNotFoundExceptionHandler(ResourceNotFoundException ex){
//		
//		String message= ex.getMessage();
//		
//		ApiResponse apiResponse= new ApiResponse(message, false);
//		
//		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
//	}
//	
//}
