package com.kafkaproducer.kafkaproducer.kafkaproducers;

import com.kafkaproducer.kafkaproducer.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Value("${spring.kafka.topic.name.default}")
    private String topicName;

    @Autowired
    private final KafkaTemplate<String, Song> kafkaTemplate;
    public KafkaProducer(KafkaTemplate<String, Song> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Song song){
        kafkaTemplate.send(topicName, song);
    }

}