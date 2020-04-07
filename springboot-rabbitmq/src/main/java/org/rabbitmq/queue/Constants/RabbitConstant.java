package org.rabbitmq.queue.Constants;

/**
 * @Author mingzhihong
 * @Description //TODO
 * @Date 20-3-26 下午9:08
 **/
public class RabbitConstant {
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

    public static final String FANOUT_MODE_QUEUE = "fanout.mode";

    public static final String TOPIC_QUEUE4 = "topic_queue4";
    public static final String TOPIC_QUEUE5 = "topic_queue5";


    /**
     * 路由1
     */
    public static final String TOPIC_ROUTING_KEY_ONE = "topic.topic";


    /**
     * 延迟队列
     */
    public static final String DELAY_QUEUE = "delay.queue";

    /**
     * 延迟队列交换器
     */
    public static final String DELAY_MODE_QUEUE = "delay.mode";

    //死信路由
    public static final String DELAY_ROUTING_KEY = "delay-routing-key";

}
