package org.rabbitmq.queue.config;

import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;


@Slf4j
@Configuration
public class RabbitMQConfig {
    //直接队列的模式
    public static final String DIRECT_QUEUE = "direct_queue";


    /*topic模式*/
    public static final String TOPIC_QUEUE1= "topic_queue1";
    public static final String TOPIC_QUEUE2 = "topic_queue2";
    public static final String TOPIC_EXCHANGE = "topic_exchange";

    @Bean
    public Queue directqueue(){
        log.info("创建队列");

        //第二个参数指是否持久化
        return new Queue(DIRECT_QUEUE,true);
    }

    @Bean
    public Queue topicQueue1(){
        log.info("创建topic队列1");
        return new Queue(TOPIC_QUEUE1);
    }

    @Bean
    public Queue topicQueue2(){
        log.info("创建topic队列2");

        return new Queue(TOPIC_QUEUE2);
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(TOPIC_EXCHANGE);
    }
    /*
    topic队列1 绑定的是topic.message.所以只能看到topic.message发的消息
    * */

    @Bean
    public Binding topicbinding1(){
        log.info("topic队列1绑定topic.message");

        return BindingBuilder.bind(topicQueue1()).to(topicExchange()).with("topic.message");
    }

    /*
topic队列2 绑定的是topic.#(与topic.*类似).所以能看到所有带topic前缀发的消息
* */
    @Bean
    public  Binding topicbinding2(){
        log.info("topic队列2绑定topic.#");

        return BindingBuilder.bind(topicQueue2()).to(topicExchange()).with("topic.#");
    }
}
