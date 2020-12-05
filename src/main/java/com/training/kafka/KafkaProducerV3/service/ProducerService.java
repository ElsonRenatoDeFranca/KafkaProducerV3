package com.training.kafka.KafkaProducerV3.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "TestTopic";

    public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String sendMessage(String message) {
        log.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
        return "published successfully";
    }


}
