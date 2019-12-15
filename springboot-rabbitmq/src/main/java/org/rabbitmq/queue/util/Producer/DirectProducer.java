package org.rabbitmq.queue.util.Producer;

import com.alibaba.fastjson.JSON;
import com.rabbitmq.tools.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.rabbitmq.queue.config.RabbitMQConfig;
import org.rabbitmq.queue.model.Book;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Slf4j
public class DirectProducer {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendDirectProducer(){
        Book book = new Book();
        book.setName("rabbitmq实战");
        book.setIntroduction("这是一本讲解rabbitmq在项目中实战的过程");
        book.setWriter("mzh");
        log.info("发送消息");
        amqpTemplate.convertAndSend(RabbitMQConfig.DIRECT_QUEUE,JSON.toJSONString(book));
    }
}
