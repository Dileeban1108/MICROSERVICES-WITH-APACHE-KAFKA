package com.code.kafka.producer.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Value("${kafka.topic.name}")
    private String topicName;

    private final KafkaTemplate<String ,String> kafkaTemplate;
    public ProducerService(KafkaTemplate<String ,String> kafkaTemplate) {
        this.kafkaTemplate=kafkaTemplate;
    }
    public void sendMessage(String message){
        kafkaTemplate.send(topicName,message);
    }
}
