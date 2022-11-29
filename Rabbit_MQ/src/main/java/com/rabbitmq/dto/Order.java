package com.rabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order { //This order object will publish to queue

	private String orderId;
	
	private String name;
	
	private int quantity;
	
	private double price;
	
	
}
