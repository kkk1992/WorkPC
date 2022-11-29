package com.rabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus {

	//This response order status object will be 
	// returned to the end user
	private Order order;
	
	private String status; //progress, completed
	
	private String message;
	
	
	
	
}
