package org.rabbitmq.queue.util.Producer;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.rabbitmq.queue.Constants.RabbitConstant;
import org.rabbitmq.queue.model.Book;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author mingzhihong
 * @Description //TODO
 * @Date 20-4-7 下午10:49
 **/
@Component
@Slf4j
public class DelayProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 生产者  如果更改绑定的队列重启之后发现接收的消息还是之前的
     * 登录 http://127.0.0.1:15672  将队列删除之后重新启动即可
     * */
    public void sendDelayProducer(){
        Book book = new Book();
        Date date = new Date();
        book.setName("rabbitmq实战之延迟队列   delay.message");
        book.setIntroduction("这是一本讲解rabbitmq在项目中实战的过程  "+date);
        book.setWriter("mzhd");

        amqpTemplate.convertAndSend(RabbitConstant.DELAY_MODE_QUEUE,RabbitConstant.DELAY_ROUTING_KEY,JSON.toJSONString(book));

    }
}
