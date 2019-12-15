package org.rabbitmq.queue.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;


@Configuration
public class RabbitMQConfig {
    public static final String DIRECT_QUEUE = "direct_queue";

    @Bean
    public Queue directqueue(){
        //第二个参数指是否持久化
        return new Queue(DIRECT_QUEUE,true);
    }
}
