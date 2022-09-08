package com.bridgelabz.rabbitmqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMQConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMQConsumerApplication.class, args);
		System.out.println("\n < ----- Welcome to Rabbit MQ Producer Application ----- > \n");
	}
}