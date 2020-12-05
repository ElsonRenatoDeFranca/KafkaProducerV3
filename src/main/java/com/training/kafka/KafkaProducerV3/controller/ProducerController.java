package com.training.kafka.KafkaProducerV3.controller;

import com.training.kafka.KafkaProducerV3.service.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/publish/{message}")
    public String post(@PathVariable ("message") String message){
        return producerService.sendMessage(message);
    }


}
