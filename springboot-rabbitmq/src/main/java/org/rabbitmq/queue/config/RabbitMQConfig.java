package org.rabbitmq.queue.config;

import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.rabbitmq.queue.Constants.RabbitConstant;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
public class RabbitMQConfig {



    @Bean
    public Queue directqueue(){
        log.info("创建直接队列");

        //第二个参数指是否持久化
        return new Queue(RabbitConstant.DIRECT_QUEUE,true);
    }

    @Bean
    public Queue topicQueue1(){
        log.info("创建topic队列1");
        return new Queue(RabbitConstant.TOPIC_QUEUE1);
    }

    @Bean
    public Queue topicQueue2(){
        log.info("创建topic队列2");

        return new Queue(RabbitConstant.TOPIC_QUEUE2);
    }
    @Bean
    public Queue topicQueue3(){
        log.info("创建topic队列3");

        return new Queue(RabbitConstant.TOPIC_QUEUE3);
    }
    @Bean
    public Queue topicQueue4(){
        log.info("创建topic队列4");

        return new Queue(RabbitConstant.TOPIC_QUEUE4);
    }
    @Bean
    public Queue topicQueue5(){
        log.info("创建topic队列5");

        return new Queue(RabbitConstant.TOPIC_QUEUE5);
    }
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(RabbitConstant.TOPIC_EXCHANGE);
    }
    /**
     * 分列模式队列
     */
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(RabbitConstant.FANOUT_MODE_QUEUE);
    }

    /*
    topic队列1 绑定的是topic.message.所以接收到topic.message发的消息
    * */

    @Bean
    public Binding topicbinding1(){
        log.info("topic队列1绑定:"+RabbitConstant.TOPIC_MESSAGE);

        return BindingBuilder.bind(topicQueue1()).to(topicExchange()).with(RabbitConstant.TOPIC_MESSAGE);
    }

    /*
    topic队列2 绑定的是topic.#(与topic.*类似).所以能接收所有带topic前缀发的消息
    * */
    @Bean
    public  Binding topicbinding2(){
        log.info("topic队列2绑定:"+RabbitConstant.TOPIC_X);

        return BindingBuilder.bind(topicQueue2()).to(topicExchange()).with(RabbitConstant.TOPIC_X);
    }

    /*
    分列模式
         topic队列4 绑定的是fanout.mode
   * */
    @Bean
    public  Binding topicbinding3(){
        log.info("topic队列4绑定:"+RabbitConstant.FANOUT_MODE_QUEUE);

        return BindingBuilder.bind(topicQueue4()).to(fanoutExchange());
    }
    /*
     topic队列5  绑定的是fanout.mode
* */
    @Bean
    public  Binding fanoutBinding3(){
        log.info("topic队列5绑定:"+RabbitConstant.FANOUT_MODE_QUEUE);

        return BindingBuilder.bind(topicQueue5()).to(fanoutExchange());
    }
    /**
     * 主题模式绑定分列模式
     * 这样的话往topic交换机中输入消息,对应的fanout也可以收到消息
     * 并且改该fanout交换机订阅的是TOPIC_ROUTING_KEY_ONE这种Routing key	的内容
     *
     */
    @Bean
    public Binding topicBinding1() {
        return BindingBuilder.bind(fanoutExchange()).to(topicExchange()).with(RabbitConstant.TOPIC_ROUTING_KEY_ONE);
    }
}
