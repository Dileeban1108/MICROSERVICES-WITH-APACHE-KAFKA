package com.code.kafka.producer.demo.controller;

import com.code.kafka.producer.demo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private ProducerService producerService;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message){
        producerService.sendMessage(message);
    }
}
