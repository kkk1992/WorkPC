package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.config.MessagingConfig;
import com.rabbitmq.dto.OrderStatus;

@Component
public class User {

	@RabbitListener(queues= MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message Received From Queue : "+orderStatus);
		
	}
}
