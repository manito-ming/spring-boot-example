package org.rabbitmq.queue.util.Consumer;

import lombok.extern.slf4j.Slf4j;
import org.rabbitmq.queue.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author mingzhihong
 * @Description //topic模式的消费者
 * @Date 19-12-15 下午3:54
 **/
@Component
@Slf4j
public class TopicConsumer {

    /**
     * 消费者  queues的值代表队列一绑定的队列
     * */
    @RabbitListener(queues = RabbitMQConfig.TOPIC_QUEUE1)
    public void receiveTopic1(String book) {
        log.info("【receiveTopic1监听到消息】" + book);
    }
    @RabbitListener(queues = RabbitMQConfig.TOPIC_QUEUE2)
    public void receiveTopic2(String book) {
        log.info("【receiveTopic2监听到消息】" + book);
    }

    @RabbitListener(queues = RabbitMQConfig.TOPIC_QUEUE3)
    public void receiveTopic3(String book) {
        log.info("【receiveTopic3监听到消息】" + book);
    }
}
