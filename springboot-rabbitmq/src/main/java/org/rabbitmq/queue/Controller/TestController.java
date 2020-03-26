package org.rabbitmq.queue.Controller;


import org.rabbitmq.queue.util.Producer.DirectProducer;
import org.rabbitmq.queue.util.Producer.FanoutProducer;
import org.rabbitmq.queue.util.Producer.TopicProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    public DirectProducer directProducer;
    @Autowired
    public TopicProducer topicProducer;

    @Autowired
    private FanoutProducer fanoutProducer;
    @GetMapping("/sendDirectQueue")
    public String sendDirectQueue(){
        directProducer.sendDirectProducer();
        return "OK";
    }


    @GetMapping("/sendTopicQueue")
    public String sendTopicQueue(){
        topicProducer.sendTopicProducer();
        return "OK";
    }


    @GetMapping("/sendFanoutQueue")
    public String sendFanoutQueue(){
        fanoutProducer.sendFanoutProducer();
        return "OK";
    }
}
