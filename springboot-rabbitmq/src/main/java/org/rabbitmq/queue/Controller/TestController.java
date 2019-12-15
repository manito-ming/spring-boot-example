package org.rabbitmq.queue.Controller;


import org.rabbitmq.queue.util.Producer.DirectProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    public DirectProducer directProducer;

    @GetMapping("/sendDirectQueue")
    public String sendDirectQueue(){
        directProducer.sendDirectProducer();
        return "OK";
    }
}
