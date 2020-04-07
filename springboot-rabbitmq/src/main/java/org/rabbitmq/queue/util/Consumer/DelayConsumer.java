package org.rabbitmq.queue.util.Consumer;

import lombok.extern.slf4j.Slf4j;
import org.rabbitmq.queue.Constants.RabbitConstant;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author mingzhihong
 * @Description //TODO
 * @Date 20-4-7 下午10:54
 **/
@Component
@Slf4j
public class DelayConsumer {

    //如果不消费的话ttl时间之后消息会过期  实验时可将此处注释
    @RabbitListener(queues = RabbitConstant.DELAY_QUEUE)
    public void receiverDirectQueue(String book){
        Date date = new Date();
        log.info("时间:{},监听到的消息{}",date,book);
    }
}
