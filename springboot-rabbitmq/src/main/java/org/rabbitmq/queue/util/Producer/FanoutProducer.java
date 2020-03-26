package org.rabbitmq.queue.util.Producer;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.rabbitmq.queue.Constants.RabbitConstant;
import org.rabbitmq.queue.model.Book;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author mingzhihong
 * @Description //TODO
 * @Date 20-3-26 下午9:37
 **/
@Component
@Slf4j
public class FanoutProducer {
    @Autowired
    private AmqpTemplate amqpTemplate;
    /**
     * 生产者  如果更改绑定的队列重启之后发现接收的消息还是之前的
     * 登录 http://127.0.0.1:15672  将队列删除之后重新启动即可
     * */
    public void sendFanoutProducer(){
        Book book = new Book();
        book.setName("rabbitmq实战之fanout模式 ");
        book.setIntroduction("这是一本讲解rabbitmq在项目中实战的过程");
        book.setWriter("mzh4");
        //                          代表绑定的交换机               代表消息推送到哪个队列          消息内容
        amqpTemplate.convertAndSend(RabbitConstant.FANOUT_MODE_QUEUE,RabbitConstant.TOPIC_MESSAGE,JSON.toJSONString(book));


        book.setName("rabbitmq实战之fanout模式 ");
        book.setIntroduction("这是一本讲解rabbitmq在项目中实战的过程");
        book.setWriter("mzh5");
        amqpTemplate.convertAndSend(RabbitConstant.FANOUT_MODE_QUEUE,RabbitConstant.TOPIC_QUEUE5,JSON.toJSONString(book));

    }
}
