package org.rabbitmq.queue.util.Consumer;

import lombok.extern.slf4j.Slf4j;
import org.rabbitmq.queue.config.RabbitMQConfig;
import org.rabbitmq.queue.model.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DirectConsumer {

    @RabbitListener(queues = RabbitMQConfig.DIRECT_QUEUE)
    public void receiverDirectQueue(String book){
        log.info("监听到的消息:{}",book.toString());
//        System.out.println("监听到的消息:{}"+book);
    }
}
