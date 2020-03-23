package org.rabbitmq.queue.util.Producer;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.rabbitmq.queue.config.RabbitMQConfig;
import org.rabbitmq.queue.model.Book;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @Author mingzhihong
 * @Description //topic模式的生产者
 * @Date 19-12-15 下午3:54
 **/
@Component
@Slf4j
public class TopicProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;
    /**
     * 生产者  如果更改绑定的队列重启之后发现接收的消息还是之前的
     * 登录 http://127.0.0.1:15672  将队列删除之后重新启动即可
     * */
    public void sendTopicProducer(){
        Book book = new Book();
        book.setName("rabbitmq实战之topic模式   topic.message");
        book.setIntroduction("这是一本讲解rabbitmq在项目中实战的过程");
        book.setWriter("mzh1");
        //                          代表绑定的交换机               代表消息推送到哪个队列          消息内容
        amqpTemplate.convertAndSend(RabbitMQConfig.TOPIC_EXCHANGE,RabbitMQConfig.TOPIC_MESSAGE,JSON.toJSONString(book));


        book.setName("rabbitmq实战之topic模式   topic.topic");
        book.setIntroduction("这是一本讲解rabbitmq在项目中实战的过程");
        book.setWriter("mzh2");
        amqpTemplate.convertAndSend(RabbitMQConfig.TOPIC_EXCHANGE,RabbitMQConfig.TOPIC_TOPIC,JSON.toJSONString(book));

    }
}
