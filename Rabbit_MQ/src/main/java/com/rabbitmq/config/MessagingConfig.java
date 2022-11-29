package com.rabbitmq.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MessagingConfig {

	public static final String QUEUE="queue_java";
	public static final String EXCHANGE="exchange_java";
	public static final String ROUTING_KEY="routing_key";
	
	@Bean
	public Queue queue() {
		
		return new Queue(QUEUE);
}
	@Bean
	public TopicExchange exchange() {
		
		return new TopicExchange(EXCHANGE);
		
	}
	
	//Now need to bind these two
	@Bean
	public Binding binding(Queue queue, TopicExchange topicExchange) {
		
		return BindingBuilder.bind(queue).to(topicExchange).with("routing_key");
		
	}
	
	//amqp converter
	@Bean
	public MessageConverter converter() {
		
		return new Jackson2JsonMessageConverter();
	}
	
	 public AmqpTemplate template(ConnectionFactory connectionFactory) {
		 
		 final RabbitTemplate rabbitTemplate= new RabbitTemplate(connectionFactory);
		 
		 rabbitTemplate.setMessageConverter(converter());
		 
		 return rabbitTemplate;
		 
	 }
	 
}