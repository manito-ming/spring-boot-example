package org.rabbitmq.queue.util.Consumer;

import org.rabbitmq.queue.Constants.RabbitConstant;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


/**
 * @Author mingzhihong
 * @Description //TODO
 * @Date 20-3-26 下午9:41
 **/
@Component
@Slf4j
public class FanoutConsumer {

    @RabbitListener(queues = RabbitConstant.TOPIC_QUEUE4)
    public void receiveTopic2(String book) {
        log.info("【receiveTopic4监听到消息】" + book);
    }
    @RabbitListener(queues = RabbitConstant.TOPIC_QUEUE5)
    public void receiveTopic3(String book) {
        log.info("【receiveTopic5监听到消息】" + book);
    }
}
