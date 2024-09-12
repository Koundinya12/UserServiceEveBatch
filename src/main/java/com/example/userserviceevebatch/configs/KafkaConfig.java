package com.example.userserviceevebatch.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaConfig {
    public KafkaTemplate<String,String> kafkaTemplate;
    public KafkaConfig(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
}
