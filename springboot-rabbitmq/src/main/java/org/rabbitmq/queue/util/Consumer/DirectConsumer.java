package org.rabbitmq.queue.util.Consumer;

import lombok.extern.slf4j.Slf4j;
import org.rabbitmq.queue.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author mingzhihong
 * @Description //direct模式的消费者
 * @Date 19-12-15 下午3:54
 **/
@Component
@Slf4j
public class DirectConsumer {

    @RabbitListener(queues = RabbitMQConfig.DIRECT_QUEUE)
    public void receiverDirectQueue(String book){
        log.info("监听到的消息:{}",book);
    }
}
