package com.bridgelabz.rabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = MQConfiguration.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }
}
