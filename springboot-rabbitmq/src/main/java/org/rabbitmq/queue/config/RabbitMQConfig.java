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
    public static final String TOPIC_QUEUE3 = "topic_queue3";

    public static final String TOPIC_EXCHANGE = "topic_exchange";

    public static final String TOPIC_MESSAGE = "topic.message";
    /*
    * #与*的效果是一样的
    * */
    public static final String TOPIC_X = "topic.*";
    public static final String TOPIC_H = "topic.#";
    public static final String TOPIC_TOPIC = "topic.topic";

    public static final String X_TOPIC = "*.topic";


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
    public Queue topicQueue3(){
        log.info("创建topic队列3");

        return new Queue(TOPIC_QUEUE3);
    }
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(TOPIC_EXCHANGE);
    }
    /*
    topic队列1 绑定的是topic.message.所以接收到topic.message发的消息
    * */

    @Bean
    public Binding topicbinding1(){
        log.info("topic队列1绑定:"+TOPIC_MESSAGE);

        return BindingBuilder.bind(topicQueue1()).to(topicExchange()).with(TOPIC_MESSAGE);
    }

    /*
    topic队列2 绑定的是topic.#(与topic.*类似).所以能接收所有带topic前缀发的消息
    * */
    @Bean
    public  Binding topicbinding2(){
        log.info("topic队列2绑定:"+TOPIC_X);

        return BindingBuilder.bind(topicQueue2()).to(topicExchange()).with(TOPIC_X);
    }

    /*
         topic队列3 绑定的是*.topic.所以能接收所有后缀带topic发的消息
   * */
    @Bean
    public  Binding topicbinding3(){
        log.info("topic队列3绑定:"+X_TOPIC);

        return BindingBuilder.bind(topicQueue3()).to(topicExchange()).with(X_TOPIC);
    }
}
