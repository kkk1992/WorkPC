package com.rabbitmq.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.config.MessagingConfig;
import com.rabbitmq.dto.Order;
import com.rabbitmq.dto.OrderStatus;

@RestController
@RequestMapping("/order")

public class OrderPublisher {

	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/{restaurantName}")
	public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
		
	order.setOrderId(UUID.randomUUID().toString());
	
	//restaurant service
	//payment service
	
	OrderStatus orderStatus= new OrderStatus(order, "Process", "Order Placed Successfully in "+restaurantName);
	
	//String exchange, String routingKey, Object object
	
	
	template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, orderStatus);
	
	return "Success !";
	}
	
	
	
}
