package com.kafkaproducer.kafkaproducer;

import com.kafkaproducer.kafkaproducer.filereader.CSVScraper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class KafkaproducerApplication {
	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KafkaproducerApplication.class, args);
        context.getBean(CSVScraper.class).processSongs();

    }

}
