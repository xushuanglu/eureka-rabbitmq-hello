package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 * @author Administrator
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

	@RabbitHandler
	public void process(String hello) {
		System.out.println("Receiver : " + hello);
	}
	
}
