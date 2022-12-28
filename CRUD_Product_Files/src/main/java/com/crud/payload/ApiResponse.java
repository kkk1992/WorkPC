package com.crud.payload;

public class ApiResponse {

	private String message;
	
	private boolean check;
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public ApiResponse(String message, boolean check) {
		super();
		this.message = message;
		this.check = check;
	}

	public ApiResponse() {
		super();
	}
	
	
}
